package com.biierg.cocc.common.vo;

import java.io.Serializable;

/**
 * @Title: PsaLostInfoVo
 * @Description: 遗失物品查询
 * @author: wxs
 * @date: 2017年11月24日 下午3:00:56
 */
public class PsaLostGoodsVo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String subject;// 物品名称

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
