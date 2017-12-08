/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.WeatherWarning;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/5/5.
 */
public interface IWeatherWarningService {
    /**
     * 查询气象预警信息
     * @param warnId 气象标识id
     * @param keyword
     * */
    SrvResponse<List<WeatherWarning>> queryWeather(String warnId,Integer state,String keyword,
                                                   Date startTime,Date endTime) throws SrvException;


    /**
     * 根据主键查找气象预警信息
     * @param id 主键ID
     */
    public WeatherWarning find(String id) throws SrvException;

}
