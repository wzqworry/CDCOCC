package com.biierg.cocc.common.service;

import java.util.Date;
import java.util.List;

import com.biierg.cocc.common.bean.XczzNotes;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

/**
 * 重要记事服务
 * @author LK
 *
 */
public interface IXczzNotesService extends IBaseService<XczzNotes, String>{
	
	/**
	 * 获取重要记事列表
	 * @param keyWord
	 * @return 
	 */
	public SrvResponse<List<XczzNotes>> queryNotes(Date start,Date end,String keyWord) throws SrvException;
	
	/**
	 * 查询最大的pd_Index
	 * @return
	 * @throws SrvException
	 */
	public XczzNotes queryMaxIndex() throws SrvException;
	
	

}
