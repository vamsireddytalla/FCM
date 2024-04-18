package com.example.fcm

import android.app.Application
import com.google.firebase.FirebaseApp

open class MyApp : Application()
{
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}