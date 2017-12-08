/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 组织机构表
 * 
 * @author wwj
 */
public class GenOrganization implements Serializable {
	private static final long serialVersionUID = 1L;

	private String orgID; // 组织机构ID
	private String orgName; // 组织机构名字
	private String pID; // 上一级机构ID
	private String delMark; //删除标记
	
	// 下级机构列表
	private List<GenOrganization> children = new ArrayList<>();

	public String getOrgID() {
		return orgID;
	}

	public void setOrgID(String orgID) {
		this.orgID = orgID;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getpID() {
		return pID;
	}

	public void setpID(String pID) {
		this.pID = pID;
	}

	/**
	 * @return the children
	 */
	public List<GenOrganization> getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(List<GenOrganization> children) {
		this.children = children;
	}

	public String getDelMark() {
		return delMark;
	}

	public void setDelMark(String delMark) {
		this.delMark = delMark;
	}
}
