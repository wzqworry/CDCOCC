/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 排班规则
 *
 * @author wen.ding
 * @date 2017/4/27  15:23
 * @email dingwenbj@foxmail.com
 */
public class DutyTurnRule implements Serializable {
    private final static long serialVersionUID = 1L;

    private String id;//排班规则 id
    private String name;//排班规则 名称
    private Integer status;//排班规则 状态
    private Integer type;//规则类型，0：正常班，1：倒班
    private String turnIdListStr; // 参与排班的班次id列表字符串,"；"隔开
    private String creator;//创建人
    private Date createTime;//创建时间
    private String updator;//修改人
    private Date updateTime;//修改时间
    private String remark;//备注

    private String turnNames;//参与排班的班次名字

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTurnIdListStr() {
        return turnIdListStr;
    }

    public void setTurnIdListStr(String turnIdListStr) {
        this.turnIdListStr = turnIdListStr;
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

    public String getTurnNames() {
        return turnNames;
    }

    public void setTurnNames(String turnNames) {
        this.turnNames = turnNames;
    }
}
