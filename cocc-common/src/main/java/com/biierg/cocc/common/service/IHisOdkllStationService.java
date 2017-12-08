/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.HisOdkllStation;
import com.biierg.cocc.common.support.SrvException;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/5/31.
 * 非实时数据 - 车站OD客流量的服务接口
 */
public interface IHisOdkllStationService {
    /**
     * OD客流明细报表
     * @param timeDate          日期
     * @param timeGrade         时间粒度
     * @param startTime         开始时间
     * @param endTime           结束时间
     * @param lineOriginId     起始线路id
     * @param stationOriginId  起始站点id
     * @param lineDestId        终点线路id
     * @param stationDestId    终点站点id
     * @param pageSize          分页大小
     * @param pageNum           分页页号
     * */

    public List<HisOdkllStation> queryOdkllDetail(String timeDate,String timeGrade,Date startTime,Date endTime,String lineOriginId,String stationOriginId,
                                                  String lineDestId,String stationDestId,Integer pageSize,Integer pageNum) throws SrvException;

    /////////////
    /**
     * OD客流明细报表
     * @param timeDate          日期
     * @param timeGrade         时间粒度
     * @param startTime         开始时间
     * @param endTime           结束时间
     * @param lineOriginId     起始线路id
     * @param stationOriginId  起始站点id
     * @param lineDestId        终点线路id
     * @param stationDestId    终点站点id
     * @param pageSize          分页大小
     * @param pageNum           分页页号
     * */

    public List<HisOdkllStation> queryOdkllDetailReport(String timeDate,String timeGrade,String startDate,String endDate,String startTime,String endTime,String lineOriginId,String stationOriginId,
                                                  String lineDestId,String stationDestId,Integer pageSize,Integer pageNum) throws SrvException;
    /**
     * 大屏OD排行
     * @return
     */
	public List<HisOdkllStation> getOdkllRank(String timeDate);
}
