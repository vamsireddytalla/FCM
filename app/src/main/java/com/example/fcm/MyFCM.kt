package com.example.fcm

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

private const val TAG = "MyFCM"
class MyFCM : FirebaseMessagingService()
{
    override fun onMessageReceived(message: RemoteMessage)
    {
        super.onMessageReceived(message)

        Log.d(TAG, "Default call ")

      message.data.isNotEmpty().let {
          Log.d(TAG, "onMessageReceived: ${message.data}")
      }

        message.notification?.let {
            Log.d(TAG, "onMessageReceived Notification: ${it.body}")
        }

    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d(TAG, "onNewToken: $token")
    }

}