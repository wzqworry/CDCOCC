/**
 * 版权所有@2015 北京京投亿雅捷交通科技有限公司；未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.apiutil;

import java.lang.reflect.Method;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.biierg.cocc.common.annotation.GenericLog;

/**
 * 通用的日志输出
 *
 * @author lei
 */
public class GenericLogAdvice {
	private Logger logger = LoggerFactory.getLogger(GenericLogAdvice.class);

	/**
	 * @param
	 * @return
	 * @throws Throwable
	 */
	public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {

		Object[] args = joinPoint.getArgs();
		Object returnObj = null;

		// 查找当前正在环绕的方法
		Signature joinSignature = joinPoint.getSignature();
		if (joinSignature != null && joinSignature instanceof MethodSignature) {
			MethodSignature methodSign = (MethodSignature) joinSignature;

			Method joinMethod = joinPoint.getTarget().getClass().getMethod(methodSign.getName(),
					methodSign.getParameterTypes());

			GenericLog logAnnotation = joinMethod.getAnnotation(GenericLog.class);

			if (logAnnotation == null) {
				return joinPoint.proceed(args);
			}

			if (logAnnotation.beforeLog()) {

				String param1 = "Invoke Method: {}({})";
				Object[] param2 = new Object[] { methodSign.getName(), ToStringBuilder.reflectionToString(args) };

				switch (logAnnotation.level()) {
				case TRACE:
					logger.trace(param1, param2);
					break;
				case DEBUG:
					logger.debug(param1, param2);
					break;
				case INFO:
					logger.info(param1, param2);
					break;
				case WARN:
					logger.warn(param1, param2);
					break;
				case ERROR:
					logger.error(param1, param2);
					break;
				default:
					logger.info(param1, param2);
					break;
				}
			}

			try {
				// 调用核心逻辑
				returnObj = joinPoint.proceed(args);

			} catch (Throwable e) {
				logger.error("Catched Exception: {}", e.getMessage(), e);
				throw e;
			}

			if (logAnnotation.afterLog()) {

				String param1 = "Method Return: {}";
				String param2 = ToStringBuilder.reflectionToString(returnObj);

				switch (logAnnotation.level()) {
				case TRACE:
					logger.trace(param1, param2);
					break;
				case DEBUG:
					logger.debug(param1, param2);
					break;
				case INFO:
					logger.info(param1, param2);
					break;
				case WARN:
					logger.warn(param1, param2);
					break;
				case ERROR:
					logger.error(param1, param2);
					break;
				default:
					logger.info(param1, param2);
					break;
				}
			}
		}

		return returnObj;
	}

	/**
	 * 核心业务逻辑调用正常退出后，不管是否有返回值，正常退出后，均执行此Advice
	 * 
	 * @param joinPoint
	 */
	public void doReturn(JoinPoint joinPoint) {
	}

	/**
	 * 核心业务逻辑调用异常退出后，执行此Advice，处理错误信息
	 * 
	 * @param joinPoint
	 * @param ex
	 */
	public void doThrowing(JoinPoint joinPoint, Throwable ex) {
	}
}
