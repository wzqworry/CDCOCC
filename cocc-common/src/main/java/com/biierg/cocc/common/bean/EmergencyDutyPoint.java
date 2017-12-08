/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * Created by wzq on 2017/4/25.
 * 应急值守点
 */
public class EmergencyDutyPoint implements Serializable {
    private final static long serialVersionUID = 1l;

    private String id;//	ID
    private Integer areaType;//应急区域
    private String locatStation;//设置在哪个站点
    private String dutyMajor;//值守专业
    private String dutyArea;//管辖范围
    private String dutyTime;//值守时间
    private String contactWay;//联系方式
    private String remark;//备注

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAreaType() {
        return areaType;
    }

    public void setAreaType(Integer areaType) {
        this.areaType = areaType;
    }

    public String getLocatStation() {
        return locatStation;
    }

    public void setLocatStation(String locatStation) {
        this.locatStation = locatStation;
    }

    public String getDutyMajor() {
        return dutyMajor;
    }

    public void setDutyMajor(String dutyMajor) {
        this.dutyMajor = dutyMajor;
    }

    public String getDutyArea() {
        return dutyArea;
    }

    public void setDutyArea(String dutyArea) {
        this.dutyArea = dutyArea;
    }

    public String getDutyTime() {
        return dutyTime;
    }

    public void setDutyTime(String dutyTime) {
        this.dutyTime = dutyTime;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
