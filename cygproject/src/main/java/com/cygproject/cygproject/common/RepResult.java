package com.cygproject.cygproject.common;

/**
 * 返回值
 * @author Chenkp
 *	2018年5月12日
 */
public class RepResult {
	/*
	 * 返回code值
	 */
	public static final int SUCCESS_CODE = 0;			//返回成功
	public static final int FAIL_CODE = -1;				//返回失败
	
	
	/*
	 * 返回信息
	 */
	public static final String SUCCESS_MSG = "成功";		//成功消息
	public static final String FAIL_MSG = "失败";		//失败消息
	public static final String OTHER = "其他";			//其他
	
	
	
	public static String getMsg(int code){
		switch(code){
			case SUCCESS_CODE:
				return SUCCESS_MSG;
			
			default:
				return OTHER;
		}
	}

	/*
	 * 返回结果
	 */
	public static ResponseBody getResult(int code, Object obj){
		ResponseBody responseBody = new ResponseBody(code, getMsg(code), obj);
		return responseBody;
	}
	
	/*
	 * 返回结果,只有返回码
	 */
	public static ResponseBody getResult(int code){
		return getResult(code, null);
	}
}
