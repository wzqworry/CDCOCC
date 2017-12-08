package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.RealAlarmCzlStation;
import com.biierg.cocc.common.bean.RealAlarmYjdSection;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;
import java.util.Map;

/**
 * 实时 预警监控 拥挤度
 * Created by syy on 2017/7/25.
 */
public interface IRealAlarmYjdSectionService {


    /**
     * 获取 所有预警 的断面
     * @return
     * @throws SrvException
     */
    public List<RealAlarmYjdSection> getRealAlarmYjdSections(String timeGrade) throws SrvException;

    /**
     * 获取 排名前十  的出站预警 站
     * @return
     * @throws SrvException
     */
    public List<RealAlarmYjdSection> getTop10AlarmYjdSection(String lineId,String timeGrade) throws SrvException;

    /**
     * 查询所有拥挤度预警
     * @param lineId
     * @param pageNum
     * @param pageSize
     * @return
     * @throws SrvException
     */
    public Map<String,Object> getAllAlarmYjdStation(String lineId, Integer pageNum, Integer pageSize,String timeGrade ) throws SrvException;

    /**
     * 插入数据
     * */
    boolean create(RealAlarmYjdSection realAlarmYjdSection) throws SrvException;

}
