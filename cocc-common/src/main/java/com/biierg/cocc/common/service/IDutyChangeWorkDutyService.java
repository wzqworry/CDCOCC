/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.DutyChangeWorkDuty;
import com.biierg.cocc.common.bean.DutyChangeWorkDuty4Emergency;
import com.biierg.cocc.common.bean.DutyChangeWorkDuty4File;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * 交接班管理 服务接口
 *
 * @author wen.ding
 * @date 2017/4/24  16:06
 * @email dingwenbj@foxmail.com
 */
public interface IDutyChangeWorkDutyService extends IBaseService<DutyChangeWorkDuty, String> {

    /**
     * 综合查询 班组交接班记录
     *
     * @param keyword   关键字
     * @param startTime 开始时间
     * @param endTime   停止时间
     * @return 交接班记录 列表
     * @throws SrvException 后台服务异常
     */
    SrvResponse<List<DutyChangeWorkDuty>> listChangeWorkDuty(String keyword, Date startTime, Date endTime) throws SrvException;

    /**
     * 批量插入交接班 - 文件 关联对象列表
     *
     * @param dutyChangeWorkDuty4FileList 交接班 - 文件 关联对象列表
     * @return boolean
     */
    boolean insertFileBatch(List<DutyChangeWorkDuty4File> dutyChangeWorkDuty4FileList) throws SrvException;

    /**
     * 批量插入交接班 - 突发事件 关联对象列表
     *
     * @param dutyChangeWorkDuty4EmergencyList 交接班 - 突发事件 关联对象列表
     * @return boolean
     */
    boolean insertEmergencyBatch(List<DutyChangeWorkDuty4Emergency> dutyChangeWorkDuty4EmergencyList) throws SrvException;

    /**
     * 批量插入交接班 - 台账 关联对象列表
     *
     * @param dutyHandoverIdList 台账id列表
     * @param id                 交接班id
     * @return boolean
     */
    boolean insertHandoverBatch(List<String> dutyHandoverIdList, String id) throws SrvException;

    /**
     * 根据交接班id , 查询该交接班的交接详情
     *
     * @param changeWorkDutyId 交接班id
     * @return 交接班详情bean
     */
    DutyChangeWorkDuty findDetails(String changeWorkDutyId) throws SrvException;

    /**
     * 获取当前交接班的基本信息，根据排班表查询，用于自动生成交接班
     *
     * @param userId      交班人id
     * @param startStart,
     * @param  startEnd
     * @param endStart,
     * @param endEnd
     * @param sendId 交班人的班组
     * @param recId 接班人的班组
     * @return 交接班详情
     */
    List<DutyChangeWorkDuty> findDetailsAuto(String userId,Date startStart,Date startEnd,Date endStart,
                                             Date endEnd,String sendId,String recId) throws SrvException, ParseException;
}
