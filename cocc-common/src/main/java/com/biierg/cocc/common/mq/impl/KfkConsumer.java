package com.biierg.cocc.common.mq.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.biierg.cocc.common.mq.IMQConsumer;
import com.biierg.cocc.common.mq.IMessageListener;
import com.biierg.cocc.common.util.BeanUtils;
import com.biierg.cocc.common.util.StringUtil;
import com.biierg.cocc.common.util.UUIDUtil;

/**
 * 基于Kafka消息总线的消费者实现类
 * <p>
 * Created by lei on 2016/12/6.
 */
public class KfkConsumer implements IMQConsumer {

	protected final AtomicBoolean closed = new AtomicBoolean(false);

	protected IMessageListener listener;

	protected Properties kfkConfig;

	// consumer group one2one/one2many
	protected java.lang.String groupId;
	// latest earliest
	protected java.lang.String resetOffset = "earliest";

	protected java.lang.String servers;
	protected java.lang.String topicName;
	protected Integer pollTimeout = 3000;

	public java.lang.String getGroupId() {
		return groupId;
	}

	public void setGroupId(java.lang.String groupId) {
		this.groupId = groupId;
	}

	public java.lang.String getResetOffset() {
		return resetOffset;
	}

	public void setResetOffset(java.lang.String resetOffset) {
		this.resetOffset = resetOffset;
	}

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

	public Integer getPollTimeout() {
		return pollTimeout;
	}

	public void setPollTimeout(Integer pollTimeout) {
		this.pollTimeout = pollTimeout;
	}

	/**
	 * Kafka Cluster configuration
	 *
	 * @return
	 */
	protected void initKfkConfiguration() {
		kfkConfig = new Properties();
		kfkConfig.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, servers);
		kfkConfig.put(ConsumerConfig.GROUP_ID_CONFIG, StringUtil.isNull(groupId) ? UUIDUtil.generate32() : groupId);
		kfkConfig.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, resetOffset);
		kfkConfig.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false");
		kfkConfig.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringDeserializer");

		if (pollTimeout < 0) {
			pollTimeout = 0;
		}
	}

	@Override
	public void setMessageListener(IMessageListener listener) {
		this.listener = listener;
	}

	public static class Message extends HashMap<java.lang.String, Object> {
		public static final long serialVersionUID = 1L;

		public static final java.lang.String KEY = "k";
		public static final java.lang.String VALUE = "v";

		public Message(java.lang.String key, Object value) {
			put(KEY, key);
			put(VALUE, value);
		}

		@Override
		public java.lang.String toString() {

			if (get(VALUE) == null) {
				return null;
			}

			return get(VALUE).toString();
		}
	}

	public static class String extends KfkConsumer implements Runnable {
		private Logger logger = LoggerFactory.getLogger(KfkConsumer.String.class);

		private Consumer<java.lang.String, java.lang.String> consumer;

		@Override
		public void run() {
			try {

				consumer.subscribe(Arrays.asList(topicName));
				while (!closed.get()) {

					try {
						ConsumerRecords<java.lang.String, java.lang.String> records = consumer.poll(pollTimeout);

						// 消息处理成功标志
						boolean processResultFlag = true;

						if (records != null) {
							Iterable<ConsumerRecord<java.lang.String, java.lang.String>> rcds = records
									.records(topicName);

							if (rcds != null) {

								for (ConsumerRecord<java.lang.String, java.lang.String> rcd : rcds) {

									// 判断消息处理是否成功
									if (!listener.onMessage(new Message(rcd.key(), rcd.value()))) {
										processResultFlag = false;
									}
								}
							}
						}

						// 消息处理成功后，提交
						if (processResultFlag) {
							consumer.commitAsync();
						}
					} catch (Throwable e) {
						logger.error("消息接收异常", e);
					}
				}
			} catch (WakeupException e) {
				if (!closed.get())
					throw e;
			} finally {
				consumer.close();
			}
		}

		/**
		 * 连接至Kafka Cluster
		 *
		 * @return
		 */
		public boolean start() {
			logger.debug("准备连接至 Kafka Cluster [{}] ...", servers);

			try {

				initKfkConfiguration();

				// 初始化文本消息发送器
				kfkConfig.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
						"org.apache.kafka.common.serialization.StringDeserializer");
				consumer = new KafkaConsumer<>(kfkConfig);

				logger.debug("连接至 Kafka Cluster [{}] ... OK", servers);

				new Thread(this).start();

				return true;
			} catch (Throwable e) {
				logger.debug("无法连接至 Kafka Cluster [{}]", servers, e);

				return false;
			}
		}

		/**
		 * 销毁连接
		 */
		public void destroy() {
			closed.set(true);
			consumer.wakeup();
		}
	}

	public static class Byte extends KfkConsumer implements Runnable {
		private Logger logger = LoggerFactory.getLogger(KfkConsumer.String.class);

		private Consumer<java.lang.String, byte[]> consumer;

		private Class<?> messageClass;

		public Class<?> getMessageClass() {
			return messageClass;
		}

		public void setMessageClass(Class<?> messageClass) {
			this.messageClass = messageClass;
		}

		@Override
		public void run() {
			try {

				if (messageClass == null) {
					throw new IllegalArgumentException("属性 [messageClass] 不能为空");
				}

				consumer.subscribe(Arrays.asList(topicName));
				while (!closed.get()) {

					try {
						ConsumerRecords<java.lang.String, byte[]> records = consumer.poll(pollTimeout);

						// 消息处理成功标志
						boolean processResultFlag = true;

						if (records != null) {
							Iterable<ConsumerRecord<java.lang.String, byte[]>> rcds = records.records(topicName);

							if (rcds != null) {
								for (ConsumerRecord<java.lang.String, byte[]> rcd : rcds) {

									// 判断消息处理是否成功
									if (!listener.onMessage(new Message(rcd.key(),
											BeanUtils.bytes2Object(rcd.value(), messageClass)))) {
										processResultFlag = false;
									}
								}
							}
						}

						// 消息处理成功后，提交
						if (processResultFlag) {
							consumer.commitAsync();
						}
					} catch (Throwable e) {
						logger.error("消息接收异常", e);
					}
				}
			} catch (IllegalArgumentException e) {
				logger.error(e.getMessage(), e);
			} catch (WakeupException e) {
				if (!closed.get())
					throw e;
			} finally {
				consumer.close();
			}
		}

		/**
		 * 连接至Kafka Cluster
		 *
		 * @return
		 */
		public boolean start() {
			logger.debug("准备连接至 Kafka Cluster [{}] ...", servers);

			try {

				initKfkConfiguration();

				// 初始化二进制消息发送器
				kfkConfig.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
						"org.apache.kafka.common.serialization.ByteArrayDeserializer");
				consumer = new KafkaConsumer<>(kfkConfig);

				logger.debug("连接至 Kafka Cluster [{}] ... OK", servers);

				new Thread(this).start();

				return true;
			} catch (Throwable e) {
				logger.debug("无法连接至 Kafka Cluster [{}]", servers, e);

				return false;
			}
		}

		/**
		 * 销毁连接
		 */
		public void destroy() {
			closed.set(true);
			consumer.wakeup();
		}
	}
}
