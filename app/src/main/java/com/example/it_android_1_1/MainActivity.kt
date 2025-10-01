package com.example.it_android_1_1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1 : TextView = findViewById(R.id.text1)
        val btn1 : Button = findViewById(R.id.btn1)

        btn1.setOnClickListener {
            text1.text = getString(R.string.hello)
        }
    }
}