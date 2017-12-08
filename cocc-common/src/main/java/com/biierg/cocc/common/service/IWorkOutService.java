/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.RealKllLine;
import com.biierg.cocc.common.bean.RealKllStation;
import com.biierg.cocc.common.bean.WorkOut;
import com.biierg.cocc.common.support.SrvException;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wzq on 2017/5/3.
 *
 * 通过计算的出的各种指标的通用接口
 */
public interface IWorkOutService {
    /**
     * 计算昨日线路线网平均运距
     * @param timeDate
     * 线路平均运距 =  客运周转量/客运量(进线量+换乘量)
     * 线网平均运距 =  线网周转量/线网进线量(= 线网进线量)
     * */
    public List<WorkOut> queryAvgDistance(String timeDate) throws SrvException;


    /**
     * 计算出当前时间点终点站的客运量  和60天内 当前时间点客运量的 最大值和平均值
     * @param timeDate  实时数据的数据日期
     * @param specialTime 当前时间点
     * */
    public List<WorkOut> queryKylNowAndHis(String timeDate,String specialTime) throws SrvException;
    
    /**
     * 计算出当前时间点终点站的客运量  和60天内 当前时间点客运量的 最大值和平均值
     * @param timeDate  实时数据的数据日期
     * @param specialTime 当前时间点
     * @param timeGrade 时间粒度
     * */
    public List<WorkOut> queryKylNowAndHis(String timeDate,String specialTime,String timeGrade) throws SrvException;

    /**
     * 查询线网客流明细报表
     * @param timeGrade 时间粒度
     * @param startTime 开始时间
     * @param endTime   结束时间
     * */
    public List<WorkOut> queryNetKylDetail(String timeGrade,String startDate,String endDate,String startTime,String endTime) throws SrvException;

    /**
     * 查询客运量情况汇总
     * @param timeDate
     * @param timeGrade
     * */
    public List<WorkOut> queryKylCollect(String timeDate,String timeGrade) throws SrvException;

    /**
     * 票务运营日报 客运量情况 查询某一天的详细信息
     * @param {"timeDate":""}
     * */
    public List<WorkOut> queryKylDayDetail(String timeDate) throws SrvException;


    /**
     * 大屏  线路5分钟客流量对比(查询最近5分钟进站量、出站量、换乘量和60日平均值)(实时表)
     * */
    List<RealKllLine> queryRealKllLine(String timeGrade) throws SrvException;

    /**
     * 大屏  线路各战犯5分钟客流量对比(查询最近5分钟进站量、出站量、换乘量和60日平均值)(实时表)
     * @param lineId
     * */
    public List<RealKllStation> queryRealKllStation(String lineId,String timeGrade) throws SrvException;
}
