/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.ScrScene;
import com.biierg.cocc.common.support.SrvException;

/**
 * 大屏控制服务
 *
 * @author lei
 */
public interface IScrService {

	/**
	 * SRV20001 - 获取布局模式列表
	 *
	 * @param scrId
	 *            大屏ID
	 * @return
	 * @throws SrvException
	 */
	public List<ScrScene> getSceneList(String scrId) throws SrvException;

	/**
	 * SRV20003 - 通知大屏切换至指定的“模式”
	 *
	 * @param scrId
	 *            大屏ID
	 * @param sceneId
	 *            布局模式ID
	 * @return 处理结果；0-成功，1-失败，2-大屏控制器连接超时，3-大屏控制器未正确响应，4-未知错误
	 * @throws SrvException
	 */
	public int showScene(String scrId, String sceneId) throws SrvException;

	/**
	 * SRV20005 - 获取当前布局模式
	 *
	 * @param scrId
	 *            大屏ID
	 * @return
	 * @throws SrvException
	 */
	public ScrScene getCurrentScene(String scrId) throws SrvException;
}
