package com.biierg.cocc.common.vo;

import java.io.Serializable;

public class AppTransferGuideToStation implements Serializable{
	private static final long serialVersionUID = 1L;
	private String dest_station_code;//运行方向终点站编码
	private String dest_station_name;//运行方向终点站名称
	private int	 entry_num;//条目序号
	private String entry_label;//条目名称
	private String description;//位置描述
	public String getDest_station_code() {
		return dest_station_code;
	}
	public void setDest_station_code(String dest_station_code) {
		this.dest_station_code = dest_station_code;
	}
	public String getDest_station_name() {
		return dest_station_name;
	}
	public void setDest_station_name(String dest_station_name) {
		this.dest_station_name = dest_station_name;
	}
	public int getEntry_num() {
		return entry_num;
	}
	public void setEntry_num(int entry_num) {
		this.entry_num = entry_num;
	}
	public String getEntry_label() {
		return entry_label;
	}
	public void setEntry_label(String entry_label) {
		this.entry_label = entry_label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
   	
  
}
