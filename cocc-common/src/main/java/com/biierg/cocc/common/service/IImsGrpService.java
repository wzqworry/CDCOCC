/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.BaseImsCamera;
import com.biierg.cocc.common.bean.ImsGroup;

import java.util.List;

/**
 * 信息组团系统中 IMS编组服务接口
 *
 * @author wen.ding
 * @date 2017/3/4 18:56.
 */
public interface IImsGrpService  {

    /**
     * 保存（新增）实体
     *
     * @param bean
     */
    public boolean create(ImsGroup bean) throws Exception;

    /**
     * 保存（更新）实体
     *
     * @param bean
     */
    public boolean update(ImsGroup bean) throws Exception;

    /**
     * 根据主键查找实体
     *
     * @param pkid 主键ID
     * @return
     */
    public ImsGroup find(String pkid) throws Exception;

    /**
     * SRV43001 - （分条件）查询所有编组
     *
     * @param displayType 类型；必选，0:整页显示 1：分页显示
     * @param status      使用状态；必选，0：正常使用， 1：停用， 其他：全部
     * @param keyWords    搜索关键字；可选，默认查询所有
     * @param orderType   排序规则；必选，0：按应用状态（先正常，后停用），1：按创建时间
     * @return List<ImsGroup> 编组列表
     */
    List<ImsGroup> list(Integer displayType, Integer status, String keyWords, Integer orderType) throws Exception;


    /**
     * SRV43003 - 删除编组（批量）
     *
     * @param dateSectionList 编组id列表；必选
     * @return Boolean是否删除成功
     */
    boolean remove(List<String> dateSectionList) throws Exception;

    /**
     * SRV43006 - 查询某编组下的摄像头
     *
     * @param imsGrpId      编组id：必选
     * @param selectedOrNot 已选（0）或未选（1）：必选
     * @return 摄像头列表
     */
    List<BaseImsCamera> getImsCameraListSelectedOrNot(String imsGrpId, Integer selectedOrNot) throws Exception;

    /**
     * SRV43007 - 更新编组摄像头
     *
     * @param imsGrpId    编组id
     * @param cameraList  摄像头列表（包含id和序号）
     * @param addOrRemove 新增或者移除（0：新增 1：移除）
     * @return boolean
     */
    boolean updateImsCameraList(String imsGrpId, List<String> cameraList, Integer addOrRemove) throws Exception;
}
