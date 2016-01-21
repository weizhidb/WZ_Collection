package com.example.weizhi.wz_titlescrollview.base;

import android.support.v4.app.Fragment;

import com.example.weizhi.wz_titlescrollview.net.detectNetWork.IcheckNetWork;

/**
 * Created by weizhi on 2015/12/24.
 * 所有懒加载Fragment的基类
 */
public abstract class superFragment extends Fragment implements IcheckNetWork {

    //Fragment 当前状态是否可见
    protected boolean m_b_isVisible = false;


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(getUserVisibleHint()){
            m_b_isVisible = true;
            onVisible();
        }else{
            m_b_isVisible = false;
            onInvisible();
        }
    }


    /**
     * 可见
     * */
    protected  void onVisible(){
        lazyLoadData();
    }

    /**
     * 不可见
     */
    protected void onInvisible() {


    }

    /**
     * 延迟加载
     * 子类重写这个方法
     * 懒加载数据
     * 如果我们不想懒加载可以让网络加载的数据不要放在这个方法里面
     * */
    protected abstract void lazyLoadData();


}
