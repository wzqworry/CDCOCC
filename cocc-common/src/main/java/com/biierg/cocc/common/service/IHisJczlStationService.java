/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.HisCzlStation;
import com.biierg.cocc.common.bean.HisJczlStation;
import com.biierg.cocc.common.support.SrvException;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/6/13.
 */
public interface IHisJczlStationService {
    /**
     * 分时最大进出站客流明细
     * 查询线路 的 进站量  topN
     * @param lineId  可空 为空查询整个线网
     * @param timeGrade 时间粒度  必填
     * @param startTime 时间段  起始时间
     * @param endTime 时间段 终止时间
     * @param topN  前n名
     * @return  List<HisJczlStation>
     * */
    public List<HisJczlStation> queryHourDetail(String lineId, String timeGrade,String startDate,String endDate, String startTime,
                                               String endTime, Integer topN) throws SrvException;

    /**
     * 分时最大进出站客流统计
     * 查询线路 的 进站量  topN
     * @param lineId  可空 为空查询整个线网
     * @param timeGrade 时间粒度  必填
     * @param startTime 时间段  起始时间
     * @param endTime 时间段 终止时间
     * @param topN  前n名
     * @return  List<HisJczlStation>
     * */
    public List<HisJczlStation> queryHourCount(String lineId, String timeGrade,String startDate,String endDate, String startTime,
                                                String endTime, Integer topN) throws SrvException;

}
