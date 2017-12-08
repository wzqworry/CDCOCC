/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

import com.biierg.cocc.common.json.JacksonHelper;

/**
 * 用户于接收微信平台推送消息的值对象
 * 
 * @author lei
 */
public class WechatPushMsg implements Serializable {
	private static final long serialVersionUID = 1L;

	private static JacksonHelper jsonHelper = JacksonHelper.newInstance();

	protected String openid; // 用户id

	/*********************************************** URL验证参数集 Begin */
	protected String signature; // 微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。
	protected String timestamp; // 时间戳
	protected String nonce; // 随机数
	protected String echostr; // 随机字符串
	protected String token; // 用户填写的Token
	/************************************************* URL验证参数集 End */

	/********************************************************************/
	/************************************************** 消息参数集 Begin */
	protected String toUserName; // 开发者微信号
	protected String fromUserName; // 发送方帐号（一个OpenID）
	protected String createTime; // 消息创建时间 （整型）
	protected String msgType; // 消息类型
	protected String content; // 文本消息内容
	protected String msgId; // 消息id，64位整型
	/**************************************************** 消息参数集 End */

	/********************************************************************/
	/*********************************************** 事件消息参数集 Begin */

	// 事件类型
	// SUBSCRIBE(订阅/关注)、UNSUBSCRIBE(取消订阅/取消关注)、
	// SUBSCRIBE(未关注时，扫描二维码并关注)、SCAN(已关注时，扫描二维码)
	// LOCATION(上报地理位置)
	// CLICK(点击自定义菜单)、VIEW(点击菜单跳转链接)
	protected String event;
	protected String eventKey; // 事件KEY值
	protected String ticket; // 二维码的ticket，可用来换取二维码图片
	protected String latitude; // 地理位置纬度
	protected String longitude; // 地理位置经度
	protected String precision; // 地理位置精度

	/************************************************* 事件消息参数集 End */


	@Override
	public String toString() {
		return "[" + hashCode() + "]" + jsonHelper.toJson(this);
	}

	/**
	 * @return the openid
	 */
	public String getOpenid() {
		return openid;
	}

	/**
	 * @param openid the openid to set
	 */
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	/**
	 * @return the signature
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * @param signature the signature to set
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the nonce
	 */
	public String getNonce() {
		return nonce;
	}

	/**
	 * @param nonce the nonce to set
	 */
	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	/**
	 * @return the echostr
	 */
	public String getEchostr() {
		return echostr;
	}

	/**
	 * @param echostr the echostr to set
	 */
	public void setEchostr(String echostr) {
		this.echostr = echostr;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the toUserName
	 */
	public String getToUserName() {
		return toUserName;
	}

	/**
	 * @param toUserName the toUserName to set
	 */
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	/**
	 * @return the fromUserName
	 */
	public String getFromUserName() {
		return fromUserName;
	}

	/**
	 * @param fromUserName the fromUserName to set
	 */
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	/**
	 * @return the createTime
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the msgType
	 */
	public String getMsgType() {
		return msgType;
	}

	/**
	 * @param msgType the msgType to set
	 */
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the msgId
	 */
	public String getMsgId() {
		return msgId;
	}

	/**
	 * @param msgId the msgId to set
	 */
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	/**
	 * @return the event
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * @param event the event to set
	 */
	public void setEvent(String event) {
		this.event = event;
	}

	/**
	 * @return the eventKey
	 */
	public String getEventKey() {
		return eventKey;
	}

	/**
	 * @param eventKey the eventKey to set
	 */
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	/**
	 * @return the ticket
	 */
	public String getTicket() {
		return ticket;
	}

	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the precision
	 */
	public String getPrecision() {
		return precision;
	}

	/**
	 * @param precision the precision to set
	 */
	public void setPrecision(String precision) {
		this.precision = precision;
	}
}
