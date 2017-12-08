package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * @author wxs
 * 车站设施表 PSA_STATION_FACILITY
 */
public class BaseStationFacility implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;//
	private String line_code;//线路编码
	private String station_code;//车站编码
	private String station_name;//车站名称
	private String toilet_desc;//站厅卫生间(非付费区)位置
	private String platform_toilet;//站台卫生间（付费区）
	private String elevator_desc;//电梯位置
	private String tvm_desc;//自助售票机
	private String bom_desc;//人工售票点
	private String police_desc;//警务室
	private String exit_desc;//出入口及道路
	private String hall_desc;//站台层
	private String atm_desc;//ATM位置
	private String tft_desc;//天府通
	
	private int xuhao;//web页面显示序号
	
	private String shops_desc;
	private String public_desc;
	private String update_date;
	private String update_user;
	private String remark;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getStation_name() {
		return station_name;
	}
	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}
	public String getToilet_desc() {
		return toilet_desc;
	}
	public void setToilet_desc(String toilet_desc) {
		this.toilet_desc = toilet_desc;
	}
	public String getElevator_desc() {
		return elevator_desc;
	}
	public void setElevator_desc(String elevator_desc) {
		this.elevator_desc = elevator_desc;
	}
	public String getTvm_desc() {
		return tvm_desc;
	}
	public void setTvm_desc(String tvm_desc) {
		this.tvm_desc = tvm_desc;
	}
	public String getBom_desc() {
		return bom_desc;
	}
	public void setBom_desc(String bom_desc) {
		this.bom_desc = bom_desc;
	}
	public String getPolice_desc() {
		return police_desc;
	}
	public void setPolice_desc(String police_desc) {
		this.police_desc = police_desc;
	}
	public String getExit_desc() {
		return exit_desc;
	}
	public void setExit_desc(String exit_desc) {
		this.exit_desc = exit_desc;
	}
	public String getHall_desc() {
		return hall_desc;
	}
	public void setHall_desc(String hall_desc) {
		this.hall_desc = hall_desc;
	}
	public String getAtm_desc() {
		return atm_desc;
	}
	public void setAtm_desc(String atm_desc) {
		this.atm_desc = atm_desc;
	}
	public int getXuhao() {
		return xuhao;
	}
	public void setXuhao(int xuhao) {
		this.xuhao = xuhao;
	}
	public String getShops_desc() {
		return shops_desc;
	}
	public void setShops_desc(String shops_desc) {
		this.shops_desc = shops_desc;
	}
	public String getPublic_desc() {
		return public_desc;
	}
	public void setPublic_desc(String public_desc) {
		this.public_desc = public_desc;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	public String getUpdate_user() {
		return update_user;
	}
	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPlatform_toilet() {
		return platform_toilet;
	}
	public void setPlatform_toilet(String platform_toilet) {
		this.platform_toilet = platform_toilet;
	}
	public String getTft_desc() {
		return tft_desc;
	}
	public void setTft_desc(String tft_desc) {
		this.tft_desc = tft_desc;
	}
	
	
}
