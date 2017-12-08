/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.HisCzlStation;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/3/31.
 */
public interface IHisCzlStationService {

    /**
     * 查询线路 的 进站量  topN 17/06/13 取消这个服务的使用
     * @param lineId  可空 为空查询整个线网
     * @param timeGrade 时间粒度  必填
     * @param startTime 时间段  起始时间
     * @param endTime 时间段 终止时间
     * @param topN  前n名
     * @param type 1.是明细（明细partition by start_time,）， 2是统计
     * @return  List<HisCzlStation>
     * */
    public List<HisCzlStation> queryTopHisCzl(String lineId, String timeGrade, Date startTime,
                                                           Date endTime, Integer topN,Integer type) throws SrvException;
    /**
     *  - 查询车站历史出站量
     * @param timeGrade
     *            数据日期；可空
     * @param startTime
     *            开始时间；可空
     * @param endTime
     *            截止时间；可空
     * @param lineId
     *            线路id；可空
     * @return List<HisCzlStation> 车站的出站量历史数据
     **/
	public List<HisCzlStation> queryHisCzlStationList(String timeGrade, Date startTime, Date endTime, String lineId) throws SrvException;
	
	/**
     * 查询线路 的 进站量  top10
     * @param lineId  可空 为空查询整个线网
     * @param timeGrade 时间粒度  必填
     * @param timeDate 日期
     * @param topN  前n名
     * @return  SrvResponse<List<HisCzlStation>>
     * */
    public SrvResponse<List<HisCzlStation>> queryTopTenCzl(String lineId, String timeGrade, String timeDate, Integer topN) throws SrvException;
}
