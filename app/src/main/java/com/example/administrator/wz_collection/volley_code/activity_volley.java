package com.example.administrator.wz_collection.volley_code;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.wz_collection.R;

/**
 * Created by Administrator on 2015/11/29.
 */
public class activity_volley extends Activity {
    private Button btn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base);
        btn = (Button) this.findViewById(R.id.id_base_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volley_post.post_test(activity_volley.this);
            }
        });
    }
}
