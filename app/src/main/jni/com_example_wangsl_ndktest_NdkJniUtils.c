//
// Created by wangsl on 2018/1/11.
//
#include "com_example_wangsl_ndktest_NdkJniUtils.h"
JNIEXPORT jstring JNICALL Java_com_example_wangsl_ndktest_NdkJniUtils_getClanguageString
        (JNIEnv * env , jobject obj){
    return (*env)->NewStringUTF(env,"This just a test for Android Studio NDK JNI developer!");
}


