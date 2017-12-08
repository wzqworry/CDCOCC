package com.biierg.cocc.common.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MemberPointsVo implements Serializable {

	private final static long serialVersionUID = 1L;
	private String memberId;
	private List<MemberPointsType> pointsType = new ArrayList<MemberPointsType>();
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public List<MemberPointsType> getPointsType() {
		return pointsType;
	}

	public void setPointsType(List<MemberPointsType> pointsType) {
		this.pointsType = pointsType;
	}
	

}
