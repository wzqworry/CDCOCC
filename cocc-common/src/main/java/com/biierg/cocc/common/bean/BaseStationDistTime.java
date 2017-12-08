package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * @author WXS
 * 站间距及运行时间表BASE_SECTION_DIST_TIME
 */
public class BaseStationDistTime implements Serializable{
	  private static final long serialVersionUID = 1L;
	  private String line_id;//线路编码
	  private String o_station_id;//起始站编码
	  private String d_station_id;//终点站编码
	  private String o_station_name;//起始站名称
	  private String d_station_name;//终点站名称
	  private String direction;//运行方向
	  private String distance;//站间距
	public String getLine_id() {
		return line_id;
	}
	public void setLine_id(String line_id) {
		this.line_id = line_id;
	}
	public String getO_station_id() {
		return o_station_id;
	}
	public void setO_station_id(String o_station_id) {
		this.o_station_id = o_station_id;
	}
	public String getD_station_id() {
		return d_station_id;
	}
	public void setD_station_id(String d_station_id) {
		this.d_station_id = d_station_id;
	}
	public String getO_station_name() {
		return o_station_name;
	}
	public void setO_station_name(String o_station_name) {
		this.o_station_name = o_station_name;
	}
	public String getD_station_name() {
		return d_station_name;
	}
	public void setD_station_name(String d_station_name) {
		this.d_station_name = d_station_name;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	 
	  
	  
}
