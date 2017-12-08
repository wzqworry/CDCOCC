/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.util;

import java.io.Serializable;

/**
 * @author Lei
 */
public class WxConstants implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 微信消息类型
	 * 
	 * @author Lei
	 */
	public static abstract class MsgType implements Serializable {
		private static final long serialVersionUID = 1L;
		
		public static final String TEXT = "text"; // 文本消息
		public static final String IMAGE = "image"; // 图片消息
		public static final String VOICE = "voice"; // 语音消息
		public static final String VIDEO = "video"; // 视频消息
		public static final String MUSIC = "music"; // 音乐消息
		public static final String NEWS = "news"; // 图文消息
		
		public static final String EVENT = "event"; // 事件推送

		public static final String LOCATION = "location"; // 地理位置消息
		public static final String LINK = "link"; // 链接消息
	}
	
	/**
	 * 微信事件类型
	 * 
	 * @author Lei
	 */
	public static abstract class EventType implements Serializable {
		private static final long serialVersionUID = 1L;
		
		public static final String SUBSCRIBE = "subscribe"; // 关注/订阅事件
		public static final String UNSUBSCRIBE = "unsubscribe"; // 取消关注/取消订阅事件
		public static final String SCAN = "scan"; // 用户已关注时的，扫描带参数二维码事件
		public static final String LOCATION = "location"; // 上报地理位置事件
		public static final String CLICK = "click"; // 点击菜单拉取消息时的事件推送
		public static final String VIEW = "view"; // 点击菜单跳转链接时的事件推送
	}
}
