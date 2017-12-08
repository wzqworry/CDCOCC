/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.EmergencyDutyTeam;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.List;

/**
 * Created by wzq on 2017/4/25.
 */
public interface IEmergencyDutyTeamService extends IBaseService<EmergencyDutyTeam, String>  {

    /**
     * 查询应急队伍
     * @param teamType 队伍类型
     * @param stationName 所在站点的名字
     * @param keyword 关键字
     * */
    SrvResponse<List<EmergencyDutyTeam>> queryDutyTeam(Integer teamType,String stationName,String keyword) throws SrvException;

    /**
     * 根据站点名字查询属于本站的应急队伍
     * */
    List<EmergencyDutyTeam> findByStationName(String stationName) throws SrvException;
    /**
     * 批量插入数据 不受事务控制
     * */
    int batchInsert(List<EmergencyDutyTeam> teamList) throws SrvException;
    /**
     * 批量插入数据 事务控制
     * */
    int batchInsertOrNot(List<EmergencyDutyTeam> teamList) throws SrvException;
    /**
     * @param teamType 类型
     * 清空
     */
    boolean clear(Integer teamType);
}
