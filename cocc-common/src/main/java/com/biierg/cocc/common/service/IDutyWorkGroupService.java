/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.DutyWorkGroup;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/4/5.
 * 排班基本信息服务接口
 */
public interface IDutyWorkGroupService extends IBaseService<DutyWorkGroup, String> {

    /**
     * 查询符合条件的 班组信息
     *
     * @param keyword   名字关键字
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @param statue    班组状态
     */
    public SrvResponse<List<DutyWorkGroup>> quertDutyWorkGroup(String keyword, Date startTime,
                                                               Date endTime, Integer statue) throws SrvException;

    /**
     * 根据用户 id 查询该用户所在的班组
     *
     * @param userId 用户id
     * @return 班组对象
     * @throws SrvException 后台服务异常
     */
    DutyWorkGroup queryByUserId(String userId) throws SrvException;

}
