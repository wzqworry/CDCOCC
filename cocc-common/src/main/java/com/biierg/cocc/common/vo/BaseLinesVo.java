package com.biierg.cocc.common.vo;

import com.biierg.cocc.common.bean.BaseLines;

public class BaseLinesVo extends BaseLines {
	
	private static final long serialVersionUID = 1L;
	private String up_station_name;
	private String down_station_name;

	public String getUp_station_name() {
		return up_station_name;
	}

	public void setUp_station_name(String up_station_name) {
		this.up_station_name = up_station_name;
	}

	public String getDown_station_name() {
		return down_station_name;
	}

	public void setDown_station_name(String down_station_name) {
		this.down_station_name = down_station_name;
	}

}
