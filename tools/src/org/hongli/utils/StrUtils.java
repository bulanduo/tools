package org.hongli.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: StrUtils
 * @Description: 字符串工具类
 * @author 随风
 * @date 2015-4-28 下午01:53:55
 * 
 */
public class StrUtils {
	/**
	 * @Title: spiltStringByLength
	 * @Description:根据指定的长度分割字符串
	 * @author 随风
	 * @param str
	 *            要分割的字符串
	 * @param len
	 *            要分割的长度
	 * @return
	 * @return List 返回的字符串list
	 * @throws
	 * @date 2015-6-11 下午04:41:13
	 */
	@SuppressWarnings("rawtypes")
	public static List spiltStringByLength(String str, int len) {
		//如果分割长度为小于1的返回null
		if(len<1||PubUtils.isEmpty(str)){
			return null;
		}
		List<String> list = new ArrayList<String>();
		// 字符串长度比要分割的长度短直接返回字符串
		if (str.length() < len || len<=0) {
			list.add(str);
			return list;
		}
		
		// 获得能够根据制定长度的字符串的分割次数
		int j = str.length() / len;
		// 根据次数进行分割字符串
		for (int i = 0; i < j; i++) {
			String s = str.substring(0 + i * len, len + len * i);
			list.add(s);
		}
		// 如果字符串剩余不能够制定长度剩下的字符串分割出来
		if (len * j < str.length()) {
			list.add(str.substring(j * len, str.length()));
		}
		return list;
	}
}
