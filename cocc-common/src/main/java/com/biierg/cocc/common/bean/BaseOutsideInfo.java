package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * Created by wzq on 2017/9/15.
 * 站点出入口周边信息
 */
public class BaseOutsideInfo implements Serializable {
    private final static long serialVersionUID = 1l;
    private String stationName; //车站名称
    private String gate;        //出入口
    private String roads;       //周边道路列表
    private int toilet;         //公厕标记
    private int hospital;       //医院标记
    private int atm;            //ATM标记
    private int elevator;       //无障碍设施
    private int police;         //警务室


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

    public String getRoads() {
        return roads;
    }

    public void setRoads(String roads) {
        this.roads = roads;
    }

    public int getToilet() {
        return toilet;
    }

    public void setToilet(int toilet) {
        this.toilet = toilet;
    }

    public int getHospital() {
        return hospital;
    }

    public void setHospital(int hospital) {
        this.hospital = hospital;
    }

    public int getAtm() {
        return atm;
    }

    public void setAtm(int atm) {
        this.atm = atm;
    }

    public int getElevator() {
        return elevator;
    }

    public void setElevator(int elevator) {
        this.elevator = elevator;
    }

    public int getPolice() {
        return police;
    }

    public void setPolice(int police) {
        this.police = police;
    }
}
