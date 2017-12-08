package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.IpsMessage;
import com.biierg.cocc.common.bean.WeiboResponse;

/**
 * 微博相关接口服务
 *
 * @author LK
 */
public interface IWeiboService {
    /**
     * 发送微博消息
     *
     * @param msg
     */
    public WeiboResponse pushGrpMessage(IpsMessage msg);
//
//    /**
//     * 群发消息
//     * 接口调用请求说明： URL：https://m.api.weibo.com/2/messages/sendall.json?access_token=ACCESS_TOKEN
//     *
//     * @param ipsMessage    消息内容
//     * @param accordingType 发送依据：1，根据分组  2，根据UID列表
//     */
//    public WeiboResponse sendAll(IpsMessage ipsMessage, int accordingType) throws SrvException;

}
