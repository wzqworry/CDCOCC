/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.DutyGroupPerson;
import com.biierg.cocc.common.bean.DutyPersonWorkOff;
import com.biierg.cocc.common.bean.DutyWorkGroup;
import com.biierg.cocc.common.bean.GenMailList;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * 员工调休管理 服务接口
 *
 * @author wen.ding
 * @date 2017/4/21  17:14
 * @email dingwenbj@foxmail.com
 */
public interface IDutyPersonWorkOffService extends IBaseService<DutyPersonWorkOff, String> {

    /**
     * 综合查询 员工调休记录
     *
     * @param keyword   关键字
     * @param startTime 开始时间
     * @param endTime   停止时间
     * @return 员工调休记录 列表
     * @throws SrvException 后台服务异常
     */
    SrvResponse<List<DutyPersonWorkOff>> listPersonWorkOff(String keyword, Date startTime, Date endTime) throws SrvException;

    /**
     * 查询：查询某个人员的所有调休记录（不管是作为请假还是加班 ）
     *
     * @param personId 关键字，开始时间，结束时间
     * @return 人员调休记录列表
     */
    List<DutyPersonWorkOff> queryByPersonId(String personId) throws SrvException;
}
