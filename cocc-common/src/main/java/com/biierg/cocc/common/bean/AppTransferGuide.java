package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.biierg.cocc.common.vo.AppTransferGuideToStation;

/**
 * @author wxs
 *  站内乘换引导表  PSA_TRANSFER_GUIDE
 */
public class AppTransferGuide  implements Serializable{
	private static final long serialVersionUID = 1L;
	private String line_code;//线路编号
	private String station_code;//车站编号
	private String station_name;//车站名称
	private List<AppTransferGuideToStation> transferGuide=new ArrayList<AppTransferGuideToStation>();
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
	public List<AppTransferGuideToStation> getTransferGuide() {
		return transferGuide;
	}
	public void setTransferGuide(List<AppTransferGuideToStation> transferGuide) {
		this.transferGuide = transferGuide;
	}
	
	
	
}
