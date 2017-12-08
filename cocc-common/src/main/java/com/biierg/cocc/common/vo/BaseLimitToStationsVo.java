package com.biierg.cocc.common.vo;

import java.io.Serializable;

public class BaseLimitToStationsVo  implements Serializable{
	private static final long serialVersionUID = 1L;
	private String lineId;//线路
	public String getLineId() {
		return lineId;
	}
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}
  

}
