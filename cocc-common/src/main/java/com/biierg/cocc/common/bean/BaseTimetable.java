/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 地铁列车时刻表
 * 
 * @author lei
 */
public class BaseTimetable implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id; // 流水号
	private String timeTableCode; // 时刻表图号
	private String schDate; // 计划日期
	private String lineCode; // 线路编码
	private String tableNo; // 车表号
	private String tripNo; // 车次号
	private String startCode; // 始发站编码
	private String destCode; // 目的站编码
	private String pltfCode; // 途经站编码
	private Date arrvTime; // 到站时刻，有跨0点情况，需要带日期
	private Date deptTime; // 出发时刻
	private int direction; // 上下行标志
	private int isActual; // 是否实际时刻
	private String stationType; // 车站类型
	private Date updateDate; // 更新日期
	private String updateUser; // 更新用户
	private String remark; // 备注

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the timeTableCode
	 */
	public String getTimeTableCode() {
		return timeTableCode;
	}

	/**
	 * @param timeTableCode
	 *            the timeTableCode to set
	 */
	public void setTimeTableCode(String timeTableCode) {
		this.timeTableCode = timeTableCode;
	}

	/**
	 * @return the schDate
	 */
	public String getSchDate() {
		return schDate;
	}

	/**
	 * @param schDate
	 *            the schDate to set
	 */
	public void setSchDate(String schDate) {
		this.schDate = schDate;
	}

	/**
	 * @return the lineCode
	 */
	public String getLineCode() {
		return lineCode;
	}

	/**
	 * @param lineCode
	 *            the lineCode to set
	 */
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	/**
	 * @return the tableNo
	 */
	public String getTableNo() {
		return tableNo;
	}

	/**
	 * @param tableNo
	 *            the tableNo to set
	 */
	public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}

	/**
	 * @return the tripNo
	 */
	public String getTripNo() {
		return tripNo;
	}

	/**
	 * @param tripNo
	 *            the tripNo to set
	 */
	public void setTripNo(String tripNo) {
		this.tripNo = tripNo;
	}

	/**
	 * @return the startCode
	 */
	public String getStartCode() {
		return startCode;
	}

	/**
	 * @param startCode
	 *            the startCode to set
	 */
	public void setStartCode(String startCode) {
		this.startCode = startCode;
	}

	/**
	 * @return the destCode
	 */
	public String getDestCode() {
		return destCode;
	}

	/**
	 * @param destCode
	 *            the destCode to set
	 */
	public void setDestCode(String destCode) {
		this.destCode = destCode;
	}

	/**
	 * @return the pltfCode
	 */
	public String getPltfCode() {
		return pltfCode;
	}

	/**
	 * @param pltfCode
	 *            the pltfCode to set
	 */
	public void setPltfCode(String pltfCode) {
		this.pltfCode = pltfCode;
	}

	/**
	 * @return the arrvTime
	 */
	public Date getArrvTime() {
		return arrvTime;
	}

	/**
	 * @param arrvTime
	 *            the arrvTime to set
	 */
	public void setArrvTime(Date arrvTime) {
		this.arrvTime = arrvTime;
	}

	/**
	 * @return the deptTime
	 */
	public Date getDeptTime() {
		return deptTime;
	}

	/**
	 * @param deptTime
	 *            the deptTime to set
	 */
	public void setDeptTime(Date deptTime) {
		this.deptTime = deptTime;
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
	 * @return the isActual
	 */
	public int getIsActual() {
		return isActual;
	}

	/**
	 * @param isActual
	 *            the isActual to set
	 */
	public void setIsActual(int isActual) {
		this.isActual = isActual;
	}

	/**
	 * @return the stationType
	 */
	public String getStationType() {
		return stationType;
	}

	/**
	 * @param stationType
	 *            the stationType to set
	 */
	public void setStationType(String stationType) {
		this.stationType = stationType;
	}

	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate
	 *            the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * @return the updateUser
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * @param updateUser
	 *            the updateUser to set
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
