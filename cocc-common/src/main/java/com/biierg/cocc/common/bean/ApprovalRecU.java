/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * 审批单（作为接口传值用）
 *
 * @author lei
 */
public class ApprovalRecU implements Serializable {
    private static final long serialVersionUID = 1L;

    private String busiPrimaryKey; // 业务单据ID；
    private String operator; // 审批操作人
    private String flag; // 审批是否通过；
    private String approveType;//1.预警 ,2预案

    public String getBusiPrimaryKey() {
        return busiPrimaryKey;
    }
    public void setBusiPrimaryKey(String busiPrimaryKey) {
        this.busiPrimaryKey = busiPrimaryKey;
    }
    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getApproveType() {
        return approveType;
    }

    public void setApproveType(String approveType) {
        this.approveType = approveType;
    }
}
