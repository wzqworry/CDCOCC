/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.Date;
import java.util.List;

import com.biierg.cocc.common.bean.PsaExchangeDate;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

/**
 * 礼品兑换日期信息 服务接口
 * @author wzq
 *
 */
public interface IPsaExchangeDateService extends IBaseService<PsaExchangeDate,String> {

	/**
	 * 根据时间范围和状态查询兑换日期
	 * @param startTime 开始时间
	 * @param endTime   结束时间
	 * @param state     状态
	 * @return List<PsaExchangeDate>
	 */
	SrvResponse<List<PsaExchangeDate>> queryExchangeDate(Date startTime,Date endTime,Integer state)
			throws SrvException;
}
