/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.HisKyzzlLine;
import com.biierg.cocc.common.support.SrvException;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/6/1.
 * 线路/线网客运周转量 的后台服务
 */
public interface IHisKyzzlLineService {

    /**
     * 查询线路和线网的平均周转量
     * @param timeGrade  时间粒度
     * @param startTime  开始时间
     * @param endTime    结束时间
     * @param lineId     线路id 不传查询全部
     * */
    public List<HisKyzzlLine> queryAvgZzl(String timeGrade, String startDate,String endDate,String startTime, String endTime, String lineId) throws SrvException;
}
