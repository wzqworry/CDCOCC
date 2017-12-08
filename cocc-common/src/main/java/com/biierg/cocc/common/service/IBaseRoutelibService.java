/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.BaseRoutelib;
import com.biierg.cocc.common.bean.BaseRoutelibViaStations;

/**
 * 路径库接口
 * @author wwj
 *
 */

public interface IBaseRoutelibService {
	/**
	 * 查询路径（带站点信息）
	 * @param beginCode
	 * 			起始站码，可空
	 * @param endCode
	 * 			终到站码，可空
	 * @param routeNum
	 * 			路径序号，可空
	 * @return
	 */
	public List<BaseRoutelib> getRoutelibMessage(String ori_station_name, String dest_station_name);
	
	/**
	 * 查询路径
	 * @param beginCode
	 * 			起始站码，可空
	 * @param endCode
	 * 			终到站码，可空
	 * @param routeNum
	 * 			路径序号，可空
	 * @return
	 */
	public List<BaseRoutelib> queryRoutelib(String ori_station_name, String endCode);
	
	/**
	 * 
	 * @param beginCode
	 * 			起始站码，可空
	 * @param endCode
	 * 			终到站码，可空
	 * @param routeNum
	 * 			路径序号，可空
	 * @param stationNum
	 * 			经过站序号，可空
	 * @param stationCode
	 * 			经过站码，可空
	 * @return
	 */
	public List<BaseRoutelibViaStations> queryRoutelibViaSta(String ori_station_name,
			String dest_station_name);
}
