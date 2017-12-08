/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.Date;
import java.util.List;

import com.biierg.cocc.common.bean.Delay;
import com.biierg.cocc.common.bean.XczzNotes;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

/**
 * 延误事件服务
 * @author LK
 *
 */
public interface IDelayService extends IBaseService<Delay, String> {
	
	/**
	 *  获取延误信息列表
     * @param keyWord 关键字
     * @param start 开始日期
     * @param end 结束日期
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @param delayCause 晚点原因
	 * @return SrvResponse<List<BaseLines>>
	 */
	public SrvResponse<List<Delay>> queryDelay(Date start,Date end,String startTime,String endTime,String keyWord,String delayCause) throws SrvException;
	
	/**
	 * 查询最大的pd_Index
	 * @return
	 * @throws SrvException
	 */
	public Delay queryMaxIndex() throws SrvException;

}
