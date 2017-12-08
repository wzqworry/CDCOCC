package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.EmergencyPlaceDrill;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;

/**
 * Created by wzq on 2017/7/10.
 */
public interface IEmergencyPlaceDrillService extends IBaseService<EmergencyPlaceDrill,String> {

    /**
     * 根据emerId 查询所有的地点
     * */
    List<EmergencyPlaceDrill> findByEmerId(String emerId) throws SrvException;
}
