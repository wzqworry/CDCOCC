/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

import com.biierg.cocc.common.util.DateUtil;

/**
 * Created by wzq on 2017/3/2.
 * 断面客流量实时
 */
public class RealDmkll implements Serializable{
    private final static long serialVersionUID = 1l;

    private String timeDate;
    private String sectionId;
    private String sectionName;
    private String lineId;
    private String lineName;
    private String beginCode;
    private String endCode;
    
    private String direction;
    private String beginStationName;
    private String endStationName;
    
    private Date startTime;
    private Date endTime;
    private Integer dmkll;
    private Integer dmkllSum;
    private Date updateTime;
    private String remark;

    private int dir;//上面的direction不知道那里再用
    private String timeGrade;

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
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

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getBeginStationName() {
		return beginStationName;
	}

	public void setBeginStationName(String beginStationName) {
		this.beginStationName = beginStationName;
	}

	public String getEndStationName() {
		return endStationName;
	}

	public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}
	
	public String getStartTimeHM() {
		
		if (startTime != null) {
			return DateUtil.format(startTime, "HH:mm");
		}
		
		return "";
	}

	public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
	
	public String getEndTimeHM() {
		
		if (endTime != null) {
			return DateUtil.format(endTime, "HH:mm");
		}
		
		return "";
	}

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getDmkll() {
        return dmkll;
    }

    public void setDmkll(Integer dmkll) {
        this.dmkll = dmkll;
    }

    public Integer getDmkllSum() {
        return dmkllSum;
    }

    public void setDmkllSum(Integer dmkllSum) {
        this.dmkllSum = dmkllSum;
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

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

	public String getTimeGrade() {
		return timeGrade;
	}

	public void setTimeGrade(String timeGrade) {
		this.timeGrade = timeGrade;
	}
}
