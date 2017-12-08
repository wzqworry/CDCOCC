/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.BaseAtsLines;
import com.biierg.cocc.common.bean.BaseLines;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.vo.AppLinesToTimefl;
import com.biierg.cocc.common.vo.BaseLinesVo;

/**
 * 线路基础信息服务
 * 
 * @author lei
 */
public interface IBaseLinesService {

	/**
	 * SRVB001 - 获取所有线路
	 * 
	 * @param lineCode
	 *            线路编号；可空
	 * @param lineState
	 *            开通状态；可空，默认查询开通的
	 * @return List<BaseLines>
	 */
	public List<BaseLines> queryLines(String lineId, int lineState) throws SrvException;
	
	/**
	 * 获取ATS所有线路信息
	 * @param fdNumber
	 *          编号:可空
	 * @param enableType
	 *          开通状态；可空， 默认查询所有
	 * @return
	 * @throws SrvException
	 */
	public List<BaseAtsLines> queryAtsLines(String fdNumber,Integer enableType) throws SrvException;
	
	/**app - 获取线路
	 * @param lineId
	 * 		  线路编号；可空
	 * @param lineState
	 * @return 
	 * @throws SrvException
	 */
	public List<BaseLinesVo> getAppLines(String lineId, Integer lineState) throws SrvException;
	
	/**
	 * @param lineId
	 * @return
	 * @throws SrvException
	 */
	public AppLinesToTimefl getLinesUpOrder(String lineId) throws SrvException;
	
}
