/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.test;

import com.biierg.cocc.common.cache.impl.RedisCluster;

/**
 * @author lei
 *
 */
public class RedisClusterTest {

	public static void main(String[] args) {

		RedisCluster cache = new RedisCluster();
		cache.setClusterHost("10.240.11.145:7003,10.240.11.139:7001,10.240.11.139:7000");
		cache.setNamespace("cocc");
		cache.connect();
		
		cache.put("test", "cluster", "hello redis cluster!");
		
		System.out.println(cache.containsKey("test", "cluster"));
		System.out.println(cache.get("test", "cluster"));
		
		cache.disconnect();
	}
}
