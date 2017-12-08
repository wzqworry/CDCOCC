/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.HisHclDirStation;
import com.biierg.cocc.common.support.SrvException;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wzq on 2017/6/1.
 * 非实时数据 - 换乘站分方向换乘量 服务接口
 */
public interface IHisHclDirStationService {
    /**
     * 查询线路换乘客流明细
     * @param startTime   开始时间
     * @param endTime     结束时间
     * @param timeGrade   数据粒度
     * @param lineOutId   从那条线路换出
     * @param lineOutDir  换出线路的运行方向
     * @param lineInId    换入到那条线路
     * @param lineInDir   换入线路的运行方向
     * */
    public List<HisHclDirStation> queryHclDirStationDetail(String startDate,String endDate,String startTime,String endTime,String timeGrade,String lineOutId,
                                                           String lineOutDir,String lineInId,String lineInDir) throws SrvException;

    /**
     * 查询线路换乘客流明细 分页
     * @param startDate
     * @param endDate
     * @param startTime
     * @param endTime
     * @param timeGrade
     * @param lineOutId
     * @param lineOutDir
     * @param lineInId
     * @param lineInDir
     * @param pageNum  页码
     * @param pageSize 条数
     * @return
     * @throws SrvException
     */
    public Map<String,Object> queryHclDirStationDetail(String startDate,String endDate,String startTime,String endTime,String timeGrade,String lineOutId,
            String lineOutDir,String lineInId,String lineInDir,Integer pageNum,Integer pageSize) throws SrvException;

    
    /**
     * 计算出由某条换乘到某条  不分方向的换乘量之和（ group by line_out_id,line_in_id,station_name）
     * @param startTime   开始时间
     * @param endTime     结束时间
     * @param timeGrade   数据粒度
     * @param lineOutId   从那条线路换出
     * @param lineInId    换入到那条线路
     * */
    public List<HisHclDirStation> queryHclDirStationSum(Date startTime,Date endTime,String timeGrade,
                                                           String lineOutId,String lineInId) throws SrvException;
}
