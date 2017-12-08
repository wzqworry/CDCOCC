/**
 * 版权所有@2015 北京京投亿雅捷交通科技有限公司；未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.apiutil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.biierg.cocc.common.cache.ICache;
import com.biierg.cocc.common.util.Constants;
import com.biierg.cocc.common.util.WebContextUtil;

/**
 * 用于获取Token存入Redis
 *
 * @author lei
 */
public class TknCatchAdvice {
	private Logger logger = LoggerFactory.getLogger(TknCatchAdvice.class);

	// Redis访问接口
	@Resource(name = "redisCache")
	private ICache redisCache;

	/**
	 * 在所有的APP接口方法加入此切面，用于获取请求头信息并保存在Redis中
	 * 
	 * @param
	 * @return
	 * @throws Throwable
	 */
	public void doBefore(JoinPoint point) throws Throwable {
		HttpServletRequest request = WebContextUtil.getRequest();

		// 对传入参数进行预处理
		ApiParam.Header header = new ApiParam.Header().fillBy(request);
		if (header != null) {
			if (logger.isDebugEnabled()) {
				logger.info("获取Head信息: {}", ToStringBuilder.reflectionToString(header));
			}
			
			// 存储会员Token与Header的映射关系（永久保存），用于推送
			redisCache.put(Constants.CacheScope.Platform, header.getTokenId(), header);
		}
	}
}
