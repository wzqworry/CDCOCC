/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.EmergencyHandleLog;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;

/**
 * Created by wzq on 2017/3/15.
 */
public interface IEmergencyHandleLogService extends IBaseService<EmergencyHandleLog, String>  {

    /** 根据突发事件id 来查询相关连的处置步骤
     *  @param emergencyId
     *  @return List<EmergencyHandleLog>
    * */
    List<EmergencyHandleLog> queryByEmergencyId(String emergencyId) throws SrvException;
}
