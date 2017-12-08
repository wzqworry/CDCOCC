/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * 大屏布局模式
 * 
 * @author lei
 */
public class ScrScene implements Serializable {
	private static final long serialVersionUID = 1L;

	private String scrId; // 大屏ID（PK）
	private String sceneId; // 布局模式ID（PK）
	
	private String sceneName; // 布局模式名称
	
	private int type; // 类型（0-日常、1-参观、2-应急）
	private int isTop; // 是否置顶（0-否、1-是）
	private int isShow; // 是否正在显示（0-否、1-是）
	private String thumbFile; // 缩略图
	private String remark; // 备注

	/**
	 * @return the scrId
	 */
	public String getScrId() {
		return scrId;
	}

	/**
	 * @param scrId
	 *            the scrId to set
	 */
	public void setScrId(String scrId) {
		this.scrId = scrId;
	}

	/**
	 * @return the sceneId
	 */
	public String getSceneId() {
		return sceneId;
	}

	/**
	 * @param sceneId the sceneId to set
	 */
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	/**
	 * @return the sceneName
	 */
	public String getSceneName() {
		return sceneName;
	}

	/**
	 * @param sceneName the sceneName to set
	 */
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the isTop
	 */
	public int getIsTop() {
		return isTop;
	}

	/**
	 * @param isTop
	 *            the isTop to set
	 */
	public void setIsTop(int isTop) {
		this.isTop = isTop;
	}

	/**
	 * @return the isShow
	 */
	public int getIsShow() {
		return isShow;
	}

	/**
	 * @param isShow the isShow to set
	 */
	public void setIsShow(int isShow) {
		this.isShow = isShow;
	}

	/**
	 * @return the thumbFile
	 */
	public String getThumbFile() {
		return thumbFile;
	}

	/**
	 * @param thumbFile
	 *            the thumbFile to set
	 */
	public void setThumbFile(String thumbFile) {
		this.thumbFile = thumbFile;
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
}
