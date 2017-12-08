/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * IMS编组与摄像头关联
 *
 * @author wen.ding
 * @date 2017/3/4 18:58.
 */
public class ImsGroupCameraRel implements Serializable {
    private static final long serialVersionUID = 1L;

    private String imsGroupId;//编组id
    private String cameraId;//摄像头id
    private Integer displayOrder;// 显示次序

    public ImsGroupCameraRel(String imsGroupId, String cameraId, Integer displayOrder) {
        this.imsGroupId = imsGroupId;
        this.cameraId = cameraId;
        this.displayOrder = displayOrder;
    }

    public String getImsGroupId() {
        return imsGroupId;
    }

    public void setImsGroupId(String imsGroupId) {
        this.imsGroupId = imsGroupId;
    }

    public String getCameraId() {
        return cameraId;
    }

    public void setCameraId(String cameraId) {
        this.cameraId = cameraId;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }
}
