package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

public class TerminalBuildSch implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int fd_Index;//主键
	private Date fd_Date;//日期
	private int lineNumber;//线路编号
	private String lineName;//线路名称
	private int planType;//施工计划类型
	private String cycle;//周期
	private Date startWeek;//开始日期
	private Date endWeek;//结束日期
	private int planEvent;//计划(件)
	private int actualEvent;//完成(件)
	private float completionRate;//完成率
	private Date updateTime;//跟新时间
	public int getFd_Index() {
		return fd_Index;
	}
	public void setFd_Index(int fd_Index) {
		this.fd_Index = fd_Index;
	}
	public Date getFd_Date() {
		return fd_Date;
	}
	public void setFd_Date(Date fd_Date) {
		this.fd_Date = fd_Date;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
    
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public int getPlanType() {
		return planType;
	}
	public void setPlanType(int planType) {
		this.planType = planType;
	}
	public String getCycle() {
		return cycle;
	}
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}
	public int getPlanEvent() {
		return planEvent;
	}
	public void setPlanEvent(int planEvent) {
		this.planEvent = planEvent;
	}
	public int getActualEvent() {
		return actualEvent;
	}
	public void setActualEvent(int actualEvent) {
		this.actualEvent = actualEvent;
	}
	public float getCompletionRate() {
		return completionRate;
	}
	public void setCompletionRate(float completionRate) {
		this.completionRate = completionRate;
	}	
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getStartWeek() {
		return startWeek;
	}
	public void setStartWeek(Date startWeek) {
		this.startWeek = startWeek;
	}
	public Date getEndWeek() {
		return endWeek;
	}
	public void setEndWeek(Date endWeek) {
		this.endWeek = endWeek;
	}
	
	
	

}
