package com.tazhibov.githubrepos

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

// Главный экран приложения
class MainActivity : AppCompatActivity(R.layout.activity_main) {
    //    Вызывается при создании Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "Был вызван onCreate")
    }

    // Вызывается при уничтожении экрана
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "Был вызван onDestroy")
    }

    //Вызывается когда экран становиться видимым
    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "Был вызван onStart")
    }

    //Вызывается когда экран становиться не видемым
    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "был вызван onStop")
    }
}
