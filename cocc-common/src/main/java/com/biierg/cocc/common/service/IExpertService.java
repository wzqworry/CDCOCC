/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.GenExpert;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.List;

/**
 * 专家通讯录接口
 *
 * @author wwj
 */
public interface IExpertService {

    /**
     * 更新专家信息
     */
    public boolean update(GenExpert bean) throws Exception;

    /**
     * 删除专家信息
     */
    public boolean remove(String pkid) throws Exception;


    /**
     * 查找专家列表
     *
     * @param expID   ID号，可空
     * @param expName 专家名字，可空
     * @return
     */
    public List<GenExpert> queryExpertList(String expID, String expName) throws Exception;

    /**
     * 新建专家信息
     *
     * @param bean
     * @return
     */
    public GenExpert createExpert(GenExpert bean) throws Exception;


    /**
     * 搜索专家列表
     *
     * @param genExpert
     * @return 专家列表(缓存)
     * @throws SrvException 后台服务异常
     */
    SrvResponse<List<GenExpert>> getGenExperts(GenExpert genExpert) throws Exception;


}
