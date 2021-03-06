package cn.edots.slug.example.model;

import android.view.View;

import cn.edots.slug.example.controller.Test01Controller;
import cn.edots.slug.example.controller.Test02Controller;
import cn.edots.slug.example.databinding.ItemMainListBinding;
import cn.edots.slug.example.ui.MainActivity;
import cn.edots.slug.example.ui.TestActivity;
import cn.edots.slug.example.ui.TestFragmentActivity;
import cn.edots.slug.model.Holdable;
import cn.edots.slug.model.Protocol;
import cn.edots.slug.ui.adapter.RecyclerViewAdapter;

/**
 * @Author WETOOP
 * @Date 2018/3/29.
 * @Description
 */

public class ItemMainModel implements Holdable<ItemMainListBinding> {

    public String title;

    @Override
    public void holding(final RecyclerViewAdapter.ViewHolder<ItemMainListBinding> holder) {
        holder.getViewDataBinding().setItem(this);
        holder.setOnItemClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (holder.getPosition()) {
                    case 0:
                        ((MainActivity) holder.getContext()).startActivity(TestActivity.class, new Protocol(Test01Controller.class));
                        break;
                    case 1:
                        ((MainActivity) holder.getContext()).startActivity(TestActivity.class, new Protocol(Test02Controller.class));
                        break;
                    case 2:
                        ((MainActivity) holder.getContext()).startActivity(TestFragmentActivity.class);
                        break;
                }
            }
        });

    }
}
