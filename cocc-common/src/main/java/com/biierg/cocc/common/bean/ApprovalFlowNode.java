/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * 审批流节点
 * 
 * @author lei
 */
public class ApprovalFlowNode implements Serializable {
	private static final long serialVersionUID = 1L;

	private String flowId; // 审批流ID；
	
	private String nodeId; // 节点ID
	private String parentNodeId; // 上级节点ID
	
	private String nodeName; // 节点名称
	
	private String roleId; // 审批角色ID  role 和 post 是一个东西
    private String roleName;// 审批角色
	private String orgId; // 审批部门ID
    private String orgName;//
	private String postId; // 审批岗位ID
    private String postName;//
	private String userId;// 审批用户ID
    private String userName;//
	
	private int firstFlag; // 首节点标记
	private int lastFlag; // 末节点标记
	public String getFlowId() {
		return flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public int getFirstFlag() {
		return firstFlag;
	}
	public void setFirstFlag(int firstFlag) {
		this.firstFlag = firstFlag;
	}
	public int getLastFlag() {
		return lastFlag;
	}
	public void setLastFlag(int lastFlag) {
		this.lastFlag = lastFlag;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public String getParentNodeId() {
		return parentNodeId;
	}
	public void setParentNodeId(String parentNodeId) {
		this.parentNodeId = parentNodeId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
