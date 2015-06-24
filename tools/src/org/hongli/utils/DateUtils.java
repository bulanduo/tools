package org.hongli.utils;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @ClassName: DateUtils
 * @Description: 时间工具类
 * @author 随风
 * @date 2015-4-28 上午11:56:03
 *
 */
public class DateUtils {
	/**
	 * @Title: dateToString
	 * @Description: 将时间转换为字符串
	 * @author 随风
	 * @param dateValue
	 * @param strFormat  例如(yyyy/MM/dd HH:mm:ss, yyyy-MM-dd HH:mm:ss, HH:mm)
	 * @return String
	 * @throws
	 * @date 2015-4-28 下午01:26:00
	 */
	public static String dateToString(Date dateValue, String strFormat) {
		SimpleDateFormat clsFormat = new SimpleDateFormat(strFormat);
		return clsFormat.format(dateValue);
	}
	
	/**
	 * @Title: getSysOptDate
	 * @Description: 获得系统的当前时间
	 * @author 随风
	 * @param strFormat 例如：(yyyy/MM/dd HH:mm:ss, yyyy-MM-dd HH:mm:ss, HH:mm)
	 * @return String 
	 * @throws
	 * @date 2015-4-28 下午01:28:47
	 */
	public static String getSysOptDate(String strFormat) {
		Calendar date = Calendar.getInstance();
		Date sysDate = date.getTime();
		String optDate=""; 
		if(PubUtils.isEmpty(strFormat))
			optDate = DateUtils.dateToString(sysDate, "yyyy-MM-dd HH:mm:ss");
		else
			optDate = DateUtils.dateToString(sysDate, strFormat);
		return optDate;
	}
	/**
	 * @Title: stringToDate
	 * @Description: 将字符串转换为date类型
	 * @author 随风
	 * @param strValue
	 * @param dateformat 例如：(yyyy/MM/dd HH:mm:ss, yyyy-MM-dd HH:mm:ss, HH:mm)
	 * @return
	 * @return Date
	 * @throws
	 * @date 2015-4-28 下午01:42:02
	 */
	public static Date stringToDate(String strValue, String dateformat) {
		if (PubUtils.isEmpty(strValue)) {
			return null;
		}
		SimpleDateFormat clsFormat = new SimpleDateFormat(dateformat);
		ParsePosition pos = new ParsePosition(0);
		return clsFormat.parse(strValue, pos);
	}

	/**
	 * @Title: modifyDate
	 * @Description: 日期的加减
	 * @author 随风
	 * @param date 日期
	 * @param type  类型  Y年  M 月  D 天
	 * @param amount  相差的数量 可以使用负值
	 * @return
	 * @return Date
	 * @throws
	 * @date 2015年6月12日 下午1:18:00
	 */
	public static Date modifyDate(Date date, String type, int amount) {
		if (date == null) {
			date = new Date();
		}
		if (PubUtils.isEmpty(type)) {
			type = "";
		}
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		if ("Y".equalsIgnoreCase(type)) {
			now.add(Calendar.YEAR, amount);
		} else if ("M".equalsIgnoreCase(type)) {
			now.add(Calendar.MONTH, amount);
		} else if ("D".equalsIgnoreCase(type)) {
			now.add(Calendar.DAY_OF_YEAR, amount);
		}
		return now.getTime();
	}
	/**
	 * @Title: daysBetween
	 * @Description:两个时间之间的天数间隔
	 * @author 随风
	 * @param smdate  小的时间
	 * @param bdate   大的时间
	 * @throws ParseException 
	 * @return int 相隔的天数
	 * @date 2015年6月15日 上午9:20:33
	 */
	 public static int daysBetween(Date smdate,Date bdate) throws ParseException {    
	        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
	        smdate=sdf.parse(sdf.format(smdate));  
	        bdate=sdf.parse(sdf.format(bdate));  
	        Calendar cal = Calendar.getInstance();    
	        cal.setTime(smdate);    
	        long time1 = cal.getTimeInMillis();                 
	        cal.setTime(bdate); 
	        long time2 = cal.getTimeInMillis();         
	        long between_days=(time2-time1)/(1000*3600*24);  
	       return Integer.parseInt(String.valueOf(between_days));           
    }    

}
