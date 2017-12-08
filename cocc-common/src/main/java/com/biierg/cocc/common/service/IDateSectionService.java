/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.DateSection;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;

/**
 * 信息组团系统 - 日期段管理服务接口
 *
 * @author wen.ding
 * @date 2017/3/1  9:24
 */
public interface IDateSectionService {

    /**
     * 保存（新增）实体
     *
     * @param bean
     */
    public boolean create(DateSection bean) throws Exception;

    /**
     * 保存（更新）实体
     *
     * @param bean
     */
    public boolean update(DateSection bean) throws Exception;

    /**
     * 根据主键查找实体
     *
     * @param pkid 主键ID
     * @return
     */
    public DateSection find(String pkid) throws Exception;

    /**
     * SRV42005 - （分条件）查询所有时期段
     *
     * @param displayType 类型；必选，0:整页显示 1：分页显示
     * @param status      使用状态；必选，0：正常使用， 1：停用， 其他：全部
     * @param keyWords    搜索关键字；可选，默认查询所有
     * @param orderType   排序规则；必选，0：按应用状态（先正常，后停用），1：按创建时间
     * @return List<DateSection> 日期段列表(缓存)
     * @throws SrvException 后台服务异常
     */
    List<DateSection> list(Integer displayType, Integer status, String keyWords, Integer orderType) throws Exception;

    /**
     * SRV42007 - 删除时期段(批量)
     *
     * @param dateSectionList 日期段ID列表；必选
     * @return Boolean是否删除成功
     * @throws SrvException 后台服务异常
     */
    boolean delete(List<String> dateSectionList) throws Exception;
}
