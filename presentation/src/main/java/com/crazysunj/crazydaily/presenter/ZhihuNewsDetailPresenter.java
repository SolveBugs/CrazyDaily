package com.crazysunj.crazydaily.presenter;

import com.crazysunj.crazydaily.base.BasePresenter;
import com.crazysunj.crazydaily.di.scope.ActivityScope;
import com.crazysunj.crazydaily.presenter.contract.ZhihuNewsDetailContract;

import javax.inject.Inject;

@ActivityScope
public class ZhihuNewsDetailPresenter extends BasePresenter<ZhihuNewsDetailContract.View> implements ZhihuNewsDetailContract.Presenter {


    @Inject
    public ZhihuNewsDetailPresenter() {
    }

    @Override
    public void getNetInfo(long id) {

    }
}
