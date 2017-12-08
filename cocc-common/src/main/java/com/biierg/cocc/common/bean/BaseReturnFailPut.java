package com.biierg.cocc.common.bean;

import java.io.Serializable;

public class BaseReturnFailPut implements Serializable{
	 private final static long serialVersionUID = 1l;
	 private int ret;//0成功 / 其它失败
	public int getRet() {
		return ret;
	}
	public void setRet(int ret) {
		this.ret = ret;
	}
	 
}
