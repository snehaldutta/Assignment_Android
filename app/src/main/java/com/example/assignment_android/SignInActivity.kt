package com.example.assignment_android

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class SignInActivity : AppCompatActivity() {
    private val credsManager : CredentialsManager = CredentialsManager()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        val inputEmailField : EditText = findViewById(R.id.inputEmailField)
//        inputEmailField.error = "anything"
//
//        findViewById<TextInputLayout>(R.id.inputEmailField).error = "oh yeah"
//        findViewById<TextInputLayout>(R.id.inputEmailField).isErrorEnabled = false


         val emailInput : TextInputLayout = findViewById(R.id.inputEmailField)
         val passwordInput : TextInputLayout = findViewById(R.id.inputPassField)
         val logBtn : Button = findViewById(R.id.signInBtn)

         logBtn.setOnClickListener{
             val emailInContent = emailInput.editText?.text.toString().trim()
             val passInContent = passwordInput.editText?.text.toString()

             if(!credsManager.isValidEmail(emailInContent)){
                 emailInput.error = "Invalid Email"
             }
             else{
                 emailInput.error = null
             }

             if (!credsManager.isPasswordFilled(passInContent)){
                 passwordInput.error = "Password is not filled"
             }
             else{
                 passwordInput.error = null
             }
         }


        val regNow : TextView = findViewById(R.id.regNow)

        regNow.setOnClickListener{
            val regNowIntent = Intent(this, CreateAccountActivity::class.java)
            startActivity(regNowIntent)
            finish()
        }
    }
}