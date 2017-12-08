/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.EmerDrillPlans;
import com.biierg.cocc.common.support.SrvException;

/**
 * 突发事件(演练) 和 预案服务
 * @author wzq
 *	
 */
public interface IEmerDrillPlansService extends IBaseService<EmerDrillPlans,String> {

	/**
	 * 返回突发事件关联的所有选中的预案
	 * @param emerId 突发事件Id
	 * @return List<EmerDrillPlans> 所有执行的预案
	 */
	List<EmerDrillPlans> listByEmerId(String emerId) throws SrvException;
	
	/**
	 * 获取突发事件正在执行的预案id
	 * @param emerId 突发事件Id
	 * @return EmerDrillPlans 正在执行的预案
	 */
	EmerDrillPlans getExecute(String emerId) throws SrvException;
}
