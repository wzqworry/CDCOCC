/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

import com.biierg.cocc.common.util.DateUtil;

/**
 * Created by wzq on 2017/5/3.
 * 计算出的指标的bean
 */
public class WorkOut implements Serializable{
    private final static long serialVersionUID = 1l;

    /*平均运距*/
    private String lineId;
    private String lineName;
    private float avgyj;

    private String stationId;
    private String stationName;
    private Integer kyl;//进站量加换乘量
    private Integer maxKyl;//60日最大客运量
    private Float avgKyl;//60日平均客运量


    /*线网客流明细的各个指标*/
    private String timeDate;
    private String timeGrade;
    private Date startTime;
    private Date endTime;
    private String remark;
    private Integer bxkl;//本线客流
    private Integer hckl;//换出客流
    private Integer odkl;//od客流（本线客流+换出客流）
    private Integer hrkl;//换入客流
    private Integer tjkl;//途径客流
    private Integer huckl;//换乘客流（换入客流+途径客流）
    private Integer jzl;//进站量
    private Integer czl;//出站量

    //客流查询报表-线网客流日报（值班主任）
    private Integer hcl;//换乘量
    private Integer jzlSum;//进站量累计
    private Integer jzlAvg;//进站月日均
    private Integer kylSum;//客运量月累计
    private Integer kylAvg;//客运量月日均

    //客运量情况
    private Integer kylYSum;//客运量年累计
    private Float kylYAvg;//客运量年日均

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

    public float getAvgyj() {
        return avgyj;
    }

    public void setAvgyj(float avgyj) {
        this.avgyj = avgyj;
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

    public Integer getKyl() {
        return kyl;
    }

    public void setKyl(Integer kyl) {
        this.kyl = kyl;
    }

    public Integer getMaxKyl() {
        return maxKyl;
    }

    public void setMaxKyl(Integer maxKyl) {
        this.maxKyl = maxKyl;
    }

    public Float getAvgKyl() {
        return avgKyl;
    }

    public void setAvgKyl(Float avgKyl) {
        this.avgKyl = avgKyl;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getRemark() {
        return remark;
    }
    
    public String getTime() {
    	if(startTime!=null&&endTime!=null){
		return DateUtil.format(startTime, "HH:mm") + "-" + DateUtil.format(endTime, "HH:mm");
    	}
		return "";
	}
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getBxkl() {
        return bxkl;
    }

    public void setBxkl(Integer bxkl) {
        this.bxkl = bxkl;
    }

    public Integer getHckl() {
        return hckl;
    }

    public void setHckl(Integer hckl) {
        this.hckl = hckl;
    }

    public Integer getOdkl() {
        return odkl;
    }

    public void setOdkl(Integer odkl) {
        this.odkl = odkl;
    }

    public Integer getHrkl() {
        return hrkl;
    }

    public void setHrkl(Integer hrkl) {
        this.hrkl = hrkl;
    }

    public Integer getTjkl() {
        return tjkl;
    }

    public void setTjkl(Integer tjkl) {
        this.tjkl = tjkl;
    }

    public Integer getHuckl() {
        return huckl;
    }

    public void setHuckl(Integer huckl) {
        this.huckl = huckl;
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

    public Integer getHcl() {
        return hcl;
    }

    public void setHcl(Integer hcl) {
        this.hcl = hcl;
    }

    public Integer getJzlSum() {
        return jzlSum;
    }

    public void setJzlSum(Integer jzlSum) {
        this.jzlSum = jzlSum;
    }

    public Integer getJzlAvg() {
        return jzlAvg;
    }

    public void setJzlAvg(Integer jzlAvg) {
        this.jzlAvg = jzlAvg;
    }

    public Integer getKylSum() {
        return kylSum;
    }

    public void setKylSum(Integer kylSum) {
        this.kylSum = kylSum;
    }

    public Integer getKylAvg() {
        return kylAvg;
    }

    public void setKylAvg(Integer kylAvg) {
        this.kylAvg = kylAvg;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getKylYSum() {
        return kylYSum;
    }

    public void setKylYSum(Integer kylYSum) {
        this.kylYSum = kylYSum;
    }

    public Float getKylYAvg() {
        return kylYAvg;
    }

    public void setKylYAvg(Float kylYAvg) {
        this.kylYAvg = kylYAvg;
    }
}
