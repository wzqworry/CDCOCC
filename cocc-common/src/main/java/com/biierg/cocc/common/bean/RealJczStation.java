/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/2/27.
 * 实时站点进出站量
 */
public class RealJczStation implements Serializable {
    private final static long serialVersionUID = 1l;

    private String timeDate;
    private String lineId;
    private String lineName;
    private String stationId;
    private String stationName;
    private Date startTime;
    private Date endTime;
    private Integer jzl;
    private Integer czl;
    private Integer jzlSum;
    private Integer czlSum;
    private Date updateTime;
    private String remark;
    private String timeGrade;
    private String shortName;
    
    

    public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getTimeDate() {
        return timeDate;
    }

    public void setTimeDate(String timeDate) {
        this.timeDate = timeDate;
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

    public Integer getJzl() {
        return jzl;
    }

    public void setJzl(Integer jzl) {
        this.jzl = jzl;
    }

    public Integer getCzl() {
        return czl;
    }

    public void setCzl(Integer czl) {
        this.czl = czl;
    }

    public Integer getJzlSum() {
        return jzlSum;
    }

    public void setJzlSum(Integer jzlSum) {
        this.jzlSum = jzlSum;
    }

    public Integer getCzlSum() {
        return czlSum;
    }

    public void setCzlSum(Integer czlSum) {
        this.czlSum = czlSum;
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

	public String getTimeGrade() {
		return timeGrade;
	}

	public void setTimeGrade(String timeGrade) {
		this.timeGrade = timeGrade;
	}
}