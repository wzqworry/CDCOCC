package com.biierg.cocc.common.bean;
/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */

import java.io.Serializable;

/**
 * 路径详情
 * @author wwj
 *
 */
public class BaseRoutelibViaStations implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ori_station_name;//起始站码
	private String dest_station_name;//终到站码
	private Integer routeNum;//路径序号
	private Integer stationNum;//经过站序号
	private String stationCode;//经过站码
	private Integer isHead;//是否首站
	private Integer isTail;//是否末站
	private Integer isTransfer;//是否换乘站
	
	/*public String getBeginCode() {
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
	}*/
	
	public Integer getRouteNum() {
		return routeNum;
	}
	public String getOri_station_name() {
		return ori_station_name;
	}
	public void setOri_station_name(String ori_station_name) {
		this.ori_station_name = ori_station_name;
	}
	public String getDest_station_name() {
		return dest_station_name;
	}
	public void setDest_station_name(String dest_station_name) {
		this.dest_station_name = dest_station_name;
	}
	public void setRouteNum(Integer routeNum) {
		this.routeNum = routeNum;
	}
	public Integer getStationNum() {
		return stationNum;
	}
	public void setStationNum(Integer stationNum) {
		this.stationNum = stationNum;
	}
	public String getStationCode() {
		return stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public Integer getIsHead() {
		return isHead;
	}
	public void setIsHead(Integer isHead) {
		this.isHead = isHead;
	}
	public Integer getIsTail() {
		return isTail;
	}
	public void setIsTail(Integer isTail) {
		this.isTail = isTail;
	}
	public Integer getIsTransfer() {
		return isTransfer;
	}
	public void setIsTransfer(Integer isTransfer) {
		this.isTransfer = isTransfer;
	}
	
	
	
	
}
