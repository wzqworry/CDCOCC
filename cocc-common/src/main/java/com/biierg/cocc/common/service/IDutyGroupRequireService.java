/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.DutyGroupRequire;
import com.biierg.cocc.common.bean.GenMailList;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;

/**
 * Created by wzq on 2017/4/5.
 */
public interface IDutyGroupRequireService {
    /**
     * 添加班组下面的岗位成员组成
     *
     * @param dutyGroupRequire
     */
    public boolean insertGroupRequire(DutyGroupRequire dutyGroupRequire) throws SrvException;

    /**
     * 更新班组下面的岗位成员组成
     *
     * @param dutyGroupRequire
     */
    public boolean updateGroupRequire(DutyGroupRequire dutyGroupRequire) throws SrvException;

    /**
     * 删除一条岗位记录
     *
     * @param id
     */
    public boolean removeGroupRequire(String id) throws SrvException;

    /**
     * 删除一条岗位记录
     *
     * @param groupId
     * @param deptId
     */
    public boolean removeGroupRequire(String groupId, String deptId) throws SrvException;

    /**
     * 添加班组下面的岗位成员组成
     *
     * @param dutyGroupRequireList
     */
    public boolean insertGroupRequire(List<DutyGroupRequire> dutyGroupRequireList) throws SrvException;

    /**
     * 根据班组id 查询班组下面所有岗位和所需人员
     *
     * @param groupId
     */
    public List<DutyGroupRequire> queryByGroupId(String groupId) throws SrvException;

    /**
     * 删除 班组id 的所有记录
     *
     * @param groupId
     */
    public boolean removeByGroupId(String groupId) throws SrvException;

}
