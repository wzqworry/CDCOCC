/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * @author wwj
 * 专家表
 */

public class GenExpert implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String expID;//专家ID号
    private String expName;//专家名字
    private String proName;//专业名称
    private String reseAreas;//研究领域
    private String positions;//职务
    private String company;//所在单位
    private String contact;//联系方式
    private String phoneNumberBackup;//联系电话( 备用 )
    private String landLineTelephone;//座机
    private String landLineTelephoneBackup;//联系电话
    private String eventHandingExp;//处置过的事件经验
    private String remark; // 备注

    public String getExpID() {
        return expID;
    }

    public void setExpID(String expID) {
        this.expID = expID;
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getReseAreas() {
        return reseAreas;
    }

    public void setReseAreas(String reseAreas) {
        this.reseAreas = reseAreas;
    }

    public String getPositions() {
        return positions;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEventHandingExp() {
        return eventHandingExp;
    }

    public void setEventHandingExp(String eventHandingExp) {
        this.eventHandingExp = eventHandingExp;
    }

    public String getPhoneNumberBackup() {
        return phoneNumberBackup;
    }

    public void setPhoneNumberBackup(String phoneNumberBackup) {
        this.phoneNumberBackup = phoneNumberBackup;
    }

    public String getLandLineTelephone() {
        return landLineTelephone;
    }

    public void setLandLineTelephone(String landLineTelephone) {
        this.landLineTelephone = landLineTelephone;
    }

    public String getLandLineTelephoneBackup() {
        return landLineTelephoneBackup;
    }

    public void setLandLineTelephoneBackup(String landLineTelephoneBackup) {
        this.landLineTelephoneBackup = landLineTelephoneBackup;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
