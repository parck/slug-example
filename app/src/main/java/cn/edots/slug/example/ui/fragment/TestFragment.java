package cn.edots.slug.example.ui.fragment;

import android.support.annotation.Nullable;

import java.util.Map;

import cn.edots.slug.Standardize;
import cn.edots.slug.annotation.BindLayout;
import cn.edots.slug.example.R;
import cn.edots.slug.example.databinding.FragmentTestBinding;
import cn.edots.slug.ui.fragment.TitleBarFragment;

/**
 * @Author WETOOP
 * @Date 2018/3/29.
 * @Description
 */
@BindLayout(R.layout.fragment_test)
public class TestFragment extends TitleBarFragment<FragmentTestBinding> implements Standardize {

    @Override
    public void setupData(@Nullable Map<String, Object> intentData) {
        setCenterTitleContent("TestFragment");
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
