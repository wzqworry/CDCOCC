package com.biierg.cocc.common.mq;

/**
 * 消息消费者接口
 * 
 * @author lei
 */
public interface IMQConsumer {

	/**
	 * 绑定消息监听
	 * 
	 * @param listener
	 */
	public void setMessageListener(IMessageListener listener);
}
