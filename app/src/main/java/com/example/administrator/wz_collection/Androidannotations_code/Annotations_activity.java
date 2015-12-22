package com.example.administrator.wz_collection.Androidannotations_code;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.wz_collection.R;

import org.androidannotations.annotations.EActivity;

/**
 * Created by weizhi on 2015/12/3.
 */

@EActivity(R.layout.base)
public class Annotations_activity extends Activity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.base);
//        btn = (Button) this.findViewById(R.id.id_base_btn);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //java_test.annotation_test(person.class);
//            }
//        });
    }
}
