package com.crazysunj.crazydaily.presenter.contract;

import com.crazysunj.crazydaily.base.IPresenter;
import com.crazysunj.crazydaily.base.IView;

/**
 * Created by codeest on 16/8/13.
 */

public interface ZhihuNewsDetailContract {

    interface View extends IView {

        void showContent();
    }

    interface  Presenter extends IPresenter<View> {

        void getNetInfo(long id);
    }
}
