/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 交接班 - 交阅文件 关联对象
 *
 * @author wen.ding
 * @date 2017/5/17  16:41
 * @email dingwenbj@foxmail.com
 */
public class DutyChangeWorkDuty4File implements Serializable {
    private final static long serialVersionUID = 1L;

    private String id; // 主键id
    private String fileId; // 文件id
    private String changeWorkDutyId;// 交接班id
    private String read; // 文件阅读状态 “已读”  id;id;id
    private String unRead; // 文件阅读状态 “未读” id;id;id
    private Date createTime; // 录入时间

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

    public String getChangeWorkDutyId() {
        return changeWorkDutyId;
    }

    public void setChangeWorkDutyId(String changeWorkDutyId) {
        this.changeWorkDutyId = changeWorkDutyId;
    }

    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }

    public String getUnRead() {
        return unRead;
    }

    public void setUnRead(String unRead) {
        this.unRead = unRead;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
