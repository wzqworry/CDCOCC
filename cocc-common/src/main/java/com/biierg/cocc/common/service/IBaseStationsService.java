/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.BaseStations;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.vo.BaseStationsVo;

/**
 * 站点基础信息服务
 *
 * @author lei
 */
public interface IBaseStationsService {

	/**
	 * SRVB002 - 查询站点
	 *
	 * @param lineCode
	 *            线路id；必填
	 * @param stationCode
	 *            站点id；可空
	 * @return 符合条件的站点信息列表
	 * @throws SrvException
	 */
	public List<BaseStations> queryStations(String lineCode, String stationCode) throws SrvException;
     
	
	/**车站信息查询
	 * @param lineCode
	 * @param stationCode
	 * @return
	 * @throws SrvException
	 */
	public List<BaseStationsVo> stationsSearch (String lineCode, String stationCode) throws SrvException;
	
	/**通过车站名称查询车站信息
	 * @param stationName
	 * @return
	 * @throws SrvException
	 */
	List<BaseStations> queryStationsByName(String stationName) throws SrvException;

	/**
	 * 根据车站id 查询车站信息
	 * @param stationId
	 * @return
	 * @throws SrvException
	 */
	public BaseStations queryStationByStationId(String stationId) throws SrvException;
	/**
	 *  根据线路名字和车站名字来查询 站点信息
	 *  @param lineName
	 *  @param stationName
	 * */
	BaseStations queryStation(String lineName,String stationName) throws SrvException;

	/**
	 * SRVB002 - 查询换乘站站点信息
	 *
	 * @param lineCode
	 *            线路id；必填
	 * @param stationState
	 *            站点状态；必填
	 * @param isTransfer
	 *            换乘站；必填
	 * @return 符合条件的站点信息列表
	 * @throws SrvException
	 */
	public List<BaseStations> queryHcStations(String lineCode, Integer stationState,Integer isTransfer) throws SrvException;


	/**
	 * 保存（更新）实体
	 */
	public boolean update(BaseStations baseStations) throws SrvException;

	/**
	 * 查询重点站
	 * @param lineCode
	 * @param stationState
	 * @param isImportant
	 * @return
	 * @throws SrvException
	 */
	public List<BaseStations> queryZdStations(String lineCode, Integer stationState,Integer isImportant) throws SrvException;
}
