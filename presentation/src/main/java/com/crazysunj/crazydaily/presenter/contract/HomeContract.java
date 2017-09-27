package com.crazysunj.crazydaily.presenter.contract;


import com.crazysunj.crazydaily.base.IPresenter;
import com.crazysunj.crazydaily.base.IView;

public interface HomeContract {

    interface View extends IView {

        void showInfo(String info);
    }

    interface Presenter extends IPresenter<View> {
        void getNetInfo();
    }
}
