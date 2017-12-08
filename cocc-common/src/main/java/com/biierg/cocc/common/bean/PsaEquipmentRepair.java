/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 乘客查询APP - 设备报修记录表
 * 
 * @author lei
 */
public class PsaEquipmentRepair implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;//记录id
	private String dev_code;//设备编码
	private String fail_desc;//故障描述
	private String pms_ret; //PMS系统返回码
	private String fail_code;//故障编码
	private String member_id;//会员ID
	private Date create_time;//报修时间
	private Integer interval;//设备提报间隔时间
	
	public Integer getInterval() {
		return interval;
	}
	public void setInterval(Integer interval) {
		this.interval = interval;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDev_code() {
		return dev_code;
	}
	public void setDev_code(String dev_code) {
		this.dev_code = dev_code;
	}
	public String getFail_desc() {
		return fail_desc;
	}
	public void setFail_desc(String fail_desc) {
		this.fail_desc = fail_desc;
	}
	public String getPms_ret() {
		return pms_ret;
	}
	public void setPms_ret(String pms_ret) {
		this.pms_ret = pms_ret;
	}
	public String getFail_code() {
		return fail_code;
	}
	public void setFail_code(String fail_code) {
		this.fail_code = fail_code;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
	
}
