package com.biierg.cocc.common.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wxs 
 * 
 * IPS_MESSAGE 获取运营动态
 */
public class IpsMessageVo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String subject; // 消息主题
	private String content; // 消息内容
	private Integer msgStatus;// 消息状态 0 已发送 1 未发送，草稿
	// 外网渠道
	private Integer chAppMobile; // app移动终端
	
	private Date createTime; // 生成时间
	private Date sendTime; // 发送时间
	private Date endTime; // 结束时间
	
	private String emergencyLevel; // 紧急程度，有A、B、C、D 四类，优先级依次降低
    private String tempCategory1; // 信息类型，消息内容涉及的专业
    private String tempCategory2; // 消息现象，消息内容涉及的现象


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

	public Integer getMsgStatus() {
		return msgStatus;
	}

	public void setMsgStatus(Integer msgStatus) {
		this.msgStatus = msgStatus;
	}

	public Integer getChAppMobile() {
		return chAppMobile;
	}

	public void setChAppMobile(Integer chAppMobile) {
		this.chAppMobile = chAppMobile;
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

	public String getEmergencyLevel() {
		return emergencyLevel;
	}

	public void setEmergencyLevel(String emergencyLevel) {
		this.emergencyLevel = emergencyLevel;
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

}
