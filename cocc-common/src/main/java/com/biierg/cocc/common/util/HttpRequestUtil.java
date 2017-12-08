/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;


/**
 *
 */
public class HttpRequestUtil {

    public static final String X_REQUESTED_WIDTH = "X-Requested-With";
    public static final String XML_HTTP_REQUEST = "XMLHttpRequest";

    private HttpRequestUtil() {
    }

    /**
     * 判断是否ajax请求.
     * 可以看到Ajax 请求多了个 x-requested-with ，可以利用它，
     * request.getHeader("x-requested-with"); 为 null，则为传统同步请求，为 XMLHttpRequest，则为Ajax 异步请求。
     *
     * @paramrequest HttpServletRequest
     * @return是否ajax请求.
     */
    public static boolean isAjaxRequest(HttpServletRequest request) {
        String xr = request.getHeader(X_REQUESTED_WIDTH);
        return (xr != null && XML_HTTP_REQUEST.equalsIgnoreCase(xr));
    }

    public static String getCookieValue(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                String cookieName = cookie.getName();
                if (cookieName.equals(name)) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
}
