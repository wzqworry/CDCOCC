/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import com.biierg.cocc.common.util.DateUtil;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/3/23.
 * 实时断面拥挤度
 */
public class RealDmyjd implements Serializable{
    private final static long serialVersionUID = 1l;

    private String timeGrade;
    private String timeDate;//日期
    private String sectionId;//断面编号
    private Integer direction;//上下行方向 1上行  2下行
    private String sectionName; //断面名称
    private String lineId;//线路编号 00线网
    private String lineName;//线路名称
    private String beginCode;//断面起始站编号
    private String endCode;//断面终点站编号
    private Date startTime;//起始时刻
    private Date endTime;//终止时刻
    private Float dmyjd;//断面拥挤度
    private Date updateTime;//更新时间
    private String remark;//备注
    private Integer section_state;//断面开通标记

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public String getTimeDate() {
        return timeDate;
    }

    public void setTimeDate(String timeDate) {
        this.timeDate = timeDate;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
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

    public Float getDmyjd() {
        return dmyjd;
    }

    public void setDmyjd(Float dmyjd) {
        this.dmyjd = dmyjd;
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

    public String getStartTimeHM() {

        if (startTime != null) {
            return DateUtil.format(startTime, "HH:mm");
        }

        return "";
    }

    public String getEndTimeHM() {

        if (endTime != null) {
            return DateUtil.format(endTime, "HH:mm");
        }

        return "";
    }

    public String getTimeGrade() {
        return timeGrade;
    }

    public void setTimeGrade(String timeGrade) {
        this.timeGrade = timeGrade;
    }

    public Integer getSection_state() {
        return section_state;
    }

    public void setSection_state(Integer section_state) {
        this.section_state = section_state;
    }
}
