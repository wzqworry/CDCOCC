package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.BaseOutsideInfo;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;

/**
 * Created by wzq on 2017/9/15.
 * 站点出入口周边信息 -- 服务接口
 */
public interface IBaseOutsideInfoService {

    /**
     * 保存（新增）实体
     *
     * @param bean
     */
    public boolean create(BaseOutsideInfo bean) throws SrvException;

    /**
     * 保存（更新）实体
     *
     * @param bean
     */
    public boolean update(BaseOutsideInfo bean) throws SrvException;

    /**
     * 根据主键查找实体
     *
     * @param stationName 站名
     * @return
     */
    public List<BaseOutsideInfo> find(String stationName) throws SrvException;

    /**
     * 根据主键 查询出入口信息（判断重复）
     * @param bean 站名
     * @return true为重复,false 不重复
     */
    public boolean findById(BaseOutsideInfo bean) throws SrvException;

    /**
     * 删除数据
     */
    public void removeAll() throws SrvException;
}
