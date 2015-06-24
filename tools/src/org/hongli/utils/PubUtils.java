package org.hongli.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: PubUtils
 * @Description: 公用的工具主要包含判断是否为空
 * @author 随风
 * @date 2015-4-28 上午11:41:37
 *
 */
public class PubUtils {
	/**
	 * @Title: isEmpty
	 * @Description:  判断String是否为空
	 * @author 随风
	 * @param Value
	 * @return
	 * @return boolean
	 * @throws
	 * @date 2015-4-28 上午11:50:32
	 */
	public static boolean isEmpty(String Value) {
		return (Value == null || Value.trim().length() == 0);
	}
	/**
	 * @Title: isEmpty
	 * @Description: 判断List是否为空
	 * @author 随风
	 * @param list
	 * @return
	 * @return boolean
	 * @throws
	 * @date 2015-4-28 上午11:50:55
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
	 * @Description: 判断Set是否为空
	 * @author 随风
	 * @param set
	 * @return
	 * @return boolean
	 * @throws
	 * @date 2015-4-28 上午11:51:24
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
	 * @Description: 判断Map是否为空
	 * @author 随风
	 * @param map
	 * @return
	 * @return boolean
	 * @throws
	 * @date 2015-4-28 上午11:51:43
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
	 * @Description: 判断Object是否为空
	 * @author 随风
	 * @param Value
	 * @return
	 * @return boolean
	 * @throws
	 * @date 2015-4-28 上午11:52:06
	 */
	public static boolean isEmpty(Object Value) {
		if (Value == null)
			return true;
		else
			return false;
	}
	/**
	 * @Title: isEmpty
	 * @Description: 判断Long是否为空
	 * @author 随风
	 * @param obj
	 * @return
	 * @return boolean
	 * @throws
	 * @date 2015-4-28 上午11:52:31
	 */
	public static boolean isEmpty(Long obj) {
		if (obj == null || obj.longValue() == 0)
			return true;
		else
			return false;
	}
	/**
	 * @Title: isEmpty
	 * @Description: 判断数组是否为空
	 * @author 随风
	 * @param Value
	 * @return
	 * @return boolean
	 * @throws
	 * @date 2015-4-28 上午11:52:54
	 */
	public static boolean isEmpty(Object[] Value) {
		if (Value == null || Value.length == 0)
			return true;
		else
			return false;
	}

}
