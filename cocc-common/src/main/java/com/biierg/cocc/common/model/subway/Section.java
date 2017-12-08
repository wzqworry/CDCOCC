/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.model.subway;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 地铁线路断面
 * 
 * @author lei
 */
public class Section implements Serializable {
	private static final long serialVersionUID = 1L;

	private String beginCode; // 断面开始站编码
	private String endCode; // 断面结束站编码

	private String name; // 断面名称(不重要)

	private List<Node> path = new ArrayList<>(); // 画线用的Path

	private String color; // 线路颜色
	private String alpha; // 线路透明度
	private int weight; // 线宽度

	/**
	 * @return the beginCode
	 */
	public String getBeginCode() {
		return beginCode;
	}

	/**
	 * @param beginCode
	 *            the beginCode to set
	 */
	public void setBeginCode(String beginCode) {
		this.beginCode = beginCode;
	}

	/**
	 * @return the endCode
	 */
	public String getEndCode() {
		return endCode;
	}

	/**
	 * @param endCode
	 *            the endCode to set
	 */
	public void setEndCode(String endCode) {
		this.endCode = endCode;
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
	 * @return the path
	 */
	public List<Node> getPathNodes() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPathNodes(List<Node> path) {
		this.path = path;
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
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * 将字符串格式的路径转换成节点列表
	 * 
	 * @return
	 */
	public String getPath() {
		StringBuffer buf = new StringBuffer();

		if (path != null && !path.isEmpty()) {
			for (int i = 0; i < path.size(); ++i) {
				Node node = path.get(i);
				
				if ("anchor".equalsIgnoreCase(node.getType())) {
					buf.append((i == 0 ? "M" : "L") + " " + node.getX() + " " + node.getY() + " ");
				} else if ("control".equalsIgnoreCase(node.getType())) {
					Node nextNode = path.get(++i);
					
					buf.append("Q " + node.getX() + " " + node.getY() + " ");
					buf.append(nextNode.getX() + " " + nextNode.getY() + " ");
				}
			}
		}

		return buf.toString();
	}

//	private static final Pattern CoordNode = Pattern
//			.compile("(?i)^\\s*([mlc])\\s*(\\d+)\\s+(\\d+)(\\s+(\\d+)\\s+(\\d+))?(.*)$");
}
