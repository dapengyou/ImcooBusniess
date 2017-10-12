package com.test.imcoobusniesstest.application;

import android.app.Application;

/**
 * 1、程序的入口
 * 2、初始化工作
 * 3、为整个应用的其他模块提供上下文
 * Created by lady_zhou on 2017/10/11.
 */

public class MyApplication extends Application {
    private static MyApplication myApplication = null;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
    }

    public static MyApplication getInstance() {
        return myApplication;
    }
}
