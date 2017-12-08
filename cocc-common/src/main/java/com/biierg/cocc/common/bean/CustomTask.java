package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/7/6.
 * 自定义任务.(相当于记事本功能)
 */
public class CustomTask implements Serializable{
    private final static long serialVersionUID = 1l;

    private String id;//主键
    private String taskName;//任务名称
    private Date taskEndTime;//任务预计完成时间
    private int taskUrgency;//任务紧急程度
    private int taskState;//任务完成状态
    private String taskRemark;//任务简单描述
    private String taskFunc;//任务关联功能
    private Date createTime;//创建时间
    private String creator;//创建角色
    private Date finishTime;//完成时间

    //对应的组团功能项的信息
    private IgrpItem func1Item;

    //组团
    private String funcId;//组团项ID
    private String name;//组团项名字
    private String url;//调用地址
    private String parameter;//调用参数
    private int status;//使用状态 0：正常使用 1：停用
    private String description;//描述


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getTaskEndTime() {
        return taskEndTime;
    }

    public void setTaskEndTime(Date taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    public int getTaskUrgency() {
        return taskUrgency;
    }

    public void setTaskUrgency(int taskUrgency) {
        this.taskUrgency = taskUrgency;
    }

    public int getTaskState() {
        return taskState;
    }

    public void setTaskState(int taskState) {
        this.taskState = taskState;
    }

    public String getTaskRemark() {
        return taskRemark;
    }

    public void setTaskRemark(String taskRemark) {
        this.taskRemark = taskRemark;
    }

    public String getTaskFunc() {
        return taskFunc;
    }

    public void setTaskFunc(String taskFunc) {
        this.taskFunc = taskFunc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public IgrpItem getFunc1Item() {
        return func1Item;
    }

    public void setFunc1Item(IgrpItem func1Item) {
        this.func1Item = func1Item;
    }

    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
