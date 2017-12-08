/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.apiutil.ApiResult;
import com.biierg.cocc.common.bean.GenMailList;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;

/**
 * 通讯录接口
 *
 * @author wwj
 */

public interface GenMailListService {
    /**
     * 创建插入通讯录人员
     */
    public boolean create(GenMailList bean) throws Exception;

    /**
     * 删除通讯录人员
     */
    public boolean remove(String pkid) throws Exception;

    /**
     * 根据id查询
     */
    public GenMailList find(String pkid) throws Exception;

    /**
     * 查询通讯录（不含已删除的用户）
     *
     * @return 符合条件的人员或参数全部为空时返回所有通讯录人员
     * @throws SrvException
     */

    public List<GenMailList> queryMailList(GenMailList genMailList) throws Exception;

    /**
     * 更新通讯录
     *
     * @param bean
     * @return
     * @throws SrvException
     */
    public GenMailList updateMailList(GenMailList bean) throws Exception;

    /**
     * 查询通讯录（含已删除的用户，用于页面输入时比较）
     *
     * @return
     * @throws SrvException
     */
    public List<GenMailList> queryMailListD(GenMailList genMailList) throws Exception;

    /**
     * 数据同步：（用户数据）完成 [外部导入] 数据与 [本地] 数据的同步
     *
     * @param genMailListsToCreate
     * @param genMailListToDelete
     * @param genMailListsToUpdate
     * @return
     */
    ApiResult synchronizeUserInfoCRU(List<GenMailList> genMailListsToCreate, List<GenMailList> genMailListToDelete, List<GenMailList> genMailListsToUpdate) throws Exception;

}
