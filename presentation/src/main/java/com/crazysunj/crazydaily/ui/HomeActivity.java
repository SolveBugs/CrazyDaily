package com.crazysunj.crazydaily.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.crazysunj.crazydaily.R;
import com.crazysunj.crazydaily.base.BaseActivity;
import com.crazysunj.crazydaily.di.module.EntityModule;
import com.crazysunj.crazydaily.presenter.HomePresenter;
import com.crazysunj.crazydaily.presenter.contract.HomeContract;

import butterknife.BindView;
import butterknife.OnClick;


public class HomeActivity extends BaseActivity<HomePresenter> implements HomeContract.View {

    @BindView(R.id.button)
    Button button;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void initView() {
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {
        mPresenter.getNetInfo();
    }

    @Override
    public void showInfo(String info) {
        button.setText(info);
    }

    @OnClick(R.id.button)
    public void onClick(View view) {
        Toast.makeText(HomeActivity.this, "click me", Toast.LENGTH_LONG).show();
    }

    @Override
    protected int getContentResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initInject() {
        getActivityComponent(new EntityModule())
                .inject(this);
    }

    @Override
    public void onBackPressed() {
    }


}
