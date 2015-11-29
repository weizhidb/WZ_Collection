package com.example.administrator.wz_collection.product_cusumer_mode;

/**
 * Created by Administrator on 2015/11/29.
 */
public class product implements Runnable{

    private baseData m_obj_baseData;
    public product(baseData data){
        this.m_obj_baseData = data;
    }
    @Override
    public void run() {
        for(int i = 0;i < 10;i ++){
            this.m_obj_baseData.WriteData("product" + i);
        }
    }
}
