/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;
import java.util.Map;

import com.biierg.cocc.common.annotation.GenericLog;
import com.biierg.cocc.common.bean.IpsMessage;
import com.biierg.cocc.common.bean.IpsMsgReclist;
import com.biierg.cocc.common.support.SrvException;

/**
 * 消息--收件人关联表服务
 *
 * @author lk
 */

public interface IMsgConService {
    /**
     * 更新实体
     */
    @GenericLog
    public boolean update(IpsMsgReclist bean) throws Exception;

    public boolean creat(String msgId, String recipients) throws Exception;

    public List<IpsMsgReclist> findUnreadMsg(Map<String, Object> map) throws Exception;

    public IpsMsgReclist findMsgCon(IpsMsgReclist ipsMsgReclist) throws Exception;
}
