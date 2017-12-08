package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * @Title: NoticeBoardInfo
 * @Description: 公告信息实体类
 * @author: wxs
 * @date: 2017年11月24日 上午11:42:42
 */
public class NoticeBoardInfo implements Serializable {

	private final static long serialVersionUID = 1L;
	private String content; // 消息内容

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
