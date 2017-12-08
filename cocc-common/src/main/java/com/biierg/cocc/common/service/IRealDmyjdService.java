/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.RealDmyjd;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;
import com.biierg.cocc.common.vo.RealDmyjdVo;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wzq on 2017/3/23.
 */
public interface IRealDmyjdService {
    /**
     *   查询指定线路所有断面指定时刻的 线路拥挤度
     *   @param lineId  必填
     *   @param timeDate 必填
     *   @param specialTime 指定时刻，为空则查询最新记录
     * */
    public SrvResponse<List<RealDmyjd>> queryRealDmyjd(String timeDate, Date specialTime, String lineId) throws SrvException;

    /**
     * 查询指定线路所有断面指定时刻的 线路拥挤度
     * @param timeDate
     * @param specialTime
     * @param lineId
     * @param timeGrade  时间粒度
     * @return
     * @throws SrvException
     */
    public SrvResponse<List<RealDmyjd>> queryRealDmyjd(String timeDate, Date specialTime, String lineId,String timeGrade) throws SrvException;

    /**
     * 查询所有基础断面关联的拥挤度数据
     * @param timeDate  当前时间
     * @param specialTime 指定时段
     * @param lineId 线路id
     * @param timeGrade  时间粒度
     * @return
     * @throws SrvException
     */
    public SrvResponse<List<RealDmyjd>> queryNewRealDmyjd(String timeDate, Date specialTime, String lineId, String timeGrade) throws SrvException;
   
    /**
     * 查询所有基础断面关联的拥挤度数据  --线网拥挤度图数据渲染
     * @param timeDate  当前时间
     * @param specialTime 指定时段
     * @param lineId 线路id
     * @param timeGrade  时间粒度
     * @return
     * @throws SrvException
     */
    public Map<String,Object> realDmyjdSearch(String timeDate, Date specialTime, String lineId,String timeGrade) throws SrvException;
    
    /**
     *   查询系统当前时间的 线路拥挤度
     *   @param updateTime 默认系统当前时间
     * */
    public Map<String,Object> realDmyjdSearch();
	
    /**
     *  断面拥挤度排行榜
     * @return
     * @throws SrvException
     */
    public List<RealDmyjd> queryRealDmyjdChart(String timeDate, Date specialTime,String lineId,String timeGrade) throws SrvException;


    /**
     * 拥挤度 同比、环比、实际、预测
     * @param timeDate
     * @param startTime
     * @param endTime
     * @param sectionId
     * @param forecastOption
     * @return
     * @throws SrvException
     */
    public Map<String, List<RealDmyjd>> queryRealDmyjdTrend(String timeDate, Date startTime, Date endTime, String sectionId,
                                                                         int forecastOption,String timeGrade) throws  SrvException;

    Date queryMaxTime(String timeGrade);

    /**
     * 新增记录
     * */
    boolean create(RealDmyjd realDmyjd);

    boolean createBatch(List<RealDmyjd> realDmyjdList);

    /**
     * 查询拥挤度数据来进行计算
     * @param dateList 日期字符串
     * @param lineId
     * @param sectionId
     * @param startTimeStr 开始时间字符串
     * @param endTimeStr 结束时间字符串
     * */
    List<RealDmyjd> getDmyjdList(List<String> dateList, String lineId, String sectionId, String startTimeStr, String endTimeStr) throws SrvException;

    /**
     * 删除某个时间段之内的断面拥挤度数据（计算断面拥挤度使用）
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @param timeGrade 时间粒度
     * */
    boolean deleteByTime(Date startTime,Date endTime,String timeGrade) throws SrvException;

    /**
     * 基础断面总条数
     * @return
     */
    int getTotalSections();

    public List<RealDmyjd> getYjdBySpecifyDate(String timeDate,String timeGrade) throws SrvException;
}
