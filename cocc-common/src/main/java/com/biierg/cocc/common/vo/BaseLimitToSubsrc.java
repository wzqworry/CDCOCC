package com.biierg.cocc.common.vo;

import java.io.Serializable;
import java.sql.Date;

public class BaseLimitToSubsrc  implements Serializable{
	private static final long serialVersionUID = 1L;
	private  String id; //记录ID
	private  String station_id;//车站id
	private  String station_name;//车站名称
	private  int limit_type;//限制类型
	private  Date start_time; //限制开始时间
	private  Date end_time;//限制结束时间
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStation_id() {
		return station_id;
	}
	public void setStation_id(String station_id) {
		this.station_id = station_id;
	}
	public String getStation_name() {
		return station_name;
	}
	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}
	public int getLimit_type() {
		return limit_type;
	}
	public void setLimit_type(int limit_type) {
		this.limit_type = limit_type;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	
}
