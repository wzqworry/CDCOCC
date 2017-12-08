package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.vo.AtsTrainPositionVO;


/**
 * 基于缓存服务的列车位置查询服务接口
 * 
 * @author lei 
 */
public interface IAtsTrainPositionService {
	
	/**
	 * 列车位置查询接口
	 * 
	 * @param lineId
	 * @return
	 */
	public List<AtsTrainPositionVO> getTrainPosition(String lineId);
	
	/**
	 * 清除某条线的列车位置数据
	 * 
	 * @param lineId
	 */
	public void clearTrainPosition(String lineId);
}
