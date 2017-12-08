package com.biierg.cocc.common.service;

import java.util.List;
import java.util.Map;

import com.biierg.cocc.common.bean.IpsSafeDays;
import com.biierg.cocc.common.bean.LedConfiguration;
import com.biierg.cocc.common.support.SrvException;


/**
 * led配置接口
 * @author wenjuan.wang 2017/8/23
 *
 */
public interface ILedConfigurationService {
	/**
	 * 查询LED配置
	 * @param param
	 * @return
	 */
    public List<LedConfiguration> getLedConf(Map<String,Object> param) throws SrvException;
    
    /**
     * 插入一条记录
     * @param bean
     * @return
     */
    public int insertLedConf(LedConfiguration bean) throws SrvException;
    
    /**
     * 更新
     * @param bean
     * @return
     */
    public int updateLedConf(LedConfiguration bean) throws SrvException;
    
    /**
     * 删除
     * @param param
     * @return
     * @throws SrvException 
     */
    public int deleteLedConf(List<String> ledConfIdList) throws SrvException;
    
    /**
     * 立即发送LED模板
     * @param bean
     * @return
     * @throws SvException
     */
    public String applyNowLedMode(LedConfiguration bean) throws SrvException;
    
    //安全运营天数
    /**
	 * 查询
	 * @param param
	 * @return
	 */
    public List<IpsSafeDays> getSafeDays(Map<String,Object> param) throws Exception;
    
    /**
     * 插入一条记录
     * @param bean
     * @return
     */
    public int insertSafeDays(IpsSafeDays bean) throws Exception;
        
    /**
     * 删除
     * @param param
     * @return
     */
    public int deleteSafeDays() throws Exception;
}
