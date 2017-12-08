/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 消息发布系统 消息实体bean
 *
 * @author wen.ding
 * @date 2017/3/27 16:45
 * @email dingwenbj@foxmail.com
 */
public class IpsMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    private String msgId;  // 消息ID
    private String msgType;  // 消息类型，系统类型：即 短信、外网、PIS、调令等
    private String amtId;  //附件ID
    private String amtName; // 附件名称
    private String subject; // 消息主题
    private String content; // 消息内容

    private Integer msgStatus;// 消息状态 0 已发送 1 未发送，草稿
    private Integer msgTem;  // 是否是模板 0 不是 1 是
    private int deleteMark; // 删除状态标记 0：未删除 1：已删除

    private String eventId;// 事件ID

    // 外网渠道
    private int chNetPortal; // 内网门户网站
    private int chExtGetway; // 对外门户网站
    private int chAppMobile; // app移动终端
    private int chMobileDecision; // 移动决策平台
    private int chWechat; // 公众微信
    private int chMicroblog; // 公众微博

    private Date createTime; // 生成时间
    private String senderId;  // 发件人id
    private Date sendTime; // 发送时间
    private Date endTime; // 结束时间

    private String emergencyLevel; // 紧急程度，有A、B、C、D 四类，优先级依次降低
    private String tempCategory1; // 信息类型，消息内容涉及的专业
    private String tempCategory2; // 消息现象，消息内容涉及的现象

    private GenMailList sender;  // 发件人
    private List<GenMailList> receieverList; // 收件人列表
    private int receieverListSize; // 收件人个数

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAmtId() {
        return amtId;
    }

    public void setAmtId(String amtId) {
        this.amtId = amtId;
    }

    public String getAmtName() {
        return amtName;
    }

    public void setAmtName(String amtName) {
        this.amtName = amtName;
    }

    public int getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(int deleteMark) {
        this.deleteMark = deleteMark;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public Integer getMsgStatus() {
        return msgStatus;
    }

    public void setMsgStatus(Integer msgStatus) {
        this.msgStatus = msgStatus;
    }

    public Integer getMsgTem() {
        return msgTem;
    }

    public void setMsgTem(Integer msgTem) {
        this.msgTem = msgTem;
    }

    public int getChNetPortal() {
        return chNetPortal;
    }

    public void setChNetPortal(int chNetPortal) {
        this.chNetPortal = chNetPortal;
    }

    public int getChExtGetway() {
        return chExtGetway;
    }

    public void setChExtGetway(int chExtGetway) {
        this.chExtGetway = chExtGetway;
    }

    public int getChAppMobile() {
        return chAppMobile;
    }

    public void setChAppMobile(int chAppMobile) {
        this.chAppMobile = chAppMobile;
    }

    public int getChMobileDecision() {
        return chMobileDecision;
    }

    public void setChMobileDecision(int chMobileDecision) {
        this.chMobileDecision = chMobileDecision;
    }

    public int getChWechat() {
        return chWechat;
    }

    public void setChWechat(int chWechat) {
        this.chWechat = chWechat;
    }

    public int getChMicroblog() {
        return chMicroblog;
    }

    public void setChMicroblog(int chMicroblog) {
        this.chMicroblog = chMicroblog;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public GenMailList getSender() {
        return sender;
    }

    public void setSender(GenMailList sender) {
        this.sender = sender;
    }

    public List<GenMailList> getReceieverList() {
        return receieverList;
    }

    public void setReceieverList(List<GenMailList> receieverList) {
        this.receieverList = receieverList;
    }

    public int getReceieverListSize() {
        return receieverListSize;
    }

    public void setReceieverListSize(int receieverListSize) {
        this.receieverListSize = receieverListSize;
    }

    public String getTempCategory1() {
        return tempCategory1;
    }

    public void setTempCategory1(String tempCategory1) {
        this.tempCategory1 = tempCategory1;
    }

    public String getTempCategory2() {
        return tempCategory2;
    }

    public void setTempCategory2(String tempCategory2) {
        this.tempCategory2 = tempCategory2;
    }

    public String getEmergencyLevel() {
        return emergencyLevel;
    }

    public void setEmergencyLevel(String emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }

	@Override
	public String toString() {
		return "IpsMessage [msgId=" + msgId + ", msgType=" + msgType + ", amtId=" + amtId + ", amtName=" + amtName
				+ ", subject=" + subject + ", content=" + content + ", msgStatus=" + msgStatus + ", msgTem=" + msgTem
				+ ", deleteMark=" + deleteMark + ", eventId=" + eventId + ", chNetPortal=" + chNetPortal
				+ ", chExtGetway=" + chExtGetway + ", chAppMobile=" + chAppMobile + ", chMobileDecision="
				+ chMobileDecision + ", chWechat=" + chWechat + ", chMicroblog=" + chMicroblog + ", createTime="
				+ createTime + ", senderId=" + senderId + ", sendTime=" + sendTime + ", endTime=" + endTime
				+ ", emergencyLevel=" + emergencyLevel + ", tempCategory1=" + tempCategory1 + ", tempCategory2="
				+ tempCategory2 + ", sender=" + sender + ", receieverList=" + receieverList + ", receieverListSize="
				+ receieverListSize + "]";
	}
    
    

}
