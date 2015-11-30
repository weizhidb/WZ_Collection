package com.example.administrator.wz_collection.handler_code;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/**
 * Created by weizhi on 2015/11/30.
 */
public class handler_thread2 extends Thread {
    @Override
    public void run() {
        super.run();
        Looper.prepare();
        Log.i("test", "---------------------- handler_thread2 enter ------------");
        Handler handler = baseHandler.getInstancePtr();
        Looper.loop();
    }
}
