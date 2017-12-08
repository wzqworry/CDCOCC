package com.biierg.cocc.common.vo;

import java.io.Serializable;

public class AppTimetableflVo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String line_id;
	private String earfirst_time;//最早首班
	private String evefirst_time;//最晚首班
	private String earlast_time;//最早末班
	private String evelast_time;//最晚末班
	public String getLine_id() {
		return line_id;
	}
	public void setLine_id(String line_id) {
		this.line_id = line_id;
	}
	public String getEarfirst_time() {
		return earfirst_time;
	}
	public void setEarfirst_time(String earfirst_time) {
		this.earfirst_time = earfirst_time;
	}
	public String getEvefirst_time() {
		return evefirst_time;
	}
	public void setEvefirst_time(String evefirst_time) {
		this.evefirst_time = evefirst_time;
	}
	public String getEarlast_time() {
		return earlast_time;
	}
	public void setEarlast_time(String earlast_time) {
		this.earlast_time = earlast_time;
	}
	public String getEvelast_time() {
		return evelast_time;
	}
	public void setEvelast_time(String evelast_time) {
		this.evelast_time = evelast_time;
	}
	
	
}
