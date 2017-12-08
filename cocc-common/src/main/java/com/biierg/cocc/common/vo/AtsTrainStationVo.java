package com.biierg.cocc.common.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AtsTrainStationVo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String line_code;// 线路编码
	private int up_order;// 上行方向是否按从小到大排序
	private List<AtsTrainStationBranch> trainStations = new ArrayList<AtsTrainStationBranch>();

	public String getLine_code() {
		return line_code;
	}

	public void setLine_code(String line_code) {
		this.line_code = line_code;
	}

	public List<AtsTrainStationBranch> getTrainStations() {
		return trainStations;
	}

	public void setTrainStations(List<AtsTrainStationBranch> trainStations) {
		this.trainStations = trainStations;
	}

	public int getUp_order() {
		return up_order;
	}

	public void setUp_order(int up_order) {
		this.up_order = up_order;
	}

}
