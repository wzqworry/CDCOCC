package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by lk on 2017/8/11.
 * 重要记事
 */
public class XczzNotes implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int fd_Index;//主键
	private Date fd_Date;//日期
	private int lineNumber;//线路ID
	private String fdName;//线路名称
	private int eventNumber;//记事编号
	private String event;//记事内容
	private Date updateTime;//创建时间
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
	public String getFdName() {
		return fdName;
	}
	public void setFdName(String fdName) {
		this.fdName = fdName;
	}
	public int getEventNumber() {
		return eventNumber;
	}
	public void setEventNumber(int eventNumber) {
		this.eventNumber = eventNumber;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	


}
