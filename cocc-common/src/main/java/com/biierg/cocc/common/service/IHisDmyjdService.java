/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.HisDmyjd;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/3/22.
 */
public interface IHisDmyjdService {
    /**
    *   查询指定线路所有断面指定时刻的 线路拥挤度
     *   @param lineId  必填
     *   @param timeDate 必填
     *   @param timeGrade 必填 时间粒度
     *   @param specialTime 指定时刻，为空则查询最新记录
    * */
    public SrvResponse<List<HisDmyjd>> queryHisDmyjd(String timeDate,String timeGrade, Date specialTime, String lineId) throws SrvException;
    
    /**
     *   查询指定线路所有断面指定时刻的拥挤度
      *   @param lineId  可选
      *   @param endTime 可选
      *   @param timeGrade 可选 时间粒度
     * */
	public SrvResponse<List<HisDmyjd>> queryDmYjdList(Date endTime,
			String timeGrade, String lineId);

    Date queryMaxTime(String timeGrade);

    /**
     * 新增记录
     * */
    boolean create(HisDmyjd hisDmyjd);

    boolean createBatch(List<HisDmyjd> hisDmyjdList);

}
