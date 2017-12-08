package com.biierg.cocc.common.service;

import java.util.List;
import java.util.Map;

import com.biierg.cocc.common.bean.BaseBankServiceBranch;
import com.biierg.cocc.common.bean.BaseStationFacility;
import com.biierg.cocc.common.bean.BaseStationShops;
import com.biierg.cocc.common.bean.BaseTFTServiceNetWork;
import com.biierg.cocc.common.bean.DeviceFaultInfo;
import com.biierg.cocc.common.bean.PsaEquipmentRepair;

public interface IBaseStationFacilityService {
	/**
	 * 获取车站设施
	 * 
	 * @param line_code
	 * @param station_code
	 * @return
	 */
	public List<BaseStationFacility> getStationEquipment(String line_code, String station_code);

	/**
	 * 增加设备故障提报记录
	 * 
	 * @param bean
	 * @return
	 */
	public int putEquipmentfail(PsaEquipmentRepair bean);

	/**
	 * 获取商铺信息
	 * 
	 * @param line_code
	 * @param station_code
	 * @return
	 */
	public List<BaseStationShops> getStationShops(String line_code, String station_code);

	/**
	 * 获取天府通服务网点
	 * 
	 * @param line_code
	 * @return
	 */
	public List<BaseTFTServiceNetWork> getTFTService(String line_code);

	/**
	 * 获取银行自助服务网点（ATM位置）
	 * 
	 * @param line_code
	 * @return
	 */
	public List<BaseBankServiceBranch> getBankService(String line_code);

	/**
	 * 根据设备类型编码查询故障码
	 * 
	 * @param type_code
	 * @return
	 */
	public List<DeviceFaultInfo> getDeviceFault(String type_code);

	// 以下车站设施web维护页面接口（wenjuan.wang）
	// 获取车站设施
	public List<BaseStationFacility> getStationEquipmentWEB(Map<String, Object> param) throws Exception;

	/**
	 *
	 * @param baseStationFacility
	 * @return 插入一条设备信息
	 */
	public int insertBaseStationEquipment(BaseStationFacility baseStationFacility) throws Exception;

	/**
	 *
	 * @param baseStationFacility
	 * @return 更改一条车站设备信息
	 */
	public int updateBaseStationEquipment(BaseStationFacility baseStationFacility) throws Exception;
	
	/**
	 * 更新车站网点信息
	 * @param baseStationFacility
	 * @return
	 * @throws Exception
	 */
	public int updateBaseStationDot(BaseStationFacility baseStationFacility) throws Exception;

	/**
	 *
	 * @param id
	 * @return 删除一条车站设备
	 */
	public int deleteBaseStationEquipment(String id) throws Exception;
	
	/**  
	* @Title: reportingInterval  
	* @Description: 查询设备报修相邻两次提报间隔时间 
	* @param memberId
	* @return PsaEquipmentRepair      
	* @throws  
	*/  
	public PsaEquipmentRepair reportingInterval(String memberId); 
}
