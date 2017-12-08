package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.OptFaultDateSetting;
import com.biierg.cocc.common.support.SrvException;

/**
* @ClassName 类名称
* @Description 类描述
* @author yayi.sun
* @date 2017年11月28日 下午5:23:42
*/
public interface IOptFaultDateSettingService {
	/**
	 * 新增
	 * @param fault_date
	 * @param replace_date
	 * @return
	 * @throws SrvException
	 */
	public boolean addSpecifyDate(String fault_date,String replace_date) throws SrvException;
	
	/**
	 * 查询指定日期 使用数据日期
	 * @return
	 */
	public List<OptFaultDateSetting> queryOptFaultDateList(String timeDate) throws SrvException;
}
