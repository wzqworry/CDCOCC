/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.DutyTurnPlanDetails;
import com.biierg.cocc.common.bean.DutyTurnPlanExport;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by wen.ding on 2017/4/10.
 */
public interface IDutyScheduleDetailService extends IBaseService<DutyTurnPlanDetails, String> {

    /**
     * 1.新增
     */
    public boolean createBatch(List<DutyTurnPlanDetails> detailList) throws SrvException;

    /**
     * 2.根据排班id  班组id 进行工作计划的查询
     *
     * @param planId
     * @param groupId
     * @param start
     * @param end
     */
    public List<DutyTurnPlanDetails> queryScheduleDetail(String planId,String groupId,Date start,Date end) throws SrvException;

    SrvResponse<List<DutyTurnPlanDetails>> listDutyTurnPlanDetails(String planId,String groupId);

    /**
     * 根据计划id ，查询计划详情，用于导出报表
     * @param planId 排班计划id
     * @return List<DutyTurnPlanExport>
     */
    DutyTurnPlanExport findDutyTurnPlanExport(String planId);

    LinkedHashMap<String,LinkedHashMap<String,LinkedHashMap<String,LinkedHashMap<String,String>>>> preview(String id);
}
