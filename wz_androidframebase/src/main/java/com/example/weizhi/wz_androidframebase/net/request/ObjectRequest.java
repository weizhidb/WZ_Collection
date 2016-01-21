package com.example.weizhi.wz_androidframebase.net.request;

import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonRequest;
import com.example.weizhi.wz_androidframebase.net.AppLog;
import com.example.weizhi.wz_androidframebase.net.RequestParam;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * Wrapper for Volley requests to facilitate parsing of json responses.
 * 
 * @param <T>
 */
public class ObjectRequest extends JsonRequest<Object> {

	private Listener<Object> mListener;
	private RequestParam mRequestParam;

	/**
	 * Creates a new request.
	 * 
	 * @param method the HTTP method to use
	 * @param url URL to fetch the Object from
	 * @param jsonRequest A {@link JSONObject} to post with the request. Null is allowed and indicates no parameters will be posted along with
	 * request.
	 * @param listener Listener to receive the JSON response
	 * @param errorListener Error listener, or null to ignore errors.
	 */
	public <T extends Object> ObjectRequest(int method, RequestParam param, T jsonRequest, Listener<Object> listener, ErrorListener errorListener) {
		super(method, param.buildRequestUrl(), (jsonRequest == null) ? null : jsonRequest.toString() /*(jsonRequest instanceof JSONObject ? jsonRequest.toString()
				: new Gson().toJson(jsonRequest))*/, listener, errorListener);
		if (jsonRequest != null) {
			System.out.println("postRequstParams----->"
					+ (jsonRequest instanceof JSONObject ? jsonRequest.toString() : new Gson().toJson(jsonRequest)));
		}
		mListener = listener;
		mRequestParam = param;
	}

	/**
	 * Constructor which defaults to <code>GET</code> if <code>jsonRequest</code> is <code>null</code>, <code>POST</code> otherwise.
	 * 
	 * @throws JSONException
	 * 
	 * @see #ObjectRequest(int, String, JSONObject, Listener, ErrorListener)
	 */
	public ObjectRequest(RequestParam param, Listener<Object> listener, ErrorListener errorListener) throws JSONException {

		this(param.requestMethod() == -1 ? Method.GET : param.requestMethod(), param,
				param.requestMethod() != -1 ? param.getmPostJsonObject() : null, listener, errorListener);

	}


	@Override
	protected Response<Object> parseNetworkResponse(NetworkResponse response) {
		try {
			byte[] data = response.data;
			String charset = HttpHeaderParser.parseCharset(response.headers);
			String jsonString = new String(data, charset);
			Object object = null;
			//object = new CommonParserBase().fromJson(jsonString);
			Log.i("test", "------- weizhi request url ---------" + mRequestParam.getmHttpURL().toString());

			return Response.success(object, HttpHeaderParser.parseCacheHeaders(response));
		} catch (UnsupportedEncodingException e) {
			return Response.error(new ParseError(e));
		}
	}

	@Override
	protected void deliverResponse(Object response) {
		if (response != null) {
			AppLog.Logd("response===" + response.toString());
			mListener.onResponse(response);
		}

	}

	@Override
	public Map<String, String> getHeaders() throws AuthFailureError {
		if (mRequestParam.getmHeadersMap() != null) {
			return mRequestParam.getmHeadersMap();
		}
		return super.getHeaders();
	}

}
