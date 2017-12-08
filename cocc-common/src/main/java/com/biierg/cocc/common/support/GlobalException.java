/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

import com.biierg.cocc.common.util.StringUtil;

/**
 * 统一处理的异常
 * <p>
 * 注意事项：
 * 1.异常码分两级，“系统模块  -->  业务模块”
 * 2.最底层的异常（第一次抛出的异常），需要携带code + errorKey（错误码 + 错误提示），除此以外的异常仅需要提供errorKey（错误提示）
 *
 * @author wen.ding
 */
public class GlobalException extends Exception {
    private static final long serialVersionUID = 1L;

    // e.g. ORDER_FROZEN
    private String code; // 错误码
    private Object[] parameters; // 错误的参数列表


    /**
     * 不应该直接实例化,应该定义子类.
     *
     * @param description 异常详细信息
     * @param parameters  如果没有参数, 可以传 null
     */
    protected GlobalException(ErrorCode errorCode, String description, Object[] parameters) {
        super(errorCode.getErrorKey() + ((StringUtil.isNull(description)) ? "" : (" ==> " + description)));
        this.code = errorCode.getCode();
        this.parameters = parameters;
    }

    /**
     * 不应该直接实例化,应该定义子类.
     *
     * @param parameters 如果没有参数, 可以传 null
     */
    protected GlobalException(ErrorCode errorCode, Object[] parameters) {
        super(errorCode.getErrorKey());
        this.code = errorCode.getCode();
        this.parameters = parameters;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object[] getParameters() {
        return parameters;
    }

    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }

}
