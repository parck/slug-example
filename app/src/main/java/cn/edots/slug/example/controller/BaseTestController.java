package cn.edots.slug.example.controller;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import cn.edots.slug.Controller;
import cn.edots.slug.example.databinding.ActivityTestBinding;
import cn.edots.slug.example.model.TestModel;
import cn.edots.slug.example.ui.TestActivity;

/**
 * @Author WETOOP
 * @Date 2018/3/28.
 * @Description
 */

public class BaseTestController extends Controller<TestActivity, ActivityTestBinding> {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        TestModel test = new TestModel();
        viewDataModel.setTest(test);
        viewDataModel.titleText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.finish();
            }
        });
    }
}
