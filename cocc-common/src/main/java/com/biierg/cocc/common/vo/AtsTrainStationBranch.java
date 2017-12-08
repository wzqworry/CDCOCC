package com.biierg.cocc.common.vo;

import java.io.Serializable;

public class AtsTrainStationBranch implements Serializable {
	private static final long serialVersionUID = 1L;
	private String station_code;// 车站编码
	private String station_name;// 车站名称
	private int station_state;// 车站状态
	private int is_head_end;// 是否首末站
	private int is_transfer;// 是否换乘站

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

	public int getStation_state() {
		return station_state;
	}

	public void setStation_state(int station_state) {
		this.station_state = station_state;
	}

	public int getIs_head_end() {
		return is_head_end;
	}

	public void setIs_head_end(int is_head_end) {
		this.is_head_end = is_head_end;
	}

	public int getIs_transfer() {
		return is_transfer;
	}

	public void setIs_transfer(int is_transfer) {
		this.is_transfer = is_transfer;
	}
}
