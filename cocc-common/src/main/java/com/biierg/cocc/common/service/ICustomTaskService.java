package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.CustomTask;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * Created by wzq on 2017/7/6.
 * 自定义任务的服务 （包括创建任务、查询任务、修改任务状态内容、删除任务）
 */
public interface ICustomTaskService  extends IBaseService<CustomTask, String> {

    /**
     *  查询指定用户某天的所有的任务
     *  @param creator 创建人id 不能为空
     *  @param startTime
     *  @param endTime
     *  @param taskUrgency 任务紧急程度
     *  @param taskState 任务状态
     */
    SrvResponse<List<CustomTask>> queryCustomTask(String creator, Date startTime, Date endTime,
                                                  Integer taskUrgency, Integer taskState) throws SrvException;


}
