package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.XczzSjfcrtd;
import com.biierg.cocc.common.support.SrvException;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/8/2.
 */
public interface IXczzSjfcrtdService {

    /**
     * 查询数据计算断面客流量
     * @param minusStartTime 计算过的开始时间
     * @param startTime 开始时间
     * @param minusEndTime 计算过的结束时间
     * @param endTime 结束时间
     * @param lineCode 线路id
     * @param stationCode stationId
     * @param direction 方向
     * *//*XczzSjfcrtd*/
    List<XczzSjfcrtd> querySjfcData(Date startTime,Date minusStartTime,Date endTime,Date minusEndTime,String lineCode,
                                    String stationCode,int direction) throws SrvException;
    /**
     * 查询数据计算断面客流量
     * @param time 时间点
     * */
    boolean exists(Date time) throws SrvException;
}
