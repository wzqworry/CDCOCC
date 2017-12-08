package com.biierg.cocc.common.bean;
/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/2/15.
 * y预警信息表
 */
public class EmergencyWarningInfo implements Serializable {
    private final static long serialVersionUID =1l;
    private String id;
    private String warnId;
    private String subject;   //预警名字
    private Integer warnType;       //类型
    private Integer warnLevel;       //等级
    private String content;//明细
    private Integer warnSource;//一级来源
    //private Integer srcType;// 内部/外部

    private Date createTime;//录入时间
    private String creator;//录入员

    private Integer publishState;//发布状态
    private String publisher;//发布员

    private String approver;//审核员
    private Integer approvalState;//审核状态
    private String approvalNo;//审核单号
    private Date updateTime;//更新时间
    private Integer sum;//相同warnId总数

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWarnId() {
        return warnId;
    }

    public void setWarnId(String warnId) {
        this.warnId = warnId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getWarnType() {
        return warnType;
    }

    public void setWarnType(Integer warnType) {
        this.warnType = warnType;
    }

    public Integer getWarnLevel() {
        return warnLevel;
    }

    public void setWarnLevel(Integer warnLevel) {
        this.warnLevel = warnLevel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getWarnSource() {
        return warnSource;
    }

    public void setWarnSource(Integer warnSource) {
        this.warnSource = warnSource;
    }

    /*public Integer getSrcType() {
        return srcType;
    }

    public void setSrcType(Integer srcType) {
        this.srcType = srcType;
    }*/

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

    public Integer getPublishState() {
        return publishState;
    }

    public void setPublishState(Integer publishState) {
        this.publishState = publishState;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public Integer getApprovalState() {
        return approvalState;
    }

    public void setApprovalState(Integer approvalState) {
        this.approvalState = approvalState;
    }

    public String getApprovalNo() {
        return approvalNo;
    }

    public void setApprovalNo(String approvalNo) {
        this.approvalNo = approvalNo;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public String switchWarnType(){
        switch(warnType)
        {
            case 4:    return "其他预警";
            case 5:    return "综合监控预警";
            case 6:    return "灾害类预警";
            case 7:    return "指标类预警";
            default:   return "不存在";
        }
    }

    public String switchWarnLevel(){
        switch(warnLevel)
        {
            case 1:    return "蓝色级别";
            case 2:    return "黄色级别";
            case 3:    return "橙色级别";
            case 4:    return "红色级别";
            default:   return "不存在";
        }
    }
    public String switchWarnSource(){
        switch(warnSource)
        {
            case 1:    return "TFDS";
            case 2:    return "PSCADA";
            case 3:    return "FG";
            case 4:    return "FAS";
            case 5:    return "AFC";
            case 6:    return "BAS";
            case 7:    return "FDTS";
            case 8:    return "客流预测系统系统";
            case 10:   return "气象系统";
            case 11:   return "地震系统";
            case 14:   return "上级通知";
            default:   return "不存在";
        }
    }
    public String switchPublishState(){
        switch(publishState)
        {
            case 0:    return "未发布";
            case 1:    return "发布中";
            case 2:    return "已撤销";
            default:   return "不存在";
        }
    }
    public String switchApprovalState(){
        switch(approvalState)
        {
            case 0:    return "未审批";
            case 1:    return "审批通过";
            case 2:    return "审批未通过";
            default:   return "不存在";
        }
    }

}
