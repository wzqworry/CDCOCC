package com.biierg.cocc.common.bean;
/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wxs on 2017/8/1.
 * 地铁车站表 BASE_STATIONS
 */
public class BaseStations implements Serializable{
    private final static long serialVersionUID = 1l;
    private String stationCode;//站点编号
    private String lineCode;//所属线路
    private String stationNameCN;//中文名称
    private String stationNameEN;//英文名称
    private int stationState;//使用状态
    private int isHeadEnd;//是否首末站
    private int isTransfer;//是否换乘站
    private int isImportant;//是否是终点站
    private int turnBackFlag;//是否折返站
    private float longitude;//经度
    private float latitude;//维度
    private Date updateTime;//更新日期
    private String  remark;//备注

    private int atsLineId;//ATS线路编码
    private int atsStationId;//ATS车站编码

    private String telNum;//车站电话
    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getLineCode() {
        return lineCode;
    }

    public void setLineCode(String lineCode) {
        this.lineCode = lineCode;
    }

    public String getStationNameCN() {
        return stationNameCN;
    }

    public void setStationNameCN(String stationNameCN) {
        this.stationNameCN = stationNameCN;
    }

    public String getStationNameEN() {
        return stationNameEN;
    }

    public void setStationNameEN(String stationNameEN) {
        this.stationNameEN = stationNameEN;
    }

    public int getStationState() {
        return stationState;
    }

    public void setStationState(int stationState) {
        this.stationState = stationState;
    }

    public int getIsHeadEnd() {
        return isHeadEnd;
    }

    public void setIsHeadEnd(int isHeadEnd) {
        this.isHeadEnd = isHeadEnd;
    }

    public int getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(int isTransfer) {
        this.isTransfer = isTransfer;
    }

    public int getTurnBackFlag() {
        return turnBackFlag;
    }

    public void setTurnBackFlag(int turnBackFlag) {
        this.turnBackFlag = turnBackFlag;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getIsImportant() {
        return isImportant;
    }

    public void setIsImportant(int isImportant) {
        this.isImportant = isImportant;
    }

    public int getAtsLineId() {
        return atsLineId;
    }

    public void setAtsLineId(int atsLineId) {
        this.atsLineId = atsLineId;
    }

    public int getAtsStationId() {
        return atsStationId;
    }

    public void setAtsStationId(int atsStationId) {
        this.atsStationId = atsStationId;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }
}
