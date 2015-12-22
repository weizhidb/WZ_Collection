package com.example.administrator.wz_collection.Androidannotations_code;

import android.util.Log;

/**
 * Created by weizhi on 2015/12/3.
 */
@person(name="weizhi",age=33)
public class java_test {

    public static void annotation_test(Class c){
        person p = (person)c.getAnnotation(c);
        Log.i("test", "--------- name = ---------" + p.name());
        Log.i("test", "--------- age = ---------" + p.age());
    }
}
