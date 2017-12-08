/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 天气信息
 * 
 * @author lei
 */
public class WeatherInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id; // 记录ID
	private Date obsTime; // 时间
	private String sunriseTime; // 日出时间
	private String sunsetTime; // 日落时间
	private String weatherType; // 天气类型
	private String weatherImg; // 天气类型图片
	private String windDirection; // 风向
	private int windLevel; // 风力
	private double windSpeed; // 风速
	private double temperature; // 当前温度
	private double tempMax; // 最高温度
	private double tempMin; // 最低温度
	private double humidity; // 当前湿度
	private double humidityMax; // 最大湿度
	private double humidityMin; // 最小湿度
	private double precipitation; // 1小时降水量
	private double pressure; // 大气压
	private String workoutIndex; // 晨练指数
	private String carwashIndex; // 洗车指数
	private String dryingIndex; // 晾晒指数
	private String umbrellaIndex; // 雨伞指数
	private String uvIndex; // 紫外线辐射指数
	private String comfortIndex; // 人体舒适度指数
	private String dressIndex; // 穿衣指数
	private String coldIndex; // 感冒指数
	private String travelIndex; // 旅游指数
	private String trafficIndex; // 交通指数
	private String aqGrade; // 空气质量等级
	private String aqIndex; // AQI
	private String pollutant; // 首要污染物
	private double pm25; // PM2.5浓度
	private double pm10; // PM10浓度
	private String dataSource; // 数据来源
	private String sourceUrl; // 来源网址
	private Date fetchTime; // 抓取时间

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
	 * @return the obsTime
	 */
	public Date getObsTime() {
		return obsTime;
	}

	/**
	 * @param obsTime
	 *            the obsTime to set
	 */
	public void setObsTime(Date obsTime) {
		this.obsTime = obsTime;
	}

	/**
	 * @return the sunriseTime
	 */
	public String getSunriseTime() {
		return sunriseTime;
	}

	/**
	 * @param sunriseTime
	 *            the sunriseTime to set
	 */
	public void setSunriseTime(String sunriseTime) {
		this.sunriseTime = sunriseTime;
	}

	/**
	 * @return the sunsetTime
	 */
	public String getSunsetTime() {
		return sunsetTime;
	}

	/**
	 * @param sunsetTime
	 *            the sunsetTime to set
	 */
	public void setSunsetTime(String sunsetTime) {
		this.sunsetTime = sunsetTime;
	}

	/**
	 * @return the weatherType
	 */
	public String getWeatherType() {
		return weatherType;
	}

	/**
	 * @param weatherType
	 *            the weatherType to set
	 */
	public void setWeatherType(String weatherType) {
		this.weatherType = weatherType;
	}

	/**
	 * @return the weatherImg
	 */
	public String getWeatherImg() {
		return weatherImg;
	}

	/**
	 * @param weatherImg
	 *            the weatherImg to set
	 */
	public void setWeatherImg(String weatherImg) {
		this.weatherImg = weatherImg;
	}

	/**
	 * @return the windDirection
	 */
	public String getWindDirection() {
		return windDirection;
	}

	/**
	 * @param windDirection
	 *            the windDirection to set
	 */
	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

	/**
	 * @return the windLevel
	 */
	public int getWindLevel() {
		return windLevel;
	}

	/**
	 * @param windLevel
	 *            the windLevel to set
	 */
	public void setWindLevel(int windLevel) {
		this.windLevel = windLevel;
	}

	/**
	 * @return the windSpeed
	 */
	public double getWindSpeed() {
		return windSpeed;
	}

	/**
	 * @param windSpeed
	 *            the windSpeed to set
	 */
	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}

	/**
	 * @return the temperature
	 */
	public double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature
	 *            the temperature to set
	 */
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the tempMax
	 */
	public double getTempMax() {
		return tempMax;
	}

	/**
	 * @param tempMax
	 *            the tempMax to set
	 */
	public void setTempMax(double tempMax) {
		this.tempMax = tempMax;
	}

	/**
	 * @return the tempMin
	 */
	public double getTempMin() {
		return tempMin;
	}

	/**
	 * @param tempMin
	 *            the tempMin to set
	 */
	public void setTempMin(double tempMin) {
		this.tempMin = tempMin;
	}

	/**
	 * @return the humidity
	 */
	public double getHumidity() {
		return humidity;
	}

	/**
	 * @param humidity
	 *            the humidity to set
	 */
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	/**
	 * @return the humidityMax
	 */
	public double getHumidityMax() {
		return humidityMax;
	}

	/**
	 * @param humidityMax
	 *            the humidityMax to set
	 */
	public void setHumidityMax(double humidityMax) {
		this.humidityMax = humidityMax;
	}

	/**
	 * @return the humidityMin
	 */
	public double getHumidityMin() {
		return humidityMin;
	}

	/**
	 * @param humidityMin
	 *            the humidityMin to set
	 */
	public void setHumidityMin(double humidityMin) {
		this.humidityMin = humidityMin;
	}

	/**
	 * @return the precipitation
	 */
	public double getPrecipitation() {
		return precipitation;
	}

	/**
	 * @param precipitation
	 *            the precipitation to set
	 */
	public void setPrecipitation(double precipitation) {
		this.precipitation = precipitation;
	}

	/**
	 * @return the pressure
	 */
	public double getPressure() {
		return pressure;
	}

	/**
	 * @param pressure
	 *            the pressure to set
	 */
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	/**
	 * @return the workoutIndex
	 */
	public String getWorkoutIndex() {
		return workoutIndex;
	}

	/**
	 * @param workoutIndex
	 *            the workoutIndex to set
	 */
	public void setWorkoutIndex(String workoutIndex) {
		this.workoutIndex = workoutIndex;
	}

	/**
	 * @return the carwashIndex
	 */
	public String getCarwashIndex() {
		return carwashIndex;
	}

	/**
	 * @param carwashIndex
	 *            the carwashIndex to set
	 */
	public void setCarwashIndex(String carwashIndex) {
		this.carwashIndex = carwashIndex;
	}

	/**
	 * @return the dryingIndex
	 */
	public String getDryingIndex() {
		return dryingIndex;
	}

	/**
	 * @param dryingIndex
	 *            the dryingIndex to set
	 */
	public void setDryingIndex(String dryingIndex) {
		this.dryingIndex = dryingIndex;
	}

	/**
	 * @return the umbrellaIndex
	 */
	public String getUmbrellaIndex() {
		return umbrellaIndex;
	}

	/**
	 * @param umbrellaIndex
	 *            the umbrellaIndex to set
	 */
	public void setUmbrellaIndex(String umbrellaIndex) {
		this.umbrellaIndex = umbrellaIndex;
	}

	/**
	 * @return the uvIndex
	 */
	public String getUvIndex() {
		return uvIndex;
	}

	/**
	 * @param uvIndex
	 *            the uvIndex to set
	 */
	public void setUvIndex(String uvIndex) {
		this.uvIndex = uvIndex;
	}

	/**
	 * @return the comfortIndex
	 */
	public String getComfortIndex() {
		return comfortIndex;
	}

	/**
	 * @param comfortIndex
	 *            the comfortIndex to set
	 */
	public void setComfortIndex(String comfortIndex) {
		this.comfortIndex = comfortIndex;
	}

	/**
	 * @return the dressIndex
	 */
	public String getDressIndex() {
		return dressIndex;
	}

	/**
	 * @param dressIndex
	 *            the dressIndex to set
	 */
	public void setDressIndex(String dressIndex) {
		this.dressIndex = dressIndex;
	}

	/**
	 * @return the coldIndex
	 */
	public String getColdIndex() {
		return coldIndex;
	}

	/**
	 * @param coldIndex
	 *            the coldIndex to set
	 */
	public void setColdIndex(String coldIndex) {
		this.coldIndex = coldIndex;
	}

	/**
	 * @return the travelIndex
	 */
	public String getTravelIndex() {
		return travelIndex;
	}

	/**
	 * @param travelIndex
	 *            the travelIndex to set
	 */
	public void setTravelIndex(String travelIndex) {
		this.travelIndex = travelIndex;
	}

	/**
	 * @return the trafficIndex
	 */
	public String getTrafficIndex() {
		return trafficIndex;
	}

	/**
	 * @param trafficIndex
	 *            the trafficIndex to set
	 */
	public void setTrafficIndex(String trafficIndex) {
		this.trafficIndex = trafficIndex;
	}

	/**
	 * @return the aqGrade
	 */
	public String getAqGrade() {
		return aqGrade;
	}

	/**
	 * @param aqGrade
	 *            the aqGrade to set
	 */
	public void setAqGrade(String aqGrade) {
		this.aqGrade = aqGrade;
	}

	/**
	 * @return the aqIndex
	 */
	public String getAqIndex() {
		return aqIndex;
	}

	/**
	 * @param aqIndex
	 *            the aqIndex to set
	 */
	public void setAqIndex(String aqIndex) {
		this.aqIndex = aqIndex;
	}

	/**
	 * @return the pollutant
	 */
	public String getPollutant() {
		return pollutant;
	}

	/**
	 * @param pollutant
	 *            the pollutant to set
	 */
	public void setPollutant(String pollutant) {
		this.pollutant = pollutant;
	}

	/**
	 * @return the pm25
	 */
	public double getPm25() {
		return pm25;
	}

	/**
	 * @param pm25
	 *            the pm25 to set
	 */
	public void setPm25(double pm25) {
		this.pm25 = pm25;
	}

	/**
	 * @return the pm10
	 */
	public double getPm10() {
		return pm10;
	}

	/**
	 * @param pm10
	 *            the pm10 to set
	 */
	public void setPm10(double pm10) {
		this.pm10 = pm10;
	}

	/**
	 * @return the dataSource
	 */
	public String getDataSource() {
		return dataSource;
	}

	/**
	 * @param dataSource
	 *            the dataSource to set
	 */
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	/**
	 * @return the sourceUrl
	 */
	public String getSourceUrl() {
		return sourceUrl;
	}

	/**
	 * @param sourceUrl
	 *            the sourceUrl to set
	 */
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	/**
	 * @return the fetchTime
	 */
	public Date getFetchTime() {
		return fetchTime;
	}

	/**
	 * @param fetchTime
	 *            the fetchTime to set
	 */
	public void setFetchTime(Date fetchTime) {
		this.fetchTime = fetchTime;
	}
}
