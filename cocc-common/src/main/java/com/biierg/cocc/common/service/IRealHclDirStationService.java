/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.RealHclDirStation;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;
import java.util.Map;

/**
 * Created by wzq on 2017/6/22.
 * 线路实时分方向换乘量
 */
public interface IRealHclDirStationService {
    /**
     * 大屏 重点换乘站分方向换乘量监察  (实时数据)
     * */
    public List<RealHclDirStation> queryRealHclDirStation(String timeGrade) throws SrvException;

    /**
     * 大屏 重点换乘站经过线路换乘量监察  (实时数据)
     * */
    public List<RealHclDirStation> queryRealHclDirLine(String stationName,String timeGrade) throws SrvException;

}
