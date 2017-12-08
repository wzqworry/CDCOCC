package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xys on 2017/7/21. 车站、路线事件
 */
public class IpsOperationEvent implements Serializable {

	private static final long serialVersionUID = 1L;

	private String eventId;
	private String lineCode; // 线路编码
	private String stationName;// 车站名
	private String endStationName;// 终点站名

	private Date startDate;// 开始日期
	private Date endDate;// 结束日期

	private String startTime;// 开始时间
	private String endTime;// 结束时间

	private Integer eventType;// 事件类型 0：跳停 2：常态限流 4：中断 6：运营调整 20：临时限流
	private Integer regionType;// 6-区间，1-每日，2-工作日，3-双休日，4-节假日，5-站点时间非限流信息

	private String description;// 描述
	private String remark;// 事件备注
	private Integer direction;// 状态   1:上行（外环）  2:下行（内环）
	private Integer status;// 状态   0:正常  1:已结束
	private String creator;// 发布人
	private Date creatTime;// 发布时间
	private String updater;// 修订人
	private Date updateTime;// 修订时间

	private String eventTypeCN;// 事件类型名称
	private int xuhao;

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getLineCode() {
		return lineCode;
	}

	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	public Integer getEventType() {
		return eventType;
	}

	public void setEventType(Integer eventType) {
		this.eventType = eventType;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public Integer getRegionType() {
		return regionType;
	}

	public void setRegionType(Integer regionType) {
		this.regionType = regionType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getEventTypeCN() {
		return eventTypeCN;
	}

	public void setEventTypeCN(String eventTypeCN) {
		this.eventTypeCN = eventTypeCN;
	}

	public int getXuhao() {
		return xuhao;
	}

	public void setXuhao(int xuhao) {
		this.xuhao = xuhao;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEndStationName() {
		return endStationName;
	}

	public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}

	public Integer getDirection() {
		return direction;
	}

	public void setDirection(Integer direction) {
		this.direction = direction;
	}

}
