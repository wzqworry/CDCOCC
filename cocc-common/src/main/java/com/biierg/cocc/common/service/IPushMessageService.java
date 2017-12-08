/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.vo.PushMessage;

/**
 * 消息推送服务
 * 
 * @author lei
 */
public interface IPushMessageService {

	/**
	 * 向指定终端推送消息
	 * 
	 * @param msg
	 */
	public void pushMessage(PushMessage msg);

	/**
	 * 向所有终端广播消息
	 * 
	 * @param msg
	 */
	public void broadcastMsg(PushMessage msg);
}
