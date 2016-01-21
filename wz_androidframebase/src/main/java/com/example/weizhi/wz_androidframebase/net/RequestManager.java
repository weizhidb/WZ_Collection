package com.example.weizhi.wz_androidframebase.net;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.Volley;
import com.example.weizhi.wz_androidframebase.base.AppLog;
import com.example.weizhi.wz_androidframebase.net.requestFactory.requestFactory;

import org.json.JSONException;

/**
 * Manager for the queue
 * 
 * @author weizhi
 * 
 */
public abstract class RequestManager {

	/**
	 * the queue :-)
	 */
	private static RequestQueue mRequestQueue;



	/**
	 * Nothing to see here.
	 */
	protected RequestManager() {
		// no instances
	}

	/**
	 * @param context application context
	 */
	public static void init(Context context) {// 获取RequestQueue
		if (mRequestQueue == null) {
			mRequestQueue = Volley.newRequestQueue(context);
		}
	}

	/**
	 * @return instance of the queue
	 * @throws IllegalStatException if init has not yet been called
	 */
	public static RequestQueue getRequestQueue() {
		if (mRequestQueue != null) {
			return mRequestQueue;
		} else {
			throw new IllegalStateException("Not initialized");
		}
	}

	public static void getRequestData(Context context, Listener<Object> listener, ErrorListener errorListener, RequestParam param) {
		// to do auto-generate

		String uri = param.buildRequestUrl();
		RequestManager.init(context);
		if (param.getmParserClassName() != null) {
			RequestManager.getRequestQueue().cancelAll(param.getmParserClassName());
		}
		Log.i("weizhi", "uri=====" + uri);
		Request<Object> request = null;
		try {
			request = requestFactory.getRequestInstance(param, listener, errorListener);
			if (param.getmParserClassName() != null) {
				request.setTag(param.getmParserClassName());
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			AppLog.Logd("weizhi", "JSONException" + e.getMessage());
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestManager.getRequestQueue().add(request);

	}

}
