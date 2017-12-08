/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.EarthQuakeIntensity;
import com.biierg.cocc.common.bean.SampleSite;
import com.biierg.cocc.common.support.SrvException;

/**
 * 烈度  和 观测点的service
 * @author wzq
 *
 */
public interface IEarthquakeIntensityService {
	
	/**
	 *  根据eventId 查询最新的观测烈度
	 *  @param eventId
	 */
	EarthQuakeIntensity queryIntensity(String eventId) throws SrvException;

	
	/**
	 * 根据eventId 查询最新一批 - 所有的观测点
	 * @param eventId
	 */
	List<SampleSite> querySite(String eventId) throws SrvException;
	
}
