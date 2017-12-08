/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.PlanScene;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

/**
 * 预案场景数字化服务
 * 
 * @author lei
 */
public interface IPlanSceneService extends IBaseService<PlanScene, String> {


	/**
	 * 保存（新增）实体
	 *
	 * @param planScene
	 */
	 boolean insert(PlanScene planScene) throws SrvException;

	 boolean removeList(List<PlanScene> planSceneList) throws SrvException;

	/**
	 * SRV32011 - 搜索符合条件的预案场景信息
	 * 
	 * @param parentId
	 *            父场景ID
	 * @param leafFlag
	 *            末级场景标记
	 * @param keyword
	 *            搜索关键字；可选，默认查询所有
	 * @return SrvResponse<List<PlanScene>>
	 * @throws SrvException
	 */
	public SrvResponse<List<PlanScene>> getPlanSceneInfo(String parentId, Integer leafFlag, String keyword)
			throws SrvException;

	/**
	 * SRV32011 - 搜索符合条件的预案场景信息
	 *
	 * @param leafFlag
	 *            末级场景标记
	 * @param id
	 *            排除掉的id
	 * @return SrvResponse<List<PlanScene>>
	 * @throws SrvException
	 */
	public SrvResponse<List<PlanScene>> getFitPlanScene(Integer leafFlag, String id,String parentId) throws SrvException;

	/**
	 * 已知 parentId  查询下一级的子节点
	 * @param parentId
	 */
	public List<PlanScene> getChildren(String parentId)
			throws SrvException;

	/**
	 * 已知 sceneId  查询所有的子节点(包括所有的子、孙)
     * @param sceneId
	 */
    public List<PlanScene> getAllChildren(String sceneId)
            throws SrvException;
	/**
	 * 已知 sceneId  查询所有的父辈（包括父辈的父辈）
     * @param sceneId
	 */
    public List<PlanScene> getAllParents(String sceneId)
            throws SrvException;

}
