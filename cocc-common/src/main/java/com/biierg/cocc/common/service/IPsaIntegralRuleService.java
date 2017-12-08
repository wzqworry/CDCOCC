package com.biierg.cocc.common.service;

import org.springframework.web.bind.annotation.RequestParam;

import com.biierg.cocc.common.bean.PsaIntegralRule;

/**
* @ClassName IPsaIntegralRuleService
* @Description 积分规则 实现接口
* @author yayi.sun
* @date 2017年11月29日 上午11:20:54
*/
public interface IPsaIntegralRuleService {
	
	/**
	 * 查询 积分规则 
	 * @return PsaIntegralRule实体对象
	 */
	public PsaIntegralRule queryIntegralRule() throws Exception;
	
	/**
	 * 新增或修改积分规则 实体
	 * @param content
	 * @return 
	 */
	public boolean addOrUpdateIntegralRule(String content) throws Exception;
}
