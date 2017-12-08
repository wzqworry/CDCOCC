/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.HisJzlStation;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/3/31.
 */
public interface IHisJzlStationService {

    /**
     * 查询线路 的 进站量  topN   17/06/13 取消这个服务的使用
     * @param lineId  可空 为空查询整个线网
     * @param timeGrade 时间粒度  必填
     * @param startTime 时间段  起始时间
     * @param endTime 时间段 终止时间
     * @param topN  前n名
     * @param type 1.是明细（明细partition by start_time,）， 2是统计
     * @return  List<HisJzlStation>
     * */
    public List<HisJzlStation> queryTopHisJzl(String lineId, String timeGrade, Date startTime,
                                                           Date endTime, Integer topN,Integer type) throws SrvException;
    /**
     *  - 查询车站历史进站量
     *
     * @param timeDate
     *            数据日期；可空
     * @param timeGrade
     * @param sdate
     *            开始时间；可空
     * @param edate
     *            截止时间；可空
     * @param lineId
     *            线路id；可空
     *
     * @return SrvResponse<List<HisJzlLine>> 车站的进站量历史数据
     **/
	public List<HisJzlStation> queryHisJzlStationList(String timeDate,
			String timeGrade, Date sdate, Date edate, String lineId);

    /**
     * SRV10031 - 当日某线路指定时刻所有车站进站量（ACC）
     *
     * @param timeDate
     *            数据日期；必填
     * @param specialTime
     *            指定时刻；可空、默认查询最新数据
     * @param lineId
     *            线路id；可选，默认查询所有线路数据
     * @param stationId
     *            站点id；可选，默认查询所有站点数据
     *
     * @return SrvResponse<List<MatJzlStation>> 该线路所有站点的进站量数据
     **/
    public SrvResponse<List<HisJzlStation>> queryJzlTime(String timeDate, Date specialTime, String lineId, String stationId)
            throws SrvException;
    
    /**
     * 查询车站 的 进站量  top10
     * @param lineId  可空 为空查询整个线网
     * @param timeGrade 时间粒度  必填
     * @param timeDate 日期
     * @param topN  前n名
     * @return  SrvResponse<List<HisJzlStation>>
     * */
    public SrvResponse<List<HisJzlStation>> queryTopTenJzl(String lineId, String timeGrade, String timeDate, Integer topN) throws SrvException;
}
   
    
