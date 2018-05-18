package com.zzy.util;

import com.alibaba.fastjson.JSONObject;
import com.mysql.fabric.xmlrpc.base.Param;

/**
* @author Zeus
* @version 1.1
* @createTime：2016年7月4日 
* @decript:
*/
public class ResultValue {

    public static final int SUCCESS=200;
    public static final int ADD_FAIL=301;
    public static final int UPDATE_FAIL=302;
    public static final int DELETE_FAIL=303;
    public static final int GET_FAIL=304;
    public static final int PARAM_FAIL=305;
    public static final int PARAM_NON_NULL=500;
    /**
     * 操作成功
     * @param 返回参数
     */
    public static JSONObject success(Object object){
     	JSONObject json=new JSONObject();
    	json.put("status", SUCCESS);
    	json.put("data", object);
    	return json;
    }
    
    /**
     * 操作成功
     */
    public static JSONObject success(){
    	return success(null);
    }
    /**
     * 参数为null
     */
    public static JSONObject paramNonNull(){
    	return fail(PARAM_NON_NULL,"参数不能为null");
    }
    /**
     * 操作失败
     * @param 状态码
     * @param 提示信息
     */
    public static JSONObject fail(Integer status,String message){
    	JSONObject json=new JSONObject();
    	json.put("status", status);
    	json.put("message", message);
    	return json;
    }  
}
