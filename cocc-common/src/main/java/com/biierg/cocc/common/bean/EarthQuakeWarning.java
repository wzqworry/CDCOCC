/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 地震预警
 * 
 * @author lei
 */
public class EarthQuakeWarning implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id; // UUID

	@JsonProperty("event_id")
	private String eventId; // 事件ID，每次地震会产生一个唯一ID，一个ID可能会有多次预警记录
	private int updates; // 报告数

	@JsonProperty("start_time")
	private long startTime; // 开始时刻
	@JsonProperty("count_down")
	private int countDown; // 倒计时（秒）
	private String magnitude; // 预估震级
	private String intensity; // 预估烈度

	private String epicenter; // 震中地名
	private String longitude; // 震中经度
	private String latitude; // 震中纬度
	private String depth; // 震源深度

	@JsonProperty("update_time")
	private long updateTime; // 更新时间
	
	/**
	 * @return the id
	 */
	@JsonIgnore
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPid() {
		return this.id;
	}

	/**
	 * @return the eventId
	 */
	public String getEventId() {
		return eventId;
	}

	/**
	 * @param eventId
	 *            the eventId to set
	 */
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	/**
	 * @return the updates
	 */
	public int getUpdates() {
		return updates;
	}

	/**
	 * @param updates
	 *            the updates to set
	 */
	public void setUpdates(int updates) {
		this.updates = updates;
	}
	
	//@JsonIgnore
	public Date getStartTime4Date() {
		return new Date(startTime);
	}

	/**
	 * @return the startTime
	 */
	public long getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime
	 *            the startTime to set
	 */
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the countDown
	 */
	public int getCountDown() {
		return countDown;
	}

	/**
	 * @param countDown
	 *            the countDown to set
	 */
	public void setCountDown(int countDown) {
		this.countDown = countDown;
	}

	/**
	 * @return the magnitude
	 */
	public String getMagnitude() {
		return magnitude;
	}

	/**
	 * @param magnitude
	 *            the magnitude to set
	 */
	public void setMagnitude(String magnitude) {
		this.magnitude = magnitude;
	}

	/**
	 * @return the intensity
	 */
	public String getIntensity() {
		return intensity;
	}

	/**
	 * @param intensity
	 *            the intensity to set
	 */
	public void setIntensity(String intensity) {
		this.intensity = intensity;
	}

	/**
	 * @return the epicenter
	 */
	public String getEpicenter() {
		return epicenter;
	}

	/**
	 * @param epicenter the epicenter to set
	 */
	public void setEpicenter(String epicenter) {
		this.epicenter = epicenter;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the depth
	 */
	public String getDepth() {
		return depth;
	}

	/**
	 * @param depth
	 *            the depth to set
	 */
	public void setDepth(String depth) {
		this.depth = depth;
	}

	//@JsonIgnore
	public Date getUpdateTime4Date() {
		return new Date(updateTime);
	}

	/**
	 * @return the updateTime
	 */
	public long getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime
	 *            the updateTime to set
	 */
	public void setUpdateTime(long updateTime) {
		this.updateTime = updateTime;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
