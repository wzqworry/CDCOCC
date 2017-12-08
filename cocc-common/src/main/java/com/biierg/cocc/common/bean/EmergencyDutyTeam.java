/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * Created by wzq on 2017/4/25.
 * 应急团队
 */
public class  EmergencyDutyTeam implements Serializable {
    private final static long serialVersionUID = 1l;
    private String id;//	ID
    private Integer teamType;//类别	1,专业应急;2.区域应急
    private String teamName;//名称
    private Integer memberType;//组员职位	1,队长;2,副队;3,队员
    private Integer teamArea;//所属区域
    private String teamWorkSpace;//工作地点
    private String major;//专业
    private String name;//姓名
    private String dept;//岗位
    private String cellphone;//手机
    private String contactBK;//备用联系方式
    private String address;//住址
    private String stationName;//靠近的站点
    private String remark;//备注

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTeamType() {
        return teamType;
    }

    public void setTeamType(Integer teamType) {
        this.teamType = teamType;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getMemberType() {
        return memberType;
    }

    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }

    public Integer getTeamArea() {
        return teamArea;
    }

    public void setTeamArea(Integer teamArea) {
        this.teamArea = teamArea;
    }

    public String getTeamWorkSpace() {
        return teamWorkSpace;
    }

    public void setTeamWorkSpace(String teamWorkSpace) {
        this.teamWorkSpace = teamWorkSpace;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getContactBK() {
        return contactBK;
    }

    public void setContactBK(String contactBK) {
        this.contactBK = contactBK;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
