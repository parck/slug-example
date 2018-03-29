package cn.edots.slug.example.controller;

import android.support.annotation.Nullable;

import java.util.Map;

import cn.edots.slug.Standardize;
import cn.edots.slug.example.R;

/**
 * @Author WETOOP
 * @Date 2018/3/28.
 * @Description
 */

public class Test02Controller extends BaseTestController implements Standardize {

    @Override
    public void setupData(@Nullable Map<String, Object> intentData) {
        viewDataModel.getTest().setTitle("Test02Controller");
        viewDataModel.titleText.setTextColor(context.getResources().getColor(R.color.colorPrimary));
    }

    @Override
    public void initView() {

    }

    @Override
    public void setListeners() {

    }

    @Override
    public void onCreateLast() {

    }
}
