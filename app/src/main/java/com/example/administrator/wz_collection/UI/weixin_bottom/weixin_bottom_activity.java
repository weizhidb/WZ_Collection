package com.example.administrator.wz_collection.UI.weixin_bottom;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.example.administrator.wz_collection.R;

/**
 * Created by weizhi on 2015/12/2.
 */
public class weixin_bottom_activity extends Activity {

    private ViewPager m_obj_viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weixinbottonactivity);
        m_obj_viewPager = (ViewPager) this.findViewById(R.id.id_viewpager);

    }
}
