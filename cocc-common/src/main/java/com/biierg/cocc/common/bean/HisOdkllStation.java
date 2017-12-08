/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/5/31. 非实时数据 - 车站OD客流量
 */
public class HisOdkllStation implements Serializable {
	private final static long serialVersionUID = 1l;

	private String timeDate;// 日期
	private String timeGrade;// 时间粒度
	private String lineOriginId;// 始线路编号
	private String lineOriginName;// 始线路名称
	private String stationOriginId;// 始车站编号
	private String stationOriginName;// 始车站名称
	private String lineDestId;// 终线路编号
	private String lineDestName;// 终线路名称
	private String stationDestId;// 终车站编号
	private String stationDestName;// 终车站名称

	private Date startTime;// 起始时刻
	private Date endTime;// 终止时刻
	private Integer kll;// 客流量
	private Date updateTime;// 更新时间
	private String remark;// 备注

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

	public String getLineOriginId() {
		return lineOriginId;
	}

	public void setLineOriginId(String lineOriginId) {
		this.lineOriginId = lineOriginId;
	}

	public String getLineOriginName() {
		return lineOriginName;
	}

	public void setLineOriginName(String lineOriginName) {
		this.lineOriginName = lineOriginName;
	}

	public String getStationOriginId() {
		return stationOriginId;
	}

	public void setStationOriginId(String stationOriginId) {
		this.stationOriginId = stationOriginId;
	}

	public String getStationOriginName() {
		return stationOriginName;
	}

	public void setStationOriginName(String stationOriginName) {
		this.stationOriginName = stationOriginName;
	}

	public String getLineDestId() {
		return lineDestId;
	}

	public void setLineDestId(String lineDestId) {
		this.lineDestId = lineDestId;
	}

	public String getLineDestName() {
		return lineDestName;
	}

	public void setLineDestName(String lineDestName) {
		this.lineDestName = lineDestName;
	}

	public String getStationDestId() {
		return stationDestId;
	}

	public void setStationDestId(String stationDestId) {
		this.stationDestId = stationDestId;
	}

	public String getStationDestName() {
		return stationDestName;
	}

	public void setStationDestName(String stationDestName) {
		this.stationDestName = stationDestName;
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

	public Integer getKll() {
		return kll;
	}

	public void setKll(Integer kll) {
		this.kll = kll;
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
