/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.DutyTurn;
import com.biierg.cocc.common.bean.DutyTurnRule;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.Date;
import java.util.List;

/**
 * 排班规则管理 服务接口
 * Created by wzq on 2017/4/10.
 */
public interface IDutyTurnRuleService extends IBaseService<DutyTurnRule, String> {

    /**
     * @param keyword   关键字
     */
    SrvResponse<List<DutyTurnRule>> listDutyTurnRule(String keyword) throws SrvException;

}
