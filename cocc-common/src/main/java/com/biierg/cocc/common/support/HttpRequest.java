/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class HttpRequest {

	/** HTTP GET method */
	public static final String METHOD_GET = "GET";

	/** HTTP POST method */
	public static final String METHOD_POST = "POST";

	/**
	 * 待请求的url
	 */
	private String url = null;

	/**
	 * 默认的请求方式
	 */
	private String method = METHOD_POST;

	private int timeout = 0;

	private int connectionTimeout = 0;

	/**
	 * Post方式请求时组装好的参数值对
	 */
	private List<NameValuePair> parameters = new ArrayList<NameValuePair>();
	
	private Map<String, Object> complexParameters = new HashMap<String, Object>();

	/**
	 * 默认的请求编码方式
	 */
	private String charset = "UTF-8";

	/**
	 * 请求发起方的ip地址
	 */
	private String clientIp;

	/**
	 * 请求返回的方式
	 */
	private HttpResultType resultType = HttpResultType.BYTES;

	public HttpRequest(HttpResultType resultType) {
		super();
		this.resultType = resultType;
	}

	/**
	 * @return Returns the clientIp.
	 */
	public String getClientIp() {
		return clientIp;
	}

	/**
	 * @param clientIp
	 *            The clientIp to set.
	 */
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public List<NameValuePair> getParameters() {
		return parameters;
	}

	public void setParameters(List<NameValuePair> parameters) {
		this.parameters = parameters;
	}
	
	public void addParameter(String name, String value) {
		parameters.add(new BasicNameValuePair(name, value));
	}

	public Map<String, Object> getComplexParameters() {
		return complexParameters;
	}

	public void setComplexParameters(Map<String, Object> complexParameters) {
		this.complexParameters = complexParameters;
	}
	
	public void addComplexParameter(String name, Object value) {
		complexParameters.put(name, value);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public int getConnectionTimeout() {
		return connectionTimeout;
	}

	public void setConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	/**
	 * @return Returns the charset.
	 */
	public String getCharset() {
		return charset;
	}

	/**
	 * @param charset
	 *            The charset to set.
	 */
	public void setCharset(String charset) {
		this.charset = charset;
	}

	public HttpResultType getResultType() {
		return resultType;
	}

	public void setResultType(HttpResultType resultType) {
		this.resultType = resultType;
	}

}
