/**
 * 版权所有@2015 北京京投亿雅捷交通科技有限公司；未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用来对需要记录日志的方法进行标注
 *
 * @author lei
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ java.lang.annotation.ElementType.METHOD })
public @interface GenericLog {

	public static enum Level {
		TRACE, DEBUG, INFO, WARN, ERROR
	}

	/**
	 * 日志级别
	 * 
	 * @return
	 */
	Level level() default Level.INFO;

	/**
	 * 方法调用之前的日志
	 * 
	 * @return
	 */
	boolean beforeLog() default true;

	/**
	 * 方法调用之后的日志
	 * 
	 * @return
	 */
	boolean afterLog() default true;
}
