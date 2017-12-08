package com.biierg.cocc.common.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxs on 2017/8/01. 首末班车时刻表 BASE_TIMETABLE_FL
 */
public class BaseTimetableflVo implements Serializable {
	private final static long serialVersionUID = 1l;
	
	// private String line_id;//线路编码
	private String start_station_id;// 起始站编码
	private String station_id;// 车站编码
	private String dest_station_id;// 目的站编码
	private int direction;// 运行方向
	private String first_time;// 首班时刻
	private String last_time;// 末班时刻
	
	private String first_time_adjust;// 调整后的首班时刻
	private String last_time_adjust;// 调整后的末班时刻
	
	private List<BaseTimeflToStationsVo> baseTimefl = new ArrayList<BaseTimeflToStationsVo>();// 车站信息

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

	public List<BaseTimeflToStationsVo> getBaseTimefl() {
		return baseTimefl;
	}

	public void setBaseTimefl(List<BaseTimeflToStationsVo> baseTimefl) {
		this.baseTimefl = baseTimefl;
	}

	/**
	 * @return the first_time_adjust
	 */
	public String getFirst_time_adjust() {
		return first_time_adjust;
	}

	/**
	 * @param first_time_adjust the first_time_adjust to set
	 */
	public void setFirst_time_adjust(String first_time_adjust) {
		this.first_time_adjust = first_time_adjust;
	}

	/**
	 * @return the last_time_adjust
	 */
	public String getLast_time_adjust() {
		return last_time_adjust;
	}

	/**
	 * @param last_time_adjust the last_time_adjust to set
	 */
	public void setLast_time_adjust(String last_time_adjust) {
		this.last_time_adjust = last_time_adjust;
	}
}
