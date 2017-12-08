/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 交接班记录详情,用于查看展示
 *
 * @author wen.ding
 * @date 2017/5/25  14:35
 * @email dingwenbj@foxmail.com
 */
public class DutyChangeWorkDuty implements Serializable {
    private final static long serialVersionUID = 1L;

    private String id; // 交接班记录id
    private String name; //  记录名称
    private Date startTime;// 开始时间
    private Date changeDutyTime; // 交接时间
    private Integer status; // 状态 “完成”，“交接中”
    private String sendUserId; // 交班人id
    private String recUserId; // 接班人id
    private String remark;// 备注
    private String creator;// 创建人
    private Date createTime; // 创建时间
    private String updator;// 修改人
    private Date updateTime;// 修改时间

    // 后续查询出的
    // 交接班双方相关基础信息
    private Date sendWorkDate; // 交班人当班日期
    private DutyTurn sendDutyTurn; // 交班人 当班班次
    private DutyWorkGroup sendGroup; // 交班班组
    private GenPost sendGenPost; // 交班人所在岗位
    private GenMailList sender; // 交班人

    private Date recWorkDate; // 接班人当班日期
    private DutyTurn recDutyTurn; // 接班人 当班班次
    private DutyWorkGroup recGroup; // 接班班组
    private GenPost recGenPost; // 接班人
    private GenMailList receiever; // 接班人

    // 交接事项
    private List<DutyHandover> dutyHandoverList; // 交接台账
    private List<AssistScheduleFile> assistScheduleFileList; // 交接文件
    private List<Emergency> emergencyList; // 交接突发事件

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

    public Date getChangeDutyTime() {
        return changeDutyTime;
    }

    public void setChangeDutyTime(Date changeDutyTime) {
        this.changeDutyTime = changeDutyTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId;
    }

    public String getRecUserId() {
        return recUserId;
    }

    public void setRecUserId(String recUserId) {
        this.recUserId = recUserId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Date getSendWorkDate() {
        return sendWorkDate;
    }

    public void setSendWorkDate(Date sendWorkDate) {
        this.sendWorkDate = sendWorkDate;
    }

    public DutyTurn getSendDutyTurn() {
        return sendDutyTurn;
    }

    public void setSendDutyTurn(DutyTurn sendDutyTurn) {
        this.sendDutyTurn = sendDutyTurn;
    }

    public DutyWorkGroup getSendGroup() {
        return sendGroup;
    }

    public void setSendGroup(DutyWorkGroup sendGroup) {
        this.sendGroup = sendGroup;
    }

    public GenPost getSendGenPost() {
        return sendGenPost;
    }

    public void setSendGenPost(GenPost sendGenPost) {
        this.sendGenPost = sendGenPost;
    }

    public GenMailList getSender() {
        return sender;
    }

    public void setSender(GenMailList sender) {
        this.sender = sender;
    }

    public Date getRecWorkDate() {
        return recWorkDate;
    }

    public void setRecWorkDate(Date recWorkDate) {
        this.recWorkDate = recWorkDate;
    }

    public DutyTurn getRecDutyTurn() {
        return recDutyTurn;
    }

    public void setRecDutyTurn(DutyTurn recDutyTurn) {
        this.recDutyTurn = recDutyTurn;
    }

    public DutyWorkGroup getRecGroup() {
        return recGroup;
    }

    public void setRecGroup(DutyWorkGroup recGroup) {
        this.recGroup = recGroup;
    }

    public GenPost getRecGenPost() {
        return recGenPost;
    }

    public void setRecGenPost(GenPost recGenPost) {
        this.recGenPost = recGenPost;
    }

    public GenMailList getReceiever() {
        return receiever;
    }

    public void setReceiever(GenMailList receiever) {
        this.receiever = receiever;
    }

    public List<DutyHandover> getDutyHandoverList() {
        return dutyHandoverList;
    }

    public void setDutyHandoverList(List<DutyHandover> dutyHandoverList) {
        this.dutyHandoverList = dutyHandoverList;
    }

    public List<AssistScheduleFile> getAssistScheduleFileList() {
        return assistScheduleFileList;
    }

    public void setAssistScheduleFileList(List<AssistScheduleFile> assistScheduleFileList) {
        this.assistScheduleFileList = assistScheduleFileList;
    }

    public List<Emergency> getEmergencyList() {
        return emergencyList;
    }

    public void setEmergencyList(List<Emergency> emergencyList) {
        this.emergencyList = emergencyList;
    }
}
