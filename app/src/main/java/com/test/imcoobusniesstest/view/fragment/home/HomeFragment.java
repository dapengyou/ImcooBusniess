package com.test.imcoobusniesstest.view.fragment.home;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.test.imcoobusniesstest.R;
import com.test.imcoobusniesstest.base.BaseFragment;

/**
 * Created by lady_zhou on 2017/10/11.
 */

public class HomeFragment extends BaseFragment implements View.OnClickListener{
    /**
     * UI
     */
    private View mContentView;
    private ListView mListView;
    private TextView mQRCodeView;
    private TextView mCategoryView;
    private TextView mSearchView;
    private ImageView mLoadingView;

    public HomeFragment(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContext = getActivity();
        mContentView = inflater.inflate(R.layout.fragment_home_layout,container,false);
        initView();

        return mContentView;

    }
    private void initView() {
        mQRCodeView = mContentView.findViewById(R.id.qrcode_view);
        mQRCodeView.setOnClickListener(this);
        mCategoryView = mContentView.findViewById(R.id.category_view);
        mCategoryView.setOnClickListener(this);
        mSearchView =  mContentView.findViewById(R.id.search_view);
        mSearchView.setOnClickListener(this);
//        mListView = (ListView) mContentView.findViewById(R.id.list_view);
//        mLoadingView = (ImageView) mContentView.findViewById(R.id.loading_view);
//        AnimationDrawable anim = (AnimationDrawable) mLoadingView.getDrawable();
//        anim.start();
    }

    @Override
    public void onClick(View view) {

    }
}
