/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 烈度采集点，包含每一个点对应的经纬度、地名、烈度值
 * @author wzq
 * 
 */
public class SampleSite implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id; // UUID
	
	private String eventId;//关联eventId
	private String longitude;//监测点经度
	private String latitude;//监测点纬度
	private String sitename;//地名  
	private String intensity;//烈度值

	@JsonProperty("UPDATE_TIME")
	private long updateTime;
	
	/**
	 * @return the id
	 */
	@JsonIgnore
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *  the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}
	

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getIntensity() {
		return intensity;
	}

	public void setIntensity(String intensity) {
		this.intensity = intensity;
	}
	@JsonIgnore
	public long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(long updateTime) {
		this.updateTime = updateTime;
	}
}
