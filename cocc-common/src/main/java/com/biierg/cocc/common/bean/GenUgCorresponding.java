/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * 
 * @author wwj
 * 用户与用户组对应表
 */

public class GenUgCorresponding implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userID;//人员ID
	private String ugID;//人员所在用户组ID
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUgID() {
		return ugID;
	}
	public void setUgID(String ugID) {
		this.ugID = ugID;
	}

}
