/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * ATS配置信息
 *
 * @author lei
 */
public class AtsConfiguration implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //

    private String scrId; // 大屏id
    private String name; // ATS名称
    private String hostIp; // ATS程序监听地址
    private int port; // ATS程序监听端口
    private int panelId; // ATS面板ID

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    public String getScrId() {
        return scrId;
    }

    public void setScrId(String scrId) {
        this.scrId = scrId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    /**
     * @param hostIp the hostIp to set
     */
    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    /**
     * @return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }

    /**
     * @return the panelId
     */
    public int getPanelId() {
        return panelId;
    }

    /**
     * @param panelId the panelId to set
     */
    public void setPanelId(int panelId) {
        this.panelId = panelId;
    }
}
