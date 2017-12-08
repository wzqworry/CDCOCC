package com.biierg.cocc.common.apiutil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * API响应
 *
 * @author lei
 */
public class ApiResult implements Serializable {
    private static final long serialVersionUID = 1L;

    private int code; // 接口处理结果（0-正常，非0-失败）（以1起头：不提醒用户，以2起头：提醒用户）
    private String message; // 接口处理结果提示信息（正常-OK，失败-错误提示）
    private List returnData; // 返回的数据结果（如果有）；可空
    private int totalDataCount; // 返回的结果记录数
    private long serviceTime; // 后台服务处理完成时间戳（毫秒值）

    public ApiResult() {
    }

    public ApiResult(int code, String message, List returnData, int totalDataCount, long serviceTime) {
        this.code = code;
        this.message = message;
        this.returnData = returnData;
        this.totalDataCount = totalDataCount;
        this.serviceTime = serviceTime;
    }


    /**
     * 处理成功时使用的通用构造器（返回单个对象时）
     *
     * @param returnObj 可为null
     */
    public ApiResult(Object returnObj) {
        this.code = 0;
        this.message = "OK";
        this.returnData = wrap(returnObj);
        this.totalDataCount = 1;
        this.serviceTime = System.currentTimeMillis();
    }


    /**
     * 处理成功时使用的通用构造器（返回单个对象时）
     *
     * @param message 提示
     * @param object  单个实体对象
     */
    public ApiResult(String message, Object object) {
        this(0, message, transToList(object), 1, System.currentTimeMillis());
    }


    /**
     * 处理成功时使用的通用构造器（返回列表时）
     *
     * @param returnData 可为null
     */
    public ApiResult(List returnData) {
        this(0, "OK", returnData, returnData != null ? returnData.size() : 0, System.currentTimeMillis());
    }

    /**
     * 处理成功时使用的通用构造器（返回列表时）
     *
     * @param message    提示
     * @param returnData 对象列表，可为null
     */
    public ApiResult(String message, List returnData) {
        this(0, message, returnData, returnData != null ? returnData.size() : 0, System.currentTimeMillis());
    }

    /**
     * 处理成功或失败时使用的通用构造器（对用户操作的反馈）
     *
     * @param code    错误码
     * @param message 错误提示
     */
    public ApiResult(int code, String message) {
        this(code, message, null, 0, System.currentTimeMillis());
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List getReturnData() {
        return returnData;
    }

    public void setReturnData(List returnData) {
        this.returnData = returnData;
    }

    public int getTotalDataCount() {
        return totalDataCount;
    }

    public void setTotalDataCount(int totalDataCount) {
        this.totalDataCount = totalDataCount;
    }

    public long getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(long serviceTime) {
        this.serviceTime = serviceTime;
    }


    private List<Object> wrap(Object... datas) {
        List<Object> returnAry = new ArrayList<>();

        if (datas != null && datas.length > 0) {
            for (Object data : datas) {
                returnAry.add(data);
            }
        }

        return returnAry;
    }

    private static List<Object> transToList(Object object) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(object);
        return list;
    }

}
