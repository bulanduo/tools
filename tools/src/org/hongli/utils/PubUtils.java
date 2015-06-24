package org.hongli.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: PubUtils
 * @Description: ���õĹ�����Ҫ�����ж��Ƿ�Ϊ��
 * @author ���
 * @date 2015-4-28 ����11:41:37
 *
 */
public class PubUtils {
	/**
	 * @Title: isEmpty
	 * @Description:  �ж�String�Ƿ�Ϊ��
	 * @author ���
	 * @param Value
	 * @return
	 * @return boolean
	 * @throws
	 * @date 2015-4-28 ����11:50:32
	 */
	public static boolean isEmpty(String Value) {
		return (Value == null || Value.trim().length() == 0);
	}
	/**
	 * @Title: isEmpty
	 * @Description: �ж�List�Ƿ�Ϊ��
	 * @author ���
	 * @param list
	 * @return
	 * @return boolean
	 * @throws
	 * @date 2015-4-28 ����11:50:55
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isEmpty(List list) {
		if (list == null || list.size() == 0)
			return true;
		else
			return false;
	}
	/**
	 * @Title: isEmpty
	 * @Description: �ж�Set�Ƿ�Ϊ��
	 * @author ���
	 * @param set
	 * @return
	 * @return boolean
	 * @throws
	 * @date 2015-4-28 ����11:51:24
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isEmpty(Set set) {
		if (set == null || set.size() == 0)
			return true;
		else
			return false;
	}
	/**
	 * @Title: isEmpty
	 * @Description: �ж�Map�Ƿ�Ϊ��
	 * @author ���
	 * @param map
	 * @return
	 * @return boolean
	 * @throws
	 * @date 2015-4-28 ����11:51:43
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isEmpty(Map map) {
		if (map == null || map.size() == 0)
			return true;
		else
			return false;
	}
	/**
	 * @Title: isEmpty
	 * @Description: �ж�Object�Ƿ�Ϊ��
	 * @author ���
	 * @param Value
	 * @return
	 * @return boolean
	 * @throws
	 * @date 2015-4-28 ����11:52:06
	 */
	public static boolean isEmpty(Object Value) {
		if (Value == null)
			return true;
		else
			return false;
	}
	/**
	 * @Title: isEmpty
	 * @Description: �ж�Long�Ƿ�Ϊ��
	 * @author ���
	 * @param obj
	 * @return
	 * @return boolean
	 * @throws
	 * @date 2015-4-28 ����11:52:31
	 */
	public static boolean isEmpty(Long obj) {
		if (obj == null || obj.longValue() == 0)
			return true;
		else
			return false;
	}
	/**
	 * @Title: isEmpty
	 * @Description: �ж������Ƿ�Ϊ��
	 * @author ���
	 * @param Value
	 * @return
	 * @return boolean
	 * @throws
	 * @date 2015-4-28 ����11:52:54
	 */
	public static boolean isEmpty(Object[] Value) {
		if (Value == null || Value.length == 0)
			return true;
		else
			return false;
	}

}
