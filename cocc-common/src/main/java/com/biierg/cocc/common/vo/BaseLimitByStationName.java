package com.biierg.cocc.common.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BaseLimitByStationName implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer eventType;// 事件类型
	private List<BaseLimitToStationNameVo> limitByStationName = new ArrayList<BaseLimitToStationNameVo>();

	public Integer getEventType() {
		return eventType;
	}

	public void setEventType(Integer eventType) {
		this.eventType = eventType;
	}

	public List<BaseLimitToStationNameVo> getLimitByStationName() {
		return limitByStationName;
	}

	public void setLimitByStationName(List<BaseLimitToStationNameVo> limitByStationName) {
		this.limitByStationName = limitByStationName;
	}

}
