/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/5/3.
 * 线路/线网平均乘车特征
 */
public class HisAvgRidingFeature implements Serializable {
    private final static long serialVersionUID = 1l;

    private String timeDate;//日期
    private String timeGrade;//时间粒度
    private String lineId;//线路编号
    private String lineName;//线路名称
    private Date startTime;//起始时刻
    private Date endTime;//终止时刻
    private float avgDistance;//平均乘车距离
    private float avgStations;//平均乘车站数
    private float acgTime;//平均乘车时间
    private Date updateTime;//更新时间
    private String remark;//备注

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

    public float getAvgDistance() {
        return avgDistance;
    }

    public void setAvgDistance(float avgDistance) {
        this.avgDistance = avgDistance;
    }

    public float getAvgStations() {
        return avgStations;
    }

    public void setAvgStations(float avgStations) {
        this.avgStations = avgStations;
    }

    public float getAcgTime() {
        return acgTime;
    }

    public void setAcgTime(float acgTime) {
        this.acgTime = acgTime;
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
}
