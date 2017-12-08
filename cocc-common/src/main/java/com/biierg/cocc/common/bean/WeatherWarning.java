/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lei
 * 
 *         天气预警
 */
public class WeatherWarning implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id; // 记录ID；(PK)
	
	private String warnCode; // 预警编号
	private String warnCategory; // 预警类型
	private String warnGrade; // 预警级别
	
	private String subject; // 主题
	private String content; // 内容

	private int state; // 状态；1-发布；0-解除
	private Date updateTime; // 更新时间

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the warnCode
	 */
	public String getWarnCode() {
		return warnCode;
	}

	/**
	 * @param warnCode
	 *            the warnCode to set
	 */
	public void setWarnCode(String warnCode) {
		this.warnCode = warnCode;
	}

	/**
	 * @return the warnCategory
	 */
	public String getWarnCategory() {
		return warnCategory;
	}

	/**
	 * @param warnCategory the warnCategory to set
	 */
	public void setWarnCategory(String warnCategory) {
		this.warnCategory = warnCategory;
	}

	/**
	 * @return the warnGrade
	 */
	public String getWarnGrade() {
		return warnGrade;
	}

	/**
	 * @param warnGrade the warnGrade to set
	 */
	public void setWarnGrade(String warnGrade) {
		this.warnGrade = warnGrade;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime
	 *            the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
