package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wxs 外部用户表 PSA_MEMBER
 */
public class Member implements Serializable {
	private final static long serialVersionUID = 1l;
	
	private String member_id; // 用户ID

	private String password = "0";// 密码
	private String nickname;// 用户昵称
	private String headImg;// 头像
	private Integer gender=-1;// 性别
	private Date birthday;// 出生日期
	private String email;// 邮箱
	private String wechat;// 微信号
	private String microblog;// 微博号
	private String address;// 通讯地址
	private String remark;// 个人备注
	private String recommend_id;//推荐人(用户ID)
	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getMicroblog() {
		return microblog;
	}

	public void setMicroblog(String microblog) {
		this.microblog = microblog;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getRecommend_id() {
		return recommend_id;
	}

	public void setRecommend_id(String recommend_id) {
		this.recommend_id = recommend_id;
	}
	
}
