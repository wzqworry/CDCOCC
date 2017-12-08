package com.biierg.cocc.common.bean;

import java.io.Serializable;

public class BaseSwitchWalkTime implements Serializable {
	private static final long serialVersionUID = 1L;
	private int feedTime;// 换乘站名称
	public int getFeedTime() {
		return feedTime;
	}
	public void setFeedTime(int feedTime) {
		this.feedTime = feedTime;
	}

	
	
}
