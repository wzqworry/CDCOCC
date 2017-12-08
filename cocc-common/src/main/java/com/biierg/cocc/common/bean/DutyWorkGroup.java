/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/4/5.
 * 班组基本信息表
 */
public class DutyWorkGroup implements Serializable{

    private final static long serialVersionUID = 1L;

    private String groupId;//班组id
    private String groupName;//班组名称
    private Integer groupStatue;//使用状态
    private Integer groupType;//使用状态
    private Date createTime;//班组创建时间
    private String creator;//班组创建人
    private Date updateTime;//班组更新时间
    private String updater;//班组更新人
    private String remark;//备注

    //从班组岗位需求表中查询出来的 每个岗位的最大人数和最小人数之和
    private Integer leastCount;
    private Integer mostCount;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getGroupStatue() {
        return groupStatue;
    }

    public void setGroupStatue(Integer groupStatue) {
        this.groupStatue = groupStatue;
    }

    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
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

    public Integer getLeastCount() {
        return leastCount;
    }

    public void setLeastCount(Integer leastCount) {
        this.leastCount = leastCount;
    }

    public Integer getMostCount() {
        return mostCount;
    }

    public void setMostCount(Integer mostCount) {
        this.mostCount = mostCount;
    }
}
