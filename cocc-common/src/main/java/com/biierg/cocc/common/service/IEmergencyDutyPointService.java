/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.EmergencyDutyPoint;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.List;

/**
 * Created by wzq on 2017/4/25.
 */
public interface IEmergencyDutyPointService extends IBaseService<EmergencyDutyPoint, String> {
    /**
     * 查询应急值守点
     * @param areaType  应急区域
     * @param locatStation  站点名称
     * */
    public SrvResponse<List<EmergencyDutyPoint>> queryDutyPoint(Integer areaType, String locatStation) throws SrvException;
    /**
     * 批量插入数据 不受事务控制
     * */
    int batchInsert(List<EmergencyDutyPoint> pointList) throws SrvException;
    /**
     * 批量插入数据 事务控制
     * */
    int batchInsertOrNot(List<EmergencyDutyPoint> pointList) throws SrvException;
    /**
    * 清空
    */
    boolean clear();
}
