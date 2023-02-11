package com.tazhibov.githubrepos

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "Был вызван onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "Был вызван onDestroy")
    }
}
