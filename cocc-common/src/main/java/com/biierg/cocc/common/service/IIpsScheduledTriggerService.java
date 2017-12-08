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

public interface IIpsScheduledTriggerService {

    /**
     * 获取与某job匹配的所有触发器
     */
    SrvResponse<List<IpsScheduledTaskTrigger>> listTimerTriggers(String taskId) throws Exception;

    // 删除
    ApiResult stopTimerTrigger(String triggerId) throws Exception;

    // 暂停
    ApiResult pauseTrigger(String triggerId) throws Exception;

    // 恢复
    ApiResult resumeTrigger(String triggerId) throws Exception;
}
