/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

/**
 * 自定义异常：Redis异常（一线）
 *
 * @author wen.ding
 */
public class RedisException extends GlobalException {
    private static final long serialVersionUID = 1L;

    /**
     * 构造方法：程序未按照预期执行的异常（默认无提示）
     *
     * @param errorCode 错误码（包含code 和 errorKey ）
     */
    public RedisException(ErrorCode errorCode) {
        super(errorCode, null, null);
    }

}
