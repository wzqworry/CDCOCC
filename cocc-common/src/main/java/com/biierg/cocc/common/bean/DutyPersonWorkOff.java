/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 员工调休记录
 *
 * @author wen.ding
 * @date 2017/4/21 17:15
 * @email dingwenbj@foxmail.com
 */
public class DutyPersonWorkOff implements Serializable {
    private final static long serialVersionUID = 1L;

    private String id; // 申请单编号
    private String proposerId;// 申请人id
    private String successorId;// 接班人id
    private Date startTime;//
    private Date endTime;//
    private String creator;//
    private Date createTime;
    private String updator;//
    private Date updateTime;//
    private String remark;// 调休事由

    private GenMailList proposer;// 申请人
    private GenMailList successor;// 接班人

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProposerId() {
        return proposerId;
    }

    public void setProposerId(String proposerId) {
        this.proposerId = proposerId;
    }

    public String getSuccessorId() {
        return successorId;
    }

    public void setSuccessorId(String successorId) {
        this.successorId = successorId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public GenMailList getProposer() {
        return proposer;
    }

    public void setProposer(GenMailList proposer) {
        this.proposer = proposer;
    }

    public GenMailList getSuccessor() {
        return successor;
    }

    public void setSuccessor(GenMailList successor) {
        this.successor = successor;
    }
}
