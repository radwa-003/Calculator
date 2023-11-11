package com.example.calculatorapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var btnSendData : Button
    private lateinit var editUserName : EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendData = findViewById(R.id.btn_sendData)
        editUserName = findViewById(R.id.et_username)

        btnSendData.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java)
                .putExtra("username",editUserName.text.toString()))
        }


    }
}
