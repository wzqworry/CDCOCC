/*
 * 版权所有 ©2011-2013 格点软件(北京)有限公司 All rights reserved.
 * 
 * 未经书面授权，不得擅自复制、影印、储存或散播。
 */
package com.biierg.cocc.common.mvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.biierg.cocc.common.annotation.JsonAryParam;
import com.biierg.cocc.common.annotation.JsonParam;
import com.biierg.cocc.common.json.JacksonHelper;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * JSON数据解析器；
 * 
 * 页面以字符串的形式向Controller传递对象（或对象数组）时，会使用此类进行解析
 * 
 * @author Lei
 */
public class JsonParamResolver implements HandlerMethodArgumentResolver {
	
	private JacksonHelper jackson = JacksonHelper.newInstance();

	public boolean supportsParameter(MethodParameter parameter) {

		// 支持的标注类型：JsonParam、JsonAryParam
		return parameter.hasParameterAnnotation(JsonParam.class)
				|| parameter.hasParameterAnnotation(JsonAryParam.class);
	}

	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {

		if (parameter.hasParameterAnnotation(JsonAryParam.class)) {
			return resolveJsonAryArgument(parameter, webRequest);
		}

		else if (parameter.hasParameterAnnotation(JsonParam.class)) {
			return resolveJsonArgument(parameter, webRequest);
		}

		return null;
	}

	private Object resolveJsonAryArgument(MethodParameter parameter, NativeWebRequest webRequest) {

		List<Object> argValue = new ArrayList<Object>();

		HttpServletRequest servletRequest = webRequest.getNativeRequest(HttpServletRequest.class);
		JsonAryParam jsonAryParam = parameter.getParameterAnnotation(JsonAryParam.class);

		Class<?> elementType = jsonAryParam.value();
		String[] childrenNames = jsonAryParam.childrenNames();
		Class<?>[] childrenTypes = jsonAryParam.childrenTypes();

		String paramName = parameter.getParameterName();
		String[] paramValues = servletRequest.getParameterValues(paramName);

		if (paramValues != null && paramValues.length > 0) {

			// 处理嵌套的子列表
			Map<String, Class<?>> childTypeMap = null;
			if (childrenNames != null && childrenTypes != null && childrenNames.length > 0
					&& childrenNames.length == childrenTypes.length) {

				childTypeMap = new HashMap<String, Class<?>>();

				for (int i = 0; i < childrenNames.length; i++) {
					childTypeMap.put(childrenNames[i], childrenTypes[i]);
				}
			}

			for (String paramValue : paramValues) {
				List<?> valueList = jackson.getObject(paramValue, List.class, elementType);

				if (valueList != null && valueList.size() > 0) {
					argValue.addAll(valueList);
				}
			}
		}

		return argValue;
	}

	private Object resolveJsonArgument(MethodParameter parameter, NativeWebRequest webRequest) {

		Object argValue = null;

		HttpServletRequest servletRequest = webRequest.getNativeRequest(HttpServletRequest.class);
		JsonParam jsonParam = parameter.getParameterAnnotation(JsonParam.class);

		String[] childrenNames = jsonParam.childrenNames();
		Class<?>[] childrenTypes = jsonParam.childrenTypes();

		String paramName = parameter.getParameterName();
		String[] paramValues = servletRequest.getParameterValues(paramName);

		if (paramValues != null && paramValues.length > 0) {
			// 处理嵌套的子列表
			Map<String, Class<?>> childTypeMap = null;
			if (childrenNames != null && childrenTypes != null && childrenNames.length > 0
					&& childrenNames.length == childrenTypes.length) {

				childTypeMap = new HashMap<String, Class<?>>();

				for (int i = 0; i < childrenNames.length; i++) {
					childTypeMap.put(childrenNames[i], childrenTypes[i]);
				}
			}

			argValue = jackson.getObject(paramValues[0], parameter.getParameterType());
		}

		return argValue;
	}
}