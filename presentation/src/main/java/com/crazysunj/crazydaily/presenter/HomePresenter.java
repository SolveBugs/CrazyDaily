package com.crazysunj.crazydaily.presenter;

import com.crazysunj.crazydaily.base.BasePresenter;
import com.crazysunj.crazydaily.di.scope.ActivityScope;
import com.crazysunj.crazydaily.presenter.contract.HomeContract;

import javax.inject.Inject;

@ActivityScope
public class HomePresenter extends BasePresenter<HomeContract.View> implements HomeContract.Presenter {


    @Inject
    public HomePresenter() {
    }

    @Override
    public void getNetInfo() {
    }


    @Override
    public void detachView() {
        super.detachView();
    }
}
