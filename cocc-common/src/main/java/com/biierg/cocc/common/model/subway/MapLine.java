/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.model.subway;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * 地铁线路
 * 
 * @author lei
 */
@Deprecated
public class MapLine implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code; // 线路编码
	private String direction; // 线路方向（上行、下行）

	private String name; // 线路名称

	private String color; // 线路颜色
	private int weight; // 宽度

	private boolean loop; // 是否环线
	private boolean show; // 是否显示

	private List<PathNode> path = new ArrayList<PathNode>(); // 线路节点列表

	/**
	 * @return the code
	 */
	@XmlAttribute
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
	 * @return the direction
	 */
	@XmlAttribute
	public String getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 *            the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
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
	 * @return the weight
	 */
	@XmlAttribute
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
	 * @return the loop
	 */
	@XmlAttribute
	public boolean isLoop() {
		return loop;
	}

	/**
	 * @param loop
	 *            the loop to set
	 */
	public void setLoop(boolean loop) {
		this.loop = loop;
	}

	/**
	 * @return the show
	 */
	@XmlAttribute
	public boolean isShow() {
		return show;
	}

	/**
	 * @param show
	 *            the show to set
	 */
	public void setShow(boolean show) {
		this.show = show;
	}

	/**
	 * 添加路径节点
	 */
	public void pushPathNode(PathNode node) {
		path.add(node);
	}

	/**
	 * @return the path
	 */
	@XmlElement(name = "node")
	public List<PathNode> getPath() {
		return path;
	}

	/**
	 * @param path
	 *            the path to set
	 */
	public void setPath(List<PathNode> path) {
		this.path = path;
	}
}
