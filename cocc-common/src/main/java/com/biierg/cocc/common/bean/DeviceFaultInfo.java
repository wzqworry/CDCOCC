package com.biierg.cocc.common.bean;

import java.io.Serializable;

public class DeviceFaultInfo implements Serializable {

	private final static long serialVersionUID = 1l;
	private String type_code;// 设备类型编码
	private String type_name;// 设备类型名称
	private String fault_code;// 故障代码
	private String fault_desc;// 故障描述

	public String getType_code() {
		return type_code;
	}

	public void setType_code(String type_code) {
		this.type_code = type_code;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public String getFault_code() {
		return fault_code;
	}

	public void setFault_code(String fault_code) {
		this.fault_code = fault_code;
	}

	public String getFault_desc() {
		return fault_desc;
	}

	public void setFault_desc(String fault_desc) {
		this.fault_desc = fault_desc;
	}

}
