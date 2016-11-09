package com.android.chengl.giftone.tools;

import android.util.Log;

/**
 * Created by chengl on 2016/11/8.
 */
public class LogUtils {
    public static final boolean DEBUG = true;
    private static final String TAG = "GiftTest";

    public LogUtils(Class _class,String msg) {
        if (DEBUG){
            Log.i(TAG, _class + "-->" + msg);
        }
    }
}
