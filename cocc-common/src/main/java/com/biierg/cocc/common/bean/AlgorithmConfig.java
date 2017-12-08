/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 预测算法配置
 * 
 * @author lei
 */
public class AlgorithmConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;//主键
	private int algorithmNum;//应用的算法
	private int algorithmCompare;//基准的算法
	private Double modulus;//系数
	private Double offset;//偏移量
	private Date updateTime;//更新时间
	private String updater;//操作人

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAlgorithmNum() {
		return algorithmNum;
	}

	public void setAlgorithmNum(int algorithmNum) {
		this.algorithmNum = algorithmNum;
	}

	public int getAlgorithmCompare() {
		return algorithmCompare;
	}

	public void setAlgorithmCompare(int algorithmCompare) {
		this.algorithmCompare = algorithmCompare;
	}

	public Double getModulus() {
		return modulus;
	}

	public void setModulus(Double modulus) {
		this.modulus = modulus;
	}

	public Double getOffset() {
		return offset;
	}

	public void setOffset(Double offset) {
		this.offset = offset;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}
}
