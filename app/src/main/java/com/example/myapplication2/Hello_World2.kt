package com.example.myapplication2

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.annotation.RequiresApi

class Hello_World2 : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.second_hello_world) //Utilisation du layout XML

        var editName = findViewById<EditText>(R.id.editTextChangeName) //Récupération du champ text

        var btnAjoutPrenom = findViewById<Button>(R.id.btnPrenom) //Récupération du bouton

        btnAjoutPrenom.setOnClickListener {
            val temp = editName.text.toString() //Récupération du texte saisie
            val resultIntent = Intent()
            resultIntent.putExtra("resultKey", temp)
            setResult(Activity.RESULT_OK, resultIntent)

            finish()
        }
    }
}