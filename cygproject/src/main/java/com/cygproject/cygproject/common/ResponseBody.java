package com.cygproject.cygproject.common;

/**
 * @author Chenkp
 *	2018年5月12日
 *	封装返回的结果
 */
public class ResponseBody {

	private int resultCode;
	
	private String resultMsg;
	
	private Object result;
	
	public ResponseBody(){
		
	}
	
	public ResponseBody(int resultCode, String resultMsg, Object result){
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
		this.result = result;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "responseBody:{resultCode="+resultCode+", resultMsg="+resultMsg+", result="+result+"}";
	}
}
