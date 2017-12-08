package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.BaseStationDistTime;
import com.biierg.cocc.common.vo.AtsTrainStationVo;

/**
 * @author wxs 站间距及运行时间查询服务接口
 */
public interface IBaseStationDistTimeService {

	/**
	 * 查询断面站间距及运行时间
	 * 
	 * @return
	 */
	public List<BaseStationDistTime> getStationDistTime();

	/**
	 * 列车途经车站查询
	 * 
	 * @return
	 */
	public List<AtsTrainStationVo> getTrainStation();
}
