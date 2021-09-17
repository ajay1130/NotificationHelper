package com.example.notificationhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var notificationHelper: NotificationHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        notificationHelper = NotificationHelper(this)
    }

    fun sendNotification(view: android.view.View) {
        notificationHelper.sendHighPriorityNotification(
            "Notification helper..",
            "Notification helper body...",
            MainActivity::class.java
        )
    }
}