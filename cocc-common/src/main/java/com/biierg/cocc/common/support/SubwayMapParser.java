/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.biierg.cocc.common.model.subway.SubwayMap;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.biierg.cocc.common.model.subway.MapIcon;
import com.biierg.cocc.common.model.subway.MapLine;
import com.biierg.cocc.common.model.subway.MapStation;
import com.biierg.cocc.common.model.subway.PathNode;

/**
 * @author lei
 */
@Deprecated
public class SubwayMapParser {
	private SubwayMap map = new SubwayMap();
    private SubwayMap doubleMap = new SubwayMap();
	private SubwayMapParser() {
	}
	private static class SingletonHolder {
		private static SubwayMapParser instance = new SubwayMapParser();
	}
	public static SubwayMapParser getInstance() {
		return SingletonHolder.instance;
	}

	public SubwayMap getSingleMap() {
		return map;
	}
	public SubwayMap getDoubleMap() {
		return doubleMap;
	}

	public void parse() {
		try {
			Stack<Object> parseStack = new Stack<Object>();

			SAXParser saxparser = SAXParserFactory.newInstance().newSAXParser();
			//subwaymap-real.xml
			saxparser.parse(SubwayMapParser.class.getResourceAsStream("/single-out.xml"), new DefaultHandler() {

				@Override
				public void startDocument() throws SAXException {
					super.startDocument();

					parseStack.clear();
				}

				@Override
				public void endDocument() throws SAXException {
					super.endDocument();

					parseStack.clear();
				}

				@Override
				public void startElement(String uri, String localName, String qName, Attributes attributes)
						throws SAXException {
					super.startElement(uri, localName, qName, attributes);

					// 新线
					if ("line".equals(qName)) {
						MapLine line = new MapLine();

						line.setCode(attributes.getValue("code"));
						line.setName(attributes.getValue("name"));
						line.setColor(attributes.getValue("color"));
						line.setDirection(attributes.getValue("direction"));
						line.setWeight(Integer.parseInt(attributes.getValue("weight")));
						line.setShow("true".equalsIgnoreCase(attributes.getValue("show")));
						line.setLoop("true".equalsIgnoreCase(attributes.getValue("loop")));

						parseStack.push(line);
					}

					// 线路节点
					else if ("node".equals(qName)) {
						PathNode node = new PathNode();

						node.setCode(attributes.getValue("code"));
						node.setName(attributes.getValue("name"));

						node.setColor(attributes.getValue("color"));

						if (attributes.getValue("type") != null) {
							switch (attributes.getValue("type").toLowerCase()) {

							case "anchor":
								node.setType(PathNode.NodeType.Anchor);
								break;

							case "control":
								node.setType(PathNode.NodeType.Control);
								break;

							case "station":
							default:
								node.setType(PathNode.NodeType.Station);
							}
						}

						node.setX(Float.parseFloat(attributes.getValue("x")));
						node.setY(Float.parseFloat(attributes.getValue("y")));

						// 从堆栈中取出最后一条线路
						((MapLine) parseStack.peek()).pushPathNode(node);
						
						parseStack.push(node);
					}

					// 分支
					else if ("branchs".equals(qName)) {
						parseStack.push(new ArrayList<MapLine>());
					}
					
					// 站点
					else if ("station".equals(qName)) {
						MapStation station = new MapStation();
						
						String lineCodes = attributes.getValue("lineCodes");
						station.setLineCodes(lineCodes.split(","));
						
						String colors = attributes.getValue("colors");
						station.setColors(colors.split(","));
						
						if (attributes.getValue("type") != null) {
							switch (attributes.getValue("type").toLowerCase()) {

							case "transfer":
								station.setType(MapStation.StationType.Transfer);
								break;

							case "transfer3":
								station.setType(MapStation.StationType.Transfer3);
								break;

							case "station":
							default:
								station.setType(MapStation.StationType.Station);
							}
						}
						
						station.setName(attributes.getValue("name"));
						station.setPinyin(attributes.getValue("pinyin"));
						
						if (attributes.getValue("top") != null) {
							station.setTop(Float.parseFloat(attributes.getValue("top")));
						}
						if (attributes.getValue("bottom") != null) {
							station.setBottom(Float.parseFloat(attributes.getValue("bottom")));
						}
						if (attributes.getValue("left") != null) {
							station.setLeft(Float.parseFloat(attributes.getValue("left")));
						}
						if (attributes.getValue("right") != null) {
							station.setRight(Float.parseFloat(attributes.getValue("right")));
						}
						
						station.setX(Float.parseFloat(attributes.getValue("x")));
						station.setY(Float.parseFloat(attributes.getValue("y")));
						
						parseStack.push(station);
					}
					
					// 站点
					else if ("icon".equals(qName)) {
						MapIcon icon = new MapIcon();
						
						if (attributes.getValue("imageurl") != null) {
							icon.setType(MapIcon.IconType.Image);
						} else {
							icon.setType(MapIcon.IconType.Label);
						}
						
						icon.setLabel(attributes.getValue("label"));
						icon.setImageurl(attributes.getValue("imageurl"));
						
						icon.setColor(attributes.getValue("color"));
						
						icon.setX(Float.parseFloat(attributes.getValue("x")));
						icon.setY(Float.parseFloat(attributes.getValue("y")));
						
						parseStack.push(icon);
					}
				}

				@Override
				public void characters(char[] ch, int start, int length) throws SAXException {
					super.characters(ch, start, length);
				}

				@Override
				@SuppressWarnings("unchecked")
				public void endElement(String uri, String localName, String qName) throws SAXException {
					super.endElement(uri, localName, qName);
					
					// 新线
					if ("line".equals(qName)) {
						MapLine line = (MapLine) parseStack.pop();
						
						// 如果当前是分支下
						if (!parseStack.empty() && List.class.isAssignableFrom(parseStack.peek().getClass())) {
							((List<MapLine>) parseStack.peek()).add(line);
						} 
						// 当前是新线
						else {
							map.getLines().add(line);
						}
					}

					// 线路节点
					else if ("node".equals(qName)) {
						parseStack.pop();
					}

					// 分支
					else if ("branchs".equals(qName)) {
						List<MapLine> branchs = (List<MapLine>) parseStack.pop();
						
						// 从堆栈中取出最后一个节点
						((PathNode) parseStack.peek()).setBranchs(branchs);
					}
					
					// 站点
					else if ("station".equals(qName)) {
						map.getStations().add((MapStation) parseStack.pop());
					}
					
					// 图标
					else if ("icon".equals(qName)) {
						map.getIcons().add((MapIcon) parseStack.pop());
					}
				}
			});
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
    public void parseDouble() {
        try {
            Stack<Object> parseStack = new Stack<Object>();

            SAXParser saxparser = SAXParserFactory.newInstance().newSAXParser();

            saxparser.parse(SubwayMapParser.class.getResourceAsStream("/double-out.xml"), new DefaultHandler() {

                @Override
                public void startDocument() throws SAXException {
                    super.startDocument();

                    parseStack.clear();
                }

                @Override
                public void endDocument() throws SAXException {
                    super.endDocument();

                    parseStack.clear();
                }

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes)
                        throws SAXException {
                    super.startElement(uri, localName, qName, attributes);

                    // 新线
                    if ("line".equals(qName)) {
                        MapLine line = new MapLine();

                        line.setCode(attributes.getValue("code"));
                        line.setName(attributes.getValue("name"));
                        line.setColor(attributes.getValue("color"));
                        line.setDirection(attributes.getValue("direction"));
                        line.setWeight(Integer.parseInt(attributes.getValue("weight")));
                        line.setShow("true".equalsIgnoreCase(attributes.getValue("show")));
                        line.setLoop("true".equalsIgnoreCase(attributes.getValue("loop")));

                        parseStack.push(line);
                    }

                    // 线路节点
                    else if ("node".equals(qName)) {
                        PathNode node = new PathNode();

                        node.setCode(attributes.getValue("code"));
                        node.setName(attributes.getValue("name"));

                        node.setColor(attributes.getValue("color"));

                        if (attributes.getValue("type") != null) {
                            switch (attributes.getValue("type").toLowerCase()) {

                                case "anchor":
                                    node.setType(PathNode.NodeType.Anchor);
                                    break;

                                case "control":
                                    node.setType(PathNode.NodeType.Control);
                                    break;

                                case "station":
                                default:
                                    node.setType(PathNode.NodeType.Station);
                            }
                        }

                        node.setX(Float.parseFloat(attributes.getValue("x")));
                        node.setY(Float.parseFloat(attributes.getValue("y")));

                        // 从堆栈中取出最后一条线路
                        ((MapLine) parseStack.peek()).pushPathNode(node);

                        parseStack.push(node);
                    }

                    // 分支
                    else if ("branchs".equals(qName)) {
                        parseStack.push(new ArrayList<MapLine>());
                    }

                    // 站点
                    else if ("station".equals(qName)) {
                        MapStation station = new MapStation();

                        String lineCodes = attributes.getValue("lineCodes");
                        station.setLineCodes(lineCodes.split(","));

                        String colors = attributes.getValue("colors");
                        station.setColors(colors.split(","));

                        if (attributes.getValue("type") != null) {
                            switch (attributes.getValue("type").toLowerCase()) {

                                case "transfer":
                                    station.setType(MapStation.StationType.Transfer);
                                    break;

                                case "transfer3":
                                    station.setType(MapStation.StationType.Transfer3);
                                    break;

                                case "station":
                                default:
                                    station.setType(MapStation.StationType.Station);
                            }
                        }

                        station.setName(attributes.getValue("name"));
                        station.setPinyin(attributes.getValue("pinyin"));

                        if (attributes.getValue("top") != null) {
                            station.setTop(Float.parseFloat(attributes.getValue("top")));
                        }
                        if (attributes.getValue("bottom") != null) {
                            station.setBottom(Float.parseFloat(attributes.getValue("bottom")));
                        }
                        if (attributes.getValue("left") != null) {
                            station.setLeft(Float.parseFloat(attributes.getValue("left")));
                        }
                        if (attributes.getValue("right") != null) {
                            station.setRight(Float.parseFloat(attributes.getValue("right")));
                        }

                        station.setX(Float.parseFloat(attributes.getValue("x")));
                        station.setY(Float.parseFloat(attributes.getValue("y")));
						station.setRotate(Integer.parseInt(attributes.getValue("rotate")));
                        parseStack.push(station);
                    }

                    // 站点
                    else if ("icon".equals(qName)) {
                        MapIcon icon = new MapIcon();

                        if (attributes.getValue("imageurl") != null) {
                            icon.setType(MapIcon.IconType.Image);
                        } else {
                            icon.setType(MapIcon.IconType.Label);
                        }

                        icon.setLabel(attributes.getValue("label"));
                        icon.setImageurl(attributes.getValue("imageurl"));

                        icon.setColor(attributes.getValue("color"));

                        icon.setX(Float.parseFloat(attributes.getValue("x")));
                        icon.setY(Float.parseFloat(attributes.getValue("y")));

                        parseStack.push(icon);
                    }
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    super.characters(ch, start, length);
                }

                @Override
                @SuppressWarnings("unchecked")
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    super.endElement(uri, localName, qName);

                    // 新线
                    if ("line".equals(qName)) {
                        MapLine line = (MapLine) parseStack.pop();

                        // 如果当前是分支下
                        if (!parseStack.empty() && List.class.isAssignableFrom(parseStack.peek().getClass())) {
                            ((List<MapLine>) parseStack.peek()).add(line);
                        }
                        // 当前是新线
                        else {
                            doubleMap.getLines().add(line);
                        }
                    }

                    // 线路节点
                    else if ("node".equals(qName)) {
                        parseStack.pop();
                    }

                    // 分支
                    else if ("branchs".equals(qName)) {
                        List<MapLine> branchs = (List<MapLine>) parseStack.pop();

                        // 从堆栈中取出最后一个节点
                        ((PathNode) parseStack.peek()).setBranchs(branchs);
                    }

                    // 站点
                    else if ("station".equals(qName)) {
                        doubleMap.getStations().add((MapStation) parseStack.pop());
                    }

                    // 图标
                    else if ("icon".equals(qName)) {
                        doubleMap.getIcons().add((MapIcon) parseStack.pop());
                    }
                }
            });
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
