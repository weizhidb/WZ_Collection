package com.example.administrator.wz_collection.eventBus;

/**
 * Created by weizhi on 2015/11/20.
 * 所有事件的基类
 * 可传任意类型的数据
 */
public class baseEvent<T> {
    private T t;
    public baseEvent(T t){
        this.t = t;
    }

    public T getMsg(){
        return this.t;
    }
}
