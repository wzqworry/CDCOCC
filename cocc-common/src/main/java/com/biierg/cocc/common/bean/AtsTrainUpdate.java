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
 * ATS - 列车更新消息
 * 
 * @author lei
 */
public class AtsTrainUpdate extends AtsMessage.PackageData {
	private static final long serialVersionUID = 1L;

	private String id; // 数据库主键

	private String lineId = ""; // 线路号
	private String type = ""; // 车次号变化状态
	private String rtuId = ""; // 集中站站号
	private String coccWindow = ""; // COCC车次窗编号
	private String coccWindowOffset = ""; // 列车在车次窗中的位置
	private int devType = 0; // 列车所在的设备类型
	private String devName = ""; // 列车所在的设备名称
	private String trainIndex = ""; // 列车标示号，全线唯一（若无法提供，缺少值为0）
	private String groupId = ""; // 列车组编号
	private String trainId = ""; // 表号
	private String globalId = ""; // 车次号
	private String destinationId = ""; // 目的地号
	private int rollingstock = 0; // 编组数量
	private String driverId = ""; // 司机号
	private String routeId = ""; // 运行路径号
	private int otpTime = 0; // 计划偏离时间
	private int mode = 0; // 列车状态
	
	private LocalDateTime arriveTime; // 列车到点
	private LocalDateTime departTime; // 列车发点
	
	private int rate = 0; // 满载率
	private int speed = 0; // 速度

	public AtsTrainUpdate() {
	}

	public AtsTrainUpdate(byte[] bytes) {
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
	public int getDevType() {
		return devType;
	}

	/**
	 * @param devType the devType to set
	 */
	public void setDevType(int devType) {
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
	 * @return the trainId
	 */
	public String getTrainId() {
		return trainId;
	}

	/**
	 * @param trainId the trainId to set
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
	 * @param globalId the globalId to set
	 */
	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	/**
	 * @return the destinationId
	 */
	public String getDestinationId() {
		return destinationId;
	}

	/**
	 * @param destinationId the destinationId to set
	 */
	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}

	/**
	 * @return the rollingstock
	 */
	public int getRollingstock() {
		return rollingstock;
	}

	/**
	 * @param rollingstock the rollingstock to set
	 */
	public void setRollingstock(int rollingstock) {
		this.rollingstock = rollingstock;
	}

	/**
	 * @return the driverId
	 */
	public String getDriverId() {
		return driverId;
	}

	/**
	 * @param driverId the driverId to set
	 */
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	/**
	 * @return the routeId
	 */
	public String getRouteId() {
		return routeId;
	}

	/**
	 * @param routeId the routeId to set
	 */
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	/**
	 * @return the otpTime
	 */
	public int getOtpTime() {
		return otpTime;
	}

	/**
	 * @param otpTime the otpTime to set
	 */
	public void setOtpTime(int otpTime) {
		this.otpTime = otpTime;
	}

	/**
	 * @return the mode
	 */
	public int getMode() {
		return mode;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(int mode) {
		this.mode = mode;
	}

	/**
	 * @return the arriveTime
	 */
	public Date getArriveTime() {
		return Date.from(arriveTime.atZone(ZoneId.systemDefault()).toInstant());
	}

	/**
	 * @param arriveTime the arriveTime to set
	 */
	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}

	/**
	 * @return the departTime
	 */
	public Date getDepartTime() {
		return Date.from(departTime.atZone(ZoneId.systemDefault()).toInstant());
	}

	/**
	 * @param departTime the departTime to set
	 */
	public void setDepartTime(Date departTime) {
		this.departTime = departTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();;
	}

	/**
	 * @return the rate
	 */
	public int getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(int rate) {
		this.rate = rate;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public PackageData fill() {

		if (buffer == null) {
			buffer = new byte[134];
		}

		ByteUtils.fill(buffer, 0, ByteUtils.getBytes4Bigendian(length() - 2, new byte[2]));
		ByteUtils.fill(buffer, 2, ByteUtils.getBytes4Bigendian(timestamp, new byte[4]));
		ByteUtils.fill(buffer, 6, ByteUtils.getBytes4Bigendian(version, new byte[2]));
		ByteUtils.fill(buffer, 8, ByteUtils.getBytes4Bigendian(msgId, new byte[2]));

		ByteUtils.fill(buffer, 10, ByteUtils.getBytes4Bigendian(Integer.parseInt(lineId), new byte[2]));
		ByteUtils.fill(buffer, 12, ByteUtils.getBytes4Bigendian(Integer.parseInt(type), new byte[2]));
		ByteUtils.fill(buffer, 14, ByteUtils.getBytes4Bigendian(Integer.parseInt(rtuId), new byte[2]));
		ByteUtils.fill(buffer, 16, ByteUtils.getBytes4Bigendian(Integer.parseInt(coccWindow), new byte[2]));
		ByteUtils.fill(buffer, 18, ByteUtils.getBytes4Bigendian(Integer.parseInt(coccWindowOffset), new byte[1]));
		ByteUtils.fill(buffer, 19, ByteUtils.getBytes4Bigendian(devType, new byte[2]));
		ByteUtils.fill(buffer, 21, fillBytes(new byte[24], devName.getBytes(Charset.forName("GB2312"))));
		ByteUtils.fill(buffer, 45, fillBytes(new byte[10], trainIndex.getBytes(Charset.forName("GB2312"))));
		ByteUtils.fill(buffer, 55, fillBytes(new byte[9], groupId.getBytes(Charset.forName("GB2312"))));
		ByteUtils.fill(buffer, 64, fillBytes(new byte[9], trainId.getBytes(Charset.forName("GB2312"))));
		ByteUtils.fill(buffer, 73, fillBytes(new byte[12], globalId.getBytes(Charset.forName("GB2312"))));
		ByteUtils.fill(buffer, 85, fillBytes(new byte[4], destinationId.getBytes(Charset.forName("GB2312"))));
		ByteUtils.fill(buffer, 89, ByteUtils.getBytes4Bigendian(rollingstock, new byte[1]));
		ByteUtils.fill(buffer, 90, fillBytes(new byte[13], driverId.getBytes(Charset.forName("GB2312"))));
		ByteUtils.fill(buffer, 103, ByteUtils.getBytes4Bigendian(Integer.parseInt(routeId), new byte[2]));
		ByteUtils.fill(buffer, 105, ByteUtils.getBytes4Bigendian(otpTime, new byte[4]));
		ByteUtils.fill(buffer, 109, ByteUtils.getBytes4Bigendian(mode, new byte[4]));
		
		// arriveTime
		ByteUtils.fill(buffer, 113, ByteUtils.getBytes4Bigendian(
				Integer.parseInt(String.valueOf(arriveTime.getYear()).substring(0, 2)), new byte[1]));
		ByteUtils.fill(buffer, 114, ByteUtils
				.getBytes4Bigendian(Integer.parseInt(String.valueOf(arriveTime.getYear()).substring(2)), new byte[1]));
		ByteUtils.fill(buffer, 115, ByteUtils.getBytes4Bigendian(arriveTime.getMonthValue(), new byte[1]));
		ByteUtils.fill(buffer, 116, ByteUtils.getBytes4Bigendian(arriveTime.getDayOfMonth(), new byte[1]));
		ByteUtils.fill(buffer, 117, ByteUtils.getBytes4Bigendian(arriveTime.getHour(), new byte[1]));
		ByteUtils.fill(buffer, 118, ByteUtils.getBytes4Bigendian(arriveTime.getMinute(), new byte[1]));
		ByteUtils.fill(buffer, 119, ByteUtils.getBytes4Bigendian(arriveTime.getSecond(), new byte[1]));

		// departTime
		ByteUtils.fill(buffer, 120, ByteUtils.getBytes4Bigendian(
				Integer.parseInt(String.valueOf(departTime.getYear()).substring(0, 2)), new byte[1]));
		ByteUtils.fill(buffer, 121, ByteUtils
				.getBytes4Bigendian(Integer.parseInt(String.valueOf(departTime.getYear()).substring(2)), new byte[1]));
		ByteUtils.fill(buffer, 122, ByteUtils.getBytes4Bigendian(departTime.getMonthValue(), new byte[1]));
		ByteUtils.fill(buffer, 123, ByteUtils.getBytes4Bigendian(departTime.getDayOfMonth(), new byte[1]));
		ByteUtils.fill(buffer, 124, ByteUtils.getBytes4Bigendian(departTime.getHour(), new byte[1]));
		ByteUtils.fill(buffer, 125, ByteUtils.getBytes4Bigendian(departTime.getMinute(), new byte[1]));
		ByteUtils.fill(buffer, 126, ByteUtils.getBytes4Bigendian(departTime.getSecond(), new byte[1]));

		ByteUtils.fill(buffer, 127, ByteUtils.getBytes4Bigendian(rate, new byte[4]));
		ByteUtils.fill(buffer, 131, ByteUtils.getBytes4Bigendian(speed, new byte[1]));

		return this;
	}

	@Override
	public void setBuffer(byte[] buffer) {
		super.setBuffer(buffer);

		lineId = String.valueOf(ByteUtils.getInt4Bigendian(buffer, 10, 12));
		type = String.valueOf(ByteUtils.getInt4Bigendian(buffer, 12, 14));
		rtuId = String.valueOf(ByteUtils.getInt4Bigendian(buffer, 14, 16));
		coccWindow = String.valueOf(ByteUtils.getInt4Bigendian(buffer, 16, 18));
		coccWindowOffset = String.valueOf(ByteUtils.getInt4Bigendian(buffer, 18, 19));
		devType = ByteUtils.getInt4Bigendian(buffer, 19, 21);

		devName = encode(ByteUtils.getRange(buffer, 21, 45));
		trainIndex = encode(ByteUtils.getRange(buffer, 45, 55));
		groupId = encode(ByteUtils.getRange(buffer, 55, 64));

		trainId = encode(ByteUtils.getRange(buffer, 64, 73));
		globalId = encode(ByteUtils.getRange(buffer, 73, 85));
		destinationId = encode(ByteUtils.getRange(buffer, 85, 89));
		rollingstock = ByteUtils.getInt4Bigendian(buffer, 89, 90);
		driverId = encode(ByteUtils.getRange(buffer, 90, 103));
		routeId = String.valueOf(ByteUtils.getInt4Bigendian(buffer, 103, 105));
		otpTime = ByteUtils.getInt4Bigendian(buffer, 105, 109);
		mode = ByteUtils.getInt4Bigendian(buffer, 109, 113);

		// arriveTime
		arriveTime = LocalDateTime.of(
				// year
				Integer.parseInt(String.valueOf(ByteUtils.getInt4Bigendian(buffer, 113, 114))
						+ String.valueOf(ByteUtils.getInt4Bigendian(buffer, 114, 115))),
				// month
				ByteUtils.getInt4Bigendian(buffer, 115, 116),
				// dayOfMonth
				ByteUtils.getInt4Bigendian(buffer, 116, 117),
				// hour
				ByteUtils.getInt4Bigendian(buffer, 117, 118),
				// minute
				ByteUtils.getInt4Bigendian(buffer, 118, 119),
				// second
				ByteUtils.getInt4Bigendian(buffer, 119, 120));
		
		// departTime
		departTime = LocalDateTime.of(
				// year
				Integer.parseInt(String.valueOf(ByteUtils.getInt4Bigendian(buffer, 120, 121))
						+ String.valueOf(ByteUtils.getInt4Bigendian(buffer, 121, 122))),
				// month
				ByteUtils.getInt4Bigendian(buffer, 122, 123),
				// dayOfMonth
				ByteUtils.getInt4Bigendian(buffer, 123, 124),
				// hour
				ByteUtils.getInt4Bigendian(buffer, 124, 125),
				// minute
				ByteUtils.getInt4Bigendian(buffer, 125, 126),
				// second
				ByteUtils.getInt4Bigendian(buffer, 126, 127));
		
		rate = ByteUtils.getInt4Bigendian(buffer, 127, 131);
		speed = ByteUtils.getInt4Bigendian(buffer, 131, 132);
	}
}
