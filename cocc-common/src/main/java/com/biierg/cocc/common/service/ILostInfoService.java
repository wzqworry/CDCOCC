package com.biierg.cocc.common.service;

import java.util.List;
import com.biierg.cocc.common.bean.PsaLostInfo;
import com.biierg.cocc.common.vo.PsaLostGoodsVo;

/**
 * @author wxs
 * 失物招领接口
 */
public interface ILostInfoService {
	
	/**app-失物招领查询接口
	 * @return
	 */
	public List<PsaLostInfo> queryLostInfo(String station_name,String start_time,String end_time,String searchArticle,String dropArticle);
	
	/**app-失物招领查询接口(重载)
	 * @return
	 */
	public List<PsaLostInfo> queryLostInfo();
	
	/**  
	* @Title: queryLostGoods  
	* @Description: app-遗失物品查询（取最近时间的前十条）  
	* @return List<PsaLostGoodsVo>      
	* @throws  
	*/  
	public List<PsaLostGoodsVo> queryLostGoods();
	
	/**
	 * 失物招领 添加
	 * @param lostInfo
	 * @return
	 */
	public boolean insertLostInfo(PsaLostInfo lostInfo);

	/**
	 * 失物招领 删除
	 * @param id
	 * @return
	 */
	public boolean deleteLostInfo(String id);

	/**
	 * 失物招领 修改
	 * @param lostInfo
	 * @return
	 */
	public boolean updateLostInfo(PsaLostInfo lostInfo);

	/**
	 * 根据id 查询对应的失物招领信息
	 * @param id
	 * @return
	 */
	public PsaLostInfo getLostInfoById(String id);

	/**
	 * 修改失物状态: 由0(未领取) 改为 1(已领取)
	 * @param id
	 * @return
	 */
	public boolean updateLostInfoStatus(String id);
}
