/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.AssistScheduleFile;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * 调度文件管理服务接口
 *
 * @author wen.ding
 * @date 2017/5/18 17:00.
 * @email dingwenbj@foxmail.com
 */
public interface IAssistScheduleFileService extends IBaseService<AssistScheduleFile, String> {

    /**
     * 综合查询调度文件
     *
     * @param startTime 起始时间
     * @param endTime   截止时间
     * @param keyword   关键字
     * @return 调度文件列表
     * @throws SrvException 后台服务异常
     */
    SrvResponse<List<AssistScheduleFile>> listAssistScheduleFile(Date startTime, Date endTime,Integer fileType, String keyword) throws SrvException;

    /**
     * 创建 调度文件 - 收件人 关联信息
     *
     * @param id           文件id
     * @param sendeeIdList 收件人id列表
     * @return boolean
     * @throws SrvException 后台服务异常
     */
    boolean createBatchFile2Sendee(String id, List<String> sendeeIdList) throws SrvException;

    /**
     * 根据 调度文件id 删除 相关的接收人关联信息
     *
     * @param id 调度文件id
     * @return boolean
     * @throws SrvException 后台服务异常
     */
    boolean removeBatchFile2Sendee(String id) throws SrvException;

    /**
     * 修改接收人该收文件的阅读状态为“已读”
     *
     * @param fileId 文件id
     * @param userId yonghuid
     * @return boolean
     * @throws SrvException 后台服务异常
     */
    boolean changeTheReadStatus(String fileId, String userId) throws SrvException;
}
