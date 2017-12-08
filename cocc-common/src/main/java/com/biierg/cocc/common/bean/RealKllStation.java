/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

import com.biierg.cocc.common.util.DateUtil;

/**
 * Created by wzq on 2017/6/21.
 */
public class RealKllStation implements Serializable {
    private final static long serialVersionUID = 1l;

    private String lineId;
    private String lineName;
    private String stationId;
    private String stationName;
    private String timeDate;
    private Date startTime;
    private Date endTime;
    private int jzl;
    private int czl;
    private int hcl;

    private float jzlAvg;
    private float czlAvg;
    private float hclAvg;

    private int jzlMax;
    private int czlMax;
    private int hclMax;
    
    private String timeGrade;

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getTimeDate() {
        return timeDate;
    }

    public void setTimeDate(String timeDate) {
        this.timeDate = timeDate;
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
    public String getTime() {
    	if(startTime!=null&&endTime!=null){
		return DateUtil.format(startTime, "HH:mm") + "-" + DateUtil.format(endTime, "HH:mm");
    	}
		return "";
	}
    
    public int getJzl() {
        return jzl;
    }

    public void setJzl(int jzl) {
        this.jzl = jzl;
    }

    public int getCzl() {
        return czl;
    }

    public void setCzl(int czl) {
        this.czl = czl;
    }

    public int getHcl() {
        return hcl;
    }

    public void setHcl(int hcl) {
        this.hcl = hcl;
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

    public float getHclAvg() {
        return hclAvg;
    }

    public void setHclAvg(float hclAvg) {
        this.hclAvg = hclAvg;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
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

    public int getHclMax() {
        return hclMax;
    }

    public void setHclMax(int hclMax) {
        this.hclMax = hclMax;
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

	public String getTimeGrade() {
		return timeGrade;
	}

	public void setTimeGrade(String timeGrade) {
		this.timeGrade = timeGrade;
	}
}
