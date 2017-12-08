/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.GenUgCorresponding;
import com.biierg.cocc.common.support.SrvException;


/**
 * 用户组与用户绑定操作接口
 *
 * @author wwj
 */
public interface IGenUgCorrService {
    /**
     * 查询人员分组情况
     *
     * @param userID   用户ID，可空
     * @param ugID     用户组ID，可空
     * @return
     * @throws SrvException
     */
    public List<GenUgCorresponding> quaryGenUgCorrList(String ugID, String userID) throws Exception;

    /**
     * 添加用户到用户组
     *
     * @param bean
     * @return
     */
    public boolean addGenUgCorr(GenUgCorresponding bean) throws Exception;

    ;
    /**
     * 添加用户到用户组（批量）
     *
     * @param beanList
     * @return
     */
    public boolean addGenUgCorrBatch(List<GenUgCorresponding> beanList) throws Exception;

    /**
     * 修改用户所在用户组ID
     *
     * @param bean
     * @return
     */
    public boolean updateGenUgCorr(GenUgCorresponding bean) throws Exception;

    ;

    /**
     * 删除用户组与用户绑定
     *
     * @param userID 用户ID，不可空
     * @param ugID   用户组ID，不可空
     * @return
     */
    public boolean deleteGenUgCorr(String userID, String ugID) throws Exception;

    ;

}
