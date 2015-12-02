package com.example.administrator.wz_collection.handler_code;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.wz_collection.R;

/**
 * Created by weizhi on 2015/11/30.
 */
public class activity_handler extends Activity {
    private Button btn ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base);
        btn = (Button) this.findViewById(R.id.id_base_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                handler_thread2 thread2 = new handler_thread2();
                handler_thread1 thread1 = new handler_thread1();
                thread2.start();
                thread1.start();
            }
        });
    }
}
