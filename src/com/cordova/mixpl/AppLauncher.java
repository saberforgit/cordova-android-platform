package com.cordova.mixpl;


import android.os.Bundle;

import org.apache.cordova.CordovaActivity;

/**
 * Created by saber on 2016/6/28.
 */
public class AppLauncher extends CordovaActivity{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Set by <content src="index.html" /> in config.xml
        loadUrl("http://shenmingxuanyi.github.io/ChinaPost_LCMS/index.html");
    }

}
