package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * @author wxs
 *获取银行自助服务网点（ATM位置）
 */
public class BaseBankServiceBranch implements Serializable{
	private static final long serialVersionUID = 1L;
	private String line_code;//线路编码
	private String station_code;//车站编码
	private String station_name;//车站名称
	private String atm_desc;//ATM位置
	public String getLine_code() {
		return line_code;
	}
	public void setLine_code(String line_code) {
		this.line_code = line_code;
	}
	public String getStation_code() {
		return station_code;
	}
	public void setStation_code(String station_code) {
		this.station_code = station_code;
	}
	public String getAtm_desc() {
		return atm_desc;
	}
	public void setAtm_desc(String atm_desc) {
		this.atm_desc = atm_desc;
	}
	public String getStation_name() {
		return station_name;
	}
	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}
	
}
