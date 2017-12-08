/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.RealDmkll;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/3/2.
 * 实时断面客流量的接口服务
 */
public interface IRealDmkllService {
    /**
     * 查询整个路网最新的全部断面的客流量
     * @param lineId
     *           为空全路网， 否则为指定线路
     * @param timeDate
     *           数据日期  必填
     * @param specialTime
     *           指定时刻；可选，默认查询最新数据
     * @param sectionId
     *           断面ID；可选，默认查询所有断面
     * @param timeGrade 时间粒度
     * @return SrvResponse<List<RealDmkll>> 符合条件的换乘站在指定时刻的换乘量
     * @throws SrvException
     * */
    List<RealDmkll> queryRealDmkll(String timeDate,String lineId,Date specialTime,
                                   String sectionId,String timeGrade) throws SrvException;
    /**
     * 查询整个路网最新的全部断面的客流量
     * @param lineId  为空全路网， 否则为指定线路
     * @param timeDate  数据日期  必填
     * @param startTime 开始时刻
     * @param endTime 结束时刻
     * @param sectionId
     *           断面ID；可选，默认查询所有断面
     * @param timeGrade 时间粒度
     * @return List<RealDmkll> 符合条件的换乘站在指定时刻的换乘量
     * @throws SrvException
     * */
    List<RealDmkll> queryRealDmkllBetween(String timeDate,String lineId,Date startTime,Date endTime,
                                   String sectionId,String timeGrade) throws SrvException;

    public List<RealDmkll> getRealDmkllChart(String timeDate, String lineId, Date specialTime, String sectionId, String timeGrade) throws SrvException;
    /**
     * 大屏断面排行榜
     * @return
     */
    List<RealDmkll> getDmkllRank(String timeDate,String timeGrade);

    public SrvResponse queryRealDmkllTrend(String timeDate, Date startTime, Date endTime, String sectionId,
                                           int forecastOption, String timeGrade) throws  SrvException;
}
