package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dw on 2017/10/30. 礼品统计
 */
public class GiftSearchCount implements Serializable {
	private static final long serialVersionUID = 1L;

	private String billId; // 单据id
	private String giftId; // 礼品id
	private String giftName; // 礼物名字
	private String lineCode; // 线路编码
	private String lineName; // 线路名称
	private String stationCode; // 车站编码
	private String stationName; // 车站名称
	private Integer type; // 出入库类型 0代表出库 1代表入库
	private Integer amount; // 出入库数量
	private String summary; // 摘要
	private Date createTime; // 创建时间
	private String creator; // 创建人
	
	private Integer quota; // 礼物配额
	private int input; // 入库数量
	private int output; // 出库数量
	private int exchangeNum; // 兑换数量
	private Integer surplus; // 剩余
	private Integer receieveAmount;// 已领取

	private String exchangeCode; //礼物兑换码 
	private Date exchangeTime; // 最后兑换时间
	
	private Gifts gifts;// 礼品
	private GiftExchangeInfo giftExchangeInfo;// 积分礼品兑换记录表

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getGiftId() {
		return giftId;
	}

	public void setGiftId(String giftId) {
		this.giftId = giftId;
	}

	public String getLineCode() {
		return lineCode;
	}

	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getExchangeNum() {
		return exchangeNum;
	}

	public void setExchangeNum(Integer exchangeNum) {
		this.exchangeNum = exchangeNum;
	}

	public Integer getSurplus() {
		return surplus;
	}

	public void setSurplus(Integer surplus) {
		this.surplus = surplus;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Gifts getGifts() {
		return gifts;
	}

	public void setGifts(Gifts gifts) {
		this.gifts = gifts;
	}

	public GiftExchangeInfo getGiftExchangeInfo() {
		return giftExchangeInfo;
	}

	public void setGiftExchangeInfo(GiftExchangeInfo giftExchangeInfo) {
		this.giftExchangeInfo = giftExchangeInfo;
	}
	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}

	public int getOutput() {
		return output;
	}

	public void setOutput(int output) {
		this.output = output;
	}

	public void setExchangeNum(int exchangeNum) {
		this.exchangeNum = exchangeNum;
	}

	public String getGiftName() {
		return giftName;
	}

	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}

	public String getExchangeCode() {
		return exchangeCode;
	}

	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	public Integer getQuota() {
		return quota;
	}

	public void setQuota(Integer quota) {
		this.quota = quota;
	}

	public Integer getReceieveAmount() {
		return receieveAmount;
	}

	public void setReceieveAmount(Integer receieveAmount) {
		this.receieveAmount = receieveAmount;
	}

	public Date getExchangeTime() {
		return exchangeTime;
	}

	public void setExchangeTime(Date exchangeTime) {
		this.exchangeTime = exchangeTime;
	}
}
