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

class MainActivity2 : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        var btnKg = findViewById<Button>(R.id.btnKilo)
        var btnHg = findViewById<Button>(R.id.btnHecto)
        var btnDag = findViewById<Button>(R.id.btnDeca)
        var btnDg = findViewById<Button>(R.id.btnDeci)
        var btnCg = findViewById<Button>(R.id.btnCenti)
        var btnMg = findViewById<Button>(R.id.btnMilli)

        var valeur = findViewById<EditText>(R.id.editTextText)
        var result = findViewById<TextView>(R.id.textViewResult)

        btnKg.setOnClickListener {
            var temp = (valeur.text.toString().toDouble()/1000)

            result.setText(temp.toString() + " Kilogrammes")
        }

        btnHg.setOnClickListener {
            var temp = (valeur.text.toString().toDouble()/100)

            result.setText(temp.toString() + " Hectogrammes")
        }

        btnDag.setOnClickListener {
            var temp = (valeur.text.toString().toDouble()/10)

            result.setText(temp.toString() + " Décagramme")
        }

        btnDg.setOnClickListener {
            var temp = (valeur.text.toString().toDouble()*10)

            result.setText(temp.toString() + " Décigramme")
        }

        btnCg.setOnClickListener {
            var temp = (valeur.text.toString().toDouble()*100)

            result.setText(temp.toString() + " Centigrammes")
        }

        btnMg.setOnClickListener {
            var temp = (valeur.text.toString().toDouble()*1000)

            result.setText(temp.toString() + " Milligrammes")
        }

        findViewById<Button>(R.id.btnBack2).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

    }

}