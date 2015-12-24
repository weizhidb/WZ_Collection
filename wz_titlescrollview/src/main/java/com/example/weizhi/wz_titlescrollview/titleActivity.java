package com.example.weizhi.wz_titlescrollview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.example.weizhi.wz_titlescrollview.util.PagerSlidingTabStrip;
import com.example.weizhi.wz_titlescrollview.util.ZoomOutPageTransformer;

/**
 * Created by weizhi on 2015/12/24.
 */
public class titleActivity extends FragmentActivity {
    private ViewPager m_obj_vp = null;
    private PagerSlidingTabStrip m_obj_tabs = null;
    private myPagerAdapter m_obj_myAdapter = null;
    private String [] m_strArray_Title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_scrollview);

        //设置title的标签名字
        String Title[] = { "新 闻", "便民", "社 区", "美食", "娱乐", "电影", "房 产",
                "汽车" };
        setTitleContent(Title);
        initView();
    }

    private void setTitleContent(String title[]) {
        m_strArray_Title = title;
    }

    private void initView() {
        m_obj_vp = (ViewPager) this.findViewById(R.id.id_viewpager);
        m_obj_myAdapter = new myPagerAdapter(getSupportFragmentManager());
        m_obj_vp.setAdapter(m_obj_myAdapter);
        m_obj_vp.setOffscreenPageLimit(2);
        m_obj_vp.setPageTransformer(true, new ZoomOutPageTransformer());

        m_obj_tabs = (PagerSlidingTabStrip) this.findViewById(R.id.id_tabs);
        m_obj_tabs.setTextColorResource(R.color.light_gray_text);
        m_obj_tabs.setDividerColorResource(R.color.common_list_divider);
        // tabs.setUnderlineColorResource(R.color.common_list_divider);
        m_obj_tabs.setIndicatorColorResource(R.color.red);
        m_obj_tabs.setSelectedTextColorResource(R.color.red);
        // tabs.setIndicatorHeight(5);
        m_obj_tabs.setViewPager(m_obj_vp);
    }

    private class myPagerAdapter extends FragmentStatePagerAdapter{

        public myPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            return new titleNewFragment(m_strArray_Title[position]);
        }

        @Override
        public int getCount() {
            return m_strArray_Title.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return m_strArray_Title[position];
        }
    }

    @Override
    protected void onDestroy() {
        Log.i("test","-------- activity ondestroy ----------");
        super.onDestroy();
    }
}
