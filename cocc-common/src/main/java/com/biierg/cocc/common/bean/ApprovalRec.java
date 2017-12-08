/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 审批单
 * 
 * @author lei
 */
public class ApprovalRec implements Serializable {
	private static final long serialVersionUID = 1L;

	private String recId; // 单据ID；UUID
	private String flowId; // 审批流程ID；
	
	private String subject; // 业务单据简要描述
	
	private String busiTypeName; // 业务单据类型名（表名）
	private String busiPrimaryKey; // 业务单据ID；
	
	private String busiLinkUrl; // 业务单所查看链接
	
	private Date createTime; // 审批单创建时间
	
	private Date startTime; // 审批流程开始时间
	private Date endTime; // 审批流程结束时间
	private String flag; // 审批是否通过；
	public String getRecId() {
		return recId;
	}
	public void setRecId(String recId) {
		this.recId = recId;
	}
	public String getFlowId() {
		return flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBusiTypeName() {
		return busiTypeName;
	}
	public void setBusiTypeName(String busiTypeName) {
		this.busiTypeName = busiTypeName;
	}
	public String getBusiPrimaryKey() {
		return busiPrimaryKey;
	}
	public void setBusiPrimaryKey(String busiPrimaryKey) {
		this.busiPrimaryKey = busiPrimaryKey;
	}
	public String getBusiLinkUrl() {
		return busiLinkUrl;
	}
	public void setBusiLinkUrl(String busiLinkUrl) {
		this.busiLinkUrl = busiLinkUrl;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
}
