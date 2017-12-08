package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.biierg.cocc.common.vo.BaseLimitToWeekday;

/**
 * @author wxs 车站限流订阅表==》PSA_LIMITING_SUBSRC
 */
public class BaseLimitingSubsrc implements Serializable {
	private static final long serialVersionUID = 1L;
	private String station_name_cn;
	private List<BaseLimitToWeekday> baseLimitToWeekday = new ArrayList<BaseLimitToWeekday>();

	public String getStation_name_cn() {
		return station_name_cn;
	}

	public void setStation_name_cn(String station_name_cn) {
		this.station_name_cn = station_name_cn;
	}

	public List<BaseLimitToWeekday> getBaseLimitToWeekday() {
		return baseLimitToWeekday;
	}

	public void setBaseLimitToWeekday(List<BaseLimitToWeekday> baseLimitToWeekday) {
		this.baseLimitToWeekday = baseLimitToWeekday;
	}

}
