package com.example.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

public class VnNativeOs {

    private static final String OS_NAME = "android";

    SharedPreferences sharedPref;
    Context context;
    WebView webView;

    public VnNativeOs(Context ctx, SharedPreferences preferences, WebView myWebView) {
        sharedPref = preferences;
        context = ctx;
        webView = myWebView;
    }

    @JavascriptInterface
    public String getOsName() {
        return OS_NAME;
    }
}

