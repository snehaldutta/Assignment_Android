package com.example.assignment_android

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CreateAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val logMem : TextView = findViewById(R.id.logMem)

        logMem.setOnClickListener{
            val logMemIntent = Intent(this, SignInActivity::class.java)
            startActivity(logMemIntent)
            finish()
        }
    }
}