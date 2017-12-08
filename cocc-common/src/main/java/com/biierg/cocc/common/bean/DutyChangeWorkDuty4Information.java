/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 交接班 - 交接信息 关联对象
 *
 * @author wen.ding
 * @date 2017/5/17  16:41
 * @email dingwenbj@foxmail.com
 */
public class DutyChangeWorkDuty4Information implements Serializable {
    private final static long serialVersionUID = 1L;

    private String id; // 主键id，消息id
    private String changeWorkDutyId; // 交接班id
    private String title;// 消息标题
    private String content; // 消息内容
    private String creator; // 录入人
    private Date createTime; // 录入时间
    private String updator; //
    private Date updateTime; //
    private String remark; //

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChangeWorkDutyId() {
        return changeWorkDutyId;
    }

    public void setChangeWorkDutyId(String changeWorkDutyId) {
        this.changeWorkDutyId = changeWorkDutyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
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
