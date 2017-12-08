package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.EmergencyDrill;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/7/10.
 */
public interface IEmergencyDrillService extends IBaseService<EmergencyDrill, String> {
    /** 查询符合条件的突发事件信息
     * @param emerStatue 事件状态
     * @param emerLevel 事件等级
     * @param keyword 关键字
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     * */
    public SrvResponse<List<EmergencyDrill>> queryEmergency(Integer emerStatue,
                                                            Integer emerLevel, String keyword, Date startTime, Date endTime) throws SrvException;
    /** 查询符合条件的突发事件信息
     * @param id 突发事件id
     * @param emerStatue 事件状态
     * @param emerLevel 事件等级
     * @param keyword 关键字
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     * */
    public SrvResponse<List<EmergencyDrill>> queryEmergencyAndPlace(String id,String emerStatue,
                                                               Integer emerLevel,String keyword,Date startTime,Date endTime) throws SrvException;
}
