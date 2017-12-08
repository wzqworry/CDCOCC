package com.biierg.cocc.common.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AtsTrainCheckinToStationsVo implements Serializable{
	private static final long serialVersionUID = 1L;
	private String station_name_cn;
	private String transferline;
	private String station_code;
	private List<AtsTrainCheckinVo> trainLocation=new ArrayList<AtsTrainCheckinVo>() ;
	public String getStation_name_cn() {
		return station_name_cn;
	}
	public void setStation_name_cn(String station_name_cn) {
		this.station_name_cn = station_name_cn;
	}
	public String getTransferline() {
		return transferline;
	}
	public void setTransferline(String transferline) {
		this.transferline = transferline;
	}
	public String getStation_code() {
		return station_code;
	}
	public void setStation_code(String station_code) {
		this.station_code = station_code;
	}
	public List<AtsTrainCheckinVo> getTrainLocation() {
		return trainLocation;
	}
	public void setTrainLocation(List<AtsTrainCheckinVo> trainLocation) {
		this.trainLocation = trainLocation;
	}
    	
}
