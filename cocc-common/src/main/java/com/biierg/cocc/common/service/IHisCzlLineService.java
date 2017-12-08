package com.biierg.cocc.common.service;

import java.util.Date;
import java.util.List;

import com.biierg.cocc.common.bean.HisCzlLine;
import com.biierg.cocc.common.support.SrvResponse;

public interface IHisCzlLineService {
	/**
     *  - 查询线路历史出站量
     *
     * @param timeDate
     *            数据日期；必填
     * @param startTime
     *            开始时间；可空
     * @param endTime
     *            截止时间；可空
     * @param lineId
     *            线路id；可空
     *
     * @return SrvResponse<List<HisCzlLine>> 线路的出站量历史数据
     **/
	public SrvResponse<List<HisCzlLine>> queryHisCzlList(String timeGrade, Date sdate,
			Date edate, String lineId);

}
