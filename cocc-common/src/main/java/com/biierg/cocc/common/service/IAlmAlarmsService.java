package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.AlmAlarms;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/8/31.
 */
public interface IAlmAlarmsService {

    /**
     *  根据条件查询综合监控的数据
     *  @param fdNodeName 线路编号
     *  @param fdPriority 报警级别
     *  @param keyword    关键字
     *  @param start      开始时间点
     *  @param end        结束时间点
     * */
    SrvResponse<List<AlmAlarms>> queryAlarms(String fdNodeName,Integer fdPriority, String keyword, Date start, Date end) throws SrvException;
}
