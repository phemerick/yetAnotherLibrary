package com.br.usemobile.exampleutil;

import android.location.Location;
import android.util.Log;

public class LogDebug {

    private static final String TAG = "I_GOT_A_TICKET_TO_RIDE";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
