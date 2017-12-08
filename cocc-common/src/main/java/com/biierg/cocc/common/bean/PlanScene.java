/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 预案场景
 * 
 * @author lei
 */
public class PlanScene implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sceneId; // 场景ID；UUID、PK
	private String parentId; // 上级场景ID；可空
	private Integer leafFlag; // 末级场景标记；0-非末级场景；1-末级场景
	private String name; // 场景名称
	private String remark; // 备注
	private Integer sortnum; // 排序号
	
	private Date createTime; // 创建时间
	private String creator; // 创建人
	
	private Date updateTime; // 更新时间
	private String updator; // 更新人

    private Integer level;//查询父子关系的时候出现的级别
	private List<PlanScene> children;

	/**
	 * @return the sceneId
	 */
	public String getSceneId() {
		return sceneId;
	}

	/**
	 * @param sceneId
	 *            the sceneId to set
	 */
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	/**
	 * @return the parentId
	 */
	public String getParentId() {
		return parentId;
	}

	/**
	 * @param parentId
	 *            the parentId to set
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}


	/**
	 * @return the children
	 */
	public List<PlanScene> getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(List<PlanScene> children) {
		this.children = children;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the creator
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * @param creator the creator to set
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @return the updator
	 */
	public String getUpdator() {
		return updator;
	}

	/**
	 * @param updator the updator to set
	 */
	public void setUpdator(String updator) {
		this.updator = updator;
	}

	public Integer getLeafFlag() {
		return leafFlag;
	}

	public void setLeafFlag(Integer leafFlag) {
		this.leafFlag = leafFlag;
	}

	public Integer getSortnum() {
		return sortnum;
	}

	public void setSortnum(Integer sortnum) {
		this.sortnum = sortnum;
	}

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
