/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;
import java.util.Map;

import com.biierg.cocc.common.bean.BaseStationEquipment;

/**
 * Created by xys on 2017/7/27.
 */
public interface BaseStationEquipmentService {

	/**
	 * 
	 * @param BaseStationEquipment
	 * @return
	 * 插入一条设备信息
	 */
	public int insertBaseStationEquipment(BaseStationEquipment baseStationEquipment)throws Exception;
	/**
	 * 
	 * @param BaseStationEquipment
	 * @return
	 * 更改一条车站设备信息
	 */
	public int updateBaseStationEquipment(BaseStationEquipment baseStationEquipment)throws Exception;
	/**
	 * 
	 * @param param
	 * @return
	 * 查询设备列表
	 */
	public List<BaseStationEquipment> queryBaseStationEquipmentList(Map<String,Object> param)throws Exception;
	/**
	 * 
	 * @param BaseStationEquipment
	 * @return
	 * 删除一条车站设备
	 */
	public int deleteBaseStationEquipment(String baseStationEquipment)throws Exception;
	
//	public	List<BaseStationEquipment> getStationEquipment(String line_code, String station_code);
}
