package org.hongli.utils;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @ClassName: DateUtils
 * @Description: ʱ�乤����
 * @author ���
 * @date 2015-4-28 ����11:56:03
 *
 */
public class DateUtils {
	/**
	 * @Title: dateToString
	 * @Description: ��ʱ��ת��Ϊ�ַ���
	 * @author ���
	 * @param dateValue
	 * @param strFormat  ����(yyyy/MM/dd HH:mm:ss, yyyy-MM-dd HH:mm:ss, HH:mm)
	 * @return String
	 * @throws
	 * @date 2015-4-28 ����01:26:00
	 */
	public static String dateToString(Date dateValue, String strFormat) {
		SimpleDateFormat clsFormat = new SimpleDateFormat(strFormat);
		return clsFormat.format(dateValue);
	}
	
	/**
	 * @Title: getSysOptDate
	 * @Description: ���ϵͳ�ĵ�ǰʱ��
	 * @author ���
	 * @param strFormat ���磺(yyyy/MM/dd HH:mm:ss, yyyy-MM-dd HH:mm:ss, HH:mm)
	 * @return String 
	 * @throws
	 * @date 2015-4-28 ����01:28:47
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
	 * @Description: ���ַ���ת��Ϊdate����
	 * @author ���
	 * @param strValue
	 * @param dateformat ���磺(yyyy/MM/dd HH:mm:ss, yyyy-MM-dd HH:mm:ss, HH:mm)
	 * @return
	 * @return Date
	 * @throws
	 * @date 2015-4-28 ����01:42:02
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
	 * @Description: ���ڵļӼ�
	 * @author ���
	 * @param date ����
	 * @param type  ����  Y��  M ��  D ��
	 * @param amount  �������� ����ʹ�ø�ֵ
	 * @return
	 * @return Date
	 * @throws
	 * @date 2015��6��12�� ����1:18:00
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
	 * @Description:����ʱ��֮����������
	 * @author ���
	 * @param smdate  С��ʱ��
	 * @param bdate   ���ʱ��
	 * @throws ParseException 
	 * @return int ���������
	 * @date 2015��6��15�� ����9:20:33
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
