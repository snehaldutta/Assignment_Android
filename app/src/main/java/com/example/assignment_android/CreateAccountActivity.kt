package com.example.assignment_android

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class CreateAccountActivity : AppCompatActivity() {
    private val credsManager : CredentialsManager = CredentialsManager()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val registerBtn : Button = findViewById(R.id.logInBtn)
        val emailInputField : TextInputLayout = findViewById(R.id.inputValEmailField)
        val passwordInputField : TextInputLayout = findViewById(R.id.inputStrPassField)

        registerBtn.setOnClickListener{
            val input_email = emailInputField.editText.toString()
            val input_password = passwordInputField.editText.toString()

            val res = credsManager.register(input_email,input_password)
            if(res.isSuccess){
                Toast.makeText(this,res.getOrNull(), Toast.LENGTH_SHORT).show()
                val login_intent = Intent(this, SignInActivity::class.java)
                startActivity(login_intent)
            }
            else{
                Toast.makeText(this,res.exceptionOrNull()?.message, Toast.LENGTH_SHORT).show()
            }
        }

        val logMem : TextView = findViewById(R.id.logMem)

        logMem.setOnClickListener{
            val logMemIntent = Intent(this, SignInActivity::class.java)
            startActivity(logMemIntent)
            finish()
        }
    }
}