/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 交接班 - 突发事件 关联对象
 *
 * @author wen.ding
 * @date 2017/5/17  16:42
 * @email dingwenbj@foxmail.com
 */
public class DutyChangeWorkDuty4Emergency implements Serializable {
    private final static long serialVersionUID = 1L;

    private String id; // 主键id
    private String emergencyId; // 应急id
    private String changeWorkDutyId;// 交接班id
    private String status; // 突发事件处置程度 “处置中”，“已结案”
    private Date createTime; // 录入时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmergencyId() {
        return emergencyId;
    }

    public void setEmergencyId(String emergencyId) {
        this.emergencyId = emergencyId;
    }

    public String getChangeWorkDutyId() {
        return changeWorkDutyId;
    }

    public void setChangeWorkDutyId(String changeWorkDutyId) {
        this.changeWorkDutyId = changeWorkDutyId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
