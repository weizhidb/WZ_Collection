package com.example.administrator.wz_collection.volley_code;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

/**
 * Created by weizhi on 2015/11/29.
 */
public class protobufRequest extends Request<java.lang.Object> {
    private Response.Listener<java.lang.Object> listener;
    public protobufRequest(int method, String url, Response.ErrorListener listener) {
        super(method, url, listener);
    }

    public protobufRequest(int method, String url,Response.Listener<java.lang.Object> listener, Response.ErrorListener errorlistener){
        this(method, url, errorlistener);
        this.listener = listener;
    }

    @Override
    protected Response<java.lang.Object> parseNetworkResponse(NetworkResponse networkResponse) {
        java.lang.Object object = ByteToObject(networkResponse.data);
        return Response.success(object, HttpHeaderParser.parseCacheHeaders(networkResponse));
    }

    @Override
    protected void deliverResponse(java.lang.Object object) {
        this.listener.onResponse(object);
    }

    public static java.lang.Object ByteToObject(byte[] bytes) {
        java.lang.Object obj = null;
        try {
            // bytearray to object
            ByteArrayInputStream bi = new ByteArrayInputStream(bytes);
            ObjectInputStream oi = new ObjectInputStream(bi);

            obj = (java.lang.Object) oi.readObject();
            bi.close();
            oi.close();
        } catch (Exception e) {
            System.out.println("translation" + e.getMessage());
            e.printStackTrace();
        }
        return obj;
    }
}
