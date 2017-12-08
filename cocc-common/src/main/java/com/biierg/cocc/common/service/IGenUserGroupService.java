/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;


import java.util.List;

import com.biierg.cocc.common.bean.GenUserGroup;
import com.biierg.cocc.common.support.SrvException;

/**
 * 用户组接口
 * @author wwj
 *
 */

public interface IGenUserGroupService {
	/**
	 * 查询用户组
	 * @param ugID
	 * 		用户组ID，可空
	 * @param ugName
	 * 		用户组名称，可空
	 * @param userID
	 * 		用户组创建人ID，可空
	 * @return
	 */
	public List<GenUserGroup> queryGenUserGroupList(String ugID, String ugName, String userID)  throws Exception;
	
	/**
	 * 增加用户组
	 * @param bean
	 * @return
	 * @throws SrvException
	 */
	public boolean createUGlist(GenUserGroup bean) throws Exception;
	
	/**
	 * 更新用户组
	 * @param bean
	 * @return
	 * @throws SrvException
	 */
	public boolean updateUGlist(GenUserGroup bean) throws Exception;
	
	/**
	 * 删除用户组
	 * @param pkid
	 * @return
	 * @throws SrvException
	 */
	public boolean deleteUGlist(String pkid) throws Exception;

}
