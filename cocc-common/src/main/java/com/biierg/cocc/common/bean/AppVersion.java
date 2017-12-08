package com.biierg.cocc.common.bean;
/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2016/11/11.
 */
public class AppVersion implements Serializable {
	
    private static final long serialVersionUID = 1L;
    private String id;
    private String platformType;  //平台类型
    private String version;//显示版本号
    private Integer version_num;//数字版本号
    private Integer mandatory;//更新标记  0:自动更新  1:强制更新
    private String updateContent;//更新内容
    private Date updateTime;//更新时间
    private String downloadUrl;//下载地址或者文件名
    private String fileName;//文件名
    private String size;//文件大小
    private String showtime;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getUpdateContent() {
        return updateContent;
    }

    public void setUpdateContent(String updateContent) {
        this.updateContent = updateContent;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Integer getVersion_num() {
		return version_num;
	}
	public void setVersion_num(Integer version_num) {
		this.version_num = version_num;
	}
	public Integer getMandatory() {
		return mandatory;
	}
	public void setMandatory(Integer mandatory) {
		this.mandatory = mandatory;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getShowtime() {
		return showtime;
	}
	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}
    
}
