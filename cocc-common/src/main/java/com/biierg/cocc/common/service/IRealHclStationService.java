/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.RealHclStation;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/2/28.
 * 车站换乘量服务接口
 */
public interface IRealHclStationService {
    /**
     * SRV10003 - 查询某条线路各个换乘站某个时间点的换乘量
     *
     * @param timeDate
     *            数据日期；必填
     * @param specialTime
     *            指定时刻；可选，默认查询最新数据
     * @param lineId
     *            线路ID；可选，默认查询所有线路
     * @param stationId
     *            车站ID；可选，默认查询所有换乘站
     * @return SrvResponse<List<RealHclStation>> 符合条件的换乘站在指定时刻的换乘量
     * @throws SrvException
     */
    public SrvResponse<List<RealHclStation>> queryHclStationByTime(String timeDate, Date specialTime, String lineId,
                                                             String stationId) throws SrvException;

    /**
     *  查询某条线路各个换乘站某个时间点某个时间粒度的换乘量
     * @param timeDate
     * @param specialTime
     * @param lineId
     * @param stationId
     * @param timeGrade
     * @return
     * @throws SrvException
     */
    public SrvResponse<List<RealHclStation>> queryHclStationByTime(String timeDate, Date specialTime, String lineId,
                                                                   String stationId,String timeGrade) throws SrvException;
}
