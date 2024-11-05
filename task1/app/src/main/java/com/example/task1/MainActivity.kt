package com.example.prcts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.task1.R

class MainActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var okayButton: Button
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        emailEditText = findViewById(R.id.inputEditText)
        okayButton = findViewById(R.id.submitButton)
        nextButton = findViewById(R.id.button2)


        okayButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER_EMAIL", email)
            startActivity(intent)
        }


        nextButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER_EMAIL", email)
            startActivity(intent)
        }
    }
}