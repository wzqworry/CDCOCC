/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

import java.io.Serializable;

/**
 * @author lei
 */
public class SimpleMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String key;
	private Object value;
	
	public SimpleMessage(String key, Object value) {
		this.key = key;
		this.value = value;
	}
	
	public String toString() {
		return key + ":" + value;
	}
}