/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.mvc;

import java.util.Map;
import java.util.Stack;

import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.biierg.cocc.common.annotation.XmlParam;
import com.biierg.cocc.common.bean.WechatPushMsg;
import com.biierg.cocc.common.util.BeanUtils;
import com.biierg.cocc.common.util.StringUtil;

/**
 * 微信平台XML数据包解析器
 * 
 * @author lei
 */
public class XmlParamResolver implements HandlerMethodArgumentResolver {
	private Logger logger = LoggerFactory.getLogger(XmlParamResolver.class);

	@Override
	public boolean supportsParameter(MethodParameter parameter) {

		// 支持的标注类型：JsonParam、JsonAryParam
		return parameter.hasParameterAnnotation(XmlParam.class);
	}

	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {

		XmlParam paramAnnotation = parameter.getParameterAnnotation(XmlParam.class);
		HttpServletRequest httpReq = webRequest.getNativeRequest(HttpServletRequest.class);

		if (paramAnnotation == null || StringUtil.isNull(paramAnnotation.rootElementName()) || httpReq == null) {
			return null;
		}
		if (logger.isDebugEnabled()) {
			logger.debug("Content-Type: {}, Content-Length: {}", httpReq.getContentType(), httpReq.getContentLength());
		}

		WechatPushMsg wechatMsg = new WechatPushMsg();

		@SuppressWarnings("unchecked")
		Map<String, ?> paramMap = (Map<String, ?>) httpReq.getParameterMap();
		if (paramMap != null && !paramMap.isEmpty()) {

			paramMap.keySet().forEach(key -> {
				String value = httpReq.getParameter(key);
				try {
					BeanUtils.setFieldValue(wechatMsg, key, String.class, value);
				} catch (Throwable e) {
					logger.warn("param: {}, value: {}", key, value, e);
				}
			});
		}

		if (httpReq.getContentLength() > 0 && httpReq.getContentType().matches("(?i)^\\s*text\\/xml\\s*.*")) {

			try {
				Stack<String> tagNVPairStack = new Stack<>();
				SAXParser sax = SAXParserFactory.newInstance().newSAXParser();
				sax.parse(httpReq.getInputStream(), new DefaultHandler() {

					@Override
					public void characters(char[] ch, int start, int length) throws SAXException {
						if (!tagNVPairStack.isEmpty()) {
							tagNVPairStack.push(new String(ch, start, length));
						}
					}

					@Override
					public void endElement(String uri, String localName, String qName) throws SAXException {

						if (!"xml".equalsIgnoreCase(qName) && !tagNVPairStack.isEmpty()
								&& tagNVPairStack.size() % 2 == 0) {
							try {
								String fieldValue = tagNVPairStack.pop();
								String fieldName = tagNVPairStack.pop();

								BeanUtils.setFieldValue(wechatMsg, fieldName, String.class, fieldValue);
							} catch (Throwable e) {
								logger.warn(e.getMessage(), e);
							}
						}
					}

					@Override
					public void startElement(String uri, String localName, String qName, Attributes attributes)
							throws SAXException {

						if (!"xml".equalsIgnoreCase(qName)) {
							tagNVPairStack.push(qName);
						}
					}
				});
			} catch (Throwable e) {
				logger.error(e.getMessage(), e);
			}
		}

		return wechatMsg;
	}
}
