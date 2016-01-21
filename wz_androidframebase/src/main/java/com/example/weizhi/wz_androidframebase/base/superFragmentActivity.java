package com.example.weizhi.wz_androidframebase.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by weizhi on 2015/12/24.
 */
public class superFragmentActivity extends FragmentActivity {
    private static String TAG = "supreFragmet.class";

    ThreadPoolManager m_obj_thread_poolManager = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m_obj_thread_poolManager = ThreadPoolManager.getInstance();
    }

    //开启线程
    protected void excuteTask(Runnable run){
        if(null != m_obj_thread_poolManager){
            m_obj_thread_poolManager.executeTask(run);
        }
    }
}
