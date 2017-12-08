package com.biierg.cocc.common.service;

/**
 * Created by wzq on 2017/9/5.
 */
@Deprecated
public interface IUeditorUploadService {
    /**
     * 上传文件
     * */
    String uploadFile(byte[] fileByte);
    /**
     * 根据唯一的名字获取文件
     * */
    byte[] downloadFile(String file);
}
