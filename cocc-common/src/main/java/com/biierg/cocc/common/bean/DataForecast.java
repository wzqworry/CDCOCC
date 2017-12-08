/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 预测数据 Created by wzq on 2017/2/13.
 */
public class DataForecast implements Serializable {
	private final static long serialVersionUID = 1l;

	private String id; // UUID, PK

    private String timeDate;//日期
	private String lineId; // 线路ID
	private String stationId; // 车站ID
	private String sectionId; // 断面ID
	
	private String dataType; // 类型 hcl、jzl、czl
	
	private Date startTime; // 预测数据开始时间
	private Date endTime; // 预测数据截止时间
	
	private double average; // 历史同期平均值
	private double geoAverage; // 几何平均值
	private double averagere; // 历史同期(去极值)
	private double geoAveragere; // 几何平均值(去极值)
	private Date updateTime;
	private String timeGrade;//时间粒度

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

	public String getTimeDate() {
		return timeDate;
	}

	public void setTimeDate(String timeDate) {
		this.timeDate = timeDate;
	}

	public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getGeoAverage() {
        return geoAverage;
    }

    public void setGeoAverage(double geoAverage) {
        this.geoAverage = geoAverage;
    }

    public double getAveragere() {
        return averagere;
    }

    public void setAveragere(double averagere) {
        this.averagere = averagere;
    }

    public double getGeoAveragere() {
        return geoAveragere;
    }

    public void setGeoAveragere(double geoAveragere) {
        this.geoAveragere = geoAveragere;
    }

    public void setGeoAveragere(float geoAveragere) {
        this.geoAveragere = geoAveragere;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTimeGrade() {
        return timeGrade;
    }

    public void setTimeGrade(String timeGrade) {
        this.timeGrade = timeGrade;
    }
}
