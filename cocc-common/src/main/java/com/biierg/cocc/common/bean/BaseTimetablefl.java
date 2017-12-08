package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wxs on 2017/8/01.
 * 首末班车时刻表 BASE_TIMETABLE_FL
 */
public class BaseTimetablefl  implements Serializable{
  private final static long serialVersionUID = 1l;
	private long id; // 流水号
	private String timeTableCode; // 时刻表图号
	private  String line_id;//线路编码
	private  String start_station_id;//起始站编码
	private  String station_id;//车站编码
	private  String dest_station_id;//目的站编码
	private  int direction;//运行方向
	private  int is_half;//是否半程车
	private  String first_time;//首班时刻
	private  String last_time;//末班时刻
	private Date update_time; // 更新日期
	private String updater; // 更新用户
	private String remark; // 备注
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTimeTableCode() {
		return timeTableCode;
	}
	public void setTimeTableCode(String timeTableCode) {
		this.timeTableCode = timeTableCode;
	}
	public String getLine_id() {
		return line_id;
	}
	public void setLine_id(String line_id) {
		this.line_id = line_id;
	}
	public String getStart_station_id() {
		return start_station_id;
	}
	public void setStart_station_id(String start_station_id) {
		this.start_station_id = start_station_id;
	}
	public String getStation_id() {
		return station_id;
	}
	public void setStation_id(String station_id) {
		this.station_id = station_id;
	}
	public String getDest_station_id() {
		return dest_station_id;
	}
	public void setDest_station_id(String dest_station_id) {
		this.dest_station_id = dest_station_id;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public int getIs_half() {
		return is_half;
	}
	public void setIs_half(int is_half) {
		this.is_half = is_half;
	}
	public String getFirst_time() {
		return first_time;
	}
	public void setFirst_time(String first_time) {
		this.first_time = first_time;
	}
	public String getLast_time() {
		return last_time;
	}
	public void setLast_time(String last_time) {
		this.last_time = last_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public String getUpdater() {
		return updater;
	}
	public void setUpdater(String updater) {
		this.updater = updater;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

  
}
