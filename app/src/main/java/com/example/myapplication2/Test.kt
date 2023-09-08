package com.example.myapplication2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.annotation.RequiresApi

class Test : ComponentActivity() {

    @RequiresApi(Build.VERSION_CODES.R)
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity2)

        //var btnReturn = findViewById<Button>(R.id.btnRetour)

        /*btnReturn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            finish()
        }*/

    }

}