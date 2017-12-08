package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

public class TellUs implements Serializable{
	
	private static final long serialVersionUID = 1L;	
	private String id;//记录ID；
	private String content;// 反馈内容
	private String phone_Num;// 手机号
	private Date create_Time;// 反馈时间
    	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPhone_Num() {
		return phone_Num;
	}

	public void setPhone_Num(String phone_Num) {
		this.phone_Num = phone_Num;
	}

	public Date getCreate_Time() {
		return create_Time;
	}

	public void setCreate_Time(Date create_Time) {
		this.create_Time = create_Time;
	}


}
