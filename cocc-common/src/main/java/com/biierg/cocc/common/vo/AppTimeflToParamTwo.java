package com.biierg.cocc.common.vo;

import java.io.Serializable;

public class AppTimeflToParamTwo  implements Serializable{
	private static final long serialVersionUID = 1L;
	private  String station_id;//车站编码
	private String station_name_cn;//车站名称
	public String getStation_id() {
		return station_id;
	}
	public void setStation_id(String station_id) {
		this.station_id = station_id;
	}
	public String getStation_name_cn() {
		return station_name_cn;
	}
	public void setStation_name_cn(String station_name_cn) {
		this.station_name_cn = station_name_cn;
	}
	
}
