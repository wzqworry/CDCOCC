/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.servlet;

import com.biierg.cocc.common.apiutil.ApiResult;
import com.biierg.cocc.common.cache.ICache;
import com.biierg.cocc.common.json.JacksonHelper;
import com.biierg.cocc.common.util.Constants;
import com.biierg.cocc.common.util.CookieUtil;
import com.biierg.cocc.common.util.HttpUtil;
import com.biierg.cocc.common.util.StringUtil;
import com.biierg.cocc.common.util.WebContextUtil;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wzq on 2017/6/15.
 */
public class ACLCheckInterceptor extends HandlerInterceptorAdapter {
    private final Logger logger = LoggerFactory.getLogger(ACLCheckInterceptor.class);

    private String loginUrl;
    private String resourceUrl;

    // Redis访问接口
    @Resource(name = "redisCache")
    private ICache redisCache;

    /**
     * 在业务处理器处理请求之前被调用,从cookoe 和redis 中获取信息
     * 如果返回true  执行下一个拦截器,直到所有的拦截器都执行完毕
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        
        WebContextUtil.setRequest(request);

        // 试图请求的用户   传登录名和token
        String userId = request.getParameter("userId");
        String token = request.getParameter("token");
        
        // 如果传入的参数中有 userId 和 token 证明是带有shell 的路径
        if(!StringUtil.isNull(userId) && !StringUtil.isNull(token)) {
        	//先判断 userId  和 token 用户登录状态
        	if(logger.isDebugEnabled()) {
        		logger.debug("准备用来判断登录的参数[{}{}]",userId,token);	
        	}
        	
            Map<String,String> loginParam = new HashMap<>();
            //请求参数 注释掉了用token判断的
            //loginParam.put("obj","{\"token\":\""+token+"\"}");
            loginParam.put("obj","{\"loginName\":\""+userId+"\"}");
            loginParam.put("token", token);
            
            if(logger.isDebugEnabled()) {
            	logger.debug("准备调用checkIsLoginByLoginName[{}{}]",loginUrl,ToStringBuilder.reflectionToString(loginParam));	
            }
            
            String  loginRet = HttpUtil.post(loginUrl,loginParam);
            //返回格式包括0说明登录了  todo 临时跳过登录验证
            if(loginRet.indexOf("0") >= 0){
            	
            	if(logger.isDebugEnabled()) {
            		logger.debug("登录成功{}",loginRet);
            	}
            	
                //获取用户下属的所有资源
                Map<String,String> resParam = new HashMap<>();
                //请求参数
                resParam.put("obj","{\"loginName\":\""+userId+"\"}");
                resParam.put("token", token);
                String resourceRet = HttpUtil.post(resourceUrl,resParam);
                
                //将 kToken 和 token拼接存入cookie 将resource 存入redis  key 为token 讲 kUserId 存入 cookie 和redis
                redisCache.put("ACL",token,resourceRet,30*60);//30分钟过期
                redisCache.put("ACL",Constants.kToken,token,30*60);//30分钟过期
                redisCache.put("ACL",Constants.kUserId,userId,30*60);//30分钟过期
                
                //存入cookie 以map的形式存入ThreadLocal
                CookieUtil.setValue(response,Constants.kToken,token,30*60);//30分钟过期
                CookieUtil.setValue(response,Constants.kUserId,userId,30*60);//30分钟过期
                
                //将用户名放在cookie 中
                //response.addCookie(CookieUtil.getCookieByName(request,"kUserId"));
                //将用户名放在session 中
                request.getSession().setAttribute("userId",userId);

                logger.info("用户token登录验证成功,当前登录的用户为-"+userId);
                return true;
            }else{
                logger.error("用户登录状态不正确");
                response.getWriter().write(JacksonHelper.newInstance().toJson(new ApiResult(2003, "用户登录状态不正确")));
                return false;
            }
        }else if(StringUtil.isNull(userId) && StringUtil.isNull(token)){
        	// 判断  token,如果都为空说明用户过期
        	if(StringUtil.isNull(CookieUtil.getActiveToken())
        			&& StringUtil.isNull(redisCache.get("ACL",Constants.kToken))){
        			logger.error("登录状态过期,请重新登陆");
                    response.getWriter().write(JacksonHelper.newInstance().toJson(new ApiResult(2002, "登录状态过期,请重新登陆")));
                	return false;
        	}
            return true;
        }else{
        	//如果userid 和 token 一个为空 
        	logger.error("参数个数不正确");
            response.getWriter().write(JacksonHelper.newInstance().toJson(new ApiResult(2004, "参数个数不正确")));
        	return false;
        }
    }


    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }
}
