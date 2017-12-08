/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.model.subway;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * 线路路径节点
 * 
 * @author lei
 */
@Deprecated
public class PathNode implements Serializable {
	private static final long serialVersionUID = 1L;

	public static enum NodeType {
		Station("station"), // 车站
		Anchor("anchor"), // 锚点
		Control("control"); // 控制点
		
		private String realm;
		
		private NodeType(String realm) {
			this.realm = realm;
		}
		
		@Override
		public String toString() {
			return this.realm;
		}
	}

	private NodeType type;

	private String code; // 节点编码；对于节点类型为“车站”的节点，此属性有效
	private String name; // 节点名称；对于节点类型为“站点”的节点，此属性有效
	
	private String color; // 自该节点开始的颜色

	private float x;
	private float y;

	private List<MapLine> branchs; // 线路分支

	/**
	 * @return the type
	 */
	@XmlAttribute
	public NodeType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(NodeType type) {
		this.type = type;
	}

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
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
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
	 * @return the branchs
	 */
	@XmlElementWrapper
	@XmlElement(name = "line")
	public List<MapLine> getBranchs() {
		return branchs;
	}

	/**
	 * @param branchs the branchs to set
	 */
	public void setBranchs(List<MapLine> branchs) {
		this.branchs = branchs;
	}
}
