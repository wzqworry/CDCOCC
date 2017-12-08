package com.biierg.cocc.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 存储登良路用户信息的工具类
 * Created by wzq on 2017/7/21.
 */
public class CookieUtil {
    private static final Logger logger = LoggerFactory.getLogger(CookieUtil.class);

    /**
     * 从cookie中获取值
     */
    public static String get(HttpServletRequest request, String key) {
        //如果不是 则判断cookie 中key 是否为空
        Cookie cookie = getCookieByName(request, key);
        if (null == cookie) {
            //说明cookie中不包含 改key
            return null;
        } else {
            //返回 cookie的值
            return cookie.getValue();
        }
    }


    /**
     * 根据名字获取cookie
     *
     * @param request
     * @param name    cookie名字
     * @return
     */
    public static Cookie getCookieByName(HttpServletRequest request, String name) {
        Map<String, Cookie> cookieMap = ReadCookieMap(request);
        if (cookieMap.containsKey(name)) {
            Cookie cookie = (Cookie) cookieMap.get(name);
            return cookie;
        } else {
            return null;
        }
    }

    /**
     * 将cookie封装到Map里面
     *
     * @param request
     * @return
     */
    public static Map<String, Cookie> ReadCookieMap(HttpServletRequest request) {
        Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();
        Cookie[] cookies = request.getCookies();
        if (null != cookies) {
            for (Cookie cookie : cookies) {
                cookieMap.put(cookie.getName(), cookie);
            }
        }
        return cookieMap;
    }

    /**
     * 添加cookie
     *
     * @param response
     * @param name
     * @param value
     */
    public static void setValue(HttpServletResponse response, String name, String value, int time) {
        Cookie cookie = new Cookie(name.trim(), value.trim());
        cookie.setMaxAge(time);// 设置为30min
        cookie.setPath("/");//可在同一应用服务器内共享方法
        response.addCookie(cookie);
    }

    // 获取当前登陆用户的登录名（userId）
    public static String getActiveUserId() {
        return CookieUtil.get(WebContextUtil.getRequest(), Constants.kUserId);
    }
    
    public static String getActiveToken() {
        return CookieUtil.get(WebContextUtil.getRequest(), Constants.kToken);
    }

}
