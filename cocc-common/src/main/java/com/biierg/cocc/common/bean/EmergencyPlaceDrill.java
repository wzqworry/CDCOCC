/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * Created by wzq on 2017/3/14.
 */
public class EmergencyPlaceDrill implements Serializable {
    private final static long serialVersionUID = 1l;
    private String id;//ID
    private String emerId;//事件id
    private Integer placeType;//地点类型
    private String lineName;
    private String stationName;
    private Integer areaType;//发生地点类型
    private String customPlace;//自定义地点
    private String startStation;//开始站
    private String endStation;//结束站
    private Integer dir;//上下行
    private String centerName;//中心id
    private String fieldName;//场段id

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmerId() {
        return emerId;
    }

    public void setEmerId(String emerId) {
        this.emerId = emerId;
    }

    public Integer getPlaceType() {
        return placeType;
    }

    public void setPlaceType(Integer placeType) {
        this.placeType = placeType;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Integer getAreaType() {
        return areaType;
    }

    public void setAreaType(Integer areaType) {
        this.areaType = areaType;
    }

    public String getCustomPlace() {
        return customPlace;
    }

    public void setCustomPlace(String customPlace) {
        this.customPlace = customPlace;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public Integer getDir() {
        return dir;
    }

    public void setDir(Integer dir) {
        this.dir = dir;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
