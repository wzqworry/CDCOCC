/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

import java.util.List;
import com.biierg.cocc.common.bean.Member;

/**
 * 用户相关服务
 */
public interface IUserService {

	/**
	 * SRVA001 - 用户登录
	 *
	 * @param userid
	 * @param passwd
	 * @return
	 */
	public boolean login(String userId, String passwd);

	/**
	 * SRVB002 - 获取用户信息
	 *
	 * @param userid
	 * @return
	 */
	public Member findById(String userId);

	/**
	 * 用户注册
	 * 
	 * @param phone
	 * @param password
	 * @return
	 */
	public int userRegister(Member member);

	/**
	 * 重置密码
	 * 
	 * @param member
	 * @return
	 */
	public int restPassWord(Member member);

	/**
	 * 修改个人信息
	 * 
	 * @param member
	 * @return
	 */
	public int updatePersonal(Member member);

	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	public List<Member> queryAllMember();

	/**
	 * 通过推荐人id(recommend_id)查询 注册人id(member_id)
	 * 
	 * @return
	 */
	public Member queryMemberId(String recommend_id);
}
