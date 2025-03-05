package com.liehan.calculatorapp

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //start of my code
        var birthday = 8
        birthday += 10
        //display log message
        Log.d(TAG, "Birthday + 10 = $birthday")
        //display log error message
        birthday *= 3
        Log.e(TAG, "Birthday * 3 = $birthday")
        //display log warning message
        birthday -= 5
        Log.w(TAG, "Birthday - 5 = $birthday")
        //display log info message
        birthday /= 2
        Log.i(TAG, "Birthday / 2 = $birthday")
    }//end of onCreate
}