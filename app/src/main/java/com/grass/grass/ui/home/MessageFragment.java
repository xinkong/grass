package com.grass.grass.ui.home;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.grass.grass.R;
import com.grass.grass.base.BaseGrassFragment;

public class MessageFragment extends BaseGrassFragment {

    @Override
    public View onInflaterView(LayoutInflater inflater) {
        View view =inflater.inflate(R.layout.fragment_message,null);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    protected void initHeadView(LinearLayout ll_headView, TextView tv_left, TextView tv_title, TextView tv_right) {
        super.initHeadView(ll_headView, tv_left, tv_title, tv_right);
        tv_title.setText("消息中心");
    }
}
