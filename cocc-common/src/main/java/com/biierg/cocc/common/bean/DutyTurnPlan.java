/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 排班计划实体
 *
 * @author wen.ding
 * @date 2017/4/28  10:37
 * @email dingwenbj@foxmail.com
 */
public class DutyTurnPlan implements Serializable {
    private final static long serialVersionUID = 1L;

    private String id;//
    private String name;//排班名称
    private Date startTime;//使用开始时间
    private Date endTime;//使用结束时间
    private Integer status;//使用状态
    private String dutyTurnRule; // 排班规则
    private String dutyWorkGroupDetails; // 参与班组 {"甲班":["白","夜",,],"":[,,,]}
    private Date createTime;//创建时间
    private String creator;//创建人
    private Date updateTime;//更新时间
    private String updator;//更新人
    private String remark;//备注

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDutyTurnRule() {
        return dutyTurnRule;
    }

    public void setDutyTurnRule(String dutyTurnRule) {
        this.dutyTurnRule = dutyTurnRule;
    }

    public String getDutyWorkGroupDetails() {
        return dutyWorkGroupDetails;
    }

    public void setDutyWorkGroupDetails(String dutyWorkGroupDetails) {
        this.dutyWorkGroupDetails = dutyWorkGroupDetails;
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

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
