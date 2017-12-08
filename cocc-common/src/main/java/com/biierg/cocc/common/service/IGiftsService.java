package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.GiftExchangeInfo;
import com.biierg.cocc.common.bean.GiftInventory;
import com.biierg.cocc.common.bean.GiftSearchCount;
import com.biierg.cocc.common.bean.Gifts;
import com.biierg.cocc.common.bean.GiftsSearch;
import com.biierg.cocc.common.bean.PsaExchangeDate;
import com.biierg.cocc.common.bean.PsaExchangeStation;
import com.biierg.cocc.common.vo.AppGiftVo;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by weibo.zheng on 2017/9/16.
 */
public interface IGiftsService {

	/**
	 * 查询所有礼品
	 * 
	 * @return
	 */
	public List<Gifts> getAllGifts();

	/**
	 * 修改礼品基本信息
	 * 
	 * @param gift
	 * @return
	 */
	public boolean updateGift(Gifts gift);

	/**
	 * 添加礼品基本信息
	 * 
	 * @param gift
	 * @return
	 */
	public boolean insertGift(Gifts gift);

	/**
	 * 条件查询
	 * 
	 * @param param
	 * @return
	 */
	public List<Gifts> queryGifts(Map<String, Object> param);
	
	/**
	 * 根据礼品名称  查询信息
	 * @param giftsName 礼品名称
	 * @return
	 */
	public List<GiftsSearch> queryGiftsByName(String giftsName) throws Exception;

	/**
	 * 根据礼品id 删除礼品
	 * 
	 * @param giftId
	 * @return
	 */
	public int deleteGift(String giftId);

	/**
	 * 根据兑换码(记录id)查询对应的礼品兑换记录信息
	 * 
	 * @param id
	 * @return
	 */
	public GiftExchangeInfo getGiftExchangeInfoById(String id);

	/**
	 * 后台管理人员确认兑换 1.修改兑换状态 2.添加实际兑换时间
	 * 
	 * @param id
	 * @return
	 */
	public boolean exchangeGift(String id);

	/**
	 * app兑换礼品 1.添加会员积分表 2.添加礼品库存变动表 3.添加礼品积分兑换记录表 4.修改礼品信息表库存
	 * 
	 * @param appGiftVo
	 * @return 0 表示正常 1 用户积分不足 2 库存不足
	 */
	public int userExchangeGift(AppGiftVo appGiftVo);

	/**
	 * 根据用户id 查询用户对应的礼品兑换记录
	 * 
	 * @param memberId
	 * @return
	 */
	public List<GiftExchangeInfo> queryGiftExchangeInfoByMemberId(String memberId);

	/**
	 * 根据memberId 查询该用户当前时间的礼品兑换记录
	 * 
	 * @param memberId
	 * @return
	 */
	public List<GiftExchangeInfo> queryGiftExchangeNowByMemberId(String memberId);

	/**
	 * 管理员出库/入库
	 * 
	 * @param giftInventory
	 * @return
	 */
	public boolean AdminGiftInventory(GiftInventory giftInventory);

	/**
	 * 车站礼品出入库明细
	 * 
	 * @param lineCode
	 *            车站编码，必填
	 * @param stationCode
	 *            站编码，必填
	 * @param keyWords
	 *            礼品名字关键字，可空
	 * @param startDate
	 *            开始日期，可空
	 * @param endDate
	 *            截止日期，可空
	 * @param type
	 *            出入库类型，必填 0:兑换  1:入库  2:出库 
	 * @return 
	 * @throws Exception
	 */
	public List<GiftSearchCount> searchGiftInoutDetail(String lineCode, String stationCode, String keyWords, Date startDate,
			Date endDate, Integer type) throws Exception;

	/**
	 * 礼品统计
	 * 
	 * @param lineCode
	 *            车站编码，可空
	 * @param stationCode
	 *            站编码，可空
	 * @param startDate
	 *            开始日期，可空
	 * @param endDate
	 *            截止日期，可空
	 * @return ApiResult
	 * @throws Exception
	 */
	public List<GiftSearchCount> searchGiftRepertoryCount(String lineCode, String stationCode, Date startDate, Date endDate,String giftName)
			throws Exception;
	
	/**  
	* @Title: queryExchangeStation  
	* @Description: 查询所有可兑换礼品车站信息接口  
	* @return List<PsaExchangeStation>      
	* @throws  
	*/  
	public List<PsaExchangeStation> queryExchangeStation();
	
	/**  
	* @Title: queryDateQuantity  
	* @Description: 根据GIFT_ID查询 每月配额数
	* @param giftId
	* @return Gifts      
	* @throws  
	*/  
	public Gifts queryQuantity(String giftId); 
	
	/**  
	* @Title: queryExchangeDate  
	* @Description: 根据GIFT_ID查询开始兑换日期、截止兑换日期  
	* @return PsaExchangeDate      
	* @throws  
	*/  
	public PsaExchangeDate queryExchangeDate();
	
	/**  
	* @Title: queryGiftExchangeAmount  
	* @Description:根据GIFT_ID查询每月礼品兑换额
	* @param giftId
	* @return Integer      
	* @throws  
	*/  
	public Integer queryGiftExchangeAmount(String giftId);
}
