package com.zzy.util;

import java.util.UUID;

/**
* @author zero
* @version 1.1
* @createTime：2016年7月12日 
* @decript:UUID生成 
*/
public class UUIDUtils {
	/**
	 * 32位UUID(去横线) 
	 */
    public static String uuid32(){
    	return UUID.randomUUID().toString().replace("-", "");
    }
}
