package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/8/17.
 * 应急演练表
 */
public class GisPlan implements Serializable{
    private final static long serialVersionUID = 1l;

    private String id;//流水号
    private String planName;//名字
    private String creator;//创建人
    private Date createTime;//创建时间
    private String updator;//更新人
    private Date updateTime;//更新时间
    private String remark;//备注
    private String emerId;//关联的突发事件id

    private List<GisPlanStep> planStepList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
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
    
    public String getEmerId() {
		return emerId;
	}

	public void setEmerId(String emerId) {
		this.emerId = emerId;
	}

	public List<GisPlanStep> getPlanStepList() {
        return planStepList;
    }

    public void setPlanStepList(List<GisPlanStep> planStepList) {
        this.planStepList = planStepList;
    }
}
