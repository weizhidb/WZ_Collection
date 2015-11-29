package com.example.administrator.wz_collection.product_cusumer_mode;

import android.util.Log;

/**
 * Created by Administrator on 2015/11/29.
 */
public class consumer implements Runnable {
    private baseData m_obj_data;

    public void setRun_ctrl(boolean run_ctrl) {
        this.run_ctrl = run_ctrl;
    }

    private boolean run_ctrl = true;
    public consumer(baseData data){
        this.m_obj_data = data;
    }
    @Override
    public void run() {
        while(run_ctrl){
            Log.i("test","--------- read data" + this.m_obj_data.readFirstData());
        }
    }
}
