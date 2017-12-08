/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 地震烈度表
 * @author wzq
 *
 */
public class EarthQuakeIntensity implements Serializable{
	private final static long serialVersionUID = 1l;
	
	private String id; // UUID
	@JsonProperty("event_id")
	private String eventId;
	private String epicenter;
	@JsonProperty("start_time")
	private long startTime; // 开始时刻
	private String longitude; // 震中经度
	private String latitude; // 震中纬度
	
	@JsonProperty("UPDATE_TIME")
	private long updateTime;

	@JsonProperty("actmeasure_flag")
	private boolean actmeasureFlag;//烈度测量标志
	@JsonProperty("sample_site")
	private List<SampleSite> sampleSite;//若干烈度采集点
	
	/**
	 * @return the id
	 */
	@JsonIgnore
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEpicenter() {
		return epicenter;
	}
	public void setEpicenter(String epicenter) {
		this.epicenter = epicenter;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
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
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public boolean isActmeasureFlag() {
		return actmeasureFlag;
	}
	public void setActmeasureFlag(boolean actmeasureFlag) {
		this.actmeasureFlag = actmeasureFlag;
	}
	public List<SampleSite> getSampleSite() {
		return sampleSite;
	}
	public void setSampleSite(List<SampleSite> sampleSite) {
		this.sampleSite = sampleSite;
	}
	@JsonIgnore
	public long getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(long updateTime) {
		this.updateTime = updateTime;
	}
}
