/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.AtsConfiguration;

/**
 * @author lei
 */
public interface IAtsSwitchService {

	/**
	 * 查询所有的ATS配置信息
	 * 
	 * @return
	 */
	public List<AtsConfiguration> listAtsConfig();

	/**
	 * 大屏ATS客户端线路切换服务
	 * 
	 * @param atsAppIp
	 *            ATS大屏程序所在工作站的IP
	 * @param atsAppPort
	 *            ATS大屏程序监听的端口号
	 * @param panelId
	 *            ATS大屏程序的panelId
	 * @param lineId
	 *            计划显示的线路Id
	 * @return
	 */
	public int showATS(String atsAppIp, int atsAppPort, int panelId, int lineId);
}
