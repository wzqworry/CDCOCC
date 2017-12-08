package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by weibo.zheng on 2017/9/15.
 * 积分礼品兑换记录表
 */
public class GiftExchangeInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    private String id;          //记录id（兑换码）
    private String inventoryId; //库存变动记录id
    private String pointsId;    //会员积分信息id
    private String memberId;    //会员id
    private String giftId;      //礼品id
    private String giftName;    //礼品名称
    private Integer amount;     //兑换数量
    private Integer status;     //兑换状态  0表示未兑换 1表示已兑换
    private String lineCode;    //预约线路编码
    private String lineName;    //预约线路名称
    private String stationCode; //预约车站编码
    private String stationName; //预约车站名称
    private Date reserveTime;   //预约时间
    private Date exchangeTime;  //实际兑换时间
    private Date createTime;    //记录创建时间

    
    private String giftImgurl;//礼品图片
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getPointsId() {
        return pointsId;
    }

    public void setPointsId(String pointsId) {
        this.pointsId = pointsId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getGiftId() {
        return giftId;
    }

    public void setGiftId(String giftId) {
        this.giftId = giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Date getReserveTime() {
        return reserveTime;
    }

    public void setReserveTime(Date reserveTime) {
        this.reserveTime = reserveTime;
    }

    public Date getExchangeTime() {
        return exchangeTime;
    }

    public void setExchangeTime(Date exchangeTime) {
        this.exchangeTime = exchangeTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public String getGiftImgurl() {
		return giftImgurl;
	}

	public void setGiftImgurl(String giftImgurl) {
		this.giftImgurl = giftImgurl;
	}
    
}
