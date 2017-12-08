package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;
/**
 * ATS线路基础表
 * @author LK
 *
 */
public class BaseAtsLines implements Serializable{
	private final static long serialVersionUID = 1l;
	private int fdIndex;//索引
	private String fdNumber;//编号
	private String fdName;//名称
	private Integer fdEnableType;//开通状态
	private Float fdLineLength;//线路长度
	private String fdDesc;//描述
	private int fdIsEffect;//本记录当前是否有效
	private String fdReserved;//保留字段
	private String fdOperator;//操作员
	private Date fdUpdateTime;//更新时间
	
	public int getFdIndex() {
		return fdIndex;
	}
	public void setFdIndex(int fdIndex) {
		this.fdIndex = fdIndex;
	}
	public String getFdNumber() {
		return fdNumber;
	}
	public void setFdNumber(String fdNumber) {
		this.fdNumber = fdNumber;
	}
	public String getFdName() {
		return fdName;
	}
	public void setFdName(String fdName) {
		this.fdName = fdName;
	}
	public Integer getFdEnableType() {
		return fdEnableType;
	}
	public void setFdEnableType(Integer fdEnableType) {
		this.fdEnableType = fdEnableType;
	}
	public Float getFdLineLength() {
		return fdLineLength;
	}
	public void setFdLineLength(Float fdLineLength) {
		this.fdLineLength = fdLineLength;
	}
	public String getFdDesc() {
		return fdDesc;
	}
	public void setFdDesc(String fdDesc) {
		this.fdDesc = fdDesc;
	}
	public int getFdIsEffect() {
		return fdIsEffect;
	}
	public void setFdIsEffect(int fdIsEffect) {
		this.fdIsEffect = fdIsEffect;
	}
	public String getFdReserved() {
		return fdReserved;
	}
	public void setFdReserved(String fdReserved) {
		this.fdReserved = fdReserved;
	}
	public String getFdOperator() {
		return fdOperator;
	}
	public void setFdOperator(String fdOperator) {
		this.fdOperator = fdOperator;
	}
	public Date getFdUpdateTime() {
		return fdUpdateTime;
	}
	public void setFdUpdateTime(Date fdUpdateTime) {
		this.fdUpdateTime = fdUpdateTime;
	}
	
	
	

}
