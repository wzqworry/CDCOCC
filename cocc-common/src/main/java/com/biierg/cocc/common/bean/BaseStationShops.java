package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * @author wxs
 * 站内商铺查询
 */
public class BaseStationShops implements Serializable  { 
	private static final long serialVersionUID = 1L;
	private String line_code;//线路编码
	private String station_code;//车站编码
	private String station_name;//车站名称
	private String shops_desc;//商铺位置
	public String getLine_code() {
		return line_code;
	}
	public void setLine_code(String line_code) {
		this.line_code = line_code;
	}
	public String getStation_code() {
		return station_code;
	}
	public void setStation_code(String station_code) {
		this.station_code = station_code;
	}
	public String getStation_name() {
		return station_name;
	}
	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}
	public String getShops_desc() {
		return shops_desc;
	}
	public void setShops_desc(String shops_desc) {
		this.shops_desc = shops_desc;
	}
	
}
