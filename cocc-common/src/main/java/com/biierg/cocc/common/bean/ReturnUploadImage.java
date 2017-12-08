package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * Created by wzq on 2017/9/5.
 */
public class ReturnUploadImage implements Serializable{
    private final static long serialVersionUID = 1l;
    private String state;//上传状态SUCCESS 一定要大写
    private String url;//上传地址
    private String title;//图片名称demo.jpg
    private String original;//图片名称demo.jpg

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }
}
