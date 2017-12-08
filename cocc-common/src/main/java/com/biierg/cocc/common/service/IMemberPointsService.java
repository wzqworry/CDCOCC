package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.MemberCheckin;
import com.biierg.cocc.common.bean.MemberPoints;
import com.biierg.cocc.common.vo.MemberPointsOther;
import com.biierg.cocc.common.vo.MemberPointsType;
import com.biierg.cocc.common.vo.MemberTotalPoints;

import java.util.List;
import java.util.Map;

/**
 * Created by Waiizz on 2017/9/15.
 */
public interface IMemberPointsService {

	/**
	 * 根据用户id 查询该用户下的所有积分记录
	 * 
	 * @param memberId
	 *            用户id
	 * @return
	 */
	public List<MemberPoints> getMemberPoints(String memberId, String dateStr);

	/**
	 * 增加积分
	 * 
	 * @param memberPoints
	 * @return
	 */
	public boolean increasePoints(MemberPoints memberPoints);

	/**
	 * 扣减积分
	 * 
	 * @param memberPoints
	 * @return
	 */
	public boolean decreasePoints(MemberPoints memberPoints);

	/**
	 * 获取会员总积分
	 * 
	 * @param memberId
	 * @return
	 */
	public List<MemberTotalPoints> getTotalPoints(String memberId);

	/**
	 * 根据日期（年/月）查询会员各渠道的积分总数
	 * 
	 * @param param
	 * @return
	 */
	public List<MemberPointsType> queryPointTypes(String memberId, String dateStr);
	
	 /**查询用户已获取及已使用的积分
     * @param param
     * @return
     */
    public List<MemberPointsOther> queryPointsOther(String memberId, String dateStr);
    
    /**查询用户签到记录
     * @param memberId
     * @return
     */
    public List<MemberCheckin> querySignInRecord(String memberId);
    
    /**用户签到接口
     * @param memberCheckin
     * @return
     */
    public int memberCheckin(MemberCheckin memberCheckin);
}
