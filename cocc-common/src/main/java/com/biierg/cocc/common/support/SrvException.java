/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

/**
 * 后台服务异常
 * 注意：
 * 1.捕获接口实现内部产生的 GlobalException 和 Exception 之后，同意包装为此类异常，抛出
 *
 * @author lei
 */
public class SrvException extends GlobalException {
    private static final long serialVersionUID = 1L;


    /**
     * 构造方法：指定业务模块 可捕获异常
     *
     * @param errorCode 错误码（包含code 和 errorKey ）
     * @param e         异常对象
     */
    public SrvException(ErrorCode errorCode, GlobalException e) {
        super(errorCode, e.getMessage(), e.getParameters());
    }

    /**
     * 构造方法：指定业务模块 未捕获异常
     *
     * @param errorCode 错误码（包含code 和 errorKey ）
     * @param e         异常对象
     */
    public SrvException(ErrorCode errorCode, Exception e) {
        super(errorCode, e.getMessage(), null);
    }


    /**
     * todo 不建议这样使用，因为不能定位到具体的错误类型，请参考其他的构造方法
     * 构造方法，仅包含异常详细信息
     *
     * @param description e.getMessage
     */
    public SrvException(String description) {
        super(ErrorCode.SYS_error, description, null);
    }
}
