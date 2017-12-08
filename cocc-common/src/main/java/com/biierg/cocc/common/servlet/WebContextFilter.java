/**
 * 版权所有@2015 北京京投亿雅捷交通科技有限公司；未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biierg.cocc.common.util.WebContextUtil;

/**
 * 基础过滤器
 *
 * @author lei
 */
public class WebContextFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		
		try {
			
			WebContextUtil.setRequest((HttpServletRequest) request);
			WebContextUtil.setResponse((HttpServletResponse) response);
			
		} finally {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
	}
}
