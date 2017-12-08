/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.biierg.cocc.common.util.ByteUtils;

/**
 * ATS 消息帧
 * 
 * @author lei
 */
public class AtsMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	// 发送方的计算机唯一ID
	private int systemId;

	// 每个消息帧中消息的总长度+1字节（Multi-flag）
	// 最长为1025，如果数据大于1024字节，剩余的在紧接着的几帧数据中发送
	private int totalLength = 0;

	// 帧标识位，0表示没有后续帧，1表示还有后续帧
	private int multiFlag;

	private List<PackageData> data = new ArrayList<>();
	
	public AtsMessage() {}
	
	public AtsMessage(int systemId) {
		this.systemId = systemId;
	}

	/**
	 * @return the systemId
	 */
	public int getSystemId() {
		return systemId;
	}

	/**
	 * @param systemId
	 *            the systemId to set
	 */
	public void setSystemId(int systemId) {
		this.systemId = systemId;
	}

	/**
	 * @return the totalLength
	 */
	public int getTotalLength() {
		return totalLength;
	}

	/**
	 * @param length
	 *            the totalLength to set
	 */
	public void setTotalLength(int totalLength) {
		this.totalLength = totalLength;
	}

	/**
	 * @return the multiFlag
	 */
	public int getMultiFlag() {
		return multiFlag;
	}

	/**
	 * @param multiFlag
	 *            the multiFlag to set
	 */
	public void setMultiFlag(int multiFlag) {
		this.multiFlag = multiFlag;
	}

	/**
	 * @return the data
	 */
	public List<PackageData> getData() {
		return data;
	}
	
	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(List<PackageData> data) {
		this.data = data;

		this.totalLength = data == null ? 0 : data.stream().collect(Collectors.summingInt(PackageData::length));
	}

	public AtsMessage addBody(PackageData body) {
		this.data.add(body);

		this.totalLength += body == null ? 0 : body.length();
		
		return this;
	}

	public static abstract class PackageData implements Serializable {
		private static final long serialVersionUID = 1L;
		
		protected byte[] buffer;

		protected long timestamp;
		protected int version;
		protected int msgId;
		
		public abstract PackageData fill();

		public int length() {
			return buffer == null ? 0 : buffer.length;
		}

		/**
		 * @return the timestamp
		 */
		public long getTimestamp() {
			return timestamp;
		}

		/**
		 * @param timestamp
		 *            the timestamp to set
		 */
		public void setTimestamp(long timestamp) {
			this.timestamp = timestamp;
		}

		/**
		 * @return the version
		 */
		public int getVersion() {
			return version;
		}

		/**
		 * @param version
		 *            the version to set
		 */
		public void setVersion(int version) {
			this.version = version;
		}

		/**
		 * @return the msgId
		 */
		public int getMsgId() {
			return msgId;
		}

		/**
		 * @param msgId
		 *            the msgId to set
		 */
		public void setMsgId(int msgId) {
			this.msgId = msgId;
		}

		/**
		 * @return the buffer
		 */
		public byte[] getBuffer() {
			return buffer;
		}

		/**
		 * @param buffer the buffer to set
		 */
		public void setBuffer(byte[] buffer) {
			this.buffer = buffer;

			this.timestamp = ByteUtils.getUnsignedInt4Bigendian(buffer, 2, 6);
			this.version = ByteUtils.getInt4Bigendian(buffer, 6, 8);
			this.msgId = ByteUtils.getInt4Bigendian(buffer, 8, 10);
		}
		
		protected byte[] fillBytes(byte[] dest, byte[] bytes) {
			
			for (int i = 0; dest != null && i < dest.length; i++) {
				
				if (bytes != null && bytes.length > i) {
					dest[i] = bytes[i];
				} else {
					dest[i] = '\0';
				}
			}
			
			return dest;
		}
		
		protected String encode(byte[] bytes) {
			
			if (bytes != null) {
				int toIdx = 0;
				for (; toIdx < bytes.length && bytes[toIdx] != '\0'; toIdx++);
				
				return new String(ByteUtils.getRange(bytes, 0, toIdx), Charset.forName("GB2312"));
			}
			
			return null;
		}
	}
}
