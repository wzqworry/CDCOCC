/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.model.subway;

import java.io.Serializable;

/**
 * 路径节点类
 * 
 * @author lei
 */
public class Node implements Serializable {
	private static final long serialVersionUID = 1L;

	private String type;
	private int x, y;
	
	public Node() {}

	public Node(String type, int x, int y) {
		this.type = type;
		this.x = x;
		this.y = y;
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
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public Node clone() {
		return new Node(type, x, y);
	}
}
