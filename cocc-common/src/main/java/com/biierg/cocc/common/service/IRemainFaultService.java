package com.biierg.cocc.common.service;

import java.util.Date;
import java.util.List;

import com.biierg.cocc.common.bean.RemainFault;
import com.biierg.cocc.common.bean.XczzNotes;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

public interface IRemainFaultService extends IBaseService<RemainFault, String> {
	
	/**
	 * 查询遗留故障
	 * @return SrvResponse
	 */
	public SrvResponse<List<RemainFault>> queryFault(Date start,Date end,String keyword) throws SrvException;
	
	/**
	 * 查询最大的pd_Index
	 * @return
	 * @throws SrvException
	 */
	public RemainFault queryMaxIndex() throws SrvException;

}
