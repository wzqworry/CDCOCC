package com.biierg.cocc.common.mq.impl;

import java.io.Serializable;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.biierg.cocc.common.mq.IMQProducer;
import com.biierg.cocc.common.util.BeanUtils;
import com.biierg.cocc.common.util.UUIDUtil;

/**
 * 基于Kafka消息总线的生产者实现类
 * <p>
 * Created by lei on 2016/12/6.
 */
public abstract class KfkProducer {

	protected Properties kfkConfig;

	protected java.lang.String servers;
	protected java.lang.String topicName;

	public java.lang.String getServers() {
		return servers;
	}

	public void setServers(java.lang.String servers) {
		this.servers = servers;
	}

	public java.lang.String getTopicName() {
		return topicName;
	}

	public void setTopicName(java.lang.String topicName) {
		this.topicName = topicName;
	}

	/**
	 * Kafka Cluster configuration
	 *
	 * @return
	 */
	protected void initKfkConfiguration() {
		kfkConfig = new Properties();
		kfkConfig.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, servers);
		kfkConfig.put(ProducerConfig.ACKS_CONFIG, "all");
		kfkConfig.put(ProducerConfig.RETRIES_CONFIG, 0);
		kfkConfig.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);
		kfkConfig.put(ProducerConfig.LINGER_MS_CONFIG, 1);
		kfkConfig.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);
		kfkConfig.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringSerializer");
	}

	/**
	 * 销毁连接
	 */
	public abstract void destroy();

	public static class String extends KfkProducer implements IMQProducer {
		private Logger logger = LoggerFactory.getLogger(KfkProducer.String.class);

		private Producer<java.lang.String, java.lang.String> producer;

		public boolean start() {

			logger.debug("准备连接至 Kafka Cluster [{}] ...", servers);

			try {

				initKfkConfiguration();

				// 初始化文本消息发送器
				kfkConfig.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
						"org.apache.kafka.common.serialization.StringSerializer");
				producer = new KafkaProducer<>(kfkConfig);

				logger.debug("连接至 Kafka Cluster [{}] ... OK", servers);

				return true;
			} catch (Throwable e) {
				logger.debug("无法连接至 Kafka Cluster [{}]", servers, e);

				return false;
			}
		}

		/**
		 * 销毁连接
		 */
		@Override
		public void destroy() {

			try {
				if (producer != null) {
					producer.close();
				}
			} catch (Throwable e) {
			}
		}

		@Override
		public boolean sendMessage(Serializable message) {

			try {
				if (message != null) {
					producer.send(new ProducerRecord<>(topicName, UUIDUtil.generate(), message.toString()));
					producer.flush();
				}
				return true;
			} catch (Throwable e) {
				return false;
			}
		}

		@Override
		public boolean sendBytesMessage(byte[] message) {

			try {
				if (message != null) {
					producer.send(new ProducerRecord<>(topicName, UUIDUtil.generate(), message.toString()));
					producer.flush();
				}
				return true;
			} catch (Throwable e) {
				return false;
			}
		}
	}

	public static class Byte extends KfkProducer implements IMQProducer {
		private Logger logger = LoggerFactory.getLogger(KfkProducer.Byte.class);

		private Producer<java.lang.String, byte[]> producer;

		public boolean start() {

			logger.debug("准备连接至 Kafka Cluster [{}] ...", servers);

			try {

				initKfkConfiguration();

				// 初始化二进制消息发送器
				kfkConfig.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
						"org.apache.kafka.common.serialization.ByteArraySerializer");
				producer = new KafkaProducer<>(kfkConfig);

				logger.debug("连接至 Kafka Cluster [{}] ... OK", servers);

				return true;
			} catch (Throwable e) {
				logger.debug("无法连接至 Kafka Cluster [{}]", servers, e);

				return false;
			}
		}

		/**
		 * 销毁连接
		 */
		@Override
		public void destroy() {

			try {
				if (producer != null) {
					producer.close();
				}
			} catch (Throwable e) {
			}
		}

		@Override
		public boolean sendMessage(Serializable message) {

			try {
				if (message != null) {
					producer.send(
							new ProducerRecord<>(topicName, UUIDUtil.generate(), BeanUtils.object2Bytes(message)));
					producer.flush();
				}
				return true;
			} catch (Throwable e) {
				return false;
			}
		}

		@Override
		public boolean sendBytesMessage(byte[] message) {

			try {
				if (message != null) {
					producer.send(new ProducerRecord<>(topicName, UUIDUtil.generate(), message));
					producer.flush();
				}
				return true;
			} catch (Throwable e) {
				return false;
			}
		}
	}
}
