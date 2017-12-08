package com.biierg.cocc.common.servlet;
/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biierg.cocc.common.cache.ICache;

/**
 * Created by wzq on 2016/11/15.
 */
public class CookieCheckFilter implements Filter {

	private ICache redisCache;

	private String ignoreUrls;

	public String getIgnoreUrls() {
		return ignoreUrls;
	}

	public void setIgnoreUrls(String ignoreUrls) {
		this.ignoreUrls = ignoreUrls;
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;

		// 如果不是 则判断cookie 中JSESSIONID 是否为空，并且redis中是否存在， 存在继续， 不存再重定向 到登录界面
//		Cookie cookie = getCookieByName(request, "JSESSIONID");
//		if (null == cookie || !redisCache.containsKey("user_session", cookie.getValue())) {
//			try {
//				response.sendRedirect("/cocc-web/login.jsp");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
//		Optional<Cookie> foundCookie = Stream.of(request.getCookies()).filter(cookie -> "KSESSIONID".equals(cookie.getName())).findFirst();
//		
//		List<Cookie> cookieList = Arrays.asList(request.getCookies());
//		if (cookieList.stream().noneMatch(cookie -> "KSESSIONID".equals(cookie.getName()))) {
//			
//			Cookie cookie = new Cookie("KSESSIONID", UUIDUtil.generate32());
//			cookie.setMaxAge(30 * 60);// 设置为30min
//			cookie.setPath("/");
//			response.addCookie(cookie);
//		} else {
//			Cookie ck = cookieList.stream().filter(cookie -> "KSESSIONID".equals(cookie.getName())).limit(1).toArray(generator);
//		}
//
//		if (request.getRequestURI().indexOf(ignoreUrls) > 0) {
//			// 判断请求的action 是否包含过滤的action 比如登录 直接继续执行并在response中创建 JSESSIONID
//			// 存在redis中
//			try {
//				returnObj = joinPoint.proceed();
//				// todo 判断登录是否成功
//
//				String uuid = UUIDUtil.generate32();
//				redisCache.put("user_session", uuid, 30 * 60);
//				Cookie cookie = new Cookie("JSESSIONID", uuid);
//				cookie.setMaxAge(30 * 60);// 设置为30min
//				cookie.setPath("/");
//				response.addCookie(cookie);
//			} catch (Throwable e) {
//				e.printStackTrace();
//			}
//		} else {
//			// 如果不是 则判断cookie 中JSESSIONID 是否为空，并且redis中是否存在， 存在继续， 不存再重定向 到登录界面
//			Cookie cookie = getCookieByName(request, "JSESSIONID");
//			if (null == cookie || !redisCache.containsKey("user_session", cookie.getValue())) {
//				try {
//					response.sendRedirect("/cocc-web/login.jsp");
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			try {
//				returnObj = joinPoint.proceed();
//			} catch (Throwable e) {
//				e.printStackTrace();
//			}
//
//		}
//		return returnObj;
	}

	@Override
	public void destroy() {
	}

}
