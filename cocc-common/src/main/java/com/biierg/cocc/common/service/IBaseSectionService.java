/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.BaseSections;
import com.biierg.cocc.common.support.SrvException;

/**
 * 断面基础信息服务
 *
 * @author lei
 */
public interface IBaseSectionService {

	/**
	 * SRVB004 - 根据线路ID获取所有断面
	 *
	 * @param lineCode
	 *            线路id；必填
	 * @param direction
	 *            上下行；可空
	 * @return 符合条件的断面信息列表
	 * @throws SrvException
	 */
	public List<BaseSections> querySection(String lineCode, Integer direction) throws SrvException;

	public List<BaseSections> queryShortNameSections(String lineCode, Integer direction) throws SrvException;
	/**
	 * 根据线路名称 上下行 开始站 终点站 获取 开始站和终点站之间的全部断面(只能查一条线上的,跨线不能)
	 * 总结  ****  下行的 begin_code < end_code  and direction = 2
	 * 		 ****  上行的 begin_code > end_code  and direction = 1
	 * @param lineName  线路名称；可以不填
	 * @param direction 上下行；必填
	 * @param beginCode 开始站
	 * @param endCode 终点站
	 * @return 符合条件的断面信息列表
	 * @throws SrvException
	 */
	List<BaseSections> queryPartSection(String lineName, String direction,String beginCode,String endCode) throws SrvException;
}
