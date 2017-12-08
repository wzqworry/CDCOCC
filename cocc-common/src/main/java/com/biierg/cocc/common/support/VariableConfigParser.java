/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

import com.biierg.cocc.common.model.vars.IpsVarConfig;
import com.biierg.cocc.common.model.vars.IpsVarsMap;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.List;
import java.util.Stack;

/**
 * 各系统通用的变量功能 依赖的变量配置文件读取工具
 *
 * @author wen.ding
 * @date 2017/6/29 10:04
 */
public class VariableConfigParser {
    private IpsVarsMap ipsVarsMap = new IpsVarsMap();

    private static boolean isLoad = false;

    private VariableConfigParser() {
    }

    public IpsVarsMap getIpsVarsMap() {
        int i = 0;
        while (!isLoad && i < 5) {
            loadXml();
            i++;
        }
        return ipsVarsMap;
    }

    public void setIpsVarsMap(IpsVarsMap ipsVarsMap) {
        this.ipsVarsMap = ipsVarsMap;
    }

    private void loadXml() {
        VariableConfigParser.getInstance().parse();
        isLoad = true;
    }

    private static class SingletonHolder {
        private static VariableConfigParser instance = new VariableConfigParser();
    }

    public static VariableConfigParser getInstance() {
        return VariableConfigParser.SingletonHolder.instance;
    }

    public void parse() {
        try {
            Stack<Object> parseStack = new Stack<>();

            SAXParser saxparser = SAXParserFactory.newInstance().newSAXParser();
            //var-config.xml
            saxparser.parse(VariableConfigParser.class.getResourceAsStream("/var-config.xml"), new DefaultHandler() {

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

                    // 新的变量
                    if ("var".equals(qName)) {
                        IpsVarConfig ipsVarConfig = new IpsVarConfig();

                        ipsVarConfig.setName(attributes.getValue("name"));
                        ipsVarConfig.setRemark(attributes.getValue("remark"));
                        ipsVarConfig.setFormat(attributes.getValue("format"));

                        parseStack.push(ipsVarConfig);
                    }
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    super.characters(ch, start, length);

                    if (!parseStack.isEmpty() && parseStack.peek() instanceof IpsVarConfig) {
                        ((IpsVarConfig) parseStack.peek()).setSql(new String(ch, start, length));
                    }
                }

                @Override
                @SuppressWarnings("unchecked")
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    super.endElement(uri, localName, qName);

                    // 新变量
                    if ("var".equals(qName)) {
                        IpsVarConfig ipsVarConfig = (IpsVarConfig) parseStack.pop();

                        // 如果当前是分支下
                        if (!parseStack.empty() && List.class.isAssignableFrom(parseStack.peek().getClass())) {
                            ((List<IpsVarConfig>) parseStack.peek()).add(ipsVarConfig);
                        }
                        // 当前是新变量
                        else {
                            ipsVarsMap.getIpsVarList().add(ipsVarConfig);
                        }
                    }

                }
            });
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
