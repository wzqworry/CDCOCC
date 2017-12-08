/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.HisHclStation;
import com.biierg.cocc.common.bean.HisJzlStation;
import com.biierg.cocc.common.bean.HisSelfCountStation;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/3/29.
 */
public interface IHisHclStationService  {
	
	   /**
     * 查询车站 的 换乘量  topN
     * @param lineId  可空 为空查询整个线网
     * @param timeGrade 时间粒度  必填
     * @param timeDate 日期
     * @param topN  前n名
     * @return  SrvResponse<List<HisJzlStation>>
     * */
    public SrvResponse<List<HisHclStation>> queryTopHisHcl(String lineId, String timeGrade, String timeDate, Integer topN) throws SrvException;

}
