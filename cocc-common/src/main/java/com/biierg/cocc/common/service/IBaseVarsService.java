/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.IpsMessage;
import com.biierg.cocc.common.model.vars.IpsVarConfig;
import com.biierg.cocc.common.model.vars.IpsVarsMap;
import com.biierg.cocc.common.support.SrvException;
import com.biierg.cocc.common.support.SrvResponse;

import java.util.List;

/**
 * 全局变量服务接口
 *
 * @author wen.ding
 */

public interface IBaseVarsService {

    /**
     * 替换文本中的变量为具体数值（多条文本）
     *
     * @param textList 文本列表
     * @return
     * @throws SrvException
     */
    public List<String> replaceVars2RealData(List<String> textList) throws Exception;

    /**
     * 替换文本中的变量为具体数值（一条文本）
     *
     * @param text 文本列表
     * @return
     * @throws SrvException
     */
    public String replaceVars2RealData(String text) throws Exception;


    /**
     * 获取变量列表
     *
     * @return
     * @throws SrvException
     */
    public List<IpsVarConfig> getVarsList() throws Exception;

}
