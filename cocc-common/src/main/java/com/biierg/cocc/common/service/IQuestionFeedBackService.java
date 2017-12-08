package com.biierg.cocc.common.service;


import java.util.Date;
import java.util.List;

import com.biierg.cocc.common.bean.PsaFeedBack;
import com.biierg.cocc.common.bean.TellUs;
import com.biierg.cocc.common.support.SrvException;


/**
 * @author wxs
 * 
 */
public interface IQuestionFeedBackService {
	
    /**问题反馈接口
     * @param feedBack
     * @return
     */
    public int InsertFeedBack(PsaFeedBack feedBack);
    
    /**
	 * 查询用户反馈
	 * 
	 * @param startDate
	 *            开始日期
	 * @param endDate
	 *            结束日期
	 * @param keyWord
	 *            关键字
	 * @return ApiResult
	 * @throws SrvException
	 */
	public List<TellUs> queryTellUs(Date startDate, Date endDate, String keyWord)
			throws SrvException;
    
}
