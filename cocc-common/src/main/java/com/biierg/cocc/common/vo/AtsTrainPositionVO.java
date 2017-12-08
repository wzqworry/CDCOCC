package com.biierg.cocc.common.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 列车实时位置
 * 
 * @author lei
 */
public class AtsTrainPositionVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String lineId; // 线路号
	private String trainId; // 列车编号
	private String groupId; // 车组号
	private String trainName; // 列车显示名

	private int direction; // 运行方向
	private String beginStationCode; // 区间起始站编号
	private String endStationCode; // 区间终点站编号

	private String trackName; // 轨道名称
	private int trackNum; // 轨道序号
	private int trackAmount; // 区间轨道总数
	private double travelRatio; // 区间行进比例

	private Date arrivalTime; // 到达时间
	private Date updateTime; // 更新时间

	/**
	 * @return the lineId
	 */
	public String getLineId() {
		return lineId;
	}

	/**
	 * @param lineId
	 *            the lineId to set
	 */
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	/**
	 * @return the trainId
	 */
	public String getTrainId() {
		return trainId;
	}

	/**
	 * @param trainId
	 *            the trainId to set
	 */
	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}

	/**
	 * @return the groupId
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
	 * @return the trainName
	 */
	public String getTrainName() {
		return trainName;
	}

	/**
	 * @param trainName
	 *            the trainName to set
	 */
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	/**
	 * @return the direction
	 */
	public int getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 *            the direction to set
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}

	/**
	 * @return the beginStationCode
	 */
	public String getBeginStationCode() {
		return beginStationCode;
	}

	/**
	 * @param beginStationCode
	 *            the beginStationCode to set
	 */
	public void setBeginStationCode(String beginStationCode) {
		this.beginStationCode = beginStationCode;
	}

	/**
	 * @return the endStationCode
	 */
	public String getEndStationCode() {
		return endStationCode;
	}

	/**
	 * @param endStationCode
	 *            the endStationCode to set
	 */
	public void setEndStationCode(String endStationCode) {
		this.endStationCode = endStationCode;
	}

	/**
	 * @return the trackName
	 */
	public String getTrackName() {
		return trackName;
	}

	/**
	 * @param trackName
	 *            the trackName to set
	 */
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	/**
	 * @return the trackNum
	 */
	public int getTrackNum() {
		return trackNum;
	}

	/**
	 * @param trackNum
	 *            the trackNum to set
	 */
	public void setTrackNum(int trackNum) {
		this.trackNum = trackNum;
	}

	/**
	 * @return the trackAmount
	 */
	public int getTrackAmount() {
		return trackAmount;
	}

	/**
	 * @param trackAmount
	 *            the trackAmount to set
	 */
	public void setTrackAmount(int trackAmount) {
		this.trackAmount = trackAmount;
	}

	/**
	 * @return the travelRatio
	 */
	public double getTravelRatio() {
		return travelRatio;
	}

	/**
	 * @param travelRatio
	 *            the travelRatio to set
	 */
	public void setTravelRatio(double travelRatio) {
		this.travelRatio = travelRatio;
	}

	/**
	 * @return the arrivalTime
	 */
	public Date getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * @param arrivalTime
	 *            the arrivalTime to set
	 */
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime
	 *            the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
