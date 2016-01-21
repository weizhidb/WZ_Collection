package com.example.weizhi.wz_androidframebase.net;

import com.android.volley.Request.Method;

import java.util.Map;

public class RequestParam<T extends Object> implements IRequestParam {
	private HttpURL mHttpURL;

	private String mParserClassName;

	private int mRequestMethod = -1;

	private Map<String, String> mHeadersMap;
	private T mPostJsonObject;


	public Class getM_c_request() {
		return this.m_c_request;
	}

	/**
	 * 设置request的class名字
	 * */
	public void setM_c_request(Class m_c_request) {
		this.m_c_request = m_c_request;
	}

	/**
	 * request的class
	 * */
	private Class m_c_request;

	public Class getM_c_bean_Class() {
		return m_c_bean_Class;
	}

	public void setM_c_bean_Class(Class m_c_bean_Class) {
		this.m_c_bean_Class = m_c_bean_Class;
	}

	/**
	 * json对应bean的类class
	 * */
	private Class m_c_bean_Class;

	public HttpURL getmHttpURL() {
		return mHttpURL;
	}

	public void setmHttpURL(HttpURL mHttpURL) {
		this.mHttpURL = mHttpURL;
	}

	public T getmPostJsonObject() {
		return mPostJsonObject;
	}

	/**
	 * 设置post的请求参数
	 * 
	 * @param postJsonObject：可以是Map和自定义的实体类（Entity)
	 */
	public void setmPostarams(T postJsonObject) {
		this.mPostJsonObject = postJsonObject;
	}

	public Map<String, String> getmHeadersMap() {
		return mHeadersMap;
	}

	public void setmHeadersMap(Map<String, String> mHeadersMap) {
		this.mHeadersMap = mHeadersMap;
	}

	public void setPostRequestMethod() {
		mRequestMethod = Method.POST;
	}

	@Override
	public String buildRequestUrl() {
		// TODO Auto-generated method stub
		return mHttpURL.toString();
	}

	public String getmParserClassName() {
		return mParserClassName;
	}

	public void setmParserClassName(String mParserClassName) {
		this.mParserClassName = mParserClassName;
	}

	@Override
	public int requestMethod() {
		return mRequestMethod;
	}

}
