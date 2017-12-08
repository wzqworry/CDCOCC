/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 预案
 * 
 * @author lei
 */
public class Plan implements Serializable,Cloneable {
	private static final long serialVersionUID = 1L;

	private String id;//主键id
	private String planId; // 预案ID,对于同一个预案唯一,防止重复
	private String sceneId; // 场景ID；可空、FK
	private String planName; // 预案名称
	private String principle; // 处置原则
	private String remark; // 注意事项

	private String planCode; // 预案编码；UUID；用于区分是否同一预案的不同版本
	private String version; // 版本号；同一预案的多个版本，同时只能有一个处于“激活”状态；

	private Integer activeFlag; // 激活状态；0-未激活，1-已激活
	private Integer approvalFlag; // 审批状态；0-未审批，1-已审批

	private String updateLog; // 修订日志
	//private String approvalLog; // 审批日志
    //private String approver; // 审批操作人
	//private Date approvalTime; // 审批操作时间
	private Date activeTime; // 激活操作时间
	private String activator;// 激活操作人
	private Date createTime; // 创建时间
	private String creator;  // 创建人
	
	private Date updateTime; // 更新时间
	private String updator;  //更新人
	
	private List<PlanStep> stepList;
	private String approvalNo;//审批单号

	@Override
	public Object clone() {
        Plan plan = null;
		try{
            plan = (Plan)super.clone();
		}catch(CloneNotSupportedException e) {
		}
		return plan;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the planId
	 */
	public String getPlanId() {
		return planId;
	}

	/**
	 * @param planId
	 *            the planId to set
	 */
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	/**
	 * @return the sceneId
	 */
	public String getSceneId() {
		return sceneId;
	}

	/**
	 * @param sceneId
	 *            the sceneId to set
	 */
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	/**
	 * @return the planName
	 */
	public String getPlanName() {
		return planName;
	}

	/**
	 * @param planName
	 *            the planName to set
	 */
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	/**
	 * @return the principle
	 */
	public String getPrinciple() {
		return principle;
	}

	/**
	 * @param principle
	 *            the principle to set
	 */
	public void setPrinciple(String principle) {
		this.principle = principle;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the planCode
	 */
	public String getPlanCode() {
		return planCode;
	}

	/**
	 * @param planCode
	 *            the planCode to set
	 */
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the activeFlag
	 */

	/**
	 * @return the updateLog
	 */
	public String getUpdateLog() {
		return updateLog;
	}

	/**
	 * @param updateLog
	 *            the updateLog to set
	 */
	public void setUpdateLog(String updateLog) {
		this.updateLog = updateLog;
	}

	/**
	 * @return the activeTime
	 */
	public Date getActiveTime() {
		return activeTime;
	}

	/**
	 * @param activeTime
	 *            the activeTime to set
	 */
	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}

	/**
	 * @return the activator
	 */
	public String getActivator() {
		return activator;
	}

	/**
	 * @param activator
	 *            the activator to set
	 */
	public void setActivator(String activator) {
		this.activator = activator;
	}

	/**
	 * @return the stepList
	 */
	public List<PlanStep> getStepList() {
		return stepList;
	}

	/**
	 * @param stepList the stepList to set
	 */
	public void setStepList(List<PlanStep> stepList) {
		this.stepList = stepList;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the creator
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * @param creator the creator to set
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @return the updator
	 */
	public String getUpdator() {
		return updator;
	}

	/**
	 * @param updator the updator to set
	 */
	public void setUpdator(String updator) {
		this.updator = updator;
	}

	public Integer getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Integer getApprovalFlag() {
		return approvalFlag;
	}

	public void setApprovalFlag(Integer approvalFlag) {
		this.approvalFlag = approvalFlag;
	}

    public String getApprovalNo() {
        return approvalNo;
    }

    public void setApprovalNo(String approvalNo) {
        this.approvalNo = approvalNo;
    }
}
