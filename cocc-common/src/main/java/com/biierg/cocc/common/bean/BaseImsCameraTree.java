/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 设备列表结构树
 *
 * @author wen.ding
 */
public class BaseImsCameraTree implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nodeID; // 节点ID
    private String nodeName; // 节点名字
    private String pID; // 上一级节点ID
    private Integer delMark; //删除标记
    private Integer type; // 分类标记 0：摄像头树

    // 下级节点列表
    private List<BaseImsCameraTree> children = new ArrayList<>();

    public BaseImsCameraTree() {
    }

    public BaseImsCameraTree(String nodeID, String nodeName, String pID, Integer type) {
        this.nodeID = nodeID;
        this.nodeName = nodeName;
        this.pID = pID;
        this.type = type;
        this.delMark=0;
    }

    public String getNodeID() {
        return nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getpID() {
        return pID;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }

    public List<BaseImsCameraTree> getChildren() {
        return children;
    }

    public void setChildren(List<BaseImsCameraTree> children) {
        this.children = children;
    }

    public Integer getDelMark() {
        return delMark;
    }

    public void setDelMark(Integer delMark) {
        this.delMark = delMark;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}
