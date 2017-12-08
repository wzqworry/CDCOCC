/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;
import java.util.Map;

import com.biierg.cocc.common.bean.ApprovalFlow;
import com.biierg.cocc.common.bean.ApprovalFlowNode;
import com.biierg.cocc.common.bean.ApprovalLog;
import com.biierg.cocc.common.bean.ApprovalRec;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

/**
 * 审批单流程服务
 * 
 * @author yb
 */
public interface IApproveService {

	/**
	 * 查询审批流
	 * 
	 * 
	 * @return SrvResponse<List<ApprovalRec>> 查询审批流数据
	 **/
	SrvResponse<List<ApprovalRec>> queryAprvRecList(Map<String, Object> map) throws SrvException;
	/**
	 * 新增审批单
	 * @param flowId    审批流程ID
	 * @param subject   业务单据简要描述
	 * @param busiTypeName   业务单据类型名（表名）
	 * @param busiPrimaryKey  业务单据ID
	 * @return String 返回审批单ID
	 **/
	String  insertAprvRec(String flowId,String subject,String busiTypeName,String busiPrimaryKey);
	
	/**
	 * 审批单据
	 * 改变单据审批流节点状态，如果是最后一个节点则判断为审核结束
	 * 
	 * @param flowId  流程ID
	 * @param secId    审批单ID
	 * @param nodeId   节点号
	 * @param result   审批结果 "1"/"0"  通过/不通过
	 * @param log      审批日志
	 **/
	boolean  updateApproveRec(String flowId,String secId,String nodeId,
							String result,String log,String creator);

	/**
	 *  根据recId 来查询审批日志的详细信息想
	 *  @param recId  单据ID；UUID
	 * */
	ApprovalLog queryLogById(String recId);

	/**
	 * 查询系统所有审批流
	 * @return
	 */
	List<ApprovalFlow> queryAprvFlowList();


	/*-------- 以下服务是审批用户的维护 ApprovalFlowNode ----------*/
    boolean insertFlowNode(ApprovalFlowNode approvalFlowNode);
    boolean deleteFlowNode(String flowId,String nodeId);
    boolean updateFlowNode(ApprovalFlowNode approvalFlowNode);
    ApprovalFlowNode queryFlowNode(String flowId,String nodeId);
    List<ApprovalFlowNode> listFlowNode(String flowId);
}
