package com.biierg.cocc.common.vo;
/**
 * 版权所有@2017 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */

import java.io.Serializable;

/**
 * 路径详情vo
 * 
 * @author wxs
 *
 */
public class BaseRoutelibViaStationsVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer stationNum;// 经过站序号
	private String stationCode;// 经过站码
	private String begin_code;// 经过站码
	private Integer direction;// 运行方向
	private Integer isHead;// 是否首站
	private Integer isTail;// 是否末站
	private Integer isTransfer;// 是否换乘站
	private Integer distance = -1;// 站间距
	private Integer timeuse = -1;// 运行时间
	private Integer feedtime = 0;// 走行时间
	private Integer dmyjd = -1;// 拥挤度
	private String station_name_cn;// 车站名称
	private String first_time;// 首班时间
	private String last_time;// 末班时间

	private String dirRemark; // 线路运行方向描述
	
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

	public Integer getStationNum() {
		return stationNum;
	}

	public void setStationNum(Integer stationNum) {
		this.stationNum = stationNum;
	}

	public String getBegin_code() {
		return begin_code;
	}

	public void setBegin_code(String begin_code) {
		this.begin_code = begin_code;
	}

	public Integer getDirection() {
		return direction;
	}

	public void setDirection(Integer direction) {
		this.direction = direction;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Integer getTimeuse() {
		return timeuse;
	}

	public void setTimeuse(Integer timeuse) {
		this.timeuse = timeuse;
	}

	public Integer getDmyjd() {
		return dmyjd;
	}

	public void setDmyjd(Integer dmyjd) {
		this.dmyjd = dmyjd;
	}

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public String getStation_name_cn() {
		return station_name_cn;
	}

	public void setStation_name_cn(String station_name_cn) {
		this.station_name_cn = station_name_cn;
	}

	public Integer getFeedtime() {
		return feedtime;
	}

	public void setFeedtime(Integer feedtime) {
		this.feedtime = feedtime;
	}

	public String getFirst_time() {
		return first_time;
	}

	public void setFirst_time(String first_time) {
		this.first_time = first_time;
	}

	public String getLast_time() {
		return last_time;
	}

	public void setLast_time(String last_time) {
		this.last_time = last_time;
	}

	/**
	 * @return the dirRemark
	 */
	public String getDirRemark() {
		return dirRemark;
	}

	/**
	 * @param dirRemark the dirRemark to set
	 */
	public void setDirRemark(String dirRemark) {
		this.dirRemark = dirRemark;
	}
}
