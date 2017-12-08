package com.biierg.cocc.common.vo;

import java.io.Serializable;

public class BaseLimitToAllStationsVo implements Serializable{
	private static final long serialVersionUID = 1L;
	private String stationName;//车站名称
	private String limitStatus;//状态
	
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getLimitStatus() {
		return limitStatus;
	}
	public void setLimitStatus(String limitStatus) {
		this.limitStatus = limitStatus;
	}
	

}
