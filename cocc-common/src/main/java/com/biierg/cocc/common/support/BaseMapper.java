/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

import java.util.List;

/**
 * 实现基础CRUD功能的Mapper
 * 
 * @author lei
 */
public interface BaseMapper<T, K> {

	/**
	 * 保存（新增）实体
	 * 
	 * @param bean
	 */
	public int create(T bean);

	/**
	 * 保存（更新）实体
	 * 
	 * @param bean
	 */
	public int update(T bean);

	/**
	 * 根据主键查找实体
	 * 
	 * @param pkid
	 *            主键ID
	 * @return
	 */
	public T find(K pkid);

	/**
	 * 获取全部实体
	 * 
	 * @return
	 */
	public List<T> list();

	/**
	 * 移除指定主键的实体
	 * 
	 * @param pkid
	 */
	public int remove(K pkid);
}
