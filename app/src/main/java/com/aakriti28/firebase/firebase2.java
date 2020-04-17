package com.aakriti28.firebase;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class firebase2 extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
