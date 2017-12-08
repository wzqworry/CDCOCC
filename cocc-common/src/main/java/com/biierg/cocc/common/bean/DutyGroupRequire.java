/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * Created by wzq on 2017/4/5.
 * DUTY_GROUP_REQUIRE   岗位下需要什么部门，需求多少人
 */
public class DutyGroupRequire implements Serializable{
    private final static long serialVersionUID = 1L;

    private String id;//ID
    private String groupId;//班组id
    private String groupName;//班组名称
    private String deptId;//岗位id
    private String deptName;//岗位名称
    private Integer leastCount;//最低人员个数
    private Integer mostCount;//最高人员个数

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public Integer getLeastCount() {
        return leastCount;
    }

    public void setLeastCount(Integer leastCount) {
        this.leastCount = leastCount;
    }

    public Integer getMostCount() {
        return mostCount;
    }

    public void setMostCount(Integer mostCount) {
        this.mostCount = mostCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
