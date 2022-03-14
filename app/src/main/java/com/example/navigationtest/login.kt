package com.example.navigationtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_sign.setOnClickListener {
            val i = Intent(this,signUp::class.java)
            startActivity(i)
            finish()
        }

        Login.setOnClickListener {
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
            finish()
        }


    }
}