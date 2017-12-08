/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.annotation.GenericLog;
import com.biierg.cocc.common.apiutil.ApiResult;
import com.biierg.cocc.common.bean.GenPost;
import com.biierg.cocc.common.support.SrvException;

public interface IGenPostListService {

    /**
     * 添加岗位
     */
    public boolean create(GenPost bean) throws Exception;

    /**
     * 添加岗位（批量）
     */
    public boolean createBatch(List<GenPost> genPostList) throws Exception;

    /**
     * 修改岗位信息
     */
    public boolean update(GenPost bean) throws Exception;

    /**
     * 删除岗位信息
     */
    public boolean remove(String pkid) throws Exception;

    /**
     * 根据id查询岗位
     */
    public GenPost find(String pkid) throws Exception;

    /**
     * 删除岗位（批量）
     */
    public boolean removeBatch(List<String> genPostList) throws Exception ;

    /**
     * 获取岗位信息（旧）
     *
     * @param postID
     * @param postName
     * @return
     */
    public List<GenPost> queryPostList(String postID, String postName) throws Exception;

    /**
     * 获取岗位信息（新）
     *
     * @param genPost
     * @return
     * @throws SrvException
     */
    List<GenPost> postList(GenPost genPost) throws Exception;

    /**
     * 获取岗位信息（根据岗位名字）
     *
     * @param postName
     * @return
     */
    public GenPost queryByName(String postName) throws Exception;

    /**
     * 数据同步：（岗位数据）完成 [外部导入] 数据与 [本地] 数据的同步
     *
     * @param genPostToCreate
     * @param genPostToDelete
     * @param genPostToUpdate
     * @return
     */
    ApiResult synchronizePostInfoCRU(List<GenPost> genPostToCreate, List<String> genPostToDelete, List<GenPost> genPostToUpdate) throws Exception;

}
