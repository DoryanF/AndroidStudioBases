package com.example.myapplication2

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import java.lang.Exception
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.StringBuilder

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout_api)

        /*findViewById<Button>(R.id.btnPageKilo).setOnClickListener {
            try {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            }
            catch (ex:Exception)
            {
                findViewById<TextView>(R.id.textView3).setText(ex.toString())
            }


        }

        findViewById<Button>(R.id.btnPageMetre).setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

            finish()
        }*/

        val postsTextView = findViewById<TextView>(R.id.textViewApiLayout)

        val api = RetrofitClient.instance

        val call  = api.getPosts()

        call.enqueue(object: Callback<List<Post>>{
            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>){
                if (response.isSuccessful) {
                    val posts = response.body()

                    val postText = StringBuilder()
                    posts?.forEach{ post ->
                        postText.append("Title: ${post.text}\n")
                        postText.append("Body: ${post.source}\n\n")
                    }

                    postsTextView.text = postText.toString()
                } else{
                    postsTextView.text = "Error loading posts ${response.code()}"
                }
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                postsTextView.text = "Failed to fetch posts." + t
            }

        })





    }

    /*private fun onActivityResult(result: ActivityResult)
    {
        if(result.resultCode == Activity.RESULT_OK) {
            val resultValue = result.data?.getStringExtra("resultKey")
            findViewById<TextView>(R.id.textView2).text = "Bonjour, $resultValue"
        }

    }*/
}