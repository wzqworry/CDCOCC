/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

/**
 * WEB 服务异常（系统模块级）
 *
 * @author wen.ding
 */
public class WebException extends GlobalException {
    private static final long serialVersionUID = 1L;

    /**
     * 构造方法：指定业务模块 可捕获异常
     *
     * @param errorCode 错误码（包含code 和 errorKey ）
     * @param e         异常对象
     */
    public WebException(ErrorCode errorCode, GlobalException e) {
        super(errorCode, e.getMessage(), e.getParameters());
    }

    /**
     * 构造方法：指定业务模块 未捕获异常
     *
     * @param errorCode 错误码（包含code 和 errorKey ）
     * @param e         异常对象
     */
    public WebException(ErrorCode errorCode, Exception e) {
        super(errorCode, e.getMessage(), null);
    }

}
