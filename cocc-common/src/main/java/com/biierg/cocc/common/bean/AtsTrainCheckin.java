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
 * ATS - 列车报点消息
 * 
 * @author lei
 */
public class AtsTrainCheckin extends AtsMessage.PackageData {
	private static final long serialVersionUID = 1L;

	private String id; // 数据库主键

	private String lineId = ""; // 线路号
	private String trainId = ""; // 表号
	private String globalId = ""; // 车次号
	private String localSubId = ""; // 局部序列号
	private String groupId = ""; // 车组号
	private String destinationId = ""; // 目的地
	private int trainType = 0; // 列车类型
	private int dir = 0; // 运行方向
	private String stationId = ""; // 站号
	private String sideId = ""; // 站台编号
	private String trackName = ""; // 轨道名称
	private int recordType = 0; // 到发点类型
	private LocalDateTime recordTime; // 到发时间

	private LocalDateTime updateTime; // 数据实际接收时间

	public AtsTrainCheckin() {
	}

	public AtsTrainCheckin(byte[] bytes) {
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
	 * @return the trainId
	 */
	public String getTrainId() {
		return trainId;
	}

	/**
	 * @param trainId
	 *            the trainId to set
	 */
	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}

	/**
	 * @return the globalId
	 */
	public String getGlobalId() {
		return globalId;
	}

	/**
	 * @param globalId
	 *            the globalId to set
	 */
	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	/**
	 * @return the localSubId
	 */
	public String getLocalSubId() {
		return localSubId;
	}

	/**
	 * @param localSubId
	 *            the localSubId to set
	 */
	public void setLocalSubId(String localSubId) {
		this.localSubId = localSubId;
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
	 * @return the destinationId
	 */
	public String getDestinationId() {
		return destinationId;
	}

	/**
	 * @param destinationId
	 *            the destinationId to set
	 */
	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}

	/**
	 * @return the trainType
	 */
	public int getTrainType() {
		return trainType;
	}

	/**
	 * @param trainType
	 *            the trainType to set
	 */
	public void setTrainType(int trainType) {
		this.trainType = trainType;
	}

	/**
	 * @return the dir
	 */
	public int getDir() {
		return dir;
	}

	/**
	 * @param dir
	 *            the dir to set
	 */
	public void setDir(int dir) {
		this.dir = dir;
	}

	/**
	 * @return the stationId
	 */
	public String getStationId() {
		return stationId;
	}

	/**
	 * @param stationId
	 *            the stationId to set
	 */
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	/**
	 * @return the sideId
	 */
	public String getSideId() {
		return sideId;
	}

	/**
	 * @param sideId
	 *            the sideId to set
	 */
	public void setSideId(String sideId) {
		this.sideId = sideId;
	}

	/**
	 * @return the trackName
	 */
	public String getTrackName() {
		return trackName;
	}

	/**
	 * @param trackName
	 *            the trackName to set
	 */
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	/**
	 * @return the recordType
	 */
	public int getRecordType() {
		return recordType;
	}

	/**
	 * @param recordType
	 *            the recordType to set
	 */
	public void setRecordType(int recordType) {
		this.recordType = recordType;
	}

	/**
	 * @return the recordTime
	 */
	public Date getRecordTime() {
		return Date.from(recordTime.atZone(ZoneId.systemDefault()).toInstant());
	}

	/**
	 * @param recordTime
	 *            the recordTime to set
	 */
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
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
			buffer = new byte[90];
		}

		ByteUtils.fill(buffer, 0, ByteUtils.getBytes4Bigendian(length() - 2, new byte[2]));
		ByteUtils.fill(buffer, 2, ByteUtils.getBytes4Bigendian(timestamp, new byte[4]));
		ByteUtils.fill(buffer, 6, ByteUtils.getBytes4Bigendian(version, new byte[2]));
		ByteUtils.fill(buffer, 8, ByteUtils.getBytes4Bigendian(msgId, new byte[2]));

		ByteUtils.fill(buffer, 10, ByteUtils.getBytes4Bigendian(Integer.parseInt(lineId), new byte[2]));
		ByteUtils.fill(buffer, 12, fillBytes(new byte[9], trainId.getBytes(Charset.forName("GB2312"))));
		ByteUtils.fill(buffer, 21, fillBytes(new byte[12], globalId.getBytes(Charset.forName("GB2312"))));
		ByteUtils.fill(buffer, 33, fillBytes(new byte[4], localSubId.getBytes(Charset.forName("GB2312"))));
		ByteUtils.fill(buffer, 37, fillBytes(new byte[9], groupId.getBytes(Charset.forName("GB2312"))));
		ByteUtils.fill(buffer, 46, fillBytes(new byte[4], destinationId.getBytes(Charset.forName("GB2312"))));

		ByteUtils.fill(buffer, 50, ByteUtils.getBytes4Bigendian(trainType, new byte[2]));
		ByteUtils.fill(buffer, 52, ByteUtils.getBytes4Bigendian(dir, new byte[1]));

		ByteUtils.fill(buffer, 53, ByteUtils.getBytes4Bigendian(Integer.parseInt(stationId), new byte[2]));
		ByteUtils.fill(buffer, 55, ByteUtils.getBytes4Bigendian(Integer.parseInt(sideId), new byte[2]));
		ByteUtils.fill(buffer, 57, fillBytes(new byte[20], trackName.getBytes(Charset.forName("GB2312"))));

		ByteUtils.fill(buffer, 77, ByteUtils.getBytes4Bigendian(recordType, new byte[2]));

		// record time
		ByteUtils.fill(buffer, 79, ByteUtils.getBytes4Bigendian(
				Integer.parseInt(String.valueOf(recordTime.getYear()).substring(0, 2)), new byte[1]));
		ByteUtils.fill(buffer, 80, ByteUtils
				.getBytes4Bigendian(Integer.parseInt(String.valueOf(recordTime.getYear()).substring(2)), new byte[1]));
		ByteUtils.fill(buffer, 81, ByteUtils.getBytes4Bigendian(recordTime.getMonthValue(), new byte[1]));
		ByteUtils.fill(buffer, 82, ByteUtils.getBytes4Bigendian(recordTime.getDayOfMonth(), new byte[1]));
		ByteUtils.fill(buffer, 83, ByteUtils.getBytes4Bigendian(recordTime.getHour(), new byte[1]));
		ByteUtils.fill(buffer, 84, ByteUtils.getBytes4Bigendian(recordTime.getMinute(), new byte[1]));
		ByteUtils.fill(buffer, 85, ByteUtils.getBytes4Bigendian(recordTime.getSecond(), new byte[1]));

		// 预留
		ByteUtils.fill(buffer, 86, ByteUtils.getBytes4Bigendian(0x0, new byte[4]));

		return this;
	}

	@Override
	public void setBuffer(byte[] buffer) {
		super.setBuffer(buffer);

		lineId = String.valueOf(ByteUtils.getInt4Bigendian(buffer, 10, 12));
		trainId = encode(ByteUtils.getRange(buffer, 12, 21));
		globalId = encode(ByteUtils.getRange(buffer, 21, 33));
		localSubId = encode(ByteUtils.getRange(buffer, 33, 37));
		groupId = encode(ByteUtils.getRange(buffer, 37, 46));
		destinationId = encode(ByteUtils.getRange(buffer, 46, 50));

		trainType = ByteUtils.getInt4Bigendian(buffer, 50, 52);
		dir = ByteUtils.getInt4Bigendian(buffer, 52, 53);

		stationId = String.valueOf(ByteUtils.getInt4Bigendian(buffer, 53, 55));
		sideId = String.valueOf(ByteUtils.getInt4Bigendian(buffer, 55, 57));

		trackName = encode(ByteUtils.getRange(buffer, 57, 77));

		recordType = ByteUtils.getInt4Bigendian(buffer, 77, 79);

		// record time
		recordTime = LocalDateTime.of(
				// year
				Integer.parseInt(String.valueOf(ByteUtils.getInt4Bigendian(buffer, 79, 80))
						+ String.valueOf(ByteUtils.getInt4Bigendian(buffer, 80, 81))),
				// month
				ByteUtils.getInt4Bigendian(buffer, 81, 82),
				// dayOfMonth
				ByteUtils.getInt4Bigendian(buffer, 82, 83),
				// hour
				ByteUtils.getInt4Bigendian(buffer, 83, 84),
				// minute
				ByteUtils.getInt4Bigendian(buffer, 84, 85),
				// second
				ByteUtils.getInt4Bigendian(buffer, 85, 86));
	}
}
