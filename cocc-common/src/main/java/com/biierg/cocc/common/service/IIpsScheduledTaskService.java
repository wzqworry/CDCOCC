/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.apiutil.ApiResult;
import com.biierg.cocc.common.bean.IpsMessage;
import com.biierg.cocc.common.bean.IpsScheduledTask;
import com.biierg.cocc.common.bean.IpsScheduledTaskTrigger;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.List;

/**
 * 消息发布子系统 - 定时消息发送 相关服务接口实现
 *
 * @author wen.ding
 */

public interface IIpsScheduledTaskService {

    /**
     * 系统启动，触发定时发送消息服务
     */
    void initMsgTimer() throws Exception;

    /**
     * 搜索定时任务
     */
    SrvResponse<List<IpsScheduledTask>> listTimerMessage(IpsScheduledTask msgTimer) throws Exception;

    /**
     * 停止定时消息服务
     */
    ApiResult stopTimerMessage(List<String> taskIdList) throws Exception;

    /**
     * 暂停一个任务
     */
    ApiResult pauseJob(String taskId) throws Exception;

    /**
     * 恢复一个定时任务
     */
    ApiResult resumeJob(String taskId) throws Exception;

    /**
     * 立即执行一个定时任务
     */
    ApiResult triggerJob(String taskId) throws Exception;

    /**
     * 修改一个任务的时间规则
     */
    ApiResult rescheduleJob(IpsScheduledTask msgTimer, IpsScheduledTaskTrigger taskTrigger) throws Exception;


    // TODO 私有方法

    /**
     * 发送定时消息（消息发布）
     */
    ApiResult createTimerMessage(IpsScheduledTask msgTimer, IpsMessage ipsMessage, List<String> receieverIdListStr,
                                 String[] checkphone, String[] cronExpressionArr) throws Exception;

}
