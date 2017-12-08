/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.model.subway;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 车站图标
 * 
 * @author lei
 */
@Deprecated
public class MapStation implements Serializable {
	private static final long serialVersionUID = 1L;

	public static enum StationType {
		Station("station"), // 普通车站
		Transfer("transfer"), // 换乘站
		Transfer3("transfer3"); // 三线换乘站

		private String realm;

		private StationType(String realm) {
			this.realm = realm;
		}

		@Override
		public String toString() {
			return this.realm;
		}
	}

	private StationType type; // 车站类型

	private String[] lineCodes; // 经过此站的线路编码

	private String name; // 车站名称
	private String pinyin; // 名称拼音

	private String[] colors; // 颜色列表

	private int rotate;//站点文字角度

	private float x;
	private float y;

	private boolean disabled; // 是否禁用

	private Float top; // 上
	private Float bottom; // 下
	private Float left; // 左
	private Float right; // 右

	/**
	 * @return the type
	 */
	@XmlAttribute
	public StationType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(StationType type) {
		this.type = type;
	}
	
	/**
	 * @return the lineCodes
	 */
	@JsonIgnore
	@XmlAttribute(name = "lineCodes")
	public String getLineCodesString() {
		
		StringBuffer buf = new StringBuffer();
		if (lineCodes != null) {
			for (String s : lineCodes) {
				buf.append(s + ",");
			}
			
			return buf.toString().replaceFirst("\\,$", "");
		}
		
		return null;
	}

	/**
	 * @return the lineCodes
	 */
	@XmlTransient
	public String[] getLineCodes() {
		return lineCodes;
	}

	/**
	 * @param lineCodes
	 *            the lineCodes to set
	 */
	public void setLineCodes(String[] lineCodes) {
		this.lineCodes = lineCodes;
	}

	/**
	 * @return the name
	 */
	@XmlAttribute
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the pinyin
	 */
	@XmlAttribute
	public String getPinyin() {
		return pinyin;
	}

	/**
	 * @param pinyin
	 *            the pinyin to set
	 */
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	/**
	 * @return the colors
	 */
	@JsonIgnore
	@XmlAttribute(name = "colors")
	public String getColorsString() {
		
		StringBuffer buf = new StringBuffer();
		if (colors != null) {
			for (String s : colors) {
				buf.append(s + ",");
			}
			
			return buf.toString().replaceFirst("\\,$", "");
		}
		
		return null;
	}

	/**
	 * @return the colors
	 */
	@XmlTransient
	public String[] getColors() {
		return colors;
	}

	/**
	 * @param colors
	 *            the colors to set
	 */
	public void setColors(String[] colors) {
		this.colors = colors;
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

	/**
	 * @return the disabled
	 */
	@XmlAttribute
	public boolean isDisabled() {
		return disabled;
	}

	/**
	 * @param disabled
	 *            the disabled to set
	 */
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	/**
	 * @return the top
	 */
	@XmlAttribute
	public Float getTop() {
		return top;
	}

	/**
	 * @param top
	 *            the top to set
	 */
	public void setTop(Float top) {
		this.top = top;
	}

	/**
	 * @return the bottom
	 */
	@XmlAttribute
	public Float getBottom() {
		return bottom;
	}

	/**
	 * @param bottom
	 *            the bottom to set
	 */
	public void setBottom(Float bottom) {
		this.bottom = bottom;
	}

	/**
	 * @return the left
	 */
	@XmlAttribute
	public Float getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(Float left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	@XmlAttribute
	public Float getRight() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(Float right) {
		this.right = right;
	}

	public int getRotate() {
		return rotate;
	}

	public void setRotate(int rotate) {
		this.rotate = rotate;
	}
}
