package com.biierg.cocc.common.service;
/**
 * Created by wxs on 2017/7/24.
 * 车站限流信息接口
 */

import java.util.List;

import com.biierg.cocc.common.bean.BaseLimitingSubsrc;
import com.biierg.cocc.common.bean.IpsOperationEvent;
import com.biierg.cocc.common.vo.BaseLimitByStationName;
import com.biierg.cocc.common.vo.BaseLimitToAllStationsVo;
import com.biierg.cocc.common.vo.IpsOperationEventVo;

public interface IBaseLimitingInfoService {

	/**
	 * 常态限流查询
	 * 
	 * @return
	 */
	public List<IpsOperationEventVo> queryBaseLimits(String dateNowStr);

	/**
	 * 临时限流查询
	 * 
	 * @return
	 */
	public List<IpsOperationEventVo> queryTemporaryLimit(String dateNowStr);
	
	/**
	 * 所有车站限流查询
	 * @return List<IpsOperationEventVo>
	 */
	public List<BaseLimitToAllStationsVo> queryAllLimit();
	
	/**
	 * 所有车站根据事件优先级查询限流
	 * 事件显示以优先级显示:中断、调停、临时限流，遇到一个事件就不再往下找。
	 * @return List
	 */
	public List<BaseLimitToAllStationsVo> queryAllLimitByPriority();

	/**
	 * 限流订阅添加
	 * 
	 * @param userid
	 * @param stationId
	 * @return
	 */
	public int createLimitSubsrc(String userid, String stationName);

	/**
	 * 限流订阅查询
	 * 
	 * @param userid
	 * @return
	 */
	public List<IpsOperationEventVo> queryLimitSubsrc(String userid,String dateNowStr);

	/**
	 * 限流订阅删除
	 * 
	 * @param userid
	 * @param station_id
	 * @return
	 */
	public int delLimitSubsrc(String userid, String stationName);

	/**判断用户名、车站是否已存在
	 * @param userid
	 * @param station_id
	 * @return
	 */
//	public boolean limitFlag(String userid, String stationName);
	
	/**根据手机号查询已订阅车站列表
	 * @param userId
	 * @return
	 */
	public List<BaseLimitingSubsrc> querysubsrcStations(String userId);
	
	/**  
	* @Title: queryLimitByStation  
	* @Description: 根据车站名称查询车站限流信息  
	* @param stationName
	* @return List<BaseLimitByStationName>      
	* @throws  
	*/  
	public List<BaseLimitByStationName> queryLimitByStation(String stationName,String dateNowStr);
}

