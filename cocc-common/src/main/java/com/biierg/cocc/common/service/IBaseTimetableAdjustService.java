package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.BaseTimetableAdjust;
import com.biierg.cocc.common.bean.BaseTimetableAdjustRemark;

/**
 * 首末班车调整 接口
 * 
 * Created by dw on 2017/10/20.
 */
public interface IBaseTimetableAdjustService {
	
	/**
	 * 新增一条时刻表变更记录
	 * 
	 * @param timetableAdjust
	 * @return
	 * @throws Exception
	 */
	public boolean create(BaseTimetableAdjust timetableAdjust)throws Exception;
	
	/**
	 * 批量新增时刻表变更记录
	 * 
	 * @param timetableAdjustList
	 * @return
	 * @throws Exception
	 */
	public boolean createBatch(List<BaseTimetableAdjust> timetableAdjustList)throws Exception;
	
	/**
	 * 更新一条时刻表记录
	 * 
	 * @param timetableAdjust
	 * @return
	 * @throws Exception
	 */
	public boolean update(BaseTimetableAdjust timetableAdjust)throws Exception;
	
	/**
	 * 删除一条时刻表变更记录
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public boolean remove(String id)throws Exception;
	
	/**
	 * 查询时刻表变更记录列表
	 * 
	 * @param timetableAdjust
	 * @return
	 * @throws Exception
	 */
	public List<BaseTimetableAdjust> list(BaseTimetableAdjust timetableAdjust)throws Exception;

	/**
	 * 根据id查询首末班时刻调整
	 * @param id
	 * @return
	 */
	public BaseTimetableAdjust find(String id)throws Exception;

	/**
	 *  批量删除时刻表调整记录
	 *  
	 * @param timeTableIdList
	 * @return
	 */
	public boolean removeBatch(List<String> timeTableIdList)throws Exception;

	/**
	 * 新增一条时刻表调整公告记录
	 * 
	 * @param timetableAdjustRemark
	 * @return
	 */
	public boolean createRemark(BaseTimetableAdjustRemark timetableAdjustRemark)throws Exception;
	 
}
