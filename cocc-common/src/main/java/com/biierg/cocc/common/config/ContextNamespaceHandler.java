/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.config;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author lei
 */
public class ContextNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("zkproperty-placeholder", new ZkPropertyPlaceholder());
	}
}
