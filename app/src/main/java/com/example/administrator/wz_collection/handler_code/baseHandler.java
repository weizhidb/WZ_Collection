package com.example.administrator.wz_collection.handler_code;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/**
 * Created by weizhi on 2015/11/30.
 */
public class baseHandler extends Handler {
    private static baseHandler handler;
    public static baseHandler getInstancePtr(){
        if(null == handler){
            handler = new baseHandler(){
                @Override
                public void handleMessage(Message msg) {
                    super.handleMessage(msg);
                    Log.i("test","-------------- msg ----------" + msg.toString());
                }
            };
        }
        return handler;
    }


}
