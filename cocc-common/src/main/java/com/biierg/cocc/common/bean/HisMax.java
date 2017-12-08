package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Date;

import com.biierg.cocc.common.util.DateUtil;

/**
 * Created by lk on 2017/5/10. 线路客运历史峰值
 */
public class HisMax implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String timeDate;
	private String hcl;
	private String kyl;
	private Date startTime;
	private Date endTime;
	private String jzl;
	private String czl;
	

	public String getTimeDate() {
		return timeDate;
	}

	public void setTimeDate(String timeDate) {
		this.timeDate = timeDate;
	}

	public String getHcl() {
		return hcl;
	}

	public void setHcl(String hcl) {
		this.hcl = hcl;
	}

	public String getKyl() {
		return kyl;
	}
    
	public void setKyl(String kyl) {
		this.kyl = kyl;
	}
	
	public String getMaxTime() {
		if(null!=startTime&&null!=endTime){
		  return DateUtil.format(startTime, "HH:mm") + "-" + DateUtil.format(endTime, "HH:mm");
		}else{
		  return "";
		}
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

	public String getJzl() {
		return jzl;
	}

	public void setJzl(String jzl) {
		this.jzl = jzl;
	}

	public String getCzl() {
		return czl;
	}

	public void setCzl(String czl) {
		this.czl = czl;
	}

}
