/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.DutyGroupPerson;
import com.biierg.cocc.common.bean.GenMailList;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;

/**
 * Created by wzq on 2017/4/5.
 */
public interface IDutyGroupPersonService extends IBaseService<DutyGroupPerson, String> {
    /**
     *  根据班组id 查询班组、岗位、人员信息
     */
    List<DutyGroupPerson> queryAllInfo(String groupId,String personId) throws SrvException;

    /**
     * 添加班组下面的一批人员
     *
     * @param dutyGroupPersonList 人员列表
     * @return boolean
     * @throws SrvException 后台服务异常
     */
    boolean insertGroupPerson(List<DutyGroupPerson> dutyGroupPersonList) throws SrvException;

    /**
     * 根据班组id 查询班组下面所有人员
     *
     * @param groupId 班组id
     */
    List<DutyGroupPerson> queryByGroupId(String groupId, String deptId) throws SrvException;

    /**
     * 根据 groupId 、deptId 查询人员
     *
     * @param groupId 班组id
     * @param deptId  岗位id
     * @param yesOrNo 可以选或已选 0：已选  1：可选
     * @return 人员列表
     * @throws SrvException 后台服务异常
     */
    List<GenMailList> queryPersonByGroupIdAndDeptId(String groupId, String deptId, int yesOrNo) throws SrvException;

    /**
     * 删除 班组id 的所有记录
     *
     * @param groupId 班组id
     * @param deptId  岗位id
     * @return boolean
     * @throws SrvException 后台服务异常
     */
    boolean removeByGroupId(String groupId, String deptId) throws SrvException;

    /**
     * 删除 班组id 的所有记录
     * */
    boolean removeById(String id) throws SrvException;
}
