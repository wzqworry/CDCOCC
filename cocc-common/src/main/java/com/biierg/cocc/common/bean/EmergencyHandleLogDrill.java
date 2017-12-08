/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/3/14.
 */
public class EmergencyHandleLogDrill implements Serializable {
    private final static long serialVersionUID = 1l;
    private String id;//记录ID
    private String eventId;//事件ID
    private int action;//动作类型  0 新建 1撤销 。。。
    private String planId;//预案ID
    private String stepId;//措施ID
    private int eventGrade;//事件级别
    private int logType;//日志类型
    private String logContent;//处置记录
    private String creator;//操作人
    private Date updateTime;//更新时间


    private Emergency emergency;//关联的突发事件
    private Plan plan;//关联的plan
    private PlanStep planStep;//关联的step


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getStepId() {
        return stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public int getEventGrade() {
        return eventGrade;
    }

    public void setEventGrade(int eventGrade) {
        this.eventGrade = eventGrade;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public int getLogType() {
        return logType;
    }

    public void setLogType(int logType) {
        this.logType = logType;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Emergency getEmergency() {
        return emergency;
    }

    public void setEmergency(Emergency emergency) {
        this.emergency = emergency;
    }
}
