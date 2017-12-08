/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/6/1.
 * 非实时数据 - 换乘站分方向换乘量
 */
public class HisHclDirStation implements Serializable{
    private final static long serialVersionUID = 1l;

    private String timeDate;//日期
    private String timeGrade;//时间粒度
    private String stationId;//车站编号
    private String stationName;//车站名称
    private String lineOutId;//出线路编号
    private String lineOutName;//出线路名称
    private String lineOutDir;//出线方向
    private String lineInId;//入线路编号
    private String lineInName;//入线路名称
    private String lineInDir;//入线方向
    private Date startTime;//起始时刻
    private Date endTime;//终止时刻
    private Integer hcl;//换乘量
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

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getLineOutId() {
        return lineOutId;
    }

    public void setLineOutId(String lineOutId) {
        this.lineOutId = lineOutId;
    }

    public String getLineOutName() {
        return lineOutName;
    }

    public void setLineOutName(String lineOutName) {
        this.lineOutName = lineOutName;
    }

    public String getLineOutDir() {
        return lineOutDir;
    }

    public void setLineOutDir(String lineOutDir) {
        this.lineOutDir = lineOutDir;
    }

    public String getLineInId() {
        return lineInId;
    }

    public void setLineInId(String lineInId) {
        this.lineInId = lineInId;
    }

    public String getLineInName() {
        return lineInName;
    }

    public void setLineInName(String lineInName) {
        this.lineInName = lineInName;
    }

    public String getLineInDir() {
        return lineInDir;
    }

    public void setLineInDir(String lineInDir) {
        this.lineInDir = lineInDir;
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

    public Integer getHcl() {
        return hcl;
    }

    public void setHcl(Integer hcl) {
        this.hcl = hcl;
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
