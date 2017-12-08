/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.DutyTurnPlan;
import com.biierg.cocc.common.bean.DutyTurnPlanDetails;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.text.ParseException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * 排班计划管理 接口
 *
 * @author wen.ding
 * @date 2017/4/28  10:39
 * @email dingwenbj@foxmail.com
 */
public interface IDutyTurnPlanService extends IBaseService<DutyTurnPlan, String> {
    /**
     * @param start
     * @param end
     * @param id
     * @return
     */
    SrvResponse<List<DutyTurnPlan>> listDutyTurnPlan(String ruleId,Date start,Date end);

    /**
     * 预览排班计划 （ 班组级别 ）
     *
     * @param id 计划id
     * @return
     */
    LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap<String, String>>>> preview(String id) throws SrvException, ParseException;

    /**
     * 1.新增
     */
    boolean createBatch(List<DutyTurnPlanDetails> detailList) throws SrvException;
}
