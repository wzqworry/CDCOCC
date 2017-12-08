/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * 关联表-收件人信息实体
 *
 * @author wen.ding
 * @date 2017/4/1 9:31
 * @email dingwenbj@foxmail.com
 */
public class IpsMsgReclist implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String msgId; // 消息 id
    private String userId; // 用户 id
    private int deleteMark; // 消息删除状态，0：未删除 1：已删除

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(int deleteMark) {
        this.deleteMark = deleteMark;
    }
}
