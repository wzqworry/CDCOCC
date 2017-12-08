package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * Created by wzq on 2017/9/15.
 * 站点出入口周边公交信息
 */
public class BaseOutsideBusInfo implements Serializable {
    private final static long serialVersionUID  = 1l;

    private String stationName;         //车站名称
    private String gate;                //出入口
    private String busStationName;      //公交站名
    private float busStationDistance;   //公交站距离
    private String busLine;             //公交线路列表

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getBusStationName() {
        return busStationName;
    }

    public void setBusStationName(String busStationName) {
        this.busStationName = busStationName;
    }

    public float getBusStationDistance() {
        return busStationDistance;
    }

    public void setBusStationDistance(float busStationDistance) {
        this.busStationDistance = busStationDistance;
    }

    public String getBusLine() {
        return busLine;
    }

    public void setBusLine(String busLine) {
        this.busLine = busLine;
    }
}
