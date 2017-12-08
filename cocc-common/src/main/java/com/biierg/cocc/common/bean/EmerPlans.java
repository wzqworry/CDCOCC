/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wzq
 * 突发事件 和 执行预案的中间关联表
 */
public class EmerPlans implements Serializable{
	private final static long serialVersionUID = 1l;
	private String id;		//主键
	private String emerId;	//突发事件id
	private String planId;	//预案id
	private Integer activeFlag;//执行状态
	private String creator; //创建人
	private Date createTime; //创建时间
	
	private String planName;//名字
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmerId() {
		return emerId;
	}
	public void setEmerId(String emerId) {
		this.emerId = emerId;
	}
	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
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
	public Integer getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
}
