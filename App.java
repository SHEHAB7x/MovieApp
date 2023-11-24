package com.example.moviesapp;

import android.app.Application;

import com.example.moviesapp.data.local.MyDatabase;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MyDatabase.init(this);
    }
}
