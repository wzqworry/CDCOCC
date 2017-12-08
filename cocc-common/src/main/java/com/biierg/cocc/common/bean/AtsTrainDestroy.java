/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import com.biierg.cocc.common.bean.AtsMessage.PackageData;
import com.biierg.cocc.common.util.ByteUtils;

/**
 * ATS - 列车删除消息
 * 
 * @author lei
 */
public class AtsTrainDestroy extends AtsMessage.PackageData {
	private static final long serialVersionUID = 1L;

	private String id; // 数据库主键

	private String lineId = ""; // 线路号
	private String rtuId = ""; // 集中站站号
	private String coccWindow = ""; // COCC车次窗编号
	private String coccWindowOffset = ""; // 列车在车次窗中的位置
	private String devType = ""; // 列车所在的设备类型
	private String devName = ""; // 列车所在的设备名称
	private String trainIndex = ""; // 列车标示号，全线唯一（若无法提供，缺少值为0）
	private String groupId = ""; // 列车组编号

	private LocalDateTime updateTime; // 数据实际接收时间

	public AtsTrainDestroy() {
	}

	public AtsTrainDestroy(byte[] bytes) {
		this.setBuffer(bytes);
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the lineId
	 */
	public String getLineId() {
		return lineId;
	}

	/**
	 * @param lineId
	 *            the lineId to set
	 */
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	/**
	 * @return the rtuId
	 */
	public String getRtuId() {
		return rtuId;
	}

	/**
	 * @param rtuId the rtuId to set
	 */
	public void setRtuId(String rtuId) {
		this.rtuId = rtuId;
	}

	/**
	 * @return the coccWindow
	 */
	public String getCoccWindow() {
		return coccWindow;
	}

	/**
	 * @param coccWindow the coccWindow to set
	 */
	public void setCoccWindow(String coccWindow) {
		this.coccWindow = coccWindow;
	}

	/**
	 * @return the coccWindowOffset
	 */
	public String getCoccWindowOffset() {
		return coccWindowOffset;
	}

	/**
	 * @param coccWindowOffset the coccWindowOffset to set
	 */
	public void setCoccWindowOffset(String coccWindowOffset) {
		this.coccWindowOffset = coccWindowOffset;
	}

	/**
	 * @return the devType
	 */
	public String getDevType() {
		return devType;
	}

	/**
	 * @param devType the devType to set
	 */
	public void setDevType(String devType) {
		this.devType = devType;
	}

	/**
	 * @return the devName
	 */
	public String getDevName() {
		return devName;
	}

	/**
	 * @param devName the devName to set
	 */
	public void setDevName(String devName) {
		this.devName = devName;
	}

	/**
	 * @return the trainIndex
	 */
	public String getTrainIndex() {
		return trainIndex;
	}

	/**
	 * @param trainIndex the trainIndex to set
	 */
	public void setTrainIndex(String trainIndex) {
		this.trainIndex = trainIndex;
	}

	/**
	 * @return the groupId
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * @param groupId
	 *            the groupId to set
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return Date.from(updateTime.atZone(ZoneId.systemDefault()).toInstant());
	}

	/**
	 * @param updateTime
	 *            the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}

	@Override
	public PackageData fill() {

		if (buffer == null) {
			buffer = new byte[62];
		}

		ByteUtils.fill(buffer, 0, ByteUtils.getBytes4Bigendian(length() - 2, new byte[2]));
		ByteUtils.fill(buffer, 2, ByteUtils.getBytes4Bigendian(timestamp, new byte[4]));
		ByteUtils.fill(buffer, 6, ByteUtils.getBytes4Bigendian(version, new byte[2]));
		ByteUtils.fill(buffer, 8, ByteUtils.getBytes4Bigendian(msgId, new byte[2]));

		ByteUtils.fill(buffer, 10, ByteUtils.getBytes4Bigendian(Integer.parseInt(lineId), new byte[2]));
		ByteUtils.fill(buffer, 12, ByteUtils.getBytes4Bigendian(Integer.parseInt(rtuId), new byte[2]));
		ByteUtils.fill(buffer, 14, ByteUtils.getBytes4Bigendian(Integer.parseInt(coccWindow), new byte[2]));
		ByteUtils.fill(buffer, 16, ByteUtils.getBytes4Bigendian(Integer.parseInt(coccWindowOffset), new byte[1]));
		ByteUtils.fill(buffer, 17, ByteUtils.getBytes4Bigendian(Integer.parseInt(devType), new byte[2]));
		ByteUtils.fill(buffer, 19, fillBytes(new byte[24], devName.getBytes(Charset.forName("GB2312"))));
		ByteUtils.fill(buffer, 43, fillBytes(new byte[10], trainIndex.getBytes(Charset.forName("GB2312"))));
		ByteUtils.fill(buffer, 53, fillBytes(new byte[9], groupId.getBytes(Charset.forName("GB2312"))));

		return this;
	}

	@Override
	public void setBuffer(byte[] buffer) {
		super.setBuffer(buffer);

		lineId = String.valueOf(ByteUtils.getInt4Bigendian(buffer, 10, 12));
		rtuId = String.valueOf(ByteUtils.getInt4Bigendian(buffer, 12, 14));
		coccWindow = String.valueOf(ByteUtils.getInt4Bigendian(buffer, 14, 16));
		coccWindowOffset = String.valueOf(ByteUtils.getInt4Bigendian(buffer, 16, 17));
		devType = String.valueOf(ByteUtils.getInt4Bigendian(buffer, 17, 19));

		devName = encode(ByteUtils.getRange(buffer, 19, 43));
		trainIndex = encode(ByteUtils.getRange(buffer, 43, 53));
		groupId = encode(ByteUtils.getRange(buffer, 53, 62));
	}
}
