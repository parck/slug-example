package cn.edots.slug.example.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import cn.edots.slug.core.cache.FragmentPool;
import cn.edots.slug.example.ui.fragment.TestFragment;
import cn.edots.slug.ui.FragmentActivity;

/**
 * @Author WETOOP
 * @Date 2018/3/29.
 * @Description
 */
public class TestFragmentActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Fragment getFragment() {
        return FragmentPool.getFragment(TestFragment.class);
    }
}
