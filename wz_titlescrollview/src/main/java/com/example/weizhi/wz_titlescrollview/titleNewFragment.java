package com.example.weizhi.wz_titlescrollview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by weizhi on 2015/12/24.
 */
public class titleNewFragment extends Fragment {
    private int m_ids = 0;
    private String m_str_text;
    private TextView m_obj_tv = null;
    public titleNewFragment(){}
    public titleNewFragment(String text){
        this.m_str_text = text;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.title_fragmetview,container,false);
        m_obj_tv = (TextView) view.findViewById(R.id.id_titleFragmeView);
        m_obj_tv.setText(m_str_text);
        return view;
    }
}
