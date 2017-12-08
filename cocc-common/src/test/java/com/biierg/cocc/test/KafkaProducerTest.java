/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.test;

import com.biierg.cocc.common.mq.impl.KfkProducer;
import com.biierg.cocc.common.support.SimpleMessage;

/**
 * @author lei
 *
 */
public class KafkaProducerTest {

	public static void main(String[] args) {
		KfkProducer.Byte producer = new KfkProducer.Byte();
		producer.setServers("cnode-1:9092,cnode-2:9092,cnode-3:9092");
		producer.setTopicName("test-obj");
		producer.start();
		
		for (int i = 0; i < 100; i++) {
			producer.sendMessage(new SimpleMessage("K-" + i, "helo kafka msg[" + i + "]"));
		}
		producer.destroy();
	}
}
