/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.PsaExchangeStation;

/**
 * @author wzq
 *
 */
public interface IPsaExchangeStationService extends IBaseService<PsaExchangeStation,String>{

	/** 
	* @Title: queryExchangeStations 
	* @Description: TODO(查询兑换车站信息) 
	* @param psaExchangeStation
	* @return List<PsaExchangeStation>    返回类型 
	* @throws Exception
	*/
	public List<PsaExchangeStation> queryExchangeStations(PsaExchangeStation psaExchangeStation) throws Exception;

	/** 
	* @Title: removeBatch 
	* @Description: TODO(批量刪除兌換車站信息) 
	* @param exchangeStationIdList
	* @return boolean    返回类型 
	* @throws Exception
	*/
	public boolean removeBatch(List<String> exchangeStationIdList) throws Exception;
}
