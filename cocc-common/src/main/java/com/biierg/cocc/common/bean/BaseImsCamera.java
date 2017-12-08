/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * Ims摄像头实体
 *
 * @author wen.ding
 * @date 2017/3/7 12:50.
 */
public class BaseImsCamera implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;//摄像机id
    private String sipId; // sipid 唯一识别码（播放cctv时要用）
    private String name;//摄像机名字
    private String ip; // 服务器ip
    private String port; // 服务端口
    private Integer type;//设备类型  1：固定枪式 2：半球式 3：球机

    private String lineId;//线路id
    private String lineName; // 线路名称
    private String stationId;//车站id或车辆id
    private String stationName;//车站名或车辆名
    private String areaId;//区域id

    private Integer status;//使用状态 0：正常使用 1：故障

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSipId() {
        return sipId;
    }

    public void setSipId(String sipId) {
        this.sipId = sipId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private String remark;//备注

}
