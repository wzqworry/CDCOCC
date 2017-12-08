/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

/**
 * 底层异常：业务异常（一线员工）
 *
 * @author wen.ding
 */
public class BizException extends GlobalException {
    private static final long serialVersionUID = 1L;

    /**
     * 构造方法：调用自己的接口( 是否提醒看捕获到的异常内部如何定义 )
     *
     * @param errorCode 错误码（包含code 和 errorKey ）
     * @param e         异常详细信息
     */
    public BizException(ErrorCode errorCode, Exception e) {
        super(errorCode, e.getMessage(), null);
    }


    /**
     * 构造方法：程序未按照预期执行的业务异常( 可设置是否提醒 )
     *
     * @param errorCode 错误码（包含code 和 errorKey ）
     */
    public BizException(ErrorCode errorCode) {
        super(errorCode, null, null);
    }

}
