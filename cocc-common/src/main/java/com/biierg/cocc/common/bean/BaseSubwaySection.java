package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * 中心场段基本信息表
 * @author wzq
 *
 */
public class BaseSubwaySection implements Serializable{
	private final static long serialVersionUID = 1l;

	private String sectionName;//中心场段名称
	private Integer sectionType;//类型：1-场段，2中心
	private String lineNearBy;//线别
	private String address;//地址
	private String tel;//场调电话
	
	
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public Integer getSectionType() {
		return sectionType;
	}
	public void setSectionType(Integer sectionType) {
		this.sectionType = sectionType;
	}
	public String getLineNearBy() {
		return lineNearBy;
	}
	public void setLineNearBy(String lineNearBy) {
		this.lineNearBy = lineNearBy;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
