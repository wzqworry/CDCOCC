/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.test;

import com.biierg.cocc.common.mq.IMessageListener;
import com.biierg.cocc.common.mq.impl.KfkConsumer;
import com.biierg.cocc.common.support.SimpleMessage;

/**
 * @author lei
 */
public class KafkaCosumerTest {


	public static void main(String[] args) {
		KfkConsumer.Byte consumer = new KfkConsumer.Byte();
		consumer.setServers("cnode-1:9092,cnode-2:9092,cnode-3:9092");
		consumer.setTopicName("test-obj");
		consumer.setGroupId("KafkaConsumerTest");
		consumer.setMessageClass(com.biierg.cocc.common.support.SimpleMessage.class);
		consumer.setMessageListener(new IMessageListener() {

			@Override
			public boolean onMessage(Object message) {
				KfkConsumer.Message msg = (KfkConsumer.Message) message;
				
				String msgKey = msg.get(KfkConsumer.Message.KEY).toString();
				SimpleMessage msgContent = (SimpleMessage) msg.get(KfkConsumer.Message.VALUE);

				System.out.println("received message key: {" + msgKey + "}, value: {" + msgContent + "}");

				return true;
			}

			@Override
			public boolean onBytesMessage(byte[] message) {
				return true;
			}
		});
		consumer.start();
	}
}
