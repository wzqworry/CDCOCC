package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.GisPlan;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;

/**
 * Created by wzq on 2017/8/17.
 * gis 演练plan和setp的关联查询（只进行关联查询）
 */
public interface IGisPlanAndStepService  {

    List<GisPlan> queryPlan(String planId) throws SrvException;
}
