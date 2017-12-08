/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

import com.biierg.cocc.common.util.DateUtil;
/**
 * Created by lk on 2017/8/15.
 */
public class RemainFault implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int fd_Index;//主键
	private Date fd_Date;//日期
	private int lineNumber;//线路编号
	private String lineName;//线路名称
	private int remainCount;//当前剩余
	private int completeCount;//已处理
	private int increaseCount;//未处理
	private String completeDesc;//已处理描述
	private String increaseDesc;//未处理描述
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
	public int getRemainCount() {
		return remainCount;
	}
	public void setRemainCount(int remainCount) {
		this.remainCount = remainCount;
	}
	public int getCompleteCount() {
		return completeCount;
	}
	public void setCompleteCount(int completeCount) {
		this.completeCount = completeCount;
	}
	public int getIncreaseCount() {
		return increaseCount;
	}
	public void setIncreaseCount(int increaseCount) {
		this.increaseCount = increaseCount;
	}
	public String getCompleteDesc() {
		return completeDesc;
	}
	public void setCompleteDesc(String completeDesc) {
		this.completeDesc = completeDesc;
	}
	public String getIncreaseDesc() {
		return increaseDesc;
	}
	public void setIncreaseDesc(String increaseDesc) {
		this.increaseDesc = increaseDesc;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getFdDate() {
		if(null!=fd_Date){
		  return DateUtil.format(fd_Date, "yyyy-MM-dd");
		}else{
		  return "";
		}
	}

}
