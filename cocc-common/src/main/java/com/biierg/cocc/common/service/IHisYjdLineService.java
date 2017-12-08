/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.HisYjdLine;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/3/22.
 * 线路拥挤度的服务
 */
public interface IHisYjdLineService {
    /**
    *  查询线网线路 分上下行 的线路平均拥挤度
    *  @param dir  1-上行 2-下行 空全部
     * @param lineId  为空查询所有，不为空查询指定线路
     * @param timeGrade 必填 时间粒度
     * @param timeDate 数据日期
     * @param specialTime
     *           指定时刻；可选，默认查询最新数据
    * */
    public SrvResponse<List<HisYjdLine>> queryHisYjd(String timeDate,String timeGrade, Date specialTime, String lineId, Integer dir) throws SrvException;
    /**
    *  查询线网拥挤度
     * @param timeDate 可选
     * @param timeGrade  可选
     * @param sdate 开始时间 可选
     * @param edate 结束时间 可选
     *  @param sectionId  可选
    * */
	public SrvResponse<List<HisYjdLine>> queryHisDmYjd(String timeDate,
			String timeGrade, Date sdate, Date edate, String lineId);

}
