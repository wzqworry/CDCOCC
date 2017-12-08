/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.EmergencySupply;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * 应急物资服务接口
 *
 * Created by wzq on 2017/3/9.
 */
public interface IEmergencySupplyService extends IBaseService<EmergencySupply, String>{

    /**
     *  查询应急物资
     *  @param   supplyName 物资名称
     *  @param   supplyType 负责人
     *  @param   keyWord
     *  @param   startTime   开始时间
     *  @param   endTime     结束时间
     *  @retuen  SrvResponse<List<EmergencySupply>>
     * */
    SrvResponse<List<EmergencySupply>> queryEmerSupply(String supplyName, Integer supplyType,
                                                              String keyWord, Date startTime, Date endTime) throws SrvException;

    /**
     * 根据站点名字查询属于本站的应急物资
     * */
    List<EmergencySupply> findByStationName(String stationName) throws SrvException;
    /**
     * 批量插入数据 不受事务控制
     * */
    int batchInsert(int data,List<EmergencySupply> supplyList) throws SrvException;
    /**
     * 批量插入数据 事务控制
     * */
    int batchInsertOrNot(int data,List<EmergencySupply> supplyList) throws SrvException;
    /**
    * 清空
    */
    boolean clear();
}
