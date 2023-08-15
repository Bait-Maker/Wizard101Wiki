package com.example.wizard101wiki

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.wizard101wiki.ui.theme.Wizard101WikiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Wizard101WikiTheme {
               MainScreen()
            }
        }
    }
}//end MainActivity()
//--------------------------------------------------------------------------------------------------