package com.biierg.cocc.common.vo;

import java.io.Serializable;

public class BaseTimeflToStationsVo implements Serializable{
	  private final static long serialVersionUID = 1l;
	  private String stationNameCN;//中文名称
	  private int isTransfer;//是否换乘站
	  private String transferline;//换乘线编号
	public String getStationNameCN() {
		return stationNameCN;
	}
	public void setStationNameCN(String stationNameCN) {
		this.stationNameCN = stationNameCN;
	}
	public int getIsTransfer() {
		return isTransfer;
	}
	public void setIsTransfer(int isTransfer) {
		this.isTransfer = isTransfer;
	}
	public String getTransferline() {
		return transferline;
	}
	public void setTransferline(String transferline) {
		this.transferline = transferline;
	}
	  
}
