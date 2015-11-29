package com.example.administrator.wz_collection.product_cusumer_mode;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/11/29.
 * 数据仓库基础数据
 */
public class baseData<T> {
    private T t;
    private List<T> list = new ArrayList<T>();//
    private final int FIRST_INDEX = 0;//首个数据
    private int m_i_Max = 100;//链表里面可以存放的数据最大量

    public baseData(int max){
        this.m_i_Max = max;
    }

    public baseData(){

    }

    //生产数据
    public synchronized void WriteData(T t){
        list.add(t);
        if(list.size() >= m_i_Max){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Log.i("test", "----------- WriteData wait exception --------- " + e.toString());
            }
        }
        this.notifyAll();
    }

    //消费数据
    public synchronized T readFirstData(){
        if(list.isEmpty()){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Log.i("test", "----------- readFirstData wait exception --------- " + e.toString());
            }
            return null;
        }
        T str = list.get(FIRST_INDEX);
        removeData(FIRST_INDEX);
        this.notifyAll();
        return str;
    }
    public void removeData(int index){
        list.remove(index);
    }
}

