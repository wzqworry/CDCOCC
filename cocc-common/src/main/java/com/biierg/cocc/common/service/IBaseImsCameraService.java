/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.apiutil.ApiResult;
import com.biierg.cocc.common.bean.*;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.vo.BaseStationsVo;

import java.util.List;

/**
 * 摄像头信息服务
 *
 * @author wen.ding
 */
public interface IBaseImsCameraService {
    /**
     * 查询摄像头
     *
     * @param baseImsCamera
     * @return
     * @throws SrvException
     */
    public List<BaseImsCamera> queryCameraList(BaseImsCamera baseImsCamera) throws Exception;

    /**
     * 数据同步：（摄像头信息数据）  完成 [外部导入] 数据与 [本地] 数据的同步
     *
     * @param cameraListToCreate
     * @param cameraListToRemove
     * @param cameraListToUpdate
     * @return
     */
    public ApiResult synchronizeCameraInfoCRU(List<BaseImsCamera> cameraListToCreate, List<BaseImsCamera> cameraListToRemove, List<BaseImsCamera> cameraListToUpdate) throws Exception;

    /**
     * 获取设备列表树
     *
     * @return
     */
    public List<BaseImsCameraTree> getImsCameraTree(String imsGrpId, Integer selectedOrNot) throws Exception;

    /**
     * 将设备数据以树的结构形式备份到另一张表
     *
     * @return
     */
    public boolean preData4ProduceCameraTree() throws Exception;

}
