package com.biierg.cocc.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 针对日期时间的工具类
 *
 * @author lei
 */
public class DateUtil {

	private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	private static Map<String, DateFormat> patternFormatterMap = new HashMap<String, DateFormat>();

	public static Date parse(String dateStr, String format) throws ParseException {
		return new SimpleDateFormat(format).parse(dateStr);
	}

	/**
	 * 将日期对象格式化为标准格式
	 *
	 * @param dateTime
	 * @return
	 */
	public static String format(Date dateTime) {
		return dateFormat.format(dateTime);
	}

	/**
	 * 将日期对象格式化为指定格式
	 *
	 * @param dateTime
	 * @param pattern
	 * @return
	 */
	public static String format(Date dateTime, String pattern) {

		if (!patternFormatterMap.containsKey(pattern)) {
			patternFormatterMap.put(pattern, new SimpleDateFormat(pattern));
		}

		return patternFormatterMap.get(pattern).format(dateTime);
	}

	/**
     * 根据日期生成cron表达式（不包含周）
	 * convert Date to cron ,eg.  "0 06 10 25 8 ? 2017"
	 * @param date  : 时间点
	 * @return
	 */
	public static String getCron(Date date){
		String dateFormat="ss mm HH dd MM ? yyyy";
		return format(date, dateFormat);
	}

	/**
	 * 获取同比日期
	 *
	 * @param target
	 * @param policy
	 * @return
	 */
	public static Date getYoYDate(Date target, int policy) {
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(target);

		switch (policy) {
		case Constants.YoYPolicy.PrevYear:
			calendar.add(Calendar.YEAR, -1);
			break;

		case Constants.YoYPolicy.PrevMonth:
			calendar.add(Calendar.MONTH, -1);
			break;

		case Constants.YoYPolicy.PrevWeek:
		default:
			calendar.add(Calendar.WEEK_OF_YEAR, -1);
		}

		return calendar.getTime();
	}

	/**
	 * 获取同比日期
	 *
	 * @param target
	 * @param policy
	 * @param pattern
	 * @return
	 */
	public static String getYoYString(String target, int policy, String pattern) {
		//
		if (!patternFormatterMap.containsKey(pattern)) {
			patternFormatterMap.put(pattern, new SimpleDateFormat(pattern));
		}
		String yoyString = "";
		try {
			yoyString = format(getYoYDate(patternFormatterMap.get(pattern).parse(target), policy), pattern);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return yoyString;
	}

	/**
	 * 获取环比日期
	 *
	 * @param target
	 * @return
	 */
	public static Date getMoMDate(Date target) {
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(target);
		calendar.add(Calendar.DAY_OF_MONTH, -1);

		return calendar.getTime();
	}

	/**
	 * 获取环比日期
	 *
	 * @param target
	 * @return
	 */
	public static String getMoMString(String target, String pattern) {
		if (!patternFormatterMap.containsKey(pattern)) {
			patternFormatterMap.put(pattern, new SimpleDateFormat(pattern));
		}
		String momString = "";
		try {
			momString = format(getMoMDate(patternFormatterMap.get(pattern).parse(target)), pattern);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return momString;
	}

	/**
	 * 获取给定日期的“零点”
	 *
	 * @param target
	 * @return
	 */
	public static Date getDateBegin(Date target) {
		Calendar calendar = Calendar.getInstance();
		Calendar targetCal = Calendar.getInstance();

		calendar.setTimeInMillis(0);
		targetCal.setTime(target);

		calendar.set(Calendar.YEAR, targetCal.get(Calendar.YEAR));
		calendar.set(Calendar.MONTH, targetCal.get(Calendar.MONTH));
		calendar.set(Calendar.DAY_OF_MONTH, targetCal.get(Calendar.DAY_OF_MONTH));

		return calendar.getTime();
	}

	/**
	 * 获取给定日期的“零点”
	 *
	 * @param target
	 * @param pattern
	 * @return
	 */
	public static String getDateBegin(String target, String pattern) {
		if (!patternFormatterMap.containsKey(pattern)) {
			patternFormatterMap.put(pattern, new SimpleDateFormat(pattern));
		}
		String begin = "";
		try {
			begin = format(getDateBegin(patternFormatterMap.get(pattern).parse(target)), pattern);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return begin;
	}

	/**
	 * 获取给定日期的“最后一个时间点”
	 *
	 * @param target
	 * @return
	 */
	public static Date getDateEnd(Date target) {
		Calendar calendar = Calendar.getInstance();
		Calendar targetCal = Calendar.getInstance();

		calendar.setTimeInMillis(0);
		targetCal.setTime(target);

		calendar.set(Calendar.YEAR, targetCal.get(Calendar.YEAR));
		calendar.set(Calendar.MONTH, targetCal.get(Calendar.MONTH));
		calendar.set(Calendar.DAY_OF_MONTH, targetCal.get(Calendar.DAY_OF_MONTH));

		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);

		return calendar.getTime();
	}

	/**
	 * 获取给定日期的“最后一个时间点”
	 *
	 * @param target
	 * @return
	 */
	public static String getDateEnd(String target, String pattern) {
		if (!patternFormatterMap.containsKey(pattern)) {
			patternFormatterMap.put(pattern, new SimpleDateFormat(pattern));
		}
		String end = "";
		try {
			end = format(getDateEnd(patternFormatterMap.get(pattern).parse(target)), pattern);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return end;
	}

	/**
	 * 获取当前时间的标准格式 "yyyy-MM-dd HH:mm:ss"
	 *
	 * @return "yyyy-MM-dd HH:mm:ss"
	 */
	public static String getCurrentTimeStandard() {
		return dateFormat.format(new Date(System.currentTimeMillis()));
	}

	/**
	 * 获取当前日期是星期几
	 *
	 * @param date
	 * @return 当前日期是星期几
	 */
	public static String getWeekOfDate(Date date) {
		String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0)
			w = 0;
		return weekDays[w];
	}

	/**
	 * 处理传入参数(如果没传时间只有日期,拼接成yyyy-MM-dd HH:mm格式)
	 * 
	 * @param date
	 *            日期
	 * @param time
	 *            时间
	 * @param type
	 *            类型 1为开始时间 2为结束时间
	 * @return Date
	 * @throws ParseException
	 */
	public static Date getDateTime(String date, String time, int type) throws ParseException {
		SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date retDate = null;
		if (type == 1) {
			if (!StringUtil.isNull(time)) {
				retDate = sdfTime.parse(date + " " + time);
			} else {
				retDate = sdfTime.parse(date + " 00:00");
			}
		} else {
			if (!StringUtil.isNull(time)) {
				retDate = sdfTime.parse(date + " " + time);
			} else {
				retDate = sdfTime.parse(date + " 23:59");
			}
		}
		return retDate;
	}
	// public static Date getDate10(long timeMillis, String pattern) {
	// DateFormat dateFormat;
	// // TODO 正则校验
	// if (StringUtil.isNull(pattern)) {
	// dateFormat = DateUtil.dateFormat;
	// } else {
	// dateFormat = new SimpleDateFormat(pattern);
	// }
	// if (timeMillis <= 0) {
	// timeMillis = System.currentTimeMillis();
	// }
	// ParsePosition pos = new ParsePosition(0);
	// Date strTodate = dateFormat.parse(dateFormat.format(new
	// Date(timeMillis)), pos);
	// return strTodate;
	// }
	//
	// public static void main(String args[]) throws ParseException {
	//
	// Date date= DateFormat.getDateInstance().parse("178278784242");
	// System.out.println(date);
	// }
}
