package com.example.administrator.wz_collection.Androidannotations_code;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by weizhi on 2015/12/3.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface person {
    String name();
    int age();
}
