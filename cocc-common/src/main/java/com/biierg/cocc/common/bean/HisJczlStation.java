/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/3/31.
 * his_jzl_station 和 his_czl_station 的关联表
 * 17/06/13 日更新， 废除到到controller里面拼接的方式
 */
public class HisJczlStation implements Serializable{
    private final static long serialVersionUID = 1l;

    private String timeDate;
    private String timeGrade;
    private String lineId;//线路id
    private String lineName;//线路名称
    private Integer rn;

    private String jzlId;//jzl站点id
    private String jzlName;//jzl站点名称
    private Integer jzl;//jzl


    private String czlId;//czl站点id
    private String czlName;//czl站点名称
    private Integer czl;//czl

    private Date startTime;
    private Date endTime;

    private Date jzlStartTime;//jzl发生的时间段
    private Date jzlEndTime;

    private Date czlStartTime;//czl发生的时间段
    private Date czlEndTime;

    public String getTimeDate() {
        return timeDate;
    }

    public void setTimeDate(String timeDate) {
        this.timeDate = timeDate;
    }

    public String getTimeGrade() {
        return timeGrade;
    }

    public void setTimeGrade(String timeGrade) {
        this.timeGrade = timeGrade;
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

    public Integer getRn() {
        return rn;
    }

    public void setRn(Integer rn) {
        this.rn = rn;
    }

    public String getJzlId() {
        return jzlId;
    }

    public void setJzlId(String jzlId) {
        this.jzlId = jzlId;
    }

    public String getJzlName() {
        return jzlName;
    }

    public void setJzlName(String jzlName) {
        this.jzlName = jzlName;
    }

    public Integer getJzl() {
        return jzl;
    }

    public void setJzl(Integer jzl) {
        this.jzl = jzl;
    }

    public String getCzlId() {
        return czlId;
    }

    public void setCzlId(String czlId) {
        this.czlId = czlId;
    }

    public String getCzlName() {
        return czlName;
    }

    public void setCzlName(String czlName) {
        this.czlName = czlName;
    }

    public Integer getCzl() {
        return czl;
    }

    public void setCzl(Integer czl) {
        this.czl = czl;
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

    public Date getJzlStartTime() {
        return jzlStartTime;
    }

    public void setJzlStartTime(Date jzlStartTime) {
        this.jzlStartTime = jzlStartTime;
    }

    public Date getJzlEndTime() {
        return jzlEndTime;
    }

    public void setJzlEndTime(Date jzlEndTime) {
        this.jzlEndTime = jzlEndTime;
    }

    public Date getCzlStartTime() {
        return czlStartTime;
    }

    public void setCzlStartTime(Date czlStartTime) {
        this.czlStartTime = czlStartTime;
    }

    public Date getCzlEndTime() {
        return czlEndTime;
    }

    public void setCzlEndTime(Date czlEndTime) {
        this.czlEndTime = czlEndTime;
    }
}
