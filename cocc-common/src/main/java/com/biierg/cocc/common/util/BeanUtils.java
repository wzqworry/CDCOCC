package com.biierg.cocc.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 提供JavaBean的序列化及反序列化方法
 * 
 * @author lei
 */
public class BeanUtils {

	// 用于从Bean中取值时的级联表达式
	private static final Pattern ChainExp = Pattern.compile("((\\w+)\\.)");

	/**
	 * 将字节数组反序列化成Java对象
	 * 
	 * @param objBytes
	 * @param objClass
	 * 
	 * @return Object
	 */
	public static <T> T bytes2Object(byte[] objBytes, Class<T> objClass) {

		try (ByteArrayInputStream bais = new ByteArrayInputStream(objBytes);
				ObjectInputStream ois = new ObjectInputStream(bais)) {
			return objClass.cast(ois.readObject());
		} catch (Throwable e) {
		}

		return null;
	}

	/**
	 * 将Java对象序列化成字节数组
	 * 
	 * @param obj
	 * @return bytes[]
	 */
	public static byte[] object2Bytes(Object obj) {

		try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos)) {

			oos.writeObject(obj);

			return baos.toByteArray();
		} catch (Throwable e) {
		}

		return null;
	}

	public static String getGetterMethodName(String fieldName) {
		return "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
	}

	public static String getSetterMethodName(String fieldName) {
		return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
	}

	/**
	 * 从给定的Bean获取属性值；
	 * 
	 * @param bean
	 *            给定的Bean，可以是Map
	 * @param fldName
	 *            属性名称，支持级联表达式“.”
	 * @return
	 */
	public static <T> Object getFieldValue(T bean, String fldName) {

		try {
			if (bean != null) {

				// 级联表达式
				Matcher chainMatcher = ChainExp.matcher(fldName);
				if (chainMatcher.find()) {

					String firstName = chainMatcher.group(2);
					fldName = chainMatcher.replaceFirst("");

					return getFieldValue(getFieldValue(bean, firstName), fldName);
				} else {

					if (bean instanceof Map) {
						return Map.class.cast(bean).get(fldName);
					}

					Class<?> beanCls = bean.getClass();
					String getterMethodName = getGetterMethodName(fldName);

					try {
						Method getterMethod = beanCls.getMethod(getterMethodName);
						if (getterMethod != null) {
							return beanCls.getMethod(getterMethodName).invoke(bean);
						}
					} catch (Throwable e) {
					}

					Field field = beanCls.getDeclaredField(fldName);
					field.setAccessible(true);
					return field.get(bean);
				}
			}
		} catch (Throwable t) {
		}

		return null;
	}

	/**
	 * 设置单个属性
	 * 
	 * @param bean
	 * @param fieldName
	 * @param fieldType
	 * @param fieldValue
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchFieldException
	 */
	public static <T> void setFieldValue(T bean, String fieldName, Class<?> fieldType, Object fieldValue)
			throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException,
			InvocationTargetException, NoSuchFieldException {

		try {
			String fieldSetterName = BeanUtils.getSetterMethodName(fieldName);
			Method fieldSetterMethod = bean.getClass().getMethod(fieldSetterName, fieldType);

			if (fieldSetterMethod != null) {
				fieldSetterMethod.invoke(bean, fieldValue);
			}
		} catch (Throwable e) {
		}

		Field field = bean.getClass().getDeclaredField(fieldName);
		field.setAccessible(true);
		field.set(bean, fieldValue);
	}
}
