package com.biierg.cocc.common.service;

import java.util.Date;
import java.util.List;

import com.biierg.cocc.common.bean.HisHclLine;
import com.biierg.cocc.common.bean.HisKylLine;
import com.biierg.cocc.common.support.SrvResponse;

public interface IHisHclLineService {
	/**
	 *  - 查询线路历史换乘量
	 * @param timeDate
	 * @param timeGrade
	 *            数据日期；必填
	 * @param sdate
	 *            开始时间；可空
	 * @param edate
	 *            截止时间；可空
	 * @param lineId
	 *            线路id；可空
	 *
	 * @return SrvResponse<List<HisJzlLine>> 线路的换乘量历史数据
	 **/
	public List<HisHclLine> queryHisHclList(String timeDate,String timeGrade, Date sdate,
											Date edate, String lineId);
	/**
	 * 查询线网的换乘量（大屏）
	 * @param timeGrade 必填 时间粒度
	 * */
	public SrvResponse<List<HisHclLine>> queryHisHclList(String timeGrade);

}
