/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.model.subway;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * 站点配置数据模型
 * 
 * <station code="0101" name="韦家碾" pinyin="weijianian" color="ff0000" visible=
 * "true" disable="false" x="100" y="100">
 * <label top="" bottom="" left="" right="" rotate="" fontSize="" color=""/>
 * </station>
 * 
 * @author lei
 */
public class Station implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code; // 站点编码
	private String name; // 名称
	private String shortName; //站名简称
	private String pinyin; // 拼音

	private String color; // 颜色
	private String fillColor; // 填充色

	private int radius; // 半径
	private int x; // 坐标 X
	private int y; // 坐标 Y

	private Label label; // 该站点的文字标签

	private boolean visible; // 是否可见
	private boolean disabled; // 是否禁用

	private String appName;  //app站名
	private boolean istransfer; //是否换乘
	private String transferLine; //换乘线路
	private String transColor; // 换乘线路颜色="68d1d7"

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public boolean isIstransfer() {
		return istransfer;
	}

	public void setIstransfer(boolean istransfer) {
		this.istransfer = istransfer;
	}

	public String getTransferLine() {
		return transferLine;
	}

	public void setTransferLine(String transferLine) {
		this.transferLine = transferLine;
	}

	public String getTransColor() {
		return transColor;
	}

	public void setTransColor(String transColor) {
		this.transColor = transColor;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
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
	 * @return the color
	 */
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
	 * @return the fillColor
	 */
	public String getFillColor() {
		return fillColor;
	}

	/**
	 * @param fillColor the fillColor to set
	 */
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	/**
	 * @return the visible
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * @param visible
	 *            the visible to set
	 */
	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	/**
	 * @return the disabled
	 */
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
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @param radius
	 *            the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
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

	/**
	 * @return the label
	 */
	public Label getLabel() {
		return label;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(Label label) {
		this.label = label;
		this.label.setText(this.getName());
	}

	public static class Label implements Serializable {
		private static final long serialVersionUID = 1L;

		private String text; // 站点文字标签
		private String color; // 站点文字标签颜色
		private String fontSize; // 站点文字标签颜色

		private int rotate; // 站点文字角度

		private Double top; // 上
		private Double bottom; // 下
		private Double left; // 左
		private Double right; // 右

		/**
		 * @return the text
		 */
		public String getText() {
			return text;
		}

		/**
		 * @param text
		 *            the text to set
		 */
		public void setText(String text) {
			this.text = text;
		}

		/**
		 * @return the color
		 */
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
		 * @return the fontSize
		 */
		public String getFontSize() {
			return fontSize;
		}

		/**
		 * @param fontSize
		 *            the fontSize to set
		 */
		public void setFontSize(String fontSize) {
			this.fontSize = fontSize;
		}

		/**
		 * @return the rotate
		 */
		public int getRotate() {
			return rotate;
		}

		/**
		 * @param rotate
		 *            the rotate to set
		 */
		public void setRotate(int rotate) {
			this.rotate = rotate;
		}

		/**
		 * @return the top
		 */
		@XmlAttribute
		public Double getTop() {
			return top;
		}

		/**
		 * @param top
		 *            the top to set
		 */
		public void setTop(Double top) {
			this.top = top;
		}

		/**
		 * @return the bottom
		 */
		@XmlAttribute
		public Double getBottom() {
			return bottom;
		}

		/**
		 * @param bottom
		 *            the bottom to set
		 */
		public void setBottom(Double bottom) {
			this.bottom = bottom;
		}

		/**
		 * @return the left
		 */
		@XmlAttribute
		public Double getLeft() {
			return left;
		}

		/**
		 * @param left
		 *            the left to set
		 */
		public void setLeft(Double left) {
			this.left = left;
		}

		/**
		 * @return the right
		 */
		@XmlAttribute
		public Double getRight() {
			return right;
		}

		/**
		 * @param right
		 *            the right to set
		 */
		public void setRight(Double right) {
			this.right = right;
		}
	}
}
