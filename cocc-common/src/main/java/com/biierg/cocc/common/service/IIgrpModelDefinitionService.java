/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.IgrpItem;
import com.biierg.cocc.common.bean.IgrpModel;
import com.biierg.cocc.common.support.SrvException;

import java.util.Date;
import java.util.List;

/**
 * 信息组团系统 - 组团模式服务接口
 *
 * @author wen.ding
 * @date 2017/3/1  16:29
 */
public interface IIgrpModelDefinitionService {

    /**
     * SRV41001 -查询所有组团模式
     *
     * @param displayType 类型；必选，0:整页显示 1：分页显示
     * @param status      使用状态；必选，0：正常使用， 1：停用， 其他：全部
     * @param keyWords    搜索关键字；可选，默认查询所有
     * @param orderType   排序规则；必选，0：按应用状态（先正常，后停用），1：按创建时间
     * @return 模式列表List<IgrpModel>
     */
    List<IgrpModel> getIgrpModelList(Integer displayType, Integer status, String keyWords, Integer orderType) throws Exception;

    /**
     * SRV41002 - 根据id查询组团模式
     *
     * @param id 组团模式id：必选
     * @return 组团模式实体对象
     */
    IgrpModel getIgrpModel(String id) throws Exception;

    /**
     * SRV41003 - 增加组团模式
     */
    boolean addIgrpModel(IgrpModel igrpModel) throws Exception;

    /**
     * SRV41004 - 删除组团模式
     *
     * @param igrpModelIdList 组团模式id列表；必选
     * @param user            用户ID；必选
     * @return Boolean是否删除成功
     */
    boolean deleteIgrpModels(List<String> igrpModelIdList, String user) throws Exception;

    /**
     * SRV41005 - 修改组团模式
     *
     * @param igrpModel
     * @return Boolean是否修改成功
     */
    boolean updateIgrpModel(IgrpModel igrpModel) throws Exception;


    /**
     * SRV41006 - 查询某组团模式下的组团项
     *
     * @param user          用户id：必选
     * @param id            组团模式id：必选
     * @param selectedOrNot 已选（0）或未选（1）：必选
     * @return 组团项实体列表
     */
    List<IgrpItem> getIgrpModelItemListSelectedOrNot(String user, String id, Integer selectedOrNot) throws Exception;

    /**
     * SRV41007 - 更新组团模式组团项
     *
     * @param user           用户id
     * @param igrpModelId    组团模式id
     * @param igrpItemIdList 组团项id列表
     * @param addOrRemove    新增或者移除（0：新增 1：移除）
     * @return boolean
     */
    boolean updateModelItems(String user, String igrpModelId, List<String> igrpItemIdList, Integer addOrRemove) throws Exception;


    /**
     * 获取当前时间匹配的组团模式
     *
     * @param currentTime 当前时间
     * @return 组团模式实体对象
     */
    List<IgrpModel> getCurrentIgrpModel(Date currentTime) throws Exception;
}
