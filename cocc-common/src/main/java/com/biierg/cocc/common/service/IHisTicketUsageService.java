/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.HisTicketUsage;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wzq on 2017/5/4.
 */
public interface IHisTicketUsageService {
	/**
	 * 查询指定日期段的票卡量 和 票卡使用比例
	 * @param start 开始日期
	 * @param end 结束日期
	 * @param lineId 线路ID
	 * @param stationId 车站ID
	 * @param timeGrade 时间粒度
	 * @return List
	 * @throws List<HisTicketUsage> 后台服务异常
	 */
	public List<HisTicketUsage>listTicketUsage(Date start, Date end, String lineId, String stationId, String timeGrade) throws SrvException;
	///////////////
    /**
     *  查询指定日期的票卡量 和 票卡使用比例
     *  @param timeDate
     *  @param timeGrade
     *  @param ticketType
     *  @param lineId
     * */
    public List<HisTicketUsage> queryTicketUsage(String timeDate,String timeGrade,Integer ticketType,String lineId) throws SrvException;
    /**
	 * 查询指定日期段的票卡量 和 票卡使用比例
	 * @param startDate 开始日期
	 * @param endDate 结束日期
	 * @param startTime 开始时间
	 * @param endTime 结束时间
	 * @param lineId 线路ID
	 * @param stationId 车站ID
	 * @param timeGrade 时间粒度
	 * @return List
	 * @throws List<HisTicketUsage> 后台服务异常
	 */
	public List<HisTicketUsage>listTicketUsageReport(String startDate, String endDate,String startTime, String endTime, String lineId, String stationId, String timeGrade) throws SrvException;
	
	/**
	 * 查询指定日期的分票种票卡量 和 票卡使用比例(线网票务运营日报)
	 * @param timeDate 日期
	 * @param timeGrade 时间粒度
	 * @return
	 */
	public List<HisTicketUsage> queryTicketUsage(String timeDate,String timeGrade);
	
	/**
	 * 查询指定日期单程票发售比例(TVM%)(线网票务运营日报)
	 * @param timeDate 日期
	 * @param timeGrade 时间粒度
	 * @return
	 */
	public Float querySingleTrip(String timeDate,String timeGrade);
	
	/**
	 * 查询平均票价
	 * @param timeDate
	 * @param timeGrade
	 * @return
	 */
	public Float avgPrice(String timeDate,String timeGrade);
	
	/**
	 * 查询每人次票务收入（元/人次）
	 * @param timeDate
	 * @param timeGrade
	 * @return
	 */
	public Float avgTicketRevenue(String timeDate,String timeGrade);
	
}
