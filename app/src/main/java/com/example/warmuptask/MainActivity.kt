package com.example.warmuptask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.warmuptask.ui.theme.WarmUpTaskTheme
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WarmUpTaskTheme {
                WarmUpApp(context = this)
            }
        }
    }
}




