/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import com.biierg.cocc.common.apiutil.ApiResult;
import com.biierg.cocc.common.support.SrvException;

/**
 * 短信发送与转发相关服务
 *
 * @author wen.ding
 * @date 2017/4/11 8:33
 * @email dingwenbj@foxmail.com
 */
public interface ISmsService {
	
    /**
     * 发送白名单短信
     *
     * @param mobiles     手机号码数组 最大5000
     * @param smsContent  发送短信内容
     * @param smsPriority 短信优先级，取值1-5，填其余值，系统默认选择1, 1最低，5最高
     * @param msgGroup    发送数据批次号，32位世界上唯一编码，分辨短信的状态报告批次，建议填写。
     * @param isMo        是否需要上行，True代表需要；false代表不需要。  目前云MAS平台默认推送上行
     * @return API 响应
     * @throws SrvException 后台服务异常
     */
    public ApiResult sendProtectedSms(String[] mobiles, String smsContent, int smsPriority, String msgGroup, boolean isMo) throws Exception;
}
