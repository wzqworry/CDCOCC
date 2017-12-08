/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.RealJczLine;
import com.biierg.cocc.common.bean.RealJczStation;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wzq on 2017/2/28.
 * 线路实时进出站量接口
 */
public interface IRealJczLineService {

    /**
     * 线网进出站排行榜
     * @param timeGrade
     * @return
     * @throws SrvException
     */
    public Map<String,List<RealJczLine>> queryJcChart(String timeDate,String timeGrade,int type) throws SrvException;

    public List<RealJczLine> queryLineJcSumChart(String timeDate,String timeGrade,int type) throws SrvException;


    /**
     *  - 当日各线路进出站量趋势对比（ACC）
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
     * @return SrvResponse<List<RealJczLine>> 线路的进出站量数据
     **/
	public SrvResponse<List<RealJczLine>> queryJczLine(String timeDate, Date startTime, Date endTime, String lineId,String timeGrade)
            throws SrvException;

    /**
     *  - 当日各线路指定时间的进出站量趋势对比（ACC）
     *
     * @param timeDate
     *            数据日期；必填
     * @param specialTime
     *            指定时刻；可空、默认查询最新数据
     * @param lineId
     *            线路id；可空
     *
     * @return SrvResponse<List<RealJczLine>> 线路的进出站量数据
     **/
    public SrvResponse<List<RealJczLine>> queryJczLine(String timeDate,Date specialTime, String lineId)
            throws SrvException;

    /**
     * 当日各线路指定时间指定粒度的进出站量趋势对比（ACC）
     * @param timeDate
     * @param specialTime
     * @param lineId
     * @param timeGrade
     * @return
     * @throws SrvException
     */
    public SrvResponse<List<RealJczLine>> queryJczLine(String timeDate,Date specialTime, String lineId,String timeGrade)
            throws SrvException;

    /**
     *  - 当日某线路进出站量趋势对比（ACC、同比、环比、预测）
     *
     * @param timeDate
     *            数据日期；必填
     * @param startTime
     *            开始时间；可空
     * @param endTime
     *            截止时间；可空
     * @param lineId
     *            线路id；必填
     * @param forecastOption
     *            预测数据选项；必填
     * @param yoyPolicy
     *            同比日期策略；必填；0-上周同期、1-上月同期、2-去年同期、3-自定义
     * @param yoyDate
     *            自定义同比日期；可空
     *
     * @return SrvResponse<Map<String, List<RealJczLine>>> 线路的进站量数据<br/>
     *         格式如：{ "cacheKey": "", "returnData": { "data": [], "yoy": [],
     *         "mom": [], "forecast": []} }
     **/
    public SrvResponse<Map<String, List<RealJczLine>>> queryJczLineTrend(String timeDate,Date startTime,Date endTime,String lineId,
                                                                         int forecastOption,int yoyPolicy,Date yoyDate) throws  SrvException;

    public SrvResponse<Map<String, List<RealJczLine>>> queryJczLineTrend(String timeDate, Date startTime, Date endTime, String lineId, int forecastOption, int yoyPolicy, Date yoyDate,String timeGrade) throws SrvException ;


    /**
     *
     - 当日某线路进出站量趋势对比（ACC、同比、环比、预测）
     *
     * @param timeDate
     *            数据日期；必填
     * @param startTime
     *            开始时间；可空
     * @param endTime
     *            截止时间；可空
     * @param lineId
     *            线路id；必填
     * @param forecastOption
     *            预测数据选项；必填
     * @param yoyPolicy
     *            同比日期策略；必填；0-上周同期、1-上月同期、2-去年同期、3-自定义
     * @param yoyDate
     *            自定义同比日期；可空
     * @param timeGrade  时间粒度
     * @return
     * @throws SrvException
     */
    public SrvResponse<Map<String, List<RealJczLine>>> queryJczLineTrend(String timeDate,Date startTime,Date endTime,String lineId,
                                                                         int forecastOption,int yoyPolicy,Date yoyDate,int forecastYoyPolicy,Date forecastYoyDate,String timeGrade) throws  SrvException;

    /**
     *  - 当日各线路进出站量趋势对比（ACC）
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
     * @return SrvResponse<List<RealJczLine>> 所有线路的实时进出站量数据
     **/
    public SrvResponse<List<RealJczLine>> queryJczLineAll(String timeDate, Date startTime, Date endTime, String lineId)
            throws SrvException;

    public SrvResponse<List<RealJczLine>> queryJczLineByTime(String timeDate, Date specialTime, String lineId,String timeGrade) throws SrvException;
    /**
     * 所有线路的实时进出站量数据
     * @param timeDate
     * @param startTime
     * @param endTime
     * @param lineId
     * @param timeGrade  时间粒度
     * @return
     * @throws SrvException
     */
    public SrvResponse<List<RealJczLine>> queryJczLineAll(String timeDate, Date startTime, Date endTime, String lineId,String timeGrade)
            throws SrvException;
    /**
     *  - 当日各线路实时进出站量
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
     * @return SrvResponse<List<RealJczLine>> 所有线路的实时进出站量数据
     **/
    public SrvResponse<List<RealJczLine>> queryJczList(String timeDate, Date startTime, Date endTime, String lineId) throws SrvException ;

    /**
     * 当日各线路实时进出站量
     * @param timeDate
     * @param startTime
     * @param endTime
     * @param lineId
     * @param timeGrade 时间粒度
     * @return
     * @throws SrvException
     */
    public SrvResponse<List<RealJczLine>> queryJczList(String timeDate, Date startTime, Date endTime, String lineId,String timeGrade) throws SrvException ;

    /**
     *  大屏 重点换乘站经过线路客流量监察 （实时）
     * */
    public List<RealJczLine> queryRealJczLine() throws SrvException;
    
    /**
     * 重点站所在线路进出站量监察（大屏）
     * @return
     * @throws SrvException
     */
    public List<RealJczLine> queryJCZNowAndHis(String timeGrade) throws SrvException;
    
    
    
}
