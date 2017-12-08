/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import org.apache.http.client.methods.CloseableHttpResponse;

import java.io.Serializable;

/**
 * 返回前端的参数
 *
 * @author LK
 */
public class WeiboResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String code;//接口处理结果
    private String message;//接口处理结果提示信息
    private String url;//跳转登录界面的url

    public WeiboResponse(String code, String message, String url) {
        this.code = code;
        this.message = message;
        this.url = url;
    }

    public WeiboResponse(CloseableHttpResponse execute) {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
