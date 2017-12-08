package com.biierg.cocc.common.bean;
/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */

import java.io.Serializable;

/**
 * Created by xys on 2017/7/27.
 */
public class BaseStationEquipment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String equipmentName;
	private String equipmentPositon;
	private String equipmentDesc;
	private String lineCode;
	private String stationCode;
	private String panorama;
	private String thumbNail;
	
	private int xuhao;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public String getEquipmentPositon() {
		return equipmentPositon;
	}
	public void setEquipmentPositon(String equipmentPositon) {
		this.equipmentPositon = equipmentPositon;
	}
	public String getEquipmentDesc() {
		return equipmentDesc;
	}
	public void setEquipmentDesc(String equipmentDesc) {
		this.equipmentDesc = equipmentDesc;
	}
	public String getLineCode() {
		return lineCode;
	}
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}
	public String getStationCode() {
		return stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public String getPanorama() {
		return panorama;
	}
	public void setPanorama(String panorama) {
		this.panorama = panorama;
	}
	public String getThumbNail() {
		return thumbNail;
	}
	public void setThumbNail(String thumbNail) {
		this.thumbNail = thumbNail;
	}
	public int getXuhao() {
		return xuhao;
	}
	public void setXuhao(int xuhao) {
		this.xuhao = xuhao;
	}
	
	
}
