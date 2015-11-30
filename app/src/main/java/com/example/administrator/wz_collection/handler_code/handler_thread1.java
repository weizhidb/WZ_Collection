package com.example.administrator.wz_collection.handler_code;

import android.os.Handler;

/**
 * Created by weizhi on 2015/11/30.
 */
public class handler_thread1 extends Thread {

    private final int ok = 0;
    @Override
    public void run() {
        super.run();
        Handler handler = baseHandler.getInstancePtr();
        baseHandler.getInstancePtr().sendEmptyMessage(ok);
    }
}
