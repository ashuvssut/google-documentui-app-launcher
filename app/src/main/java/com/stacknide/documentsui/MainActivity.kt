package com.stacknide.documentsui

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.ComponentName
import android.content.Intent
import android.widget.Toast

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Try to launch DocumentsUI
        try {
            val intent = Intent().apply {
                component = ComponentName(
                    "com.google.android.documentsui",
                    "com.android.documentsui.files.FilesActivity"
                )
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
            finish() // close this app
        } catch (e: Exception) {
            Toast.makeText(this, "Unable to open DocumentsUI", Toast.LENGTH_LONG).show()
            e.printStackTrace()
        }
    }
}