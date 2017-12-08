/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.model.subway;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.biierg.cocc.common.util.StringUtil;

/**
 * 图标
 * 
 * @author lei
 */
public class Icon implements Serializable {
	private static final long serialVersionUID = 1L;

	private String type; // label/image/sprite

	private String label;
	private String color;
	private String alpha;
	private String fontSize;

	private String weight; // type=sprite时，此属性有效
	private String path; // type=sprite时，此属性有效

	private String imageurl;

	private int rotate; // 角度
	private int x;
	private int y;

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
	 * @return the label
	 */
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
	 * @return the alpha
	 */
	public String getAlpha() {
		return alpha;
	}

	/**
	 * @param alpha
	 *            the alpha to set
	 */
	public void setAlpha(String alpha) {
		this.alpha = alpha;
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
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path
	 *            the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
	
	/**
	 * 将字符串格式的路径转换成节点列表
	 * 
	 * @return
	 */
	public List<Node> getPathNodes() {
		List<Node> nodes = new ArrayList<>();

		if (!StringUtil.isEmpty(path)) {

			for (Matcher mCoord = CoordNode.matcher(path); mCoord != null
					&& mCoord.find(); mCoord = CoordNode.matcher(mCoord.group(7))) {

				if ("M".equalsIgnoreCase(mCoord.group(1)) || "L".equalsIgnoreCase(mCoord.group(1))) {
					nodes.add(new Node("anchor", Integer.parseInt(mCoord.group(2)), Integer.parseInt(mCoord.group(3))));
				} else if ("C".equalsIgnoreCase(mCoord.group(1))) {
					nodes.add(new Node("control", Integer.parseInt(mCoord.group(2)), Integer.parseInt(mCoord.group(3))));
					nodes.add(new Node("anchor", Integer.parseInt(mCoord.group(5)), Integer.parseInt(mCoord.group(6))));
				}
			}
			
			if (!nodes.isEmpty() && path.matches("(?i)z\\s*$")) {
				nodes.add(nodes.get(0).clone());
			}
		}

		return nodes;
	}

	private static final Pattern CoordNode = Pattern
			.compile("(?i)^\\s*([mlc])\\s*(\\d+)\\s+(\\d+)(\\s+(\\d+)\\s+(\\d+))?(.*)$");

	/**
	 * @return the imageurl
	 */
	public String getImageurl() {
		return imageurl;
	}

	/**
	 * @param imageurl
	 *            the imageurl to set
	 */
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
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
}
