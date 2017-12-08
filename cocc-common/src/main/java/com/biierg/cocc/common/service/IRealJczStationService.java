/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.RealJczStation;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wzq on 2017/2/28.
 * 车站实时进出站量接口
 */
public interface IRealJczStationService {

    /**
     * 线路进出站排行榜
     * @param timeGrade
     * @param lineId
     * @return
     * @throws SrvException
     */
    public List<RealJczStation> queryJcstationChart(String timeGrade,String lineId,int type,String timeDate, Date specialTime)   throws SrvException;
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
    public SrvResponse<List<RealJczStation>> queryJczStationByTime(String timeDate, Date specialTime, String lineId, String stationId)
            throws SrvException;

    /**
     * 查询实时进出站 数据 带时间粒度
     * @param timeDate
     * @param specialTime
     * @param lineId
     * @param stationId
     * @param timeGrade
     * @return
     * @throws SrvException
     */
    public SrvResponse<List<RealJczStation>> queryJczStationByTime(String timeDate, Date specialTime, String lineId, String stationId,String timeGrade)
            throws SrvException;

    /**
     * SRV10017 - 当日某车站进站量趋势对比（ACC、同比、环比、预测）
     *
     * @param timeDate
     *            数据日期；必填
     * @param startTime
     *            开始时间；可空
     * @param endTime
     *            截止时间；可空
     * @param stationId
     *            车站id；必填
     * @param forecastOption
     *            预测数据选项；必填
     * @param yoyPolicy
     *            同比日期策略；必填；0-上周同期、1-上月同期、2-去年同期、3-自定义
     * @param yoyDate
     *            自定义同比日期；可空
     *
     * @return SrvResponse<Map<String, List<RealJczStation>>> 线路的进站量数据<br/>
     *         格式如：{ "cacheKey": "", "returnData": { "data": [], "yoy": [],
     *         "mom": [], "forecast": []} }
     **/
    public SrvResponse<Map<String, List<RealJczStation>>> queryJczLineTrend(String timeDate, Date startTime, Date endTime, String stationId,
                                                                            int forecastOption, int yoyPolicy, Date yoyDate) throws  SrvException;
    
    /**
     * 获取实时进站量和出站量排名前六的车站
     * @param endTime
     * @return
     */
	public SrvResponse<List<RealJczStation>> query6HeadLists(Date endTime)throws SrvException ;
    
}
