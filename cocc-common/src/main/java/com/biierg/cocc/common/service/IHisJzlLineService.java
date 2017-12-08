package com.biierg.cocc.common.service;

import java.util.Date;
import java.util.List;

import com.biierg.cocc.common.bean.HisJzlLine;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

public interface IHisJzlLineService {
	 /**
     *  - 查询线路历史进站量
     * @param timeGrade
     *            时间维度；不可空
     * @param startTime
     *            开始时间；可空
     * @param endTime
     *            截止时间；可空
     * @param lineId
     *            线路id；可空
     * @return List<HisJzlLine> 线路的进站量历史数据
     **/
	public List<HisJzlLine> queryHisJzlList(String timeGrade, Date startTime,
											Date endTime, String lineId) throws SrvException;
	/**
     * 查询线网的进站量（大屏）
     * @param timeGrade 必填 时间粒度
    * */
	public SrvResponse<List<HisJzlLine>> queryHisJzlList(String timeGrade);

}
