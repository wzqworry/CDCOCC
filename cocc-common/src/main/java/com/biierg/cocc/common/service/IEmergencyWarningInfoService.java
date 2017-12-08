package com.biierg.cocc.common.service;
/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */

import java.util.Date;
import java.util.List;

import com.biierg.cocc.common.bean.EmergencyWarningInfo;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

/**
 * 预警信息服务接口
 * 
 * @author lei
 */
public interface IEmergencyWarningInfoService extends IBaseService<EmergencyWarningInfo, String> {

	/**
	 * SRV30001 - 获取预警信息列表
	 * 
	 * @param source
	 *            具体系统来源
	 * @param type 预警类型
	 * @param level 预警级别
	 * @param publishState 发布状态
     * @param approvalState 审核状态
     * @param keyWord 关键字
     * @param startTime 开始时间
     * @param endTime 结束时间
	 * @return SrvResponse<List<EmergencyWarningInfo>>
	 */
	public SrvResponse<List<EmergencyWarningInfo>> queryWarningInfo(Integer source,
               Integer type, Integer level, String publishState, Integer approvalState, String keyWord, Date startTime, Date endTime) throws SrvException;
	/**
	 * 获取指定warnId的全部信息列表
	 * @param  warnId 预警Id
	 * @param  SrcType 预警类型
	 * @return List<EmergencyWarningInfo>
	 * @throws SrvException
	 */
	public List<EmergencyWarningInfo> queryOneWarning(String warnId,Integer SrcType) throws SrvException;

	/**
	 * 获取指定warnId的最后一条记录
	 * @param  warnId 预警Id
	 * @return EmergencyWarningInfo
	 * @throws SrvException
	 */
	public EmergencyWarningInfo queryNewestWarning(String warnId) throws SrvException;
	
	/**
	 * 批量的发布/撤销预警信息（实际的操作是创建一条最新的数据）
	 * @param  infoList List<EmergencyWarningInfo> 多条
	 * @return boolean
	 * @throws SrvException
	 */
	 Boolean createList(List<EmergencyWarningInfo> infoList,String publisher) throws SrvException;
	
}
