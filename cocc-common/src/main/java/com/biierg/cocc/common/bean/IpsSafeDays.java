package com.biierg.cocc.common.bean;
/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */

import java.io.Serializable;
import java.util.Date;

/**
 * LED安全运营天数
 * Created by wenjuan.wang on 2017/9/16.
 */
public class IpsSafeDays implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Date pre_date;//截止日期
    private Integer days;//天数
    
	public Date getPre_date() {
		return pre_date;
	}
	public void setPre_date(Date pre_date) {
		this.pre_date = pre_date;
	}
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	

}
