/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 客流预警配置
 * 
 * Created by wzq on 2017/5/11.
 */
public class ThresholdConfig implements Serializable {
    private final static long serialVersionUID = 1l;

    private String id;//主键
    private String type;//类型,jzl/czl/hcl....
    private Integer hisCount;//计算数量
    private Integer sdTimes;//标准差倍数
    
    private Double alarmDegree1; // 一级报警系数
    private Double alarmDegree2; // 二级报警系数
    private Double alarmDegree3; // 三级报警系数
    
    private Integer state;//状态
    private Date createTime;//创建时间
    private String creator;//创建人
    private Date updateTime;//更新时间
    private String updater;//更新人

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getHisCount() {
        return hisCount;
    }

    public void setHisCount(Integer hisCount) {
        this.hisCount = hisCount;
    }

    public Integer getSdTimes() {
        return sdTimes;
    }

    public void setSdTimes(Integer sdTimes) {
        this.sdTimes = sdTimes;
    }

    /**
	 * @return the alarmDegree1
	 */
	public Double getAlarmDegree1() {
		return alarmDegree1;
	}

	/**
	 * @param alarmDegree1 the alarmDegree1 to set
	 */
	public void setAlarmDegree1(Double alarmDegree1) {
		this.alarmDegree1 = alarmDegree1;
	}

	/**
	 * @return the alarmDegree2
	 */
	public Double getAlarmDegree2() {
		return alarmDegree2;
	}

	/**
	 * @param alarmDegree2 the alarmDegree2 to set
	 */
	public void setAlarmDegree2(Double alarmDegree2) {
		this.alarmDegree2 = alarmDegree2;
	}

	/**
	 * @return the alarmDegree3
	 */
	public Double getAlarmDegree3() {
		return alarmDegree3;
	}

	/**
	 * @param alarmDegree3 the alarmDegree3 to set
	 */
	public void setAlarmDegree3(Double alarmDegree3) {
		this.alarmDegree3 = alarmDegree3;
	}

	public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }
}
