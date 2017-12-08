package com.biierg.cocc.common.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 提供与集合有关的静态方法
 * 
 * @author lei
 */
public class CollectionUtil {

	/**
	 * 转换给定的集合类型
	 * 
	 * @param shortList
	 * @return
	 */
	public static byte[] convertToByteAry(List<Short> shortList) {
		byte[] bytes = null;

		if (shortList != null && shortList.size() > 0) {
			bytes = new byte[shortList.size()];
			
			for (int i = 0, s = shortList.size(); i < s; i++) {
				bytes[i] = (shortList.get(i).byteValue());
			}
		}

		return bytes;
	}

	/**
	 * 转换给定的集合类型
	 * 
	 * @param list
	 * @return
	 */
	public static List<Short> convertToShort(List<String> strList) {
		List<Short> shortList = new ArrayList<Short>();

		if (strList != null && strList.size() > 0) {
			for (String str : strList) {
				shortList.add(Short.parseShort(str));
			}
		}

		return shortList;
	}

	/**
	 * 转换给定的集合类型
	 * 
	 * @param list
	 * @return
	 */
	public static List<String> convertToString(List<Short> shortList) {
		List<String> strList = new ArrayList<String>();

		if (shortList != null && shortList.size() > 0) {
			for (Short val : shortList) {
				strList.add(String.valueOf(val));
			}
		}

		return strList;
	}
}
