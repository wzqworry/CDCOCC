package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by weibo.zheng on 2017/9/15.
 * 礼物信息表
 */
public class Gifts implements Serializable {

    private static final long serialVersionUID = 1L;

    private String giftId;      //礼品id
    private String giftName;    //礼品名称
    private String giftImgurl;   //礼品图片
    private Integer amount;     //库存数量
    private Integer price;      //单价/兑换所需积分
    private Date updateTime;    //库存更新时间
    private Date exchangeTime;  //最后兑换时间
    private Integer quota;		//每月分配兑换额度
    
    private int xuhao;
    private String click;

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

    public String getGifImgurl() {
        return giftImgurl;
    }

    public void setGifImgurl(String giftImgurl) {
        this.giftImgurl = giftImgurl;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getExchangeTime() {
        return exchangeTime;
    }

    public void setExchangeTime(Date exchangeTime) {
        this.exchangeTime = exchangeTime;
    }

	public int getXuhao() {
		return xuhao;
	}

	public void setXuhao(int xuhao) {
		this.xuhao = xuhao;
	}

	public String getClick() {
		return click;
	}

	public void setClick(String click) {
		this.click = click;
	}

	public Integer getQuota() {
		return quota;
	}

	public void setQuota(Integer quota) {
		this.quota = quota;
	}
	
}
