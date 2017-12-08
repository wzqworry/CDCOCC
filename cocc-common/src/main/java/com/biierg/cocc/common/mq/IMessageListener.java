package com.biierg.cocc.common.mq;

/**
 * 消息监听接口
 * 
 * @author lei
 */
public interface IMessageListener {

	/**
	 * 响应收到的消息
	 * 
	 * @param message
	 * @return
	 */
	public boolean onMessage(Object message);

	/**
	 * 响应收到的字节消息
	 * 
	 * @param message
	 * @return
	 */
	public boolean onBytesMessage(byte[] message);
	
	/**
	 * IMessageListener接口的空实现
	 * 
	 * @author lei
	 */
	public static class Adapter implements IMessageListener {

		public boolean onMessage(Object message) {
			return false;
		}

		public boolean onBytesMessage(byte[] message) {
			return false;
		}
	}
}
