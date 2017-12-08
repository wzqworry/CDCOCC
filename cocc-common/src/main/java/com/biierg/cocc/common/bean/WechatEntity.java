/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import com.biierg.cocc.common.json.JacksonHelper;

/**
 * @author Lei
 */
public class WechatEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final JacksonHelper jackson = JacksonHelper.newInstance();

	/**
	 * ACCESS_TOKEN
	 * 
	 * @author lei
	 */
	public static class AccessToken implements Serializable {
		private static final long serialVersionUID = 1L;

		private String token;
		private long expMillions;
		
		public AccessToken(String token, long expMillions) {
			this.token = token;
			this.expMillions = expMillions;
		}
		
		public boolean isExpired() {
			return this.expMillions <= System.currentTimeMillis();
		}

		/**
		 * @return the token
		 */
		public String getToken() {
			return token;
		}

		/**
		 * @param token
		 *            the token to set
		 */
		public void setToken(String token) {
			this.token = token;
		}

		/**
		 * @return the expMillions
		 */
		public long getExpMillions() {
			return expMillions;
		}

		/**
		 * @param expMillions
		 *            the expMillions to set
		 */
		public void setExpMillions(long expMillions) {
			this.expMillions = expMillions;
		}
	}

	/**
	 * 自定义菜单数据模型
	 * 
	 * @author lei
	 */
	public static class CustomMenu implements Serializable {
		private static final long serialVersionUID = 1L;

		private String type;
		private String name;
		private String key;
		private String url;

		private List<CustomMenu> sub_button;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public List<CustomMenu> getSub_button() {
			return sub_button;
		}

		public void setSub_button(List<CustomMenu> sub_button) {
			this.sub_button = sub_button;
		}
	}

	/**
	 * 微信平台响应模型
	 * 
	 * @author lei
	 */
	@SuppressWarnings("rawtypes")
	public static class Response extends HashMap {
		private static final long serialVersionUID = 1L;

		public String getString(String key) {
			return containsKey(key) ? get(key).toString() : null;
		}

		public Integer getInteger(String key) {
			return containsKey(key) ? (Integer) get(key) : 0;
		}

		public String getOpenid() {
			return getString("openid");
		}

		public String getAccess_token() {
			return getString("access_token");
		}

		public Integer getExpires_in() {
			return getInteger("expires_in");
		}

		public Integer getErrcode() {
			return getInteger("errcode");
		}

		public String getErrmsg() {
			return getString("errmsg");
		}

		@Override
		public String toString() {
			return jackson.toJson(this);
		}
	}
}
