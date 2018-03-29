package cn.edots.slug.example.ui;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import cn.edots.slug.annotation.BindLayout;
import cn.edots.slug.example.R;
import cn.edots.slug.example.databinding.ActivityMainBinding;
import cn.edots.slug.example.model.ItemMainModel;
import cn.edots.slug.example.model.MainModel;
import cn.edots.slug.model.Holdable;
import cn.edots.slug.ui.BaseActivity;
import cn.edots.slug.ui.adapter.HoldenAdapter;

@BindLayout(R.layout.activity_main)
public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainModel dataModel = new MainModel();
        dataModel.setName("nameText");
        viewDataBinding.setMain(dataModel);
        List<Holdable> holdables = new ArrayList<>();
        ItemMainModel e = new ItemMainModel();
        e.title = "testController01";
        holdables.add(e);
        e = new ItemMainModel();
        e.title = "testController02";
        holdables.add(e);
        viewDataBinding.recyclerView.setAdapter(new HoldenAdapter(this, R.layout.item_main_list, holdables));
    }
}
