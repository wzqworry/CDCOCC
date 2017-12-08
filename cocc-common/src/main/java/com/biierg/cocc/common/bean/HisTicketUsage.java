/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/5/4.
 */
public class HisTicketUsage implements Serializable {
    private final static long serialVersionUID = 1l;

    private String timeDate;//日期
    private String timeGrade;//粒度
    private String lineId;//全路网编号
    private String lineName;//全路网名称

    private String stationId;//全路网编号
    private String stationName;//全路网名称



    private Date startTime;//起始时刻
    private Date endTime;//终止时刻
    private Integer ticketType;//票卡类型编码	1~99
    private String ticketName;//票卡名称
    private String ticketCategory; // 票卡归属种类 TICKET_CATEGORY
    private Long ticketUsage;//票卡使用量
    private Float ticketRatio;//TicketRatio       
    private Date updateTime;//UpdateTime更新时间
    private String remark;//备注
    private Integer jzl;//进站客流
    private Integer czl;//出战客流
    private List<HisTicketUsage> ticketList;//票卡种类及使用量列表

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
    
    public Integer getTicketType() {
		return ticketType;
	}

	public void setTicketType(Integer ticketType) {
		this.ticketType = ticketType;
	}

	public String getTicketName() {
		return ticketName;
	}

	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}
    
	public String getTicketCategory() {
		return ticketCategory;
	}

	public void setTicketCategory(String ticketCategory) {
		this.ticketCategory = ticketCategory;
	}

	public Long getTicketUsage() {
		return ticketUsage;
	}

	public void setTicketUsage(Long ticketUsage) {
		this.ticketUsage = ticketUsage;
	}

	public Float getTicketRatio() {
		return ticketRatio;
	}

	public void setTicketRatio(Float ticketRatio) {
		this.ticketRatio = ticketRatio;
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

	public List<HisTicketUsage> getTicketList() {
		return ticketList;
	}

	public void setTicketList(List<HisTicketUsage> ticketList) {
		this.ticketList = ticketList;
	}

	
    
	
    
}
