package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.CmsColumns;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;

/**
 * Created by syy on 2017/8/26.
 */
public interface IBaseColumnService {

    /**
     * 获取栏目树
     * @return
     */
    public List<CmsColumns> getColumnsTree() throws SrvException;

    /**
     * 获取所有栏目列表
     * @return
     */
    public List<CmsColumns> queryAllColumns(String id,String pid,String lable) throws SrvException;

    /**
     * 删除栏目
     * @param colId
     * @return
     */
    public String deleteColumns(String colId) throws SrvException;

    /**
     * 新增
     * @return
     */
    public boolean createColumns(String parentId,String label,int sortnum) throws SrvException;

    /**
     * 修改
     * @return
     */
    public boolean updateColumns(String id,String label,int sortnum) throws SrvException;
}
