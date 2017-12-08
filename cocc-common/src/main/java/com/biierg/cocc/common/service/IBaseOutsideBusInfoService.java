package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.BaseOutsideBusInfo;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;

/**
 * Created by wzq on 2017/9/15.
 * 站点出入口周边公交信息 -- 服务接口
 */
public interface IBaseOutsideBusInfoService {

    /**
     * 新增
     *
     * @param bean
     */
    public boolean create(BaseOutsideBusInfo bean) throws SrvException;

    /**
     * 更新
     *
     * @param bean
     */
    public boolean update(BaseOutsideBusInfo bean) throws SrvException;

    /**
     * 根据站名查询 出入口信息
     *
     * @param stationName 站名
     * @return
     */
    public List<BaseOutsideBusInfo> find(String stationName) throws SrvException;

    /**
     * 根据主键 查询出入口信息（判断重复）
     * @param bean 站名
     * @return true为重复,false 不重复
     */
    public boolean findById(BaseOutsideBusInfo bean) throws SrvException;

    /**
     * 删除数据
     */
    public void removeAll() throws SrvException;


    public void removeMuti() throws SrvException;
}
