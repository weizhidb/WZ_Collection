package com.example.administrator.wz_collection.product_cusumer_mode;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.administrator.wz_collection.R;

/**
 * Created by Administrator on 2015/11/29.
 */
public class activity_p_c extends Activity {
    private Button btn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base);
        btn = (Button) this.findViewById(R.id.id_base_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("test","------------- enter ----------------");
                baseData<String> stringbaseData = new baseData<String>();
                Thread pro = new Thread(new product(stringbaseData));
                Thread con = new Thread(new consumer(stringbaseData));

                pro.start();
                con.start();
            }
        });
    }
}
