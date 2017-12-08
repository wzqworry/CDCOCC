package com.biierg.cocc.common.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wxs
 * 
 */
public class AtsTrainCheckinVo implements Serializable {
	private static final long serialVersionUID = 1L;
    private String line_id;//线路号
    private String train_id;//列车编号
    private int direction;//运行方向
    private String begin_station_code;//区间起始站编号
    private String end_station_code;//区间终点站编号
    private String track_name;//轨道名称
    private int track_num;//轨道序号
    private int track_amount;//区间轨道总数
    private Double travel_ratio;//区间行进比例
    private Date arrival_time;//到达时间
	public String getLine_id() {
		return line_id;
	}
	public void setLine_id(String line_id) {
		this.line_id = line_id;
	}
	public String getTrain_id() {
		return train_id;
	}
	public void setTrain_id(String train_id) {
		this.train_id = train_id;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public String getBegin_station_code() {
		return begin_station_code;
	}
	public void setBegin_station_code(String begin_station_code) {
		this.begin_station_code = begin_station_code;
	}
	public String getEnd_station_code() {
		return end_station_code;
	}
	public void setEnd_station_code(String end_station_code) {
		this.end_station_code = end_station_code;
	}
	public String getTrack_name() {
		return track_name;
	}
	public void setTrack_name(String track_name) {
		this.track_name = track_name;
	}
	public int getTrack_num() {
		return track_num;
	}
	public void setTrack_num(int track_num) {
		this.track_num = track_num;
	}
	public int getTrack_amount() {
		return track_amount;
	}
	public void setTrack_amount(int track_amount) {
		this.track_amount = track_amount;
	}
	public Date getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(Date arrival_time) {
		this.arrival_time = arrival_time;
	}
	public Double getTravel_ratio() {
		return travel_ratio;
	}
	public void setTravel_ratio(Double travel_ratio) {
		this.travel_ratio = travel_ratio;
	}
	
    
	
}
