/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.model.subway;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * 图标
 * 
 * @author lei
 */
@Deprecated
public class MapIcon implements Serializable {
	private static final long serialVersionUID = 1L;

	public static enum IconType {
		Label, // 文字
		Image; // 图片
	}

	private IconType type;

	private String label;
	private String color;

	private String imageurl;

	private float x;
	private float y;

	/**
	 * @return the type
	 */
	@XmlAttribute
	public IconType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(IconType type) {
		this.type = type;
	}

	/**
	 * @return the label
	 */
	@XmlAttribute
	public String getLabel() {
		return label;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the color
	 */
	@XmlAttribute
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the imageurl
	 */
	@XmlAttribute
	public String getImageurl() {
		return imageurl;
	}

	/**
	 * @param imageurl the imageurl to set
	 */
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	/**
	 * @return the x
	 */
	@XmlAttribute
	public float getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	@XmlAttribute
	public float getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(float y) {
		this.y = y;
	}
}
