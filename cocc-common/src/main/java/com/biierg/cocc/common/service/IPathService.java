/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;
import java.util.Map;
import com.biierg.cocc.common.bean.BaseRoutelib;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.vo.BaseRoutelibVo;

/**
 * 出行路径规划服务
 * 
 * @author lei
 * update by wxs
 */
public interface IPathService {
	List<BaseRoutelib> getTrainlist(Map<String, String> params);
	
 public	List<BaseRoutelibVo>getPathList(String ori_station_name,String dest_station_name)throws SrvException;
}
