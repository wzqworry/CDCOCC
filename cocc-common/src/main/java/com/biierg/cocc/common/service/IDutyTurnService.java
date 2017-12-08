/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.DutyTurn;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * 班次管理服务接口
 * Created by wzq on 2017/4/10.
 */
public interface IDutyTurnService extends IBaseService<DutyTurn, String> {

    /**
     * 查询班次列表
     *
     * @param startTime 起始时间
     * @param endTime   截止时间
     * @param keyword   关键字
     */
    SrvResponse<List<DutyTurn>> listDutyTurn(Date startTime, Date endTime,Integer turnType, String keyword) throws SrvException;

    /**
     * @param time 当前时间（格式为小时：分钟）
     **/
    DutyTurn findByCurrentTime(String time) throws SrvException;

    /**
     * 查询当前排班使用的班次
     */
    List<DutyTurn> queryDutyTurn(String planId);

}
