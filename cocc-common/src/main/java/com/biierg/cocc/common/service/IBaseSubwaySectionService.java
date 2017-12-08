package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.BaseSubwaySection;

/**
 * 查询中心场段的服务接口
 * @author wzq
 */
public interface IBaseSubwaySectionService {
	
	/**
	 * 查询中心场段信息
	 * @param sectionType
	 * @return
	 */
	public List<BaseSubwaySection> getSectionInfo(Integer sectionType);
}
