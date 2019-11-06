package com.br.usemobile.logutil;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "SUPER_CALIFRAGIL";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
