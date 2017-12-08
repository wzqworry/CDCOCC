package com.biierg.cocc.common.bean;

import org.omg.CORBA.INTERNAL;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by weibo.zheng on 2017/9/15.
 * 礼品库存变动记录表
 */
public class GiftInventory implements Serializable {

    private static final long serialVersionUID = 1L;

    private String billId;      //单据id
    private String giftId;      //礼品id
    private String lineCode;    //线路编码
    private String lineName;    //线路名称
    private String stationCode; //车站编码
    private String stationName; //车站名称
    private Integer type;       //出入库类型 0代表出库 1代表入库
    private Integer amount;     //出入库数量
    private String summary;     //摘要
    private Date createTime;    //创建时间
    private String creator;     //创建人

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
}
