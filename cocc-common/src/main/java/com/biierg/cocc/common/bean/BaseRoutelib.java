package com.biierg.cocc.common.bean;
/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 路径表BASE_ROUTELIB
 * @author wwj
 *
 */
public class BaseRoutelib implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ori_station_name;//起始站码
	private String dest_station_name;//终到站码
	private Integer routeNum;//路径序号
	private String viaLine;//途径线路
	private String viaTransfer;//途径换乘站
	private String viaStations;//乘车路径
	private float refFee;//参考票价
	private float refDistance;//乘车距离
	private Integer refStationCount;//乘车站数
	private float refTime;//参考乘车时间
	private Date updateTime;//更新日期
	private String remark;//备注
	
	//所有车站信息
	private List<BaseRoutelibViaStations> viastations = new ArrayList<>();
	
/*	public String getBeginCode() {
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
	public String getViaLine() {
		return viaLine;
	}
	public void setViaLine(String viaLine) {
		this.viaLine = viaLine;
	}
	public String getViaTransfer() {
		return viaTransfer;
	}
	public void setViaTransfer(String viaTransfer) {
		this.viaTransfer = viaTransfer;
	}
	public String getViaStations() {
		return viaStations;
	}
	public void setViaStations(String viaStations) {
		this.viaStations = viaStations;
	}
	public float getRefFee() {
		return refFee;
	}
	public void setRefFee(float refFee) {
		this.refFee = refFee;
	}
	public float getRefDistance() {
		return refDistance;
	}
	public void setRefDistance(float refDistance) {
		this.refDistance = refDistance;
	}
	public Integer getRefStationCount() {
		return refStationCount;
	}
	public void setRefStationCount(Integer refStationCount) {
		this.refStationCount = refStationCount;
	}
	public float getRefTime() {
		return refTime;
	}
	public void setRefTime(float refTime) {
		this.refTime = refTime;
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
	public List<BaseRoutelibViaStations> getViastations() {
		return viastations;
	}
	public void setViastations(List<BaseRoutelibViaStations> viastations) {
		this.viastations = viastations;
	}
	
	
	
}
