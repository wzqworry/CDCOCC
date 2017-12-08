package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.vo.IpsMessageVo;
import com.biierg.cocc.common.vo.IpsOperationEventToLineVo;

/**
 * @author wxs
 *
 */
public interface IOperatDynamicService {
	/**
	 * 获取运营动态接口
	 * 
	 * @return
	 */
	public List<IpsMessageVo> queryOperatDynamic()throws SrvException;
	
	/**
	 * 根据线路ID获取运营调整内容接口
	 * @return
	 * @throws SrvException
	 */
	public List<IpsOperationEventToLineVo> queryOperatByLineCode(String lineCode)throws SrvException;
}
