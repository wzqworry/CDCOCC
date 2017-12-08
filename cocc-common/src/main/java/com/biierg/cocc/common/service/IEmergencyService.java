/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.Emergency;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/3/15.
 */
public interface IEmergencyService extends IBaseService<Emergency, String> {
    /** 查询符合条件的突发事件信息
     * @param emerStatue 事件状态
     * @param emerLevel 事件等级
     * @param keyword 关键字
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
    * */
    public SrvResponse<List<Emergency>> queryEmergency(Integer emerStatue,
                           Integer emerLevel,String keyword,Date startTime,Date endTime) throws SrvException;
    /** 查询符合条件的突发事件信息
     * @param id 突发事件id
     * @param emerStatue 事件状态
     * @param emerLevel 事件等级
     * @param keyword 关键字
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     * */
    public SrvResponse<List<Emergency>> queryEmergencyAndPlace(String id,String emerStatue,
                                                       Integer emerLevel,String keyword,Date startTime,Date endTime) throws SrvException;



}
