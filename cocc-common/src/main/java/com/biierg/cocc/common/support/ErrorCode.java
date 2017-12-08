/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

/**
 * 错误码
 *
 * @author wen.ding
 */
public enum ErrorCode {

    // =====================================================================
    // 系统级错误码
    // =====================================================================
    SYS_error("10001", "System error 系统错误！"),

    // =====================================================================
    // 服务级错误代码
    // =====================================================================
    // 符合型
    SRV_PARAM_isNull("20101", "请求参数为空！"),
    SRV_PARAM_invalid("20102", "请求参数无效！"),

    // 通用请求
    SRV_REQUEST_create("20201", "增加失败！"),
    SRV_REQUEST_createBatch("20202", "批量增加失败！"),
    SRV_REQUEST_remove("20203", "删除失败！"),
    SRV_REQUEST_removeBatch("20204", "批量删除失败！"),
    SRV_REQUEST_update("20205", "修改失败！"),
    SRV_REQUEST_find("20206", "查询失败！"),
    SRV_REQUEST_list("20207", "查询列表失败！"),

    // =====================================================================
    // TODO 业务请求错误代码
    //    注意：
    //      1.系统会默认处理错误码在 30000-40000（含头不含尾） 之间的错误信息（提醒给客户端），请使用者根据实际需求进行设置；
    // =====================================================================
    // 提醒


    // 不提醒
    SRV_REQUEST_sendMsg("40000", "消息发送失败！"),
    SRV_REQUEST_sendSms("40002", "短信发送失败！"),
    SRV_REQUEST_replaceVars("40003", "替换动态运营数据失败！"),
    SRV_REQUEST_import("40004", "导入文件失败！"),
    SRV_REQUEST_exchangeAtx("40005", "切换ats线路失败！"),
    SRV_REQUEST_createTimer("40006", "新建定时任务失败！"),


    END("", "");

    // ============================  华丽分割线  ======================================
    // 成员变量
    private String code;
    private String errorKey;

    ErrorCode(String code, String errorKey) {
        this.setCode(code);
        this.setErrorKey(errorKey);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrorKey() {
        return errorKey;
    }

    public void setErrorKey(String errorKey) {
        this.errorKey = errorKey;
    }

    @Override
    public String toString() {
        return "[" + this.code + "]" + this.errorKey;
    }
}
