package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/8/17.
 */
public class GisPlanAndStep implements Serializable {
    private final static long serialVersionUID = 1l;
    //plan 的内容
    private String id;//流水号
    private String planName;//名字
    private String emerId;//突发事件的id
    
    //step 的内容
    private String planId;//预案id
    private String stepType;//步骤的类型 1.点、2.线、3.面、4标会
    private Integer stepOrder;//步骤顺序
    private String points;//坐标points
    private Date dateTime;//时间信息
    private String content;//
    private String info;//显示到infowindow里面的内容
    private String icon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmerId() {
		return emerId;
	}

	public void setEmerId(String emerId) {
		this.emerId = emerId;
	}

	public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getStepType() {
        return stepType;
    }

    public void setStepType(String stepType) {
        this.stepType = stepType;
    }

    public Integer getStepOrder() {
        return stepOrder;
    }

    public void setStepOrder(Integer stepOrder) {
        this.stepOrder = stepOrder;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
