package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.EmergencyHandleLogDrill;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;

/**
 * Created by wzq on 2017/7/10.
 */
public interface IEmergencyHandleLogDrillService  extends IBaseService<EmergencyHandleLogDrill, String>{
    /** 根据突发事件id 来查询相关连的处置步骤
     *  @param emergencyId
     *  @return List<EmergencyHandleLogDrill>
     * */
    public List<EmergencyHandleLogDrill> queryByEmergencyId(String emergencyId) throws SrvException;
}
