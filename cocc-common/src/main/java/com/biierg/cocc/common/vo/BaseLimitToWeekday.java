package com.biierg.cocc.common.vo;

import java.io.Serializable;
import java.util.Date;

import com.biierg.cocc.common.util.DateUtil;

public class BaseLimitToWeekday implements Serializable {
	private static final long serialVersionUID = 1L;
	private String startTime;// 开始时间
	private String endTime;// 结束时间
	private Date start_date;
	private Date end_date;
	private String weekday;// 工作日
	private String weekend;// 非工作日
	private int eventType;
	private int region_type;
	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

	public String getWeekend() {
		return weekend;
	}

	public void setWeekend(String weekend) {
		this.weekend = weekend;
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

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}

	public int getRegion_type() {
		return region_type;
	}

	public void setRegion_type(int region_type) {
		this.region_type = region_type;
	}
    
}
