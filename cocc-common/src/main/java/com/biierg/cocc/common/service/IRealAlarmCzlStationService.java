package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.RealAlarmCzlStation;
import com.biierg.cocc.common.bean.RealAlarmJzlStation;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;
import java.util.Map;

/**
 * 实时 预警监控 出站量
 * Created by syy on 2017/7/25.
 */
public interface IRealAlarmCzlStationService {


    /**
     * 获取 出站预警 的所有站
     * @return
     * @throws SrvException
     */
    public List<RealAlarmCzlStation> getRealAlarmCzlStations(String timeGrade) throws SrvException;

    /**
     * 获取 排名前十 的出站量 预警站
     * @return
     * @throws SrvException
     */
    public List<RealAlarmCzlStation> getTop10AlarmCzlStation(String lineId,String timeGrade) throws SrvException;


    /**
     * 查询所有出站预警
     * @param lineId
     * @param pageNum
     * @param pageSize
     * @return
     * @throws SrvException
     */
    public Map<String,Object> getAllAlarmCzlStation(String lineId,Integer pageNum, Integer pageSize,String timeGrade ) throws SrvException;

}
