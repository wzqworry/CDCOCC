package com.biierg.cocc.common.apiutil;

import com.biierg.cocc.common.annotation.DataSource;
import com.biierg.cocc.common.support.DataSourceContextHolder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * Created by wzq on 2017/8/21.
 */
public class DataSourceAdvice {
    private Logger logger = LoggerFactory.getLogger(DataSourceAdvice.class);

    /**
     * 拦截目标方法，获取由@DataSource指定的数据源标识，设置到线程存储中以便切换数据源
     *
     * @param point
     * @throws Exception
     */
   public void before(JoinPoint point) throws Exception {
       Class<?> target = point.getTarget().getClass();
       MethodSignature signature = (MethodSignature) point.getSignature();
       // 默认使用目标类型的注解，如果没有则使用其实现接口的注解
       for (Class<?> clazz : target.getInterfaces()) {
           resolveDataSource(clazz, signature.getMethod());
       }
       resolveDataSource(target, signature.getMethod());

   }

    public void after(JoinPoint point) throws Exception {
        DataSourceContextHolder.clearDbType();
    }

    /**
     * 提取目标对象方法注解和类型注解中的数据源标识
     * @param clazz
     * @param method
     */
    private void resolveDataSource(Class<?> clazz, Method method) {
        try {
            Class<?>[] types = method.getParameterTypes();
            // 默认使用类型注解
            if (clazz.isAnnotationPresent(DataSource.class)) {
                DataSource source = clazz.getAnnotation(DataSource.class);
                DataSourceContextHolder.setDbType(source.value());
            }
            // 方法注解可以覆盖类型注解
            Method m = clazz.getMethod(method.getName(), types);
            if (m != null && m.isAnnotationPresent(DataSource.class)) {
                DataSource source = m.getAnnotation(DataSource.class);
                DataSourceContextHolder.setDbType(source.value());
            }
        } catch (Exception e) {
            logger.error("注解提取失败"+clazz + ":" + e.getMessage());
        }
    }
}
