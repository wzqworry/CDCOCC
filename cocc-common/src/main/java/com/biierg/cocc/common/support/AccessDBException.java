/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

/**
 * 底层异常：访问数据库异常（一线员工）
 *
 * @author wen.ding
 */
public class AccessDBException extends GlobalException {
    private static final long serialVersionUID = 1L;

    /**
     * 构造方法：主动捕获并抛出
     *
     * @param errorCode 错误码（包含code 和 errorKey ）
     * @param e         捕获的异常
     */
    public AccessDBException(ErrorCode errorCode, Exception e) {
        super(errorCode, e.getMessage(), null);
    }

}
