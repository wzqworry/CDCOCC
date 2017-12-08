package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.DataForecast;

/**
 * Created by wzq on 2017/8/3.
 * 预测数据的服务
 */
public interface IDataForecastService {
    /**
     * 创建预测数据
     * */
    boolean create(DataForecast dataForecast);
}
