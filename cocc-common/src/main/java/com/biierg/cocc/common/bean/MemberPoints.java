package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Weibo on 2017/9/14.
 */
public class MemberPoints implements Serializable{
    private final static long serialVersionUID = 1L;

    private String id;//记录id
    private String memberId;//会员id
    private Integer points;//分值
    private String summary;//摘要 (用来记录通过哪种途径变更的积分)
    private Integer type;//记账类型 (增加或者修改 0是增加 1是减少)
    private Date createTime;//记账时间
    private String reason;//记分原因

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Integer getPoint() {
        return points;
    }

    public void setPoint(Integer point) {
        this.points = point;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
    
}
