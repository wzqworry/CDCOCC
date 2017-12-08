package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 礼品信息表
 * @author LK
 *
 */
public class GiftsSearch implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int xuhao;//序号
	private String giftName;//礼品名称
	private Integer quota;//每月配额数
	private Integer inAmount;//入库
	private Integer outAmount;//出库
	private Integer exchangeAmount;//已兑换
	private Integer receiveAmount;//已领取
	private Date exchangeTime;//最后兑换时间
	
	
	public int getXuhao() {
		return xuhao;
	}
	public void setXuhao(int xuhao) {
		this.xuhao = xuhao;
	}
	public String getGiftName() {
		return giftName;
	}
	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}
	public Integer getQuota() {
		return quota;
	}
	public void setQuota(Integer quota) {
		this.quota = quota;
	}	
	public Integer getInAmount() {
		return inAmount;
	}
	public void setInAmount(Integer inAmount) {
		this.inAmount = inAmount;
	}
	public Integer getOutAmount() {
		return outAmount;
	}
	public void setOutAmount(Integer outAmount) {
		this.outAmount = outAmount;
	}
	public Integer getExchangeAmount() {
		return exchangeAmount;
	}
	public void setExchangeAmount(Integer exchangeAmount) {
		this.exchangeAmount = exchangeAmount;
	}
	public Integer getReceiveAmount() {
		return receiveAmount;
	}
	public void setReceiveAmount(Integer receiveAmount) {
		this.receiveAmount = receiveAmount;
	}
	public Date getExchangeTime() {
		return exchangeTime;
	}
	public void setExchangeTime(Date exchangeTime) {
		this.exchangeTime = exchangeTime;
	}
	
	
	
	

}
