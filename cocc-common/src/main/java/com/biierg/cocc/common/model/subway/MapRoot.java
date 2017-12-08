/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.model.subway;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 地铁线路图根节点
 * 
 * @author lei
 */
@XmlRootElement(name = "maproot")
public class MapRoot implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Line> lines = new ArrayList<>();
	private List<Station> stations = new ArrayList<>();
	private List<Icon> icons = new ArrayList<>();

	/**
	 * @return the lines
	 */
	@XmlElementWrapper
	@XmlElement(name = "line")
	public List<Line> getLines() {
		return lines;
	}
	
	public void addLine(Line line) {
		lines.add(line);
	}

	/**
	 * @param lines
	 *            the lines to set
	 */
	public void setLines(List<Line> lines) {
		this.lines = lines;
	}

	/**
	 * @return the stations
	 */
	@XmlElementWrapper
	@XmlElement(name = "stations")
	public List<Station> getStations() {
		return stations;
	}
	
	public void addStation(Station station) {
		this.stations.add(station);
	}

	/**
	 * @param stations the stations to set
	 */
	public void setStations(List<Station> stations) {
		this.stations = stations;
	}

	/**
	 * @return the icons
	 */
	@XmlElementWrapper
	@XmlElement(name = "icon")
	public List<Icon> getIcons() {
		return icons;
	}
	
	public void addIcon(Icon icon) {
		icons.add(icon);
	}

	/**
	 * @param icons
	 *            the icons to set
	 */
	public void setIcons(List<Icon> icons) {
		this.icons = icons;
	}

}
