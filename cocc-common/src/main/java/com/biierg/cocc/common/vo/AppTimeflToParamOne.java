package com.biierg.cocc.common.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AppTimeflToParamOne  implements Serializable{
	private static final long serialVersionUID = 1L;
	private  String start_station_id;//起始站编码
	private  String dest_station_id;//目的站编码
	private  int direction;//运行方向
	private List<AppTimeflToParamTwo> stations=new ArrayList<AppTimeflToParamTwo>();
	public String getStart_station_id() {
		return start_station_id;
	}
	public void setStart_station_id(String start_station_id) {
		this.start_station_id = start_station_id;
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
	public List<AppTimeflToParamTwo> getStations() {
		return stations;
	}
	public void setStations(List<AppTimeflToParamTwo> stations) {
		this.stations = stations;
	}
}
