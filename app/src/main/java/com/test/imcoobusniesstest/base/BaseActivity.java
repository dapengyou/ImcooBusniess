package com.test.imcoobusniesstest.base;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.test.imcoobusniesstest.constant.Constant;


/**
 * 是为我们所有的Activity提供公共的行为
 * Created by lady_zhou on 2017/10/11.
 */

public abstract  class BaseActivity extends AppCompatActivity{
    public String mClassName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        initUmeng();
    }

    /**
     * 初始化友盟统计
     */
    private void initUmeng() {
        mClassName = getComponentName().getShortClassName();
//        MobclickAgent.setDebugMode(true);
//        MobclickAgent.openActivityDurationTrack(false);
    }

    @Override
    protected void onResume() {
        super.onResume();
//        MobclickAgent.onPageStart(mClassName);
//        MobclickAgent.onResume(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
//        MobclickAgent.onPageEnd(mClassName);
//        MobclickAgent.onPause(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /**
     * 申请指定的权限.
     */
    public void requestPermission(int code, String... permissions) {

        ActivityCompat.requestPermissions(this, permissions, code);
    }

    /**
     * 判断是否有指定的权限
     */
    public boolean hasPermission(String... permissions) {

        for (String permisson : permissions) {
            if (ContextCompat.checkSelfPermission(this, permisson)
                    != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {

            case Constant.WRITE_READ_EXTERNAL_CODE:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    doSDCardPermission();
                }
                break;
        }
    }

    /**
     * 处理整个应用用中的SDCard业务
     */
    public void doSDCardPermission() {
    }

}
