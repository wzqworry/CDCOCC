/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

import com.biierg.cocc.common.cache.ICache;
import com.biierg.cocc.common.json.JacksonHelper;
import com.biierg.cocc.common.util.Constants;
import com.biierg.cocc.common.util.CookieUtil;
import com.biierg.cocc.common.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.util.List;
import java.util.Map;

/**
 * Created by wzq on 2017/6/15.
 */
public class ACLTagSupport extends BodyTagSupport {
    private static final long serialVersionUID = 1L;
    private final Logger logger = LoggerFactory.getLogger(ACLTagSupport.class);

    private JacksonHelper jackson = JacksonHelper.newInstance();
    private String resourceName;
    private String resourceValue;
    private String resource;
    private static ICache redisCache;

    private void init() {
        resourceName = resourceValue = null;
        if(redisCache == null){
            ApplicationContext cx = new ClassPathXmlApplicationContext("spring-context.xml");

            redisCache = (ICache) cx.getBean("redisCache");
        }

    }

    public ACLTagSupport() {
        super();
        init();
    }

    @SuppressWarnings("unchecked")
    public int doStartTag() throws JspException {
        HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
        HttpServletResponse response = (HttpServletResponse) pageContext.getResponse();

        //判断返回值  如果登录再去判断资源有没有缓存
        try {
            //如果找到了记录
            if(CookieUtil.get(request,"kToken") != null){
                String token = CookieUtil.get(request,Constants.kToken);
                //1.判断redis中是否存在
                if(!redisCache.containsKey("ACL",token)){
                    //response.getWriter().write(JacksonHelper.newInstance().toJson(new ApiResult(2005, "没有在cookie中获取到资源信息")));
                    return SKIP_BODY;
                }else{
                    resource = redisCache.get("ACL",token);
                    //遍历解析取得的权限列表
                    Map resMap = jackson.getObject(resource,Map.class);
                    List<String> resList = (List<String>) resMap.get("obj");
                    for (String rs : resList) {
                        if (!StringUtil.isNull(rs) && rs.equals(resourceName)) {
                            return EVAL_BODY_INCLUDE;
                        }
                    }
                }
            }else{
                logger.info("没有找到设置的cookie=======证明没有登陆过活着超时");
                //response.getWriter().write(JacksonHelper.newInstance().toJson(new ApiResult(2004, "没有登录或者已经cookie失效")));

                return SKIP_BODY;//直接不显示
            }
        } catch (Exception e) {
            logger.error("ACLTagSupport判断权限出错",e.getMessage(),e);
            return SKIP_BODY;//直接不显示
        }

        return SKIP_BODY;
    }

    public int doEndTag() {
        return EVAL_PAGE;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceValue() {
        return resourceValue;
    }

    public void setResourceValue(String resourceValue) {
        this.resourceValue = resourceValue;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
