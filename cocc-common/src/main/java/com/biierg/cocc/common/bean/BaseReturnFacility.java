package com.biierg.cocc.common.bean;

import java.io.Serializable;

public class BaseReturnFacility implements Serializable{
    private final static long serialVersionUID = 1l;
    private int ret;//0成功 / 其它失败
    private String type;//设备类型名称，失败时为空
    private String typeCode;	//设备类型编码，失败时为空
	public int getRet() {
		return ret;
	}
	public void setRet(int ret) {
		this.ret = ret;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
    
}
