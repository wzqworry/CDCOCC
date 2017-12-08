/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.RealHclLine;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wzq on 2017/2/28.
 * 线路换乘量服务接口
 */
public interface IRealHclLineService {
    /**
     * SRV10034 - 查询某条线路的换乘量趋势
     *
     * @param timeDate
     *            数据日期；必填
     * @param startTime
     *            开始时间；可空
     * @param endTime
     *            截止时间；可空
     * @param lineId
     *            线路ID；必填
     *
     * @return SrvResponse<List<RealHclLine>>
     * @throws SrvException
     */
    public SrvResponse<List<RealHclLine>> queryHclLine(String timeDate, Date startTime, Date endTime, String lineId) throws SrvException;

    public SrvResponse<List<RealHclLine>> queryHclLine(String timeDate, Date startTime, Date endTime, String lineId,String timeGrade) throws  SrvException;

    /**
     * SRV10033 - 查询某条线路的换乘量趋势
     *
     * @param timeDate
     *            数据日期；必填
     * @param startTime
     *            开始时间；可空
     * @param endTime
     *            截止时间；可空
     * @param lineId
     *            线路ID；必填
     * @param forecastOption
     *            预测数据选项；必填
     * @param yoyPolicy
     *            同比日期策略；必填；0-上周同期、1-上月同期、2-去年同期、3-自定义
     * @param yoyDate
     *            自定义同比日期；可空
     *
     * @return SrvResponse<Map<String, List<RealHclLine>>> 线路的换乘量数据<br/>
     *         格式如：{ "cacheKey": "", "returnData": { "data": [], "yoy": [],
     *         "mom": [], "forecast": []} }
     * @throws SrvException
     */
    public SrvResponse<Map<String, List<RealHclLine>>> queryHclLineTrend(String timeDate, Date startTime, Date endTime,
                                String lineId, int forecastOption, int yoyPolicy, Date yoyDate) throws SrvException;
    

    /**
     * SRV10033 - 查询某条线路的换乘量趋势
     *
     * @param timeDate
     *            数据日期；必填
     * @param startTime
     *            开始时间；可空
     * @param endTime
     *            截止时间；可空
     * @param lineId
     *            线路ID；必填
     * @param forecastOption
     *            预测数据选项；必填
     * @param yoyPolicy
     *            同比日期策略；必填；0-上周同期、1-上月同期、2-去年同期、3-自定义
     * @param yoyDate
     *            自定义同比日期；可空
     *
     * @return SrvResponse<Map<String, List<RealHclLine>>> 线路的换乘量数据<br/>
     *         格式如：{ "cacheKey": "", "returnData": { "data": [], "yoy": [],
     *         "mom": [], "forecast": []} }
     * @throws SrvException
     */
    public SrvResponse<Map<String, List<RealHclLine>>> queryHclLineTrend(String timeDate, Date startTime, Date endTime,
                                String lineId, int forecastOption, int yoyPolicy, Date yoyDate, String timeGrade) throws SrvException;
    
    /**
     * SRV10034 - 查询所有线路的换乘量
     *
     * @param timeDate
     *            数据日期；必填
     * @param startTime
     *            开始时间；可空
     * @param endTime
     *            截止时间；可空
     * @param lineId
     *            线路ID；可空
     *
     * @return SrvResponse<List<RealHclLine>>
     * @throws SrvException
     */
    public SrvResponse<List<RealHclLine>> queryHclList(String timeDate, Date startTime, Date endTime, String lineId) throws SrvException;

    /**
     * 查询所有线路的换乘量
     * @param timeDate
     * @param startTime
     * @param endTime
     * @param lineId
     * @param timeGrade  时间粒度
     * @return
     * @throws SrvException
     */
    public SrvResponse<List<RealHclLine>> queryHclList(String timeDate, Date startTime, Date endTime, String lineId,String timeGrade) throws SrvException;

    /**
     * 查询数据库中最新的换乘量（包括线网）
     * @param timeDate
     * @param lineId
     * @param timeGrade  时间粒度
     * @return
     * @throws SrvException
     */
    List<RealHclLine> queryNewestHcl(String timeDate,String lineId,String timeGrade) throws SrvException;
}
