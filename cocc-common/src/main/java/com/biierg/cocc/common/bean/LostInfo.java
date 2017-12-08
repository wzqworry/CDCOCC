package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by weibo.zheng on 2017/9/15.
 * 失物招领信息表
 */
public class LostInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    private String id;          //记录id
    private String subject;     //信息主题
    private String imgUrl;      //失物图片
    private Date foundTime;     //发现时间
    private String lineName;    //线路名称
    private String stationName; //车站名称
    private String telNum;      //联系电话
    private Integer status;     //领取状态 0表示未领取 1表示已领取

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Date getFountTime() {
        return foundTime;
    }

    public void setFountTime(Date fountTime) {
        this.foundTime = fountTime;
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

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
