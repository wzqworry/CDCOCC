/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/2/27.
 * 实时站点换乘量
 */
public class RealHclStation implements Serializable {
    private final static long serialVersionUID = 1l;

    private String timeDate;//数据日期
    private String lineId;//线路id
    private String lineName;//线路名称
    private String stationId;//线路id
    private String stationName;//线路名称
    private Date startTime;
    private Date endTime;
    private Integer hcl;//换乘量
    private Integer hclSum;
    private Date updateTime;
    private String remark;
    
    private String timeGrade;

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

    public Integer getHcl() {
        return hcl;
    }

    public void setHcl(Integer hcl) {
        this.hcl = hcl;
    }

    public Integer getHclSum() {
        return hclSum;
    }

    public void setHclSum(Integer hclSum) {
        this.hclSum = hclSum;
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
