package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/8/2.
 * 各站出发车列数（5分钟） 通过这个来计算断面拥挤度
 */
public class XczzSjfcrtd implements Serializable {
    private final static long serialVersionUID = 1l;

    private String dateTime;// 数据日期
    private Date startTime;// 开始时间
    private Date endTime;// 结束时间
    private int lineId;// 线路id
    private int stationId;// 站点id
    private int upTrip;// 上行发车
    private int downTrip;// 下行发车
    private String updateTime;// 更新时间（主键）
    private String remark;// 备注

    private String lineCode;// 线路code
    private String stationCode;// 站点code

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
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

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public int getUpTrip() {
        return upTrip;
    }

    public void setUpTrip(int upTrip) {
        this.upTrip = upTrip;
    }

    public int getDownTrip() {
        return downTrip;
    }

    public void setDownTrip(int downTrip) {
        this.downTrip = downTrip;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLineCode() {
        return lineCode;
    }

    public void setLineCode(String lineCode) {
        this.lineCode = lineCode;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }
}
