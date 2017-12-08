package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wxs 用户签到表
 */
public class MemberCheckin implements Serializable {

	private final static long serialVersionUID = 1L;
	private String member_id;
	private Date checkin_date;

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public Date getCheckin_date() {
		return checkin_date;
	}

	public void setCheckin_date(Date checkin_date) {
		this.checkin_date = checkin_date;
	}

}
