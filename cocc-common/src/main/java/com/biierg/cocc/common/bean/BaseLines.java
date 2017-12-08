package com.biierg.cocc.common.bean;
/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/1/5.
 * 地铁线路表 BASE_LINES
 */
public class BaseLines implements Serializable {
	private final static long serialVersionUID = 1l;
    private String lineId;//线路编码
    private String lineNameCN;//中文名
    private String lineNameEN;//英文名
    private Integer isCircle;//是否环线
    private Integer lineState;//使用状态
    private String upEndCode;//上行末站
    private String downEndCode;//下行末站
    private Double length;//线路长度
    private int tripTime;//理论运行时间
    private Date updateTime;//更新日期

    private int vehicleCapacity;//车辆定员数
    private int vehicleAmount;//列车保有量
    private String atsLineId;//行车数据中的线路编码
    private String remark;//备注
    private String dir_desc;//线路运行方向描述
    
    private int upOrder; // 上行方向是否按从小到大排序
    private int driverAmount; // 列车司机人数

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getLineNameCN() {
        return lineNameCN;
    }

    public void setLineNameCN(String lineNameCN) {
        this.lineNameCN = lineNameCN;
    }

    public String getLineNameEN() {
        return lineNameEN;
    }

    public void setLineNameEN(String lineNameEN) {
        this.lineNameEN = lineNameEN;
    }

    public Integer getIsCircle() {
        return isCircle;
    }

    public void setIsCircle(Integer isCircle) {
        this.isCircle = isCircle;
    }

    public Integer getLineState() {
        return lineState;
    }

    public void setLineState(Integer lineState) {
        this.lineState = lineState;
    }

    public String getUpEndCode() {
        return upEndCode;
    }

    public void setUpEndCode(String upEndCode) {
        this.upEndCode = upEndCode;
    }

    public String getDownEndCode() {
        return downEndCode;
    }

    public void setDownEndCode(String downEndCode) {
        this.downEndCode = downEndCode;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public int getTripTime() {
        return tripTime;
    }

    public void setTripTime(int tripTime) {
        this.tripTime = tripTime;
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
    
    public String getAtsLineId() {
		return atsLineId;
	}

	public void setAtsLineId(String atsLineId) {
		this.atsLineId = atsLineId;
	}

	public int getVehicleCapacity() {
        return vehicleCapacity;
    }

    public void setVehicleCapacity(int vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }

    public int getVehicleAmount() {
        return vehicleAmount;
    }

    public void setVehicleAmount(int vehicleAmount) {
        this.vehicleAmount = vehicleAmount;
    }

	public String getDir_desc() {
		return dir_desc;
	}

	public void setDir_desc(String dir_desc) {
		this.dir_desc = dir_desc;
	}
	
    public int getUpOrder() {
		return upOrder;
	}

	public void setUpOrder(int upOrder) {
		this.upOrder = upOrder;
	}

	public int getDriverAmount() {
		return driverAmount;
	}

	public void setDriverAmount(int driverAmount) {
		this.driverAmount = driverAmount;
	}
    
}
