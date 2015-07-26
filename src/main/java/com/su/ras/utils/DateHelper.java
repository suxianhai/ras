package com.su.ras.utils;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateHelper {

	/**
	 * @return 返回短时间字符串格式yyyy-MM-dd
	 */
	public static String getStringDateShort(Date date) {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString;
		if (date == null) {
			dateString = "";
		} else
			dateString = formatter.format(date);
		return dateString;
	}

	public static String getAfterDate(int n) {
		Date dateNow = new Date(); // 当前时间
		Date dateBefore = new Date();
		Calendar calendar = Calendar.getInstance(); // 得到日历
		calendar.setTime(dateNow);// 把当前时间赋给日期calendar
		calendar.add(Calendar.DAY_OF_MONTH, n);
		dateBefore = calendar.getTime(); // 得到前n天的时间
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(dateBefore);
		return dateString;
	}

	public static String getStringDateLong(Date date) {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString;
		if (date == null) {
			dateString = "";
		} else
			dateString = formatter.format(date);
		return dateString;
	}
	

	public static Date getNowDate() {
		Date currentTime = new Date();
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		ParsePosition pos = new ParsePosition(0);
		Date currentTime_2 = formatter.parse(dateString, pos);
		return currentTime_2;
	}

	public static Date getDateShort(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(date);
		ParsePosition pos = new ParsePosition(8);
		return formatter.parse(dateString, pos);
	}

	/**
	 * @return 返回短时间字符串格式yyyy/MM
	 */
	public static String getStringDateMonth(Date date) {
		DateFormat formatter = new SimpleDateFormat("yyyy/MM");
		String dateString = formatter.format(date);
		return dateString;
	}

	/**
	 * @return 返回时间加一天的日期
	 */
	public static String getStringDateAddOneDay(String date) {

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date tempDate;
			tempDate = sdf.parse(date);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(tempDate);
			calendar.add(Calendar.DAY_OF_MONTH, 1);// 天加1
			return sdf.format(calendar.getTime());
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 验证给定字符串是否为日期格式
	 * @param str
	 * @return
	 */
	public static boolean isDate(String str) {
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
		try {
			format.parse(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 转换给定的短日期字符串转换为Date类型
	 * 
	 * @param date
	 * @return
	 */
	public static Date toShortDate(String date) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			return sdf.parse(date);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 转换给定的长日期字符串转换为Date类型
	 * 
	 * @param date
	 * @return
	 */
	public static Date toLongDate(String date) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return sdf.parse(date);
		} catch (Exception e) {
			return null;
		}
	}
	
	public static String getStringDate() {
		Date currentTime = new Date();
		DateFormat formatter = new SimpleDateFormat("yyyyMMddHHmm");
		String dateString = formatter.format(currentTime);
		return dateString;
	}
	
}
