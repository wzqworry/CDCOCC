package com.biierg.cocc.common.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wxs
 *
 */
public class AppTimeflToParam implements Serializable{
	private static final long serialVersionUID = 1L;
	private  String line_id;//线路编码
	private List<AppTimeflToParamOne> directions=new ArrayList<AppTimeflToParamOne>();
//	private  String start_station_id;//起始站编码
//	private  String station_id;//车站编码
//	private  String dest_station_id;//目的站编码
//	private  int direction;//运行方向
	public String getLine_id() {
		return line_id;
	}
	public void setLine_id(String line_id) {
		this.line_id = line_id;
	}
//	public String getStart_station_id() {
//		return start_station_id;
//	}
//	public void setStart_station_id(String start_station_id) {
//		this.start_station_id = start_station_id;
//	}
//	public String getStation_id() {
//		return station_id;
//	}
//	public void setStation_id(String station_id) {
//		this.station_id = station_id;
//	}
//	public String getDest_station_id() {
//		return dest_station_id;
//	}
//	public void setDest_station_id(String dest_station_id) {
//		this.dest_station_id = dest_station_id;
//	}
//	public int getDirection() {
//		return direction;
//	}
//	public void setDirection(int direction) {
//		this.direction = direction;
//	}
	public List<AppTimeflToParamOne> getDirections() {
		return directions;
	}
	public void setDirections(List<AppTimeflToParamOne> directions) {
		this.directions = directions;
	}
	
}
