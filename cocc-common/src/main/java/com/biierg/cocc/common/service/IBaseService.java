/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.support.SrvException;

/**
 * 实现基础CRUD功能的服务接口
 * 
 * @author lei
 */
public interface IBaseService<T, K> {

	/**
	 * 保存（新增）实体
	 * 
	 * @param bean
	 */
	public boolean create(T bean) throws SrvException;

	/**
	 * 保存（更新）实体
	 * 
	 * @param bean
	 */
	public boolean update(T bean) throws SrvException;

	/**
	 * 根据主键查找实体
	 * 
	 * @param pkid
	 *            主键ID
	 * @return
	 */
	public T find(K pkid) throws SrvException;

	/**
	 * 获取全部实体
	 * 
	 * @return
	 */
	public List<T> list() throws SrvException;

	/**
	 * 移除指定主键的实体
	 * 
	 * @param pkid
	 */
	public boolean remove(K pkid) throws SrvException;
}
