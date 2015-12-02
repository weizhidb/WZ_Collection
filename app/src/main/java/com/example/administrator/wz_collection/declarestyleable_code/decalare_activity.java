package com.example.administrator.wz_collection.declarestyleable_code;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.wz_collection.R;

/**
 * Created by weizhi on 2015/11/30.
 */
public class decalare_activity extends Activity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.decalare_activity);
        btn = (Button) this.findViewById(R.id.id_decalare_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
