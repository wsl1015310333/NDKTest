package com.example.wangsl.ndktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NdkJniUtils ndkJniUtils=new NdkJniUtils();
        Log.e("ndk",ndkJniUtils.getClanguageString());
    }
    static {
        System.loadLibrary("jnitText");
    }
}
