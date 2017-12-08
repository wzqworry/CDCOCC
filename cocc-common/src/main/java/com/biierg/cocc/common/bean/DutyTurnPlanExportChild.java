/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 排班计划导出，专用实体类子表
 *
 * @author wen.ding
 * @date 2017/5/12  10:53
 * @email dingwenbj@foxmail.com
 */
public class DutyTurnPlanExportChild implements Serializable {
    private final static long serialVersionUID = 1L;

    private Date workDate;// 当前日期

    // TODO 此处存放 Map<String,Map<String,Map<String<Map<String,String>>>>>  整合下边嵌套字段，查询实现
    private String groupId; // 班组id
    private String groupName; // 班组名

//    private String lineId; // 线路id
//    private String lineName; // 线路名

    private String turnId; // 班次id
    private String turnName; // 班次名

    private String postId; // 岗位id
    private String postName; // 岗位id

    private String personId; // 员工id
    private String personName; // 员工名

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getTurnId() {
        return turnId;
    }

    public void setTurnId(String turnId) {
        this.turnId = turnId;
    }

    public String getTurnName() {
        return turnName;
    }

    public void setTurnName(String turnName) {
        this.turnName = turnName;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
