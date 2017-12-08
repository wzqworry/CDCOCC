/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.HisJczLineMax;
import com.biierg.cocc.common.bean.HisKylLine;
import com.biierg.cocc.common.bean.HisMax;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wzq on 2017/3/22.
 */
public interface IHisKylLineService {


    /**
     * 峰值日各线路客运量
     * @return
     * @throws SrvException
     */
    public List<HisKylLine> quereyMaxKylDay() throws SrvException;

    /**
     * 查询峰值日各线路开行列次
     * @return
     * @throws SrvException
     */
    //public List<> queryFzDayKxls() throws SrvException;

    /**
     * 查询线网(除了线网 00 )的客运量
     * @param lineId  为空查询所有，不为空查询指定线路
     * @param timeGrade 必填 时间粒度
     * @param timeDate 数据日期
     * @param specialTime
    * */
    public SrvResponse<List<HisKylLine>> queryHisKylLine(String timeDate, String timeGrade, Date specialTime, String lineId) throws SrvException;

    /**
     * 查询线网的客运量（大屏）
     *
     * @param timeGrade 必填 时间粒度
     */
    public SrvResponse<List<HisKylLine>> queryHisKylLines(String timeGrade);

    /**
     * 查询线网的客运周转量（大屏）
     * @param timeGrade 必填 时间粒度
    * */
	public SrvResponse<List<HisKylLine>> queryHisZzlLines(String timeGrade) throws SrvException;

    /**
     * 查询线网( 只查询线网 )的客运量 用于大屏的年级别的数据，
     * */
    public List<HisKylLine> queryNetKyl() throws SrvException;

    /**
     * 查询峰值日 线网客运量 除了（00） 5min 粒度
     * */
    public List<HisKylLine> queryMaxDayNetKyl() throws SrvException;

    /**
     * 查询线网的客运强度（大屏）
     *
     * @param timeGrade 必填 时间粒度
    * */
	public SrvResponse<List<HisKylLine>> queryHisKyqdLines(String timeGrade) throws SrvException;
	/**
     * 查询峰值日线网客运量,换乘量,最大客流发生时段 5min 粒度,五分钟粒度进站量、出战量（大屏）
     */
    public List<HisMax> queryMaxDay() throws SrvException;

    /**
     * 大屏 线网全年各月日均客运量及趋势
     *
     * @param timeGrade 时间粒度
     * @param monthMap  两个key"preMonthes","currentMonthes"，分别代表“上一周期的12个月”“本周期的12个月”
     * @return Map 两个key "preKylList","currentKylList"，分别代表“上一周期全年各月日均客运量”“本周期全年各月日均客运量”
     */
    SrvResponse<Map<String, List<Integer>>> queryXwYmdKylAvgTrend(String timeGrade, Map<String, List<Date>> monthMap);

	/**
     * 查询峰值日线网最大客流发生时段 一小时 粒度进站量、出战量（大屏）
    * */
	public List<HisMax> queryMaxDayVisit() throws SrvException;
	/**
     * 查询05min历史各线路最大进出站量
    * */
	public List<HisJczLineMax> queryHisMaxJczLines(String timeGrade);
	
	/**
	 * 查询平均运距(线网票务运营日报)
	 * @param timeDate
	 * @param timeGrade
	 * @return
	 */
	public Float queryAvgDistance(String timeDate,String timeGrade);

}
