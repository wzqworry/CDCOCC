/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.ThresholdConfig;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.List;

/**
 * Created by wzq on 2017/5/11.
 */
public interface IThresholdConfigService extends IBaseService<ThresholdConfig, String>{
    /**
     * 根据条件查询阈值
     * @param type
     * @param state
     */
    public SrvResponse<List<ThresholdConfig>> queryThresholdConfig(String type,Integer state) throws SrvException;
}
