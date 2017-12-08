package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dw on 2017/10/20. 首末班车时刻调整表 BASE_TIMETABLE_ADJUST
 */
public class BaseTimetableAdjust implements Serializable {
	private final static long serialVersionUID = 1l;
	
	private long id; // 流水号
	private String line_id;// 线路编码
	private String line_name;// （线路名）
	private String start_station_id;// 起始站编码
	private String start_station_name; // (起始站名字)
	private String station_id;// 车站编码
	private String station_name; // (起始站名字)
	private String dest_station_id;// 目的站编码
	private String dest_station_name; // (目的站名字)
	private int direction;// 运行方向
	private String first_time;// 首班时刻
	private String last_time;// 末班时刻
	private Date begin_time; // 调整开始时间
	private Date end_time; // 调整截止时间
	private Date update_time; // 更新时间
	private String updater; // 更新用户
	private String remark; // 备注

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	
	public Date getBegin_time() {
		return begin_time;
	}

	public void setBegin_time(Date begin_time) {
		this.begin_time = begin_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public String getLine_name() {
		return line_name;
	}

	public void setLine_name(String line_name) {
		this.line_name = line_name;
	}

	public String getStart_station_name() {
		return start_station_name;
	}

	public void setStart_station_name(String start_station_name) {
		this.start_station_name = start_station_name;
	}

	public String getStation_name() {
		return station_name;
	}

	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}

	public String getDest_station_name() {
		return dest_station_name;
	}

	public void setDest_station_name(String dest_station_name) {
		this.dest_station_name = dest_station_name;
	}


}
