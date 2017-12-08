package com.biierg.cocc.common.vo;

import java.io.Serializable;

public class MemberPointsType implements Serializable{
	
	private final static long serialVersionUID = 1L;
	private int signin_points;//签到总积分
	private String summary;//积分渠道
	private String reason;//记分原因
	
	public int getSignin_points() {
		return signin_points;
	}
	public void setSignin_points(int signin_points) {
		this.signin_points = signin_points;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
