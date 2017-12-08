/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.IgrpItem;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.List;

/**
 * 信息组团系统 - 组团项管理服务接口
 * Created by wen.ding on 2017/2/27.
 */
public interface IIgrpItemService {

    // SRV42002 - 新增组团项
    public boolean create(IgrpItem igrpItem) throws Exception;

    // SRV42004 - 修改组团项
    public boolean update(IgrpItem igrpItem) throws Exception;

    // SRV42013 - 根据id查询组团项
    public IgrpItem find(String id) throws Exception;

    /**
     * SRV42001 - （分条件）查询所有组团项
     *
     * @param displayType 类型；必选，0:整页显示 1：分页显示
     * @param status      使用状态；必选，0：正常使用， 1：停用， 其他：全部
     * @param keyWords    搜索关键字；可选，默认查询所有
     * @param orderType   排序规则；必选，0：按应用状态（先正常，后停用），1：按创建时间
     * @return List<IgrpItem> 组团项列表(缓存)
     * @throws SrvException 后台服务异常
     */
    public List<IgrpItem> list(Integer displayType, Integer status, String keyWords, Integer orderType) throws Exception;

    /**
     * SRV42003 - 删除组团项
     *
     * @param igrpItemList 组团项ID列表；必选
     * @return Boolean是否删除成功
     * @throws SrvException 后台服务异常
     */
    public boolean delete(List<String> igrpItemList) throws Exception;

    /**
     * 根据组团的名字获取组团项
     */
    IgrpItem findByName(String name) throws Exception;

}
