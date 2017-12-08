/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

/**
 * 调度文件 - 收件人 关联对象
 *
 * @author wen.ding
 * @date 2017/5/18 13:14
 * @email dingwenbj@foxmail.com
 */
public class AssistScheduleFileSendee {
    private final static long serialVersionUID = 1L;

    private String id; // id
    private String fileId; // 文件 id
    private String sendeeId;// 接收人id
    private String status;// 阅读状态  "已读" "未读"

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getSendeeId() {
        return sendeeId;
    }

    public void setSendeeId(String sendeeId) {
        this.sendeeId = sendeeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
