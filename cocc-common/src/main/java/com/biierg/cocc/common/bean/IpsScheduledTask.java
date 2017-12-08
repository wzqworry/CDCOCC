package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class IpsScheduledTask implements Serializable {
    private static final long serialVersionUID = 1L;

    private String taskId;  // 任务编号 jobName
    private String taskName; // 任务名
    private String taskGroupName; // 任务所属组 jobGroupName
    private int taskType; // 定时器类型 ,0 每天  1 定期 2 每周
    private String jobClassName; // 执行任务的类名
    private int state;  // 任务状态
    private String stateMsg; // 任务状态信息

    // timerInitParams
    private String initJsonStr; // 生成定时规则的初始参数,转化为Map后, key为year\month\day\week\hour\minute\second

    private String creator; // 创建人
    private Date createTime; // 创建时间
    private String updater; // 修改人
    private Date updateTime; // 修改时间

    private String msgId;  // 关联id

    private int msgType;  // '任务的业务类型 0:信息发布 1:应急指挥2:....'
    private IpsMessage ipsMessage; // 定时任务关联的消息
    private List<IpsScheduledTaskTrigger> ipsTriggerList; // 任务关联的触发器列表


    public List<IpsScheduledTaskTrigger> getIpsTriggerList() {
        return ipsTriggerList;
    }

    public void setIpsTriggerList(List<IpsScheduledTaskTrigger> ipsTriggerList) {
        this.ipsTriggerList = ipsTriggerList;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskType() {
        return taskType;
    }

    public void setTaskType(int taskType) {
        this.taskType = taskType;
    }

    public String getTaskGroupName() {
        return taskGroupName;
    }

    public void setTaskGroupName(String taskGroupName) {
        this.taskGroupName = taskGroupName;
    }

    public String getJobClassName() {
        return jobClassName;
    }

    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
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

    public String getInitJsonStr() {
        return initJsonStr;
    }

    public void setInitJsonStr(String initJsonStr) {
        this.initJsonStr = initJsonStr;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public IpsMessage getIpsMessage() {
        return ipsMessage;
    }

    public void setIpsMessage(IpsMessage ipsMessage) {
        this.ipsMessage = ipsMessage;
    }
    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }
}
