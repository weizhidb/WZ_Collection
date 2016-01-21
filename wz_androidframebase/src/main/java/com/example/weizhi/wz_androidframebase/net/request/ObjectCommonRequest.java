package com.example.weizhi.wz_androidframebase.net.request;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.HttpHeaderParser;
import com.example.weizhi.wz_androidframebase.net.AppLog;
import com.example.weizhi.wz_androidframebase.net.RequestParam;
import com.example.weizhi.wz_androidframebase.net.jsonparser.CommonParserBase;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author weizhi
 * @version 1.0
 * @date 2015.08.27
 *
 * */
public class ObjectCommonRequest extends Request<Object> {

	private Listener<Object> mListener;
	private RequestParam mRequestParam;
	Map<String, String> map = new HashMap<String, String>();

	/**
	 * Creates a new request with the given method.
	 *
	 * @param method the request {@link Method} to use
	 * @param url URL to fetch the string at
	 * @param listener Listener to receive the String response
	 * @param errorListener Error listener, or null to ignore errors
	 */
	public ObjectCommonRequest(RequestParam param, Listener<Object> listener, ErrorListener errorListener) {

		super(param.requestMethod() != Method.POST ? Method.GET : Method.POST, param.buildRequestUrl(), errorListener);

		this.mRequestParam = param;
		mListener = listener;
	}



	@Override
	protected void deliverResponse(Object response) {
		AppLog.Logd("response===" + response.toString());
		mListener.onResponse(response);
	}

	@Override
	protected Response<Object> parseNetworkResponse(NetworkResponse response) {

		try {
			byte[] data = response.data;
			String charset = HttpHeaderParser.parseCharset(response.headers);

			String jsonString = new String(data, charset);

			Object object = new CommonParserBase().fromJson(jsonString,mRequestParam.getM_c_bean_Class());

			return Response.success(object, HttpHeaderParser.parseCacheHeaders(response));
		} catch (UnsupportedEncodingException e) {
			return Response.error(new ParseError(e));
		}
	}


}
