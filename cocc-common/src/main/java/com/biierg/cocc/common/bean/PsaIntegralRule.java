package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;


/**
* @ClassName PsaIntegralRule
* @Description 积分规则 实体类
* @author yayi.sun
* @date 2017年11月29日 上午11:10:17
*/
public class PsaIntegralRule  implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String content;// 内容
    private Date createTime;
    private String creator;
    private Date updateTime;
    private String updater;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	@Override
	public String toString() {
		return "PsaIntegralRule [id=" + id + ", content=" + content + ", createTime=" + createTime + ", creator="
				+ creator + ", updateTime=" + updateTime + ", updater=" + updater + "]";
	}

    
}
