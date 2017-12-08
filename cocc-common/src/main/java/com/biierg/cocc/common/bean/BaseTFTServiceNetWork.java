package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * @author wxs
 * 获取天府通服务网点
 */
public class BaseTFTServiceNetWork implements Serializable{
	private static final long serialVersionUID = 1L;
	private String line_code;//线路编码
	private String station_code;//车站编码
	private String station_name;//车站名称
	private String tvm_desc;//自助售票机
	private String bom_desc;//人工售票点
	private String tft_desc;//天府通
	public String getLine_code() {
		return line_code;
	}
	public void setLine_code(String line_code) {
		this.line_code = line_code;
	}
	public String getTvm_desc() {
		return tvm_desc;
	}
	public void setTvm_desc(String tvm_desc) {
		this.tvm_desc = tvm_desc;
	}
	public String getBom_desc() {
		return bom_desc;
	}
	public void setBom_desc(String bom_desc) {
		this.bom_desc = bom_desc;
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
	public String getTft_desc() {
		return tft_desc;
	}
	public void setTft_desc(String tft_desc) {
		this.tft_desc = tft_desc;
	}
	

}
