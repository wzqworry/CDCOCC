package com.biierg.cocc.common.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by weibo.zheng on 2017/9/19. APP礼品兑换相关参数
 */
public class AppGiftVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String phoneNum;// 手机号
	private String memberId;// 会员id
	private String giftID; // 要兑换的礼品id
	private String stationName;// 兑换车站
	private Date exchangeDate;//预约兑换时间
	
	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getGiftID() {
		return giftID;
	}

	public void setGiftID(String giftID) {
		this.giftID = giftID;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public Date getExchangeDate() {
		return exchangeDate;
	}

	public void setExchangeDate(Date exchangeDate) {
		this.exchangeDate = exchangeDate;
	}
	
	
	
}
