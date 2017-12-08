/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.EmergencyPlace;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;

/**
 * Created by wzq on 2017/3/15.
 */
public interface IEmergencyPlaceService extends IBaseService<EmergencyPlace,String> {

    /**
     * 根据emerId 查询所有的地点
     * */
    List<EmergencyPlace> findByEmerId(String emerId) throws SrvException;
}
