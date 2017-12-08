package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 实时 预警监控 断面拥挤度 实体类
 * Created by syy on 2017/7/25.
 */
public class RealAlarmYjdSection implements Serializable {
    private final static long serialVersionUID = 1l;
    private String id;
    private String timeDate;
    private String lineId;
    private String lineName;
    private String sectionId;
    private String sectionName;
    private Integer direction;  //上下行方向 1上行  2下行
    private String beginCode;
    private String endCode;
    private Date startTime;
    private Date endTime;
    private Double value;
    private Double threshold;
    private Integer alarmLevel;
    private Date updateTime;
    private String timeGrade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBeginCode() {
        return beginCode;
    }

    public void setBeginCode(String beginCode) {
        this.beginCode = beginCode;
    }

    public String getEndCode() {
        return endCode;
    }

    public void setEndCode(String endCode) {
        this.endCode = endCode;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
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

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
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

    public void setValue(Double value) {
        this.value = value;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public Integer getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
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
