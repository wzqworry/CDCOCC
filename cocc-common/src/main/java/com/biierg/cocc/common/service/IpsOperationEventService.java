/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;
import java.util.Map;

import com.biierg.cocc.common.bean.IpsOperationEvent;

/**
 * Created by xys on 2017/7/21.
 */
public interface IpsOperationEventService {

	/**
	 * 
	 * @param ipsOperationEvent
	 * @return 插入一条车站、线路事件
	 */
	public int insertIpsOperationEvent(IpsOperationEvent ipsOperationEvent) throws Exception;

	/**
	 * 
	 * @param ipsOperationEvent
	 * @return 更改一条车站、线路事件
	 */
	public int updateIpsOperationEvent(IpsOperationEvent ipsOperationEvent) throws Exception;

	/**
	 * 
	 * @param param
	 * @return 查询车站事件列表
	 */
	public List<IpsOperationEvent> queryIpsOperationEventList(Map<String, Object> param) throws Exception;

	/**
	 * 
	 * @param ipsOperationEvent
	 * @return 删除一条车站、线路事件
	 */
	public int deleteIpsOperationEvent(String ipsOperationEvent) throws Exception;

	/**
	 * 根据event_id 查出对应的事件类型 查出对应的车站信息 查询限流订阅表 查出对应的所有用户 生成一个pushMessage Bean
	 * 
	 * @param event
	 */
	public void creatPushMessage(IpsOperationEvent event) throws Exception;
}
