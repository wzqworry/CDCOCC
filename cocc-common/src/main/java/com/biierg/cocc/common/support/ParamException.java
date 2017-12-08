/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

/**
 * 自定义异常：参数异常（一线）
 *
 * @author wen.ding
 */
public class ParamException extends GlobalException {
    private static final long serialVersionUID = 1L;

    /**
     * 构造方法，主动判断（指定ErrorCode）
     *
     * @param errorCode 异常详细信息
     */
    public ParamException(ErrorCode errorCode) {
        super(errorCode, null);
    }

}
