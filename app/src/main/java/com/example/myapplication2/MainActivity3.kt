package com.example.myapplication2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.annotation.RequiresApi

class MainActivity3 : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity2)


        var value = findViewById<EditText>(R.id.editTextTextMetre)
        var result = findViewById<TextView>(R.id.textViewResultMetre)

        findViewById<Button>(R.id.btnKilometre).setOnClickListener {
            var temp = (value.text.toString().toDouble()/1000)

            result.setText(temp.toString() + " Kilomètre")

        }
        findViewById<Button>(R.id.btnHectometre).setOnClickListener {
            var temp = (value.text.toString().toDouble()/100)

            result.setText(temp.toString() + " Hectomètre")

        }
        findViewById<Button>(R.id.btnDecametre).setOnClickListener {
            var temp = (value.text.toString().toDouble()/10)

            result.setText(temp.toString() + " Décamètre")

        }
        findViewById<Button>(R.id.btnDecimetre).setOnClickListener {
            var temp = (value.text.toString().toDouble()*10)

            result.setText(temp.toString() + " Décimètre")
        }
        findViewById<Button>(R.id.btnCentimetre).setOnClickListener {
            var temp = (value.text.toString().toDouble()*100)

            result.setText(temp.toString() + " Centimètre")

        }
        findViewById<Button>(R.id.btnMillimetre).setOnClickListener {
            var temp = (value.text.toString().toDouble()*1000)

            result.setText(temp.toString() + " Milimètre")

        }

        findViewById<Button>(R.id.btnBack2).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}