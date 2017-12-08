package com.biierg.cocc.common.bean;
/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */

import java.io.Serializable;
import java.util.Date;

/**
 * Desc: 时期段实体
 * Created by dw on 2017/2/25.
 */
public class DateSection implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;//时期段ID
    private String name;//时期段名字
    private int type;//类型 0：普通  1：特殊
    private Date startDate;//起始日期
    private Date endDate;//截止日期
    private int status;//使用状态 0：正常使用 1：停用
    private String creator;//创建者
    private Date createTime;//创建时间
    private String updator;//修改者
    private Date updateTime;//修改时间
    private String remark;//备注

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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
