package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.RealAlarmJzlStation;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;
import java.util.Map;

/**
 * 实时 预警监控 进站量
 * Created by syy on 2017/7/25.
 */
public interface IRealAlarmJzlStationService {


    /**
     * 获取 进站预警 的所有站
     * @return
     * @throws SrvException
     */
    public List<RealAlarmJzlStation> getRealAlarmJzlStations(String timeGrade) throws SrvException;

    /**
     * 获取 排名前十 的进站量 预警站
     * @return
     * @throws SrvException
     */
    public List<RealAlarmJzlStation> getTop10AlarmJzlStation(String lineId,String timeGrade) throws SrvException;

    /**
     * 查询所有进站预警
     * @param lineId
     * @param pageNum
     * @param pageSize
     * @return
     * @throws SrvException
     */
    public Map<String,Object> getAllAlarmJzlStation(String lineId, Integer pageNum, Integer pageSize,String timeGrade ) throws SrvException;

}
