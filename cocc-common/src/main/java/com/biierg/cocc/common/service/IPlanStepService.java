/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.PlanStep;
import com.biierg.cocc.common.bean.PlanStepIgrpItem;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

/**
 * 预案措施数字化服务
 * 
 * @author lei
 */
public interface IPlanStepService extends IBaseService<PlanStep, String> {

	/**
	 * SRV32021 - 搜索符合条件的预案措施信息
	 * 
	 * @param planId
	 *            预案ID；必填
	 * @param category
	 *            措施类别；可选，默认查询所有类别
	 * @param phaseFlag
	 *            阶段标记；可选，默认查询所有
	 * @param keyword
	 *            搜索关键字；可选，默认查询所有
	 * @return SrvResponse<List<PlanStep>>
	 * @throws SrvException
	 */
	public SrvResponse<List<PlanStep>> getPlanStepInfo(String planId, Integer category, Integer phaseFlag,
			String keyword) throws SrvException;
    /**
     * 根据parentId 查找阶段下的所有要点
     * @param parentId
     * @return List<PlanStep>
    * */
	public List<PlanStep> getChildSteps(String parentId) throws SrvException;

	/**
	 * 根据parentId 查找planId下所有阶段和要点
	 * @param planId
	 * @return List<PlanStep>
	 * */
	public List<PlanStep> findByPlanId(String planId) throws SrvException;

	/**
	 * 根据parentId 查找planId下所有阶段
	 * @param planId
	 * @return List<PlanStep>
	 * */
	public List<PlanStep> findParseByPlanId(String planId) throws SrvException;

    /**
     * 根据planId下所有阶段和关联的组团项
     * @param planId
     * @return List<PlanStepIgrpItem>
     * */
    public List<PlanStepIgrpItem> findStepJoinIgrp(String planId) throws SrvException;

}
