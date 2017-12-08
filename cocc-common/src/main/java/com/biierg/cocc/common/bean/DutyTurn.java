/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/4/10.
 * 每种排班方式对应一种算法
 */
public class DutyTurn implements Serializable {
    private final static long serialVersionUID = 1L;

    private String turnId;//班次id
    private String turnName;//班次名称
    private Integer turnType;//班次类型
    //private Date workStartTime;//工作开始时间
    //private Date workEndTime;//工作结束时间
    private String workStartTime;//工作开始时间
    private String workEndTime;//工作结束时间
    private Date createTime;//创建时间
    private String creator;//创建人
    private Date updateTime;//修改时间
    private String updater;//修改人
    private String remark;//备注

    public String getTurnId() {
        return turnId;
    }

    public void setTurnId(String turnId) {
        this.turnId = turnId;
    }

    public String getTurnName() {
        return turnName;
    }

    public void setTurnName(String turnName) {
        this.turnName = turnName;
    }

    public Integer getTurnType() {
        return turnType;
    }

    public void setTurnType(Integer turnType) {
        this.turnType = turnType;
    }

    public String getWorkStartTime() {
        return workStartTime;
    }

    public void setWorkStartTime(String workStartTime) {
        this.workStartTime = workStartTime;
    }

    public String getWorkEndTime() {
        return workEndTime;
    }

    public void setWorkEndTime(String workEndTime) {
        this.workEndTime = workEndTime;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
