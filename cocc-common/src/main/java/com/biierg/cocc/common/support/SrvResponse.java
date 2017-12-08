/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

import java.io.Serializable;

/**
 * 内部服务接口响应
 * 
 * @author lei
 */
public class SrvResponse<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cacheKey; // 数据缓存Key
	private T returnData; // 返回数据
	
	public SrvResponse() {
	}
	
	public SrvResponse(String cacheKey, T returnData) {
		this.cacheKey = cacheKey;
		this.returnData = returnData;
	}

	/**
	 * 获取数据缓存Key
	 * 
	 * @return the cacheKey
	 */
	public String getCacheKey() {
		return cacheKey;
	}

	/**
	 * @param cacheKey
	 *            the cacheKey to set
	 */
	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}

	/**
	 * 获取接口返回数据
	 * 
	 * @return the returnData
	 */
	public T getReturnData() {
		return returnData;
	}

	/**
	 * @param returnData
	 *            the returnData to set
	 */
	public void setReturnData(T returnData) {
		this.returnData = returnData;
	}
}
