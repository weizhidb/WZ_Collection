package com.example.administrator.wz_collection.eventBus;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.wz_collection.R;

import de.greenrobot.event.EventBus;

/**
 * Created by weizhi on 2015/11/20.
 * 参考博客：http://www.2cto.com/kf/201503/386385.html
 * http://blog.csdn.net/bigconvience/article/details/46278719
 */

//订阅者中的代码是：
/*private void eventBus_Demo() {
        EventBus.getDefault().register(this);
        }

public void onEvent(baseEvent event){
        Log.i("test","---------- msg ---------" + (Integer)event.getMsg());
        }*/
public class activity2 extends Activity {
    private Button btn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        btn = (Button) this.findViewById(R.id.id_btn_activity2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.getDefault().post(new baseEvent<Integer>(5));
            }
        });

    }
}
