/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.IpsMessage;
import com.biierg.cocc.common.bean.WechatResponse;

/**
 * 微信相关接口服务
 * 
 * @author lei
 */
public interface IWechatService {

	/**
	 * 推送订阅消息(仅每天一次)
	 */
	public WechatResponse pushSubMessage(IpsMessage msg);

	/**
	 * 推送企业微信群消息
	 */
	public WechatResponse pushGrpMessage(IpsMessage msg);
}
