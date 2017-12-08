/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.Date;
import java.util.List;

import com.biierg.cocc.common.bean.TerminalBuildSch;
import com.biierg.cocc.common.bean.XczzNotes;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;
/**
 * Created by lk on 2017/8/15.
 */
public interface ITerminalBuildSchService extends IBaseService<TerminalBuildSch, String> {
	
	/**
	 * 查询施工计划
	 * @return
	 * @throws SrvException
	 */
	public SrvResponse<List<TerminalBuildSch>> queryBuildScheme(Date start,Date end,String keyword) throws SrvException;
	
	/**
	 * 查询最大的pd_Index
	 * @return
	 * @throws SrvException
	 */
	public TerminalBuildSch queryMaxIndex() throws SrvException;

}
