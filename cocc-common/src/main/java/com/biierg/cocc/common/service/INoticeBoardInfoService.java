package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.NoticeBoardInfo;
import com.biierg.cocc.common.support.SrvException;

/** 
 * @Title: INoticeBoardInfoService 
 * @Description: 公告信息接口
 * @author: wxs
 * @date: 2017年11月24日 上午10:47:00  
 */
public interface INoticeBoardInfoService {
	
	/**  
	* @Title: queryNoticeBoardInfo  
	* @Description:查询公告信息
	* @return
	* @throws SrvException List<NoticeBoardInfo>      
	* @throws  
	*/ 
	public List<NoticeBoardInfo> queryNoticeBoardInfo()throws SrvException;
	
}
