/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

import com.biierg.cocc.common.util.DateUtil;

/**
 * Created by wzq on 2017/3/28.
 */
public class HisDmkll implements Serializable {
	private final static long serialVersionUID = 1l;

	private String timeDate;// 日期
	private String timeGrade;// 时间粒度
	private String sectionId;// 断面id
	private String lineId;// 线路编号
	private String lineName;// 线路名称
	private String beginCode;// 断面起始站编号
	private String endCode;// 断面终点站编号
	private Date startTime;// 起始时刻
	private Date endTime;// 终止时刻
	private Integer dmkll;// 断面客流量

	private Integer maxDmkll;// 最大断面客流量
	/* 上下行断面客流是给查询断面客流明细报表使用的 对应detail服务 */

	private String sectionName;
	private Integer direction;
	private String startName; // 起始站的名字
	private String endName;// 终点站的名字
	private Integer upDmkll;// 上行断面客流量
	private Integer downDmkll;// 下行断面按客流量
	private String dmkllType;// 类型 (最大,上行,下行)

	private Date updateTime;// 更新时间
	private String remark;// 备注

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public Integer getDirection() {
		return direction;
	}

	public void setDirection(Integer direction) {
		this.direction = direction;
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

	public Integer getDmkll() {
		return dmkll;
	}

	public void setDmkll(Integer dmkll) {
		this.dmkll = dmkll;
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

	public Integer getMaxDmkll() {
		return maxDmkll;
	}

	public void setMaxDmkll(Integer maxDmkll) {
		this.maxDmkll = maxDmkll;
	}

	public Integer getUpDmkll() {
		return upDmkll;
	}

	public void setUpDmkll(Integer upDmkll) {
		this.upDmkll = upDmkll;
	}

	public Integer getDownDmkll() {
		return downDmkll;
	}

	public void setDownDmkll(Integer downDmkll) {
		this.downDmkll = downDmkll;
	}

	public String getDmkllType() {
		return dmkllType;
	}

	public void setDmkllType(String dmkllType) {
		this.dmkllType = dmkllType;
	}

	public String getStartName() {
		return startName;
	}

	public void setStartName(String startName) {
		this.startName = startName;
	}

	public String getEndName() {
		return endName;
	}

	public void setEndName(String endName) {
		this.endName = endName;
	}

	public String getTime() {
		
		if (startTime != null && endTime != null) {
			return DateUtil.format(startTime, "HH:mm") + "-" + DateUtil.format(endTime, "HH:mm");
		}
		
		return "";
	}
}
