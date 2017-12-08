/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.AlgorithmConfig;
import com.biierg.cocc.common.support.SrvException;

/**
 * Created by wzq on 2017/5/10.
 * 算法配置的服务接口
 */
public interface IAlgorithmConfigService {
    /**
     * 1.新增配置 只要有一条记录即可，id 默认为1
     * */
    public boolean insertAlgorithm(AlgorithmConfig algorithmConfig) throws SrvException;
    /**
     * 2.查找配置 根据默认id 1，查找配置是否存在
     * */
    public AlgorithmConfig queryAlgorithm(String id) throws SrvException;
    /**
     * 3.更新配置  更新这条id 为1的记录
     * */
    public boolean updateAlgorithm(AlgorithmConfig algorithmConfig) throws SrvException;
}
