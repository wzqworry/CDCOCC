/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * @author wwj
 * 通讯录表
 */

public class GenMailList implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String id;//删除用的id，未用到，时间紧，先占用为关键字
    private String userID;//人员ID
    private String userName;//人员名字
    private String postID;//所在岗位ID
    private String orgID;//所在组织机构ID
    private String phoneNumber;//联系电话
    private String phoneNumberBackup;//联系电话( 备用 )
    private String landLineTelephone;//座机
    private String landLineTelephoneBackup;//联系电话

    private String userMark;//与接口获得的账户标记
    private String delMark;//删除用户时的逻辑标志

    private int srcFlag; // 用户来源标记 0 系统内部，1.导入
    private String remark; // 备注

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public String getOrgID() {
        return orgID;
    }

    public void setOrgID(String orgID) {
        this.orgID = orgID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getUserMark() {
        return userMark;
    }

    public void setUserMark(String userMark) {
        this.userMark = userMark;
    }

    public String getDelMark() {
        return delMark;
    }

    public void setDelMark(String delMark) {
        this.delMark = delMark;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getSrcFlag() {
        return srcFlag;
    }

    public void setSrcFlag(int srcFlag) {
        this.srcFlag = srcFlag;
    }
}
