/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.lang3.StringUtils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.biierg.cocc.common.model.subway.Icon;
import com.biierg.cocc.common.model.subway.Line;
import com.biierg.cocc.common.model.subway.MapRoot;
import com.biierg.cocc.common.model.subway.Node;
import com.biierg.cocc.common.model.subway.Section;
import com.biierg.cocc.common.model.subway.Station;
import com.biierg.cocc.common.util.StringUtil;

/**
 * 地铁线网图配置解析工具类
 * 
 * @author lei
 */
public class MapConfiguration {

	private MapRoot maproot = new MapRoot();

	private MapConfiguration() {
	}

	private static class SingletonHolder {
		private static Map<String, MapConfiguration> instance = new HashMap<>();
	}

	public static MapConfiguration getInstance(String name) {
		return getInstance(name, false);
	}

	public static MapConfiguration getInstance(String name, boolean forceFlush) {

		if (forceFlush || !SingletonHolder.instance.containsKey(name)) {
			SingletonHolder.instance.put(name, new MapConfiguration().parse(name));
		}

		return SingletonHolder.instance.get(name);
	}

	/**
	 * @return the maproot
	 */
	public MapRoot getMaproot() {
		return maproot;
	}

	private MapConfiguration parse(String name) {
		try {
			Stack<Object> stack = new Stack<Object>();

			SAXParser saxparser = SAXParserFactory.newInstance().newSAXParser();
			saxparser.parse(MapConfiguration.class.getResourceAsStream(name), new DefaultHandler() {

				@Override
				public void startDocument() throws SAXException {
					super.startDocument();
					stack.clear();
				}

				@Override
				public void endDocument() throws SAXException {
					super.endDocument();
					stack.clear();
				}

				@Override
				public void startElement(String uri, String localName, String qName, Attributes attributes)
						throws SAXException {
					super.startElement(uri, localName, qName, attributes);

					// 新线
					if ("line".equalsIgnoreCase(qName)) {
						Line line = new Line();

						line.setCode(attributes.getValue("code"));
						line.setName(attributes.getValue("name"));

						line.setLoop("true".equalsIgnoreCase(attributes.getValue("loop")));
						line.setVisible("true".equalsIgnoreCase(attributes.getValue("visible")));

						stack.push(line);
					}

					// 主线/上行线/下行线
					else if ("primary".equalsIgnoreCase(qName) || "up".equalsIgnoreCase(qName)
							|| "down".equalsIgnoreCase(qName)) {
						Line.Path path = new Line.Path();

						path.setColor(attributes.getValue("color"));
						path.setAlpha(attributes.getValue("alpha"));
						path.setWeight(Integer.parseInt(attributes.getValue("weight")));

						stack.push(path);
					}

					// 断面
					else if ("section".equalsIgnoreCase(qName)) {
						Section section = new Section();

						section.setBeginCode(attributes.getValue("beginCode"));
						section.setEndCode(attributes.getValue("endCode"));
						section.setName(attributes.getValue("name"));

						stack.push(section);
					}
					
					// 路径节点
					else if ("node".equalsIgnoreCase(qName)) {
						Node node = new Node();

						node.setType(attributes.getValue("type"));
						node.setX(Integer.parseInt(attributes.getValue("x")));
						node.setY(Integer.parseInt(attributes.getValue("y")));

						stack.push(node);
					}

					// 站点
					else if ("station".equalsIgnoreCase(qName)) {
						Station station = new Station();

						station.setCode(attributes.getValue("code"));
						String name=attributes.getValue("name");
						station.setName(name);
						if(StringUtils.isBlank(name)){
							station.setAppName(attributes.getValue("appName"));
						}
						station.setShortName(attributes.getValue("shortName"));
						station.setPinyin(attributes.getValue("pinyin"));
						station.setColor(attributes.getValue("color"));
						station.setFillColor(attributes.getValue("fillColor"));

						station.setVisible("false".equalsIgnoreCase(attributes.getValue("visible")) ? false : true);
						station.setDisabled("true".equalsIgnoreCase(attributes.getValue("disabled")));
						boolean istransfer="true".equalsIgnoreCase(attributes.getValue("istransfer"));
						station.setIstransfer(istransfer);
						if(istransfer){
							station.setTransferLine(attributes.getValue("transferLine"));
							station.setTransColor(attributes.getValue("transColor"));
						}

						station.setRadius(Integer.parseInt(attributes.getValue("radius")));
						station.setX(Integer.parseInt(attributes.getValue("x")));
						station.setY(Integer.parseInt(attributes.getValue("y")));

						stack.push(station);
					}

					// 站点文字标签
					else if ("label".equalsIgnoreCase(qName)) {
						Station.Label label = new Station.Label();

						label.setColor(attributes.getValue("color"));
						label.setFontSize(attributes.getValue("fontSize"));

						if (StringUtil.isNumber(attributes.getValue("rotate"))) {
							label.setRotate(Integer.parseInt(attributes.getValue("rotate")));
						}
						if (StringUtil.isNumber(attributes.getValue("top"))) {
							label.setTop(Double.parseDouble(attributes.getValue("top")));
						}
						if (StringUtil.isNumber(attributes.getValue("bottom"))) {
							label.setBottom(Double.parseDouble(attributes.getValue("bottom")));
						}
						if (StringUtil.isNumber(attributes.getValue("left"))) {
							label.setLeft(Double.parseDouble(attributes.getValue("left")));
						}
						if (StringUtil.isNumber(attributes.getValue("right"))) {
							label.setRight(Double.parseDouble(attributes.getValue("right")));
						}

						stack.push(label);
					}

					// 图标
					else if ("icon".equalsIgnoreCase(qName)) {
						Icon icon = new Icon();

						icon.setType(attributes.getValue("type"));

						icon.setFontSize(attributes.getValue("fontSize"));
						icon.setColor(attributes.getValue("color"));
						icon.setAlpha(attributes.getValue("alpha"));
						icon.setWeight(attributes.getValue("weight"));

						icon.setRotate(StringUtil.isNumber(attributes.getValue("rotate"))
								? Integer.parseInt(attributes.getValue("rotate")) : 0);

						icon.setX(StringUtil.isNumber(attributes.getValue("x"))
								? Integer.parseInt(attributes.getValue("x")) : 0);
						icon.setY(StringUtil.isNumber(attributes.getValue("y"))
								? Integer.parseInt(attributes.getValue("y")) : 0);

						stack.push(icon);
					}
				}

				@Override
				public void characters(char[] ch, int start, int length) throws SAXException {
					super.characters(ch, start, length);
					
					String text = new String(ch, start, length);

					if (!stack.isEmpty() && !StringUtil.isEmpty(text)) {
						Object obj = stack.peek();

						// 断面路径
//						if (obj != null && obj instanceof Section) {
//							((Section) obj).setPath(text.trim());
//						}

						// 文字标签
						if (obj != null && obj instanceof Icon) {
							Icon icon = (Icon) obj;

							if ("label".equals(icon.getType())) {
								icon.setLabel(text.trim());
							} else if ("image".equals(icon.getType())) {
								icon.setImageurl(text.trim());
							} else if ("sprite".equals(icon.getType())) {
								icon.setPath(text.trim());
							}
						}
					}
				}

				@Override
				public void endElement(String uri, String localName, String qName) throws SAXException {
					super.endElement(uri, localName, qName);
					
					// 路径节点 结束
					if ("node".equalsIgnoreCase(qName)) {
						Node node = (Node) stack.pop();

						// 从堆栈中取出最后一个元素，判断是否为片断
						Object element = stack.peek();
						if (element != null && element instanceof Section) {
							((Section) element).getPathNodes().add(node);
						}
					}

					// 断面 结束
					else if ("section".equalsIgnoreCase(qName)) {
						Section section = (Section) stack.pop();

						// 从堆栈中取出最后一个元素，判断是主线还是辅助线
						Object element = stack.peek();
						if (element != null && element instanceof Line.Path) {
							((Line.Path) element).getSections().add(section);
						}
					}

					// 线 结束
					else if ("primary".equalsIgnoreCase(qName)) {
						Line.Path path = (Line.Path) stack.pop();

						// 从堆栈中取出最后一个元素，判断是线路还是分支
						Object element = stack.peek();
						if (element != null && element instanceof Line) {
							((Line) element).setPrimary(path);
						}
					} else if ("up".equalsIgnoreCase(qName)) {
						Line.Path path = (Line.Path) stack.pop();

						// 从堆栈中取出最后一个元素，判断是线路还是分支
						Object element = stack.peek();
						if (element != null && element instanceof Line) {
							((Line) element).setUp(path);
						}
					} else if ("down".equalsIgnoreCase(qName)) {
						Line.Path path = (Line.Path) stack.pop();

						// 从堆栈中取出最后一个元素，判断是线路还是分支
						Object element = stack.peek();
						if (element != null && element instanceof Line) {
							((Line) element).setDown(path);
						}
					}

					// 线 结束
					else if ("line".equalsIgnoreCase(qName)) {
						maproot.addLine((Line) stack.pop());
					}

					// 站点文字标签 结束
					else if ("label".equalsIgnoreCase(qName)) {
						Station.Label label = (Station.Label) stack.pop();

						// 从堆栈中取出最后一个元素
						Object element = stack.peek();
						if (element != null && element instanceof Station) {
							((Station) element).setLabel(label);
						}
					}

					// 站点 结束
					else if ("station".equalsIgnoreCase(qName)) {
						maproot.addStation((Station) stack.pop());
					}

					// 图标 结束
					else if ("icon".equalsIgnoreCase(qName)) {
						maproot.addIcon((Icon) stack.pop());
					}
				}
			});
		} catch (Throwable e) {
		}

		return this;
	}
}
