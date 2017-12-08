/**
 * 版权所有@2015 北京京投亿雅捷交通科技有限公司；未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 异步任务处理服务
 *
 * @author lei
 */
public class AsyncService {
	private ExecutorService executorService;

	private int poolSize = 3;

	public void setPoolSize(int poolSize) {
		this.poolSize = poolSize;
	}

	/**
	 * 启动异步服务
	 */
	public void startup() {
		executorService = Executors.newFixedThreadPool(poolSize);
	}

	/**
	 * 停止提供服务
	 */
	public void shutdown() {
		executorService.shutdown();
	}

	/**
	 * 调度异步任务
	 * 
	 * @param asyncTask
	 */
	public void execute(Runnable asyncTask) {
		executorService.execute(asyncTask);
	}
}
