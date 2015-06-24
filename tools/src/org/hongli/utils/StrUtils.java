package org.hongli.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: StrUtils
 * @Description: �ַ���������
 * @author ���
 * @date 2015-4-28 ����01:53:55
 * 
 */
public class StrUtils {
	/**
	 * @Title: spiltStringByLength
	 * @Description:����ָ���ĳ��ȷָ��ַ���
	 * @author ���
	 * @param str
	 *            Ҫ�ָ���ַ���
	 * @param len
	 *            Ҫ�ָ�ĳ���
	 * @return
	 * @return List ���ص��ַ���list
	 * @throws
	 * @date 2015-6-11 ����04:41:13
	 */
	@SuppressWarnings("rawtypes")
	public static List spiltStringByLength(String str, int len) {
		//����ָ��ΪС��1�ķ���null
		if(len<1||PubUtils.isEmpty(str)){
			return null;
		}
		List<String> list = new ArrayList<String>();
		// �ַ������ȱ�Ҫ�ָ�ĳ��ȶ�ֱ�ӷ����ַ���
		if (str.length() < len || len<=0) {
			list.add(str);
			return list;
		}
		
		// ����ܹ������ƶ����ȵ��ַ����ķָ����
		int j = str.length() / len;
		// ���ݴ������зָ��ַ���
		for (int i = 0; i < j; i++) {
			String s = str.substring(0 + i * len, len + len * i);
			list.add(s);
		}
		// ����ַ���ʣ�಻�ܹ��ƶ�����ʣ�µ��ַ����ָ����
		if (len * j < str.length()) {
			list.add(str.substring(j * len, str.length()));
		}
		return list;
	}
}
