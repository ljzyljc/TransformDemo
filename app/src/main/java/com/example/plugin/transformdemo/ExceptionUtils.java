package com.example.plugin.transformdemo;

import android.util.Log;

public class ExceptionUtils {
    private static final String TAG = "ExceptionUtils";

    public static void uploadCatchedException(Exception e){
        if (e == null){
            return;
        }
        Log.d(TAG, "uploadCatchedException: ===",e);
    }


}
