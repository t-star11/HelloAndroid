package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//This file loads the instance of activity_main. Modifying this would change what instance is created
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}