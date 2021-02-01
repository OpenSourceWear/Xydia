package com.xydiateam.xydia;

import android.os.Build;

import java.util.Locale;

public class DeviceInfo {

    public static int getApiLevel(){
        return Build.VERSION.SDK_INT;
    }

    public static String getProductName(){
        return Build.PRODUCT;
    }

    public static String getVersionCode(){
        return Build.VERSION.RELEASE;
    }

    public static String getCurrentLanguage(){
        return Locale.getDefault().getLanguage();
    }
}
