/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

import com.biierg.cocc.common.util.DateUtil;

/**
 * Created by wzq on 2017/2/27.
 * 实时的进出站量线路表
 */
public class RealJczLine implements Serializable {
    private final static long serialVersionUID = 1l;

    private String timeDate;// 数据日期
    private String lineId;//线路id
    private String lineName;//线路名称
    
    private String stationNameCN;//中文名称
    
    private Date startTime;
    private Date endTime;
    private Integer jzl;//进站量
    private Integer czl;//出站量
    private Integer jzlSum;//
    private Integer czlSum;
    private int jzlMax;//60日峰值
    private int czlMax;//60日峰值
    private float jzlAvg;//60日均值
    private float czlAvg;//60日均值
    private Date updateTime;//
    private String Remark;
    
    private String timeGrade;
    
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

    public int getJzlMax() {
        return jzlMax;
    }

    public void setJzlMax(int jzlMax) {
        this.jzlMax = jzlMax;
    }

    public int getCzlMax() {
        return czlMax;
    }

    public void setCzlMax(int czlMax) {
        this.czlMax = czlMax;
    }

    public float getJzlAvg() {
        return jzlAvg;
    }

    public void setJzlAvg(float jzlAvg) {
        this.jzlAvg = jzlAvg;
    }

    public float getCzlAvg() {
        return czlAvg;
    }

    public void setCzlAvg(float czlAvg) {
        this.czlAvg = czlAvg;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

	public String getStationNameCN() {
		return stationNameCN;
	}

	public void setStationNameCN(String stationNameCN) {
		this.stationNameCN = stationNameCN;
	}

	public String getTimeGrade() {
		return timeGrade;
	}

	public void setTimeGrade(String timeGrade) {
		this.timeGrade = timeGrade;
	}
}
