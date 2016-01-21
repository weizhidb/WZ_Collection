package com.example.weizhi.wz_androidframebase.net.requestFactory;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.example.weizhi.wz_androidframebase.net.RequestParam;

import java.lang.reflect.Constructor;

/**
 * Created by weizhi
 */
public class requestFactory {
    public static Request getRequestInstance(RequestParam param,Response.Listener listener,Response.ErrorListener errorListener) throws Exception{
        Class<?> class_ = Class.forName(param.getM_c_request().getName());
        Log.i("test", "--------- request className ---------" + param.getM_c_request().getName());
        Constructor<?> con = class_.getConstructor(RequestParam.class, Response.Listener.class, Response.ErrorListener.class);
        Request request = (Request) con.newInstance(param,listener,errorListener);
        return request;
    }
}
