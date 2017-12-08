package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wxs 失物招领数据表：PSA_LOST_INFO
 */
public class PsaLostInfo implements Serializable {

	private final static long serialVersionUID = 1l;

	private String id;// 记录ID
	private String subject;// 信息主题
	private String img_url;// 失物图片
	private Date found_time;// 发现时间
	private String line_name;// 线路名称
	private String station_name;// 车站名称
	private String tel_num;// 联系电话
	private String status;// 领取状态 0:未领取 1:已领取
	
	private int xuhao;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public Date getFound_time() {
		return found_time;
	}

	public void setFound_time(Date found_time) {
		this.found_time = found_time;
	}

	public String getLine_name() {
		return line_name;
	}

	public void setLine_name(String line_name) {
		this.line_name = line_name;
	}

	public String getStation_name() {
		return station_name;
	}

	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}

	public String getTel_num() {
		return tel_num;
	}

	public void setTel_num(String tel_num) {
		this.tel_num = tel_num;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getXuhao() {
		return xuhao;
	}

	public void setXuhao(int xuhao) {
		this.xuhao = xuhao;
	}

}
