package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dw on 2017/10/30.  地铁首末班时刻调整说明 BASE_TIMETABLE_ADJ_REMARK
 */
public class BaseTimetableAdjustRemark implements Serializable {
	private final static long serialVersionUID = 1l;
	
	private long id; // 流水号
	private String remark; // 备注
	private Date update_time; // 更新时间
	private String updater; // 更新用户

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
