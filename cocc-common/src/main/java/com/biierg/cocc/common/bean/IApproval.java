/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.util.Date;

/**
 * 支持审批流的业务Bean接口
 * 
 * @author lei
 */
public interface IApproval<K> {

	public String getTableName();
	
	public String getPrimaryKey();
	
	public int getApprovalState();
	
	public void setApprovalState(int state);
	
	public Date getApprovalTime();
	
	public void setApprovalTime(Date time);
	
	public String getApprover();
	
	public void setApprover(String approver);
}
