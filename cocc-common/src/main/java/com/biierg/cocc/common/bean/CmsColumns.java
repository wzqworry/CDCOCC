package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 栏目
 * Created by syy on 2017/8/26.
 */
public class CmsColumns implements Serializable {
    private final static long serialVersionUID = 1L;

    private String id;
    private String parentId; // 父栏目ID
    private String columnPath; // 栏目路径

    private String label; // 栏目简单描述；
    private String description; //简介
    private String picurl; //栏目图片路径
    private int isLocked; // 是否锁定 1是 2否
    private int isTop; //1是 2否
    private int isQuick; //是否快速发布标记 1是 2否
    private int sortnum;
    private Date createTime;
    private String creator;
    private Date updateTime;
    private String updater;

    private List<CmsColumns> childColumn = new ArrayList<>(); //下级栏目列表

    @Override
    public String toString() {
        return "CmsColumns{" +
                "id='" + id + '\'' +
                ", parentId='" + parentId + '\'' +
                ", columnPath='" + columnPath + '\'' +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", picurl='" + picurl + '\'' +
                ", isLocked=" + isLocked +
                ", isTop=" + isTop +
                ", isQuick=" + isQuick +
                ", sortnum=" + sortnum +
                ", createTime=" + createTime +
                ", creator='" + creator + '\'' +
                ", updateTime=" + updateTime +
                ", updater='" + updater + '\'' +
                ", childColumn=" + childColumn +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getColumnPath() {
        return columnPath;
    }

    public void setColumnPath(String columnPath) {
        this.columnPath = columnPath;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public int getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(int isLocked) {
        this.isLocked = isLocked;
    }

    public int getIsTop() {
        return isTop;
    }

    public void setIsTop(int isTop) {
        this.isTop = isTop;
    }

    public int getIsQuick() {
        return isQuick;
    }

    public void setIsQuick(int isQuick) {
        this.isQuick = isQuick;
    }

    public int getSortnum() {
        return sortnum;
    }

    public void setSortnum(int sortnum) {
        this.sortnum = sortnum;
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

    public List<CmsColumns> getChildColumn() {
        return childColumn;
    }

    public void setChildColumn(List<CmsColumns> childColumn) {
        this.childColumn = childColumn;
    }
}
