package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
* @ClassName 类名称
* @Description 类描述
* @author yayi.sun
* @date 2017年11月28日 下午5:01:44
*/
public class OptFaultDateSetting implements Serializable{
    private final static long serialVersionUID = 1L;
    
	    private String id;
	    private String scope;
	    private String faultDate;
	    private String replaceDate;
	    private int status;//状态（0正常 、1停用）
	    private Date createTime;
	    private String creator;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getScope() {
			return scope;
		}
		public void setScope(String scope) {
			this.scope = scope;
		}
		public String getFaultDate() {
			return faultDate;
		}
		public void setFaultDate(String faultDate) {
			this.faultDate = faultDate;
		}
		public String getReplaceDate() {
			return replaceDate;
		}
		public void setReplaceDate(String replaceDate) {
			this.replaceDate = replaceDate;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
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
	    
	    
}
