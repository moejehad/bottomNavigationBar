package com.example.navigationtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up.*

class signUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        SignUp.setOnClickListener {
            val i = Intent(this,login::class.java)
            startActivity(i)
            finish()
        }

        sign_login.setOnClickListener {
            val i = Intent(this,login::class.java)
            startActivity(i)
            finish()
        }

    }
}