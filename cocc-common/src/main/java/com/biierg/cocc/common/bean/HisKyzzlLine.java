/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wzq on 2017/6/1.
 * 非实时数据 - 线路/线网客运周转量
 */
public class HisKyzzlLine implements Serializable{
    private final static long serialVersionUID = 1l;

    private String timeDate;//日期
    private String timeGrade;//时间粒度
    private String lineId;//线路编号
    private String lineName;//线路名称
    private Date startTime;//起始时刻
    private Date endTime;//终止时刻
    private Integer zzl;//周转量
    private Double avgZzl;//平均周转量
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

    public Integer getZzl() {
        return zzl;
    }

    public void setZzl(Integer zzl) {
        this.zzl = zzl;
    }

    public String getAvgZzl() {
        BigDecimal bigDecimal = new BigDecimal(avgZzl);
        String result = bigDecimal.toString();
        return result;
    }

    public void setAvgZzl(Double avgZzl) {
        this.avgZzl = avgZzl;
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
