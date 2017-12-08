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
 * 地铁线路图
 * 
 * @author lei
 */
@Deprecated
@XmlRootElement(name = "root")
public class SubwayMap implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<MapLine> lines = new ArrayList<MapLine>();
	private List<MapStation> stations = new ArrayList<MapStation>();
	private List<MapIcon> icons = new ArrayList<MapIcon>();

	/**
	 * @return the lines
	 */
	@XmlElementWrapper
	@XmlElement(name = "line")
	public List<MapLine> getLines() {
		return lines;
	}

	/**
	 * @param lines
	 *            the lines to set
	 */
	public void setLines(List<MapLine> lines) {
		this.lines = lines;
	}

	/**
	 * @return the stations
	 */
	@XmlElementWrapper
	@XmlElement(name = "station")
	public List<MapStation> getStations() {
		return stations;
	}

	/**
	 * @param stations the stations to set
	 */
	public void setStations(List<MapStation> stations) {
		this.stations = stations;
	}

	/**
	 * @return the icons
	 */
	@XmlElementWrapper
	@XmlElement(name = "icon")
	public List<MapIcon> getIcons() {
		return icons;
	}

	/**
	 * @param icons
	 *            the icons to set
	 */
	public void setIcons(List<MapIcon> icons) {
		this.icons = icons;
	}

}
