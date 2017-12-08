/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.apiutil.ApiResult;
import com.biierg.cocc.common.bean.GenOrganization;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;

/**
 * 组织机构信息管理服务接口
 * 
 * @author lei
 */
public interface IOrgService{

	/**
	 * 根据id查询
	 */
	public GenOrganization find(String pkid) throws Exception;

	/**
	 * 获取集团公司组织机构树
	 * 
	 * @return
	 */
	public List<GenOrganization> getGrpCompanyOrgTree() throws Exception;
	
	/**
	 * 获取所有组织机构列表(不含带删除标记的)
	 */
	public List<GenOrganization> queryOrgList(String orgID, String orgName, String pID, String delMark) throws Exception;
	
	/**
	 * 获取所有组织机构列表(包含带删除标记的)
	 * @return
	 */
	public List<GenOrganization> queryOrgListD(String orgID, String orgName, String pID, String delMark) throws Exception;
	
	/**
	 * 删除组织机构
	 * @param orgID
	 * @return
	 */
	public boolean deleteOrg(String orgID) throws Exception;
	
	/**
	 * 增加组织机构
	 * @return
	 */
	public boolean createOrglist(GenOrganization org) throws Exception;
	
	/**
	 * 更新组织机构
	 * @param orgID
	 * @param orgName
	 * @return
	 */
	public boolean updateOrg(String orgID, String orgName) throws Exception;


	/**
	 * 根据机构名字查询机构信息
	 *
	 * @param orgName
	 * @return
	 * @throws SrvException
	 */
	public GenOrganization queryByName(String orgName) throws Exception;


	/**
	 * 数据同步：（机构数据）完成 [外部导入] 数据与 [本地] 数据的同步
	 *
	 * @param genOrganizationListToCreate
	 * @param genOrganizationListToDelete
	 * @param genOrganizationListYoUpdate
	 * @return
	 */
	public ApiResult synchronizeOrzInfoCRU(
			List<GenOrganization> genOrganizationListToCreate, List<GenOrganization> genOrganizationListToDelete,
			List<GenOrganization> genOrganizationListYoUpdate) throws Exception;

}
