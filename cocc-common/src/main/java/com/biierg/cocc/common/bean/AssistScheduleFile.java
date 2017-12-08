/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 调度文件管理
 *
 * @author wen.ding
 * @date 2017/5/18 13:14
 * @email dingwenbj@foxmail.com
 */
public class AssistScheduleFile implements Serializable {
    private final static long serialVersionUID = 1L;

    private String id; // 文件 id
    private String name; //  文件名
    private String url;// 文件地址 url

    private String creator;// 创建人
    private Date createTime; // 创建时间
    private String updater;// 修改人
    private Date updateTime;// 修改时间
    private String remark;// 备注，文件内容提示

    private Integer fileType;//文件类型,作为搜索条件或者规定文件的路径

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
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

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }
}
