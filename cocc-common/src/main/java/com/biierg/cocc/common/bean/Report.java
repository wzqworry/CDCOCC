package com.biierg.cocc.common.bean;

import java.io.Serializable;

public class Report  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String group;
	private String name;//报表名称
	private String tempdir;//模板目录
	private String reportdir;//报表目录
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTempdir() {
		return tempdir;
	}
	public void setTempdir(String tempdir) {
		this.tempdir = tempdir;
	}
	public String getReportdir() {
		return reportdir;
	}
	public void setReportdir(String reportdir) {
		this.reportdir = reportdir;
	}
	
}
