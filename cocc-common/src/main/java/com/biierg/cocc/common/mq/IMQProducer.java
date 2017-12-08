package com.biierg.cocc.common.mq;

import java.io.Serializable;

/**
 * 消息生产者接口
 * 
 * @author lei
 */
public interface IMQProducer {
	
	/**
	 * 发送对象消息至消息队列
	 * 
	 * @param message
	 * @return
	 */
	public boolean sendMessage(Serializable message);
	
	/**
	 * 发送字节数组消息至消息队列
	 * 
	 * @param message
	 * @return
	 */
	public boolean sendBytesMessage(byte[] message);
}
