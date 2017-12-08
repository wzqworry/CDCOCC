/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/3/9.
 * 突发事件信息表
 */
public class Emergency implements Serializable {
    private final static long serialVersionUID = 1l;

    private String id;//ID
    private String sceneId;// 场景Id

    private String emerName;//事件名称
    private Date emerTime;//事件发生时间
    private Integer emerStatue;//事件状态
    private String emerDesc;//事件描述
    private String emerReason;//事件原因
    private Integer emerLevel;//事件等级
    private String emerHandler;//提交人员

    private String emerAppearance;//事件现象

    private Integer death;//死亡人数
    private Integer injury;//重伤人数
    private Integer wound;//轻伤人数
    private Double lost;//
    private Double delay;//
    private Double serviceBreak;//运营中断
    private Integer lineBreak;//线路中断
    private Integer stationStatue;//车站状态
    private Integer serviceStatue;//运营状态
    private Integer healthEvent;//卫生事件
    private String updater;//更新操作人员
    private Date updateTime;//
    private String fileId;//处置报告的存储id

    private List<EmergencyPlace> emergencyPlaceList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmerName() {
        return emerName;
    }

    public void setEmerName(String emerName) {
        this.emerName = emerName;
    }

    public Date getEmerTime() {
        return emerTime;
    }

    public void setEmerTime(Date emerTime) {
        this.emerTime = emerTime;
    }

    public Integer getEmerStatue() {
        return emerStatue;
    }

    public void setEmerStatue(Integer emerStatue) {
        this.emerStatue = emerStatue;
    }

    public String getEmerDesc() {
        return emerDesc;
    }

    public void setEmerDesc(String emerDesc) {
        this.emerDesc = emerDesc;
    }

    public String getEmerReason() {
        return emerReason;
    }

    public void setEmerReason(String emerReason) {
        this.emerReason = emerReason;
    }

    public Integer getEmerLevel() {
        return emerLevel;
    }

    public void setEmerLevel(Integer emerLevel) {
        this.emerLevel = emerLevel;
    }

    public String getEmerHandler() {
        return emerHandler;
    }

    public void setEmerHandler(String emerHandler) {
        this.emerHandler = emerHandler;
    }

    public Integer getDeath() {
        return death;
    }

    public void setDeath(Integer death) {
        this.death = death;
    }

    public Integer getInjury() {
        return injury;
    }

    public void setInjury(Integer injury) {
        this.injury = injury;
    }

    public Integer getWound() {
        return wound;
    }

    public void setWound(Integer wound) {
        this.wound = wound;
    }

    public Double getLost() {
        return lost;
    }

    public void setLost(Double lost) {
        this.lost = lost;
    }

    public Double getDelay() {
        return delay;
    }

    public void setDelay(Double delay) {
        this.delay = delay;
    }

    public Double getServiceBreak() {
        return serviceBreak;
    }

    public void setServiceBreak(Double serviceBreak) {
        this.serviceBreak = serviceBreak;
    }

    public Integer getLineBreak() {
        return lineBreak;
    }

    public void setLineBreak(Integer lineBreak) {
        this.lineBreak = lineBreak;
    }

    public Integer getStationStatue() {
        return stationStatue;
    }

    public void setStationStatue(Integer stationStatue) {
        this.stationStatue = stationStatue;
    }

    public Integer getServiceStatue() {
        return serviceStatue;
    }

    public void setServiceStatue(Integer serviceStatue) {
        this.serviceStatue = serviceStatue;
    }

    public Integer getHealthEvent() {
        return healthEvent;
    }

    public void setHealthEvent(Integer healthEvent) {
        this.healthEvent = healthEvent;
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

    /*public EmergencyPlace getEmergencyPlace() {
        return emergencyPlace;
    }

    public void setEmergencyPlace(EmergencyPlace emergencyPlace) {
        this.emergencyPlace = emergencyPlace;
    }*/

    public String getEmerAppearance() {
        return emerAppearance;
    }

    public void setEmerAppearance(String emerAppearance) {
        this.emerAppearance = emerAppearance;
    }

    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    public List<EmergencyPlace> getEmergencyPlaceList() {
        return emergencyPlaceList;
    }

    public void setEmergencyPlaceList(List<EmergencyPlace> emergencyPlaceList) {
        this.emergencyPlaceList = emergencyPlaceList;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}
