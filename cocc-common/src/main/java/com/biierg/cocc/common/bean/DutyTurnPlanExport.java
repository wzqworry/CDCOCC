/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 排班计划导出，专用实体类
 *
 * @author wen.ding
 * @date 2017/5/12  10:53
 * @email dingwenbj@foxmail.com
 */
public class DutyTurnPlanExport implements Serializable {
    private final static long serialVersionUID = 1L;

    private DutyTurnPlan dutyTurnPlan; // 排班计划基本信息

    private List<DutyTurnPlanExportChild> dutyTurnPlanExportChildList; // 排班计划导出，专用实体类子表

    public DutyTurnPlan getDutyTurnPlan() {
        return dutyTurnPlan;
    }

    public void setDutyTurnPlan(DutyTurnPlan dutyTurnPlan) {
        this.dutyTurnPlan = dutyTurnPlan;
    }

    public List<DutyTurnPlanExportChild> getDutyTurnPlanExportChildList() {
        return dutyTurnPlanExportChildList;
    }

    public void setDutyTurnPlanExportChildList(List<DutyTurnPlanExportChild> dutyTurnPlanExportChildList) {
        this.dutyTurnPlanExportChildList = dutyTurnPlanExportChildList;
    }
}
