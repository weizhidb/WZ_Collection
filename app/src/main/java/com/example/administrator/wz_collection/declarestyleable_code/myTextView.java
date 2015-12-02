package com.example.administrator.wz_collection.declarestyleable_code;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import com.example.administrator.wz_collection.R;
/**
 * Created by weizhi on 2015/11/30.
 */
public class myTextView extends TextView {

    public myTextView(Context context) {
        super(context);
    }


    public myTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public myTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.Test);
        int buttonNum = a.getInt(R.styleable.Test_buttonNum,3);
        Log.i("test","------------ decalare-style num -----------" + buttonNum);
        a.recycle();
    }
}
