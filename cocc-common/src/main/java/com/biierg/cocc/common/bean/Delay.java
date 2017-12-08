package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

import com.biierg.cocc.common.util.DateUtil;

public class Delay implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int fd_Index;//主键
	private Date fd_Time;//日期
	private String startTime;//开始时间
	private String endTime;//结束时间
	private int lineNumber;//线路ID
	private String lineName;//线路名称
	private int trainNumber;//车次号
	private int serviceNumber;//服务号
	private int unitNumber;//车组号
	private int stationNumber;//车站ID
	private Date delayTime;//晚点时间
	private String delayTimeStr;//晚点时间(字符串)
	private String delayTime_HH;
	private String delayTime_mm;
	private String delayTime_ss;
	private String delayCause;//晚点原因
	private Date updateTime;//跟新时间
	
	public int getFd_Index() {
		return fd_Index;
	}
	public void setFd_Index(int fd_Index) {
		this.fd_Index = fd_Index;
	}
	
	public Date getFd_Time() {
		return fd_Time;
	}
	public void setFd_Time(Date fd_Time) {
		this.fd_Time = fd_Time;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
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
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public int getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(int serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	public int getUnitNumber() {
		return unitNumber;
	}
	public void setUnitNumber(int unitNumber) {
		this.unitNumber = unitNumber;
	}
	public int getStationNumber() {
		return stationNumber;
	}
	public void setStationNumber(int stationNumber) {
		this.stationNumber = stationNumber;
	}
	public Date getDelayTime() {
		return delayTime;
	}
	public void setDelayTime(Date delayTime) {
		this.delayTime = delayTime;
	}
	
	public String getDelayTimeStr() {
		return delayTimeStr;
	}
	public void setDelayTimeStr(String delayTimeStr) {
		this.delayTimeStr = delayTimeStr;
	}
	
	public String getDelayTime_HH() {
		return delayTime_HH;
	}
	public void setDelayTime_HH(String delayTime_HH) {
		this.delayTime_HH = delayTime_HH;
	}
	public String getDelayTime_mm() {
		return delayTime_mm;
	}
	public void setDelayTime_mm(String delayTime_mm) {
		this.delayTime_mm = delayTime_mm;
	}
	public String getDelayTime_ss() {
		return delayTime_ss;
	}
	public void setDelayTime_ss(String delayTime_ss) {
		this.delayTime_ss = delayTime_ss;
	}
	public String getDelayCause() {
		return delayCause;
	}
	public void setDelayCause(String delayCause) {
		this.delayCause = delayCause;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getTime() {
		if(null!=delayTime){
		  return DateUtil.format(delayTime, "HH:mm:ss");
		}else{
		  return "";
		}
	}
	public String getTimeHH() {
		if(null!=delayTime){
		  return DateUtil.format(delayTime, "HH").substring(0, 1).equals("0")?DateUtil.format(delayTime, "HH").substring(1, 2):DateUtil.format(delayTime, "HH");
		}else{
		  return "";
		}
	}
	public String getTimeMM() {
		if(null!=delayTime){
		  return DateUtil.format(delayTime, "mm").substring(0, 1).equals("0")?DateUtil.format(delayTime, "mm").substring(1, 2):DateUtil.format(delayTime, "mm");
		}else{
		  return "";
		}
	}
	public String getTimeSS() {
		if(null!=delayTime){
		  return DateUtil.format(delayTime, "ss").substring(0, 1).equals("0")?DateUtil.format(delayTime, "ss").substring(1, 2):DateUtil.format(delayTime, "ss");
		}else{
		  return "";
		}
	}
	public String getFdDate() {
		if(null!=fd_Time){
		  return DateUtil.format(fd_Time, "yyyy-MM-dd");
		}else{
		  return "";
		}
	}
	
	

}
