/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.biierg.cocc.common.util.ByteUtils;

/**
 * @author lei
 *
 */
public class ByteUtilsTest {

	@Test
	public void test() {
		
		int v = -123;
		
		byte[] vBytes = ByteUtils.getBytes(v, new byte[4]);
		byte[] vBytes4Bigendian = ByteUtils.getBytes4Bigendian(v, new byte[4]);
		
		System.out.println(ByteUtils.getInt(vBytes));
		System.out.println(ByteUtils.getInt4Bigendian(vBytes));
		
		System.out.println(ByteUtils.getInt(vBytes4Bigendian));
		System.out.println(ByteUtils.getInt4Bigendian(vBytes4Bigendian));
	}
}
