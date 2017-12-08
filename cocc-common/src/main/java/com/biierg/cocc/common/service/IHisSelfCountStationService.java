/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.HisSelfCountStation;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wzq on 2017/3/29.
 * 查询历史进出站量
 */
public interface IHisSelfCountStationService {
    /**
     * SRV11002 - 车站客流明细数据查询服务 ( 车站客流明细表 && 换乘站客流明细表 )
     * 
     * @param startDate
     *            起始日期
     * @param endDate
     *            截止日期
     * @param startTime
     *            起始时间
     * @param endTime
     *            截止时间
     * @param lineId
     *            线路ID
     * @param stationId
     *            车站ID
     * @param timeGrade
     * @return Map<String,Object>
     * @throws SrvException
     */
    public Map<String,Object> queryStationKllDetail(String startDate, String endDate,String startTime,String endTime, String lineId, String stationId,
                                                    String timeGrade, Integer pageSize, Integer pageNumber) throws SrvException;

    /**
     * 车站换乘量明细数据查询服务
     *
     * @param startTime
     *            起始时间
     * @param endTime
     *            截止时间
     * @param lineId
     *            线路ID
     * @param stationName
     *            车站ID
     * @param timeGrade
     * @return Map<String,Object>
     * @throws SrvException
     */
    public Map<String,Object> queryHisHclStation(String startDate, String endDate,String startTime,String endTime, String lineId,String stationName,
                                                        String timeGrade,Integer pageSize,Integer pageNumber) throws SrvException;

    /**
     * 查询过去n 天内客运量最大日 重点站的jczl
     * */
    public List<HisSelfCountStation> getImportantJczl() throws SrvException;
}
