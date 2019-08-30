package com.dagger.example.daggerexamplelibrary.services;

import android.content.Context;
import android.util.Log;

/**
 * Created on 2019-08-30.
 */
public class ServiceFoo {

    private static final String TAG = ServiceFoo.class.getSimpleName();

    private final Context mContext;

    public ServiceFoo(Context context) {
        this.mContext = context;
    }

    public void downloadImages() {
        Log.d(TAG, "Downloading images");
    }
}
