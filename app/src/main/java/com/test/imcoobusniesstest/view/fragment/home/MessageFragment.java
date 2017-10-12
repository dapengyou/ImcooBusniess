package com.test.imcoobusniesstest.view.fragment.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.test.imcoobusniesstest.R;
import com.test.imcoobusniesstest.base.BaseFragment;

/**
 * Created by lady_zhou on 2017/10/11.
 */

public class MessageFragment extends BaseFragment implements View.OnClickListener {
    private View mContentView;

    private TextView mMessageView;
    private TextView mZanView;
    private TextView mImoocView;
    private TextView mTipView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mContext = getActivity();
        mContentView = inflater.inflate(R.layout.fragment_message_layout, container, false);
        initView();
        return mContentView;
    }

    private void initView() {
        mMessageView = mContentView.findViewById(R.id.tip_message_view);
        mImoocView = mContentView.findViewById(R.id.tip_imooc_view);
        mZanView = mContentView.findViewById(R.id.zan_message_info_view);
        mTipView = mContentView.findViewById(R.id.tip_view);
    }

    @Override
    public void onClick(View view) {

    }
}
