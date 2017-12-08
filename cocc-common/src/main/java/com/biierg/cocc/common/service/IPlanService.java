/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.Date;
import java.util.List;

import com.biierg.cocc.common.bean.Plan;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

/**
 * 预案数字化服务
 * 
 * @author lei
 */
public interface IPlanService extends IBaseService<Plan, String> {

	/**
	 * SRV32001 - 搜索符合条件的预案信息
	 * 
	 * @param sceneId
	 *            场景ID；可选，默认查询所有场景
	 * @param planCode
	 *            预案编码；可选，默认查询所有
	 * @param activeFlag
	 *            激活标记；可选，默认查询所有
	 * @param approvalFlag
	 *            审批标记；可选，默认查询所有
	 * @param keyword
	 *            搜索关键字；可选，默认查询所有
	 * @return SrvResponse<List<Plan>>
	 * @throws SrvException
	 */
	SrvResponse<List<Plan>> getPlanInfo(Date startTime,Date endTime,String sceneId, String planCode, Integer activeFlag,
			Integer approvalFlag, String keyword) throws SrvException;
    /**
     * @param sceneIdList 查询所有的
     * @return SrvResponse<List<Plan>>
     * @throws SrvException
    * */
	SrvResponse<List<Plan>> getPlans(List<String> sceneIdList) throws SrvException;

    /**
     * 查询一个预案的全部历史操作
     * @param planId
     * @return List<Plan>
     * */
	List<Plan> queryOnePlan(String planId) throws SrvException;
	
	/**
     * 根据planId查询一个预案的最新数据
     * @param planId
     * */
	Plan queryNewestPlan(String planId) throws SrvException;
}
