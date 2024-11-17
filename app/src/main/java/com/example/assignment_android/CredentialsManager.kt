package com.example.assignment_android

class CredentialsManager {
    private val emailPatt =
            ("[a-zA-Z0-9\\+\\%\\-\\+]{1,256}" +
                "\\@" +
                "[a-zA-Z0-9][0-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][0-zA-Z0-9\\-]{0,25}" +
                ")+"). toRegex()

    fun isEmailEmpty(email: String) : Boolean{
        return email.isEmpty()
    }

    fun isValidEmail(email : String): Boolean{
        return email.matches(emailPatt)
    }

    fun isPasswordEmpty(passwword: String):Boolean{
        return passwword.isEmpty()
    }

    fun isPasswordFilled(passwword: String): Boolean{
        return passwword.isNotEmpty()
    }


}