package com.biierg.cocc.common.bean;
/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */

import java.io.Serializable;
import java.util.Date;

/**
 * Desc :断面信息
 *
 * @author dw
 * @date 2017/1/12  12:18
 */
public class BaseSections implements Serializable {
    private final static long serialVersionUID = 1l;
    private String sectionId;//断面编号
    private String lineCode;//
    private String sectionName;//断面名称
    private String beginCode;//断面起点站编号
    private String endCode;//断面终点站编号
    private Integer direction;//上下行方向
    private Date updateTime;//更新日期  14
    private String remark;

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getLineCode() {
        return lineCode;
    }

    public void setLineCode(String lineCode) {
        this.lineCode = lineCode;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getBeginCode() {
        return beginCode;
    }

    public void setBeginCode(String beginCode) {
        this.beginCode = beginCode;
    }

    public String getEndCode() {
        return endCode;
    }

    public void setEndCode(String endCode) {
        this.endCode = endCode;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
