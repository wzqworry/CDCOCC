/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dw on 2017/4/10.
 */
public class DutyTurnPlanDetails implements Serializable {
    private final static long serialVersionUID = 1L;

    private String id;//
    private String dutyTurnPlanId;//排班id
    private Date workDate; //
    private String groupId; //
    private String dutyTurnId; //

    private Date workStart;
    private Date workEnd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDutyTurnPlanId() {
        return dutyTurnPlanId;
    }

    public void setDutyTurnPlanId(String dutyTurnPlanId) {
        this.dutyTurnPlanId = dutyTurnPlanId;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getDutyTurnId() {
        return dutyTurnId;
    }

    public void setDutyTurnId(String dutyTurnId) {
        this.dutyTurnId = dutyTurnId;
    }

    public Date getWorkStart() {
        return workStart;
    }

    public void setWorkStart(Date workStart) {
        this.workStart = workStart;
    }

    public Date getWorkEnd() {
        return workEnd;
    }

    public void setWorkEnd(Date workEnd) {
        this.workEnd = workEnd;
    }
}
