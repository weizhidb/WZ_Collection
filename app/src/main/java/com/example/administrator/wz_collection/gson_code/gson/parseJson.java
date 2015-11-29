package com.example.administrator.wz_collection.gson_code.gson;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * json数据解析
 * */
public class parseJson {

	private String code ;
	private String message;
	private JsonObject data;

	private final String codeValue = "code";
	private final String MsgValue = "message";
	private final String dataValue = "data";
	public static parseJson getInstancePtr(){
		if(null == instance){
			instance = new parseJson();
		}
		return instance;
	}


	/**
	 * 判断json数据是否是正确的  同时取出data的数据
	 * @param jsonString 需要解析的json数据
	 * @return boolean  true:解析成功    false:解析失败
	 * */
	public boolean jugeFormat(String jsonString){
		try{
			JsonParser jp = new JsonParser();
			JsonObject jo = (JsonObject) jp.parse(jsonString);
			code = jo.get(codeValue).getAsString();
			message = jo.get(MsgValue).getAsString();
			data = jo.get(dataValue).getAsJsonObject();
			//解析成功
			return true;
		}catch(Exception e){
			//解析失败
			System.out.println("error" + e.toString());
			return false;
		}
	}

	public <T> T json2Object(Class<T> cls){
		System.out.println("data str = " + data.toString());
		if(null == data){
			return null;
		}
		T t = GsonTools.getObject(data.toString(), cls);
		return t;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private static parseJson instance = null;

	private parseJson(){

	}
}
