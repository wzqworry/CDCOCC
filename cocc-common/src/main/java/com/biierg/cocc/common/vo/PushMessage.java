/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 推送消息
 * 
 * @author lei
 */
public class PushMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<String> memberIds; // 会员ID列表

	private List<String> tokens; // 推送消息token列表

	private int badge; // 消息气泡数
	private String sound; // 消息提示音

	private String type; // 消息类型
	private String message; // 消息内容

	public PushMessage() {
	}

	/**
	 * @param memberIds
	 *            会员ID列表
	 * @param type
	 *            （announcement:公告栏，limit:限流）参见
	 *            com.biierg.cocc.common.util.Constants.PushMessageType
	 * @param message
	 *            消息内容
	 * @param badge
	 *            消息气泡数（适用于IOS）
	 * @param sound
	 *            播放声音（适用于IOS）
	 */
	public PushMessage(List<String> memberIds, String type, String message, int badge, String sound) {
		this.memberIds = memberIds;
		this.type = type;
		this.message = message;
		this.badge = badge;
		this.sound = sound;
	}

	/**
	 * @return the memberIds
	 */
	public List<String> getMemberIds() {
		return memberIds;
	}

	/**
	 * @param memberIds
	 *            the memberIds to set
	 */
	public void setMemberIds(List<String> memberIds) {
		this.memberIds = memberIds;
	}

	/**
	 * @return the tokens
	 */
	public List<String> getTokens() {
		return tokens;
	}

	/**
	 * @param tokens
	 *            the tokens to set
	 */
	public void setTokens(List<String> tokens) {
		this.tokens = tokens;
	}

	/**
	 * @return the badge
	 */
	public int getBadge() {
		return badge;
	}

	/**
	 * @param badge
	 *            the badge to set
	 */
	public void setBadge(int badge) {
		this.badge = badge;
	}

	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}

	/**
	 * @param sound
	 *            the sound to set
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
