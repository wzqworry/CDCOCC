/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

import com.biierg.cocc.common.bean.WeiboEntity;

/**
 * 微信平台运行错误
 * 
 * @author Lei
 */
public class WeiboLocalException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private WeiboEntity.Response response;

	public WeiboEntity.Response getResponse() {
		return response;
	}

	public WeiboLocalException(WeiboEntity.Response response) {
		this.response = response;
	}
	
	public String getMessage() {
		return response.getErrmsg();
	}
}

