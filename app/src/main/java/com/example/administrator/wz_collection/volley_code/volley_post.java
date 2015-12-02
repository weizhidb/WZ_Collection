package com.example.administrator.wz_collection.volley_code;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/11/29.
 */
public class volley_post {
    public static void post_test(Context context){

        RequestQueue queue = Volley.newRequestQueue(context);
        Map<String,String> params = new HashMap<String,String>();
        params.put("user","weizhi");
        params.put("pwd","123456");
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, "http://192.168.1.2:8080/webProjTest/servlet/httppost", (new JSONObject(params)).toString(), new Response.Listener<JSONObject>(){

            @Override
            public void onResponse(JSONObject jsonObject) {
                Log.i("test", "============ data =========== " + jsonObject.toString());
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.i("test","------------ error -----------");
            }
        });
        queue.add(request);
    }

    //protobuf
    protobufRequest protobufRequest = new protobufRequest(Request.Method.GET,"",new Response.Listener<java.lang.Object>(){
        @Override
        public void onResponse(Object o) {

        }
    },new Response.ErrorListener() {

        @Override
        public void onErrorResponse(VolleyError volleyError) {

        }
    });
}
