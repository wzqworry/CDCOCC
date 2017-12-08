package com.biierg.cocc.common.vo;

import java.io.Serializable;

public class MemberTotalPoints implements Serializable{
	  private final static long serialVersionUID = 1L;
	  private int totalPoints;//会员总积分
	public int getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	  
}
