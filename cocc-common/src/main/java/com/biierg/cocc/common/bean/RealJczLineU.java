/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * Created by wzq on 2017/2/27.
 * 实时的进出站量线路表
 */
public class RealJczLineU implements Serializable {
    private final static long serialVersionUID = 1l;

    private Integer jtb;//进同比
    private Integer jhb;//进环比
    private Integer ctb;//出同比
    private Integer chb;//出环比
    private Integer hcl;//换乘量
    private Integer hclSum;//换乘量总
    
    private String timeGrade;
    
    public Integer getHclSum() {
		return hclSum;
	}

	public void setHclSum(Integer hclSum) {
		this.hclSum = hclSum;
	}

	private RealJczLine realJczLine;
	private RealJczLine realJczLineLastDay;
	private RealJczLine realJczLineLastWeek;

	public Integer getJtb() {
		return jtb;
	}

	public void setJtb(Integer jtb) {
		this.jtb = jtb;
	}

	public Integer getJhb() {
		return jhb;
	}

	public void setJhb(Integer jhb) {
		this.jhb = jhb;
	}

	public Integer getCtb() {
		return ctb;
	}

	public void setCtb(Integer ctb) {
		this.ctb = ctb;
	}

	public Integer getChb() {
		return chb;
	}

	public void setChb(Integer chb) {
		this.chb = chb;
	}

	public Integer getHcl() {
		return hcl;
	}

	public void setHcl(Integer hcl) {
		this.hcl = hcl;
	}

	public RealJczLine getRealJczLineLastDay() {
		return realJczLineLastDay;
	}

	public void setRealJczLineLastDay(RealJczLine realJczLineLastDay) {
		this.realJczLineLastDay = realJczLineLastDay;
	}

	public RealJczLine getRealJczLineLastWeek() {
		return realJczLineLastWeek;
	}

	public void setRealJczLineLastWeek(RealJczLine realJczLineLastWeek) {
		this.realJczLineLastWeek = realJczLineLastWeek;
	}

	public RealJczLine getRealJczLine() {
		return realJczLine;
	}

	public void setRealJczLine(RealJczLine realJczLine) {
		this.realJczLine = realJczLine;
	}

	public String getTimeGrade() {
		return timeGrade;
	}

	public void setTimeGrade(String timeGrade) {
		this.timeGrade = timeGrade;
	}
    
    
}
