/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * 
 * @author wwj
 * 用户组表
 */
 

public class GenUserGroup implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ugID;//用户组ID
	private String ugName;//用户组名字
	private String userID;//用户组创建人
	private String postID;//岗位ID	
	
	public String getUgID() {
		return ugID;
	}
	public void setUgID(String ugID) {
		this.ugID = ugID;
	}
	public String getUgName() {
		return ugName;
	}
	public void setUgName(String ugName) {
		this.ugName = ugName;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPostID() {
		return postID;
	}
	public void setPostID(String postID) {
		this.postID = postID;
	}
	

}
