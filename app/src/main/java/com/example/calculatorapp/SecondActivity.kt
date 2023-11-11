package com.example.calculatorapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var textUserName : TextView
    private lateinit var btnStart : Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        textUserName = findViewById(R.id.tv_username)

        val userName = intent.getStringExtra("username")

        textUserName.text = "Hello, "+userName


        btnStart = findViewById(R.id.btn_Start)
        btnStart.setOnClickListener {
            startActivity(
                Intent(this, ThirdActivity::class.java)
            )
        }

    }
}