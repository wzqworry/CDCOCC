/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.model.subway;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 地铁线路
 * 
 * @author lei
 */
public class Line implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code; // 线路编码
	private String name; // 线路名称

	private boolean loop; // 是否环线
	private boolean visible; // 是否显示
	
	private Path primary; // 主线
	private Path up, down; // 辅线（上、下行）
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
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
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the loop
	 */
	public boolean isLoop() {
		return loop;
	}

	/**
	 * @param loop the loop to set
	 */
	public void setLoop(boolean loop) {
		this.loop = loop;
	}

	/**
	 * @return the visible
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * @param visible the visible to set
	 */
	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	/**
	 * @return the primary
	 */
	public Path getPrimary() {
		return primary;
	}

	/**
	 * @param primary the primary to set
	 */
	public void setPrimary(Path primary) {
		this.primary = primary;
	}

	/**
	 * @return the up
	 */
	public Path getUp() {
		return up;
	}

	/**
	 * @param up the up to set
	 */
	public void setUp(Path up) {
		this.up = up;
	}

	/**
	 * @return the down
	 */
	public Path getDown() {
		return down;
	}

	/**
	 * @param down the down to set
	 */
	public void setDown(Path down) {
		this.down = down;
	}

	public static class Path implements Serializable {
		private static final long serialVersionUID = 1L;

		private String color; // 线路颜色
		private String alpha; // 线路透明度
		private int weight; // 线宽度	

		private List<Section> sections = new ArrayList<>();

		/**
		 * @return the color
		 */
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
		 * @return the alpha
		 */
		public String getAlpha() {
			return alpha;
		}

		/**
		 * @param alpha the alpha to set
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
		 * @param weight the weight to set
		 */
		public void setWeight(int weight) {
			this.weight = weight;
		}

		/**
		 * @return the sections
		 */
		public List<Section> getSections() {
			return sections;
		}

		/**
		 * @param sections the sections to set
		 */
		public void setSections(List<Section> sections) {
			this.sections = sections;
		}
	}
}
