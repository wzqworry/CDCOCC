/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.apiutil.ApiResult;
import com.biierg.cocc.common.bean.IpsMessage;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.List;

/**
 * 消息信息服务
 *
 * @author lk
 */

public interface IIpsMsgService {

	/**
	 * 将给定的消息对象发送出去（不入库，直接发送）
	 * 
	 * @param msg
	 *            将要发送的消息对象（已经入库的对象）
	 * @return
	 */
	public boolean send(IpsMessage msg);

	/**
	 * 新增消息
	 */
	public boolean create(IpsMessage bean) throws Exception;

	/**
	 * 更新消息
	 */
	public boolean update(IpsMessage ipsMessage) throws Exception;

	/**
	 * 根据id查询消息
	 */
	public IpsMessage find(String msgId) throws Exception;

	/**
	 * 根据id删除消息
	 */
	public boolean remove(String msgId) throws Exception;
	// TODO 消息发布模块

	/**
	 * insert 消息,分类添加（同时添加收件人信息） ( 必选 )：subject; content; msgType; msgStatus;
	 * msgTem; sender;
	 *
	 * @param ipsMessage
	 *            消息对象
	 * @param receieverIdList
	 *            收件人 id 列表
	 * @return 添加成功后的消息 id 字符串
	 * @throws SrvException
	 *             后台服务异常
	 */
	boolean createIpsMessageAndReclist(IpsMessage ipsMessage, List<String> receieverIdList) throws Exception;

	/**
	 * update 消息,分类更新（同时更新接收人） ( 必选 )：subject; content; msgType; msgStatus; msgTem;
	 * sender;
	 *
	 * @param ipsMessage
	 *            消息对象
	 * @param receieverIdList
	 *            收件人 id 列表
	 * @return 添加成功后的消息 id 字符串
	 * @throws SrvException
	 *             后台服务异常
	 */
	boolean updateIpsMessageAndReclist(IpsMessage ipsMessage, List<String> receieverIdList) throws Exception;

	/**
	 * 消息管理模块： 查询消息列表
	 *
	 * @param msgType
	 *            消息类型 1：“短信” 2：“外网” 3：“调令” 30：“未读调令” 0：全部 必选
	 * @param queryMsgType
	 *            查询消息的类型 1：收件箱 2：发件箱 3：草稿箱 4：模板 必选
	 * @param userId
	 *            当前用户id 必选
	 * @param keyWord
	 *            关键字 可选
	 * @param orderType
	 *            排序规则 1：按创建时间降序 2： 发送时间 必选
	 * @return 消息列表（缓存）
	 * @throws SrvException
	 *             后台服务异常
	 */
	SrvResponse<List<IpsMessage>> listIpsMessage(Integer msgType, Integer queryMsgType, String userId, String keyWord,
			Integer orderType) throws Exception;

	/**
	 * 根据id 查询用于面板显示的消息
	 *
	 * @param msgId
	 *            消息id
	 * @return MsgList4Box
	 * @throws SrvException
	 *             后台服务异常
	 */
	IpsMessage find4Panel(String msgId) throws Exception;

	/**
	 * 批量删除消息
	 *
	 * @param msgIdList
	 *            消息id列表
	 * @return boolean
	 * @throws SrvException
	 *             后台服务异常
	 */
	Boolean removeBatch(List<String> msgIdList) throws Exception;

	/**
	 * 复制消息
	 *
	 * @param msgId
	 *            消息id
	 * @return boolean
	 * @throws SrvException
	 *             后台服务异常
	 */
	Boolean copyIpsMessageAndReclist(String msgId) throws Exception;

	/**
	 * 根据eventId查找事件消息
	 *
	 * @param eventId
	 *            事件Id
	 * @return 消息列表(缓存)
	 * @throws SrvException
	 *             后台服务异常
	 */
	SrvResponse<List<IpsMessage>> findMsgEvent(String eventId) throws Exception;

	/**
	 * 搜索消息
	 *
	 * @param ipsMessage
	 * @return 消息列表(缓存)
	 * @throws SrvException
	 *             后台服务异常
	 */
	SrvResponse<List<IpsMessage>> getMessages(IpsMessage ipsMessage) throws Exception;

	/**
	 * 搜索消息
	 *
	 * @param msg
	 *            消息对象
	 * @return
	 * @throws SrvException
	 */
	List<IpsMessage> searchMsg(IpsMessage msg) throws Exception;

	/**
	 * 同步消息模板
	 * 
	 * @param messageToCreate
	 * @param messageToDelete
	 * @param messageToUpdate
	 * @return
	 * @throws Exception
	 */
	ApiResult synchronizeMsgInfoCRU(List<IpsMessage> messageToCreate, List<IpsMessage> messageToDelete,
			List<IpsMessage> messageToUpdate) throws Exception;
}
