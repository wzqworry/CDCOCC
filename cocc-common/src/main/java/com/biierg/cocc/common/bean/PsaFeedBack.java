package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wxs
 * 问题反馈表：PSA_FEEDBACK
 */
public class PsaFeedBack implements Serializable {
	
	private final static long serialVersionUID=1l;
	private String id;//记录ID
	private String content;//反馈内容
	private Date create_time;//反馈时间
	private String phone_num;//手机号
	private String mobile_brand;//手机型号
	private String screen_size;//屏幕尺寸
	private String platform_type;//平台类型
	private String platform_version;//平台版本
	private String app_version;//软件版本
	private String net_type;//网络类型
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
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public String getMobile_brand() {
		return mobile_brand;
	}
	public void setMobile_brand(String mobile_brand) {
		this.mobile_brand = mobile_brand;
	}
	public String getScreen_size() {
		return screen_size;
	}
	public void setScreen_size(String screen_size) {
		this.screen_size = screen_size;
	}
	public String getPlatform_type() {
		return platform_type;
	}
	public void setPlatform_type(String platform_type) {
		this.platform_type = platform_type;
	}
	public String getPlatform_version() {
		return platform_version;
	}
	public void setPlatform_version(String platform_version) {
		this.platform_version = platform_version;
	}
	public String getApp_version() {
		return app_version;
	}
	public void setApp_version(String app_version) {
		this.app_version = app_version;
	}
	public String getNet_type() {
		return net_type;
	}
	public void setNet_type(String net_type) {
		this.net_type = net_type;
	}
	
}
