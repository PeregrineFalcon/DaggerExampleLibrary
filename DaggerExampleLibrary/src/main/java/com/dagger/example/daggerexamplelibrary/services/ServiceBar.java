package com.dagger.example.daggerexamplelibrary.services;

import android.content.Context;
import android.util.Log;

/**
 * Created on 2019-08-30.
 */
public class ServiceBar {
    private static final String TAG = ServiceBar.class.getSimpleName();
    private final Context mContext;
    private final ServiceFoo mServiceFoo;

    public ServiceBar(Context context, ServiceFoo serviceFoo) {

        this.mContext = context;
        this.mServiceFoo = serviceFoo;
    }

    public void uploadImages() {

        Log.d(TAG, "Uplloading Images");
    }
}
