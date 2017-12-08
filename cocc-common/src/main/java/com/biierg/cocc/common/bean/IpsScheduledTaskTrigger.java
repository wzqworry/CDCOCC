package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 定时任务的触发器
 */
public class IpsScheduledTaskTrigger implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;  // ID
    private String triggerName; // 触发器名
    private String triggerGroupName; // 触发器所属组名
    private String cronExpression;  //  规则表达式
    private int period; // 周期
    private int state;  // 触发器状态码
    private String stateMsg; // 触发器状态信息

    private String taskId;  // job ID

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroupName() {
        return triggerGroupName;
    }

    public void setTriggerGroupName(String triggerGroupName) {
        this.triggerGroupName = triggerGroupName;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateMsg() {
        return stateMsg;
    }

    public void setStateMsg(String stateMsg) {
        this.stateMsg = stateMsg;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

}
