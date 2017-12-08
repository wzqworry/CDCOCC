package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.AppVersion;
import com.biierg.cocc.common.support.SrvException;

/**
 * @author wxs App版本升级接口
 */
public interface IAppVersionService {

	/**
	 * 加载所有的版本记录
	 * 
	 * @return
	 */
	public List<AppVersion> list();

	/**
	 * 根据平台类型，查询最新版本号
	 * 
	 * @param platformType
	 * @return
	 */
	public List<AppVersion> queryAppVersion(String platformType) throws SrvException;

	/**
	 * 查询版本信息
	 * 
	 * @param platformType
	 * @return
	 * @throws SrvException
	 */
	public AppVersion getAppVersionInfo(String platformType) throws SrvException;

	/**
	 * 增加一条app版本记录
	 *
	 * @param appVersion
	 *            版本记录
	 * @return boolean
	 */
	public boolean create(AppVersion appVersion) throws Exception;

	/**
	 * 删除一条app版本记录（根据id）
	 *
	 * @param id
	 *            记录id
	 * @return boolean
	 */
	public boolean remove(String id) throws Exception;

	/**
	 * 批量删app版本记录
	 * 
	 * @param idListt
	 * @return
	 */
	public boolean removeBatch(List<String> idListt) throws Exception;
}
