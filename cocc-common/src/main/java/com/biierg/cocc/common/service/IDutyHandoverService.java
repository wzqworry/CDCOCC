/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.DutyHandover;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * 台账管理服务接口
 *
 * @author wen.ding
 * @date 2017/5/21  12:21
 * @email dingwenbj@foxmail.com
 */
public interface IDutyHandoverService extends IBaseService<DutyHandover, String> {

    /**
     * 查询台账列表
     *
     * @param creator   创建人
     * @param startTime 起始时间
     * @param endTime   截止时间
     * @param keyword   关键字
     */
    SrvResponse<List<DutyHandover>> listDutyHandover(String creator, Date startTime, Date endTime, String keyword) throws SrvException;

}
