/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 审批记录
 * 
 * @author lei
 */
public class ApprovalLog implements Serializable {
	private static final long serialVersionUID = 1L;

	private String recId; // 单据ID；UUID
	private String logId; // 记录ID；序号
	
	private String flowId; // 审批流ID
	private String flowNodeId; // 审批流节点序号

	private String log; // 审批日志
	
	private Date operateTime; // 审批操作时间
	private String operator; // 审批操作人
	public String getRecId() {
		return recId;
	}
	public void setRecId(String recId) {
		this.recId = recId;
	}
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getFlowId() {
		return flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	public String getFlowNodeId() {
		return flowNodeId;
	}
	public void setFlowNodeId(String flowNodeId) {
		this.flowNodeId = flowNodeId;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public Date getOperateTime() {
		return operateTime;
	}
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
}
