package com.biierg.cocc.common.service;

import java.util.List;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.vo.AppTimeflToInStation;
import com.biierg.cocc.common.vo.AppTimeflToParam;
import com.biierg.cocc.common.vo.AppTimetableflVo;
import com.biierg.cocc.common.vo.BaseTimetableflVo;

/**
 * @Title: IBaseTimeTableFlService
 * @Description: 首末班查询接口
 * @author: wxs
 * @date: 2017年10月31日 下午5:30:14
 */
public interface IBaseTimeTableFlService {

	/**  
	* @Title: getFlTimeList  
	* @Description: 首末班时刻查询接口  
	* @param line_Id
	* @param start_station_id
	* @param dest_station_id
	* @param direction
	* @param up_order
	* @return
	* @throws SrvException List<AppTimeflToInStation>      
	*/  
	public List<AppTimeflToInStation> getFlTimeList(String line_Id, String start_station_id, String dest_station_id,
			int direction, int up_order) throws SrvException;

	/**  
	* @Title: getInStationFlTimeList  
	* @Description: 站内首末班接口  
	* @param station_name_cn
	* @return
	* @throws SrvException List<BaseTimetableflVo>        
	*/  
	public List<BaseTimetableflVo> getInStationFlTimeList(String station_name_cn) throws SrvException;

	/**  
	* @Title: getFlTimeParamList  
	* @Description: 车站基础信息查询接口（线路编码、起始站编码、终点站编码、途径站编码、运行方向）  
	* @return
	* @throws SrvException List<AppTimeflToParam>      
	*/  
	public List<AppTimeflToParam> getFlTimeParamList() throws SrvException;

	/**  
	* @Title: querySlTimeFls  
	* @Description: 最早首班、最晚首班和最早末班、最晚末班查询接口
	* @return List<AppTimetableflVo>      
	* @throws  
	*/  
	public List<AppTimetableflVo> querySlTimeFls();
	
	/**
	 * 查询 最早早班和最晚末班（不分线路）
	 * @return
	 */
	public AppTimetableflVo queryTimeFlsForYjd();

}
