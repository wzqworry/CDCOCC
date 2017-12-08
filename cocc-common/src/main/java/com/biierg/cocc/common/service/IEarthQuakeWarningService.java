/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.EarthQuakeWarning;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/5/5.
 * 地震预警信息服务接口
 */
public interface IEarthQuakeWarningService {
    /**
     * 查询地震预警信息 2017/12/05号之后 根据eventId 查询地震预警信息(最新)
     * @param eventId 地震标识id
     * @param startTime
     * @param endTime
     * @param epicenter
     * */
	@Deprecated
    public SrvResponse<List<EarthQuakeWarning>> queryEarthQuake(String eventId,Date startTime,
                                                                Date endTime,String epicenter) throws SrvException;


    /**
     * 根据主键查找地震预警信息
     * @param id 主键ID
     */
    public EarthQuakeWarning find(String id) throws SrvException;
    
    /**
     * 2017/12/05号之后 根据eventId 查询地震预警信息(最新)
     * @param eventId 地震标识id
     * @param startTime
     * @param endTime
     * @param epicenter
     * */
    public SrvResponse<List<EarthQuakeWarning>> queryByEventId(String eventId,Date startTime,
                                                                Date endTime,String epicenter) throws SrvException;
}
