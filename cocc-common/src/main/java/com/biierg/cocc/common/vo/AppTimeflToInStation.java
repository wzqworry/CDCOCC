package com.biierg.cocc.common.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Title: AppTimeflToInStation
 * @Description: 首末班车时刻查询实体类
 * @author: wxs
 * @date: 2017年10月31日 下午5:31:29
 */
public class AppTimeflToInStation implements Serializable {
	private static final long serialVersionUID = 1L;
	private String line_id;// 线路编码
	private String remark;// 调整说明
	private List<BaseTimetableflVo> timetablefl = new ArrayList<BaseTimetableflVo>();

	public List<BaseTimetableflVo> getTimetablefl() {
		return timetablefl;
	}

	public void setTimetablefl(List<BaseTimetableflVo> timetablefl) {
		this.timetablefl = timetablefl;
	}

	public String getLine_id() {
		return line_id;
	}

	public void setLine_id(String line_id) {
		this.line_id = line_id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
