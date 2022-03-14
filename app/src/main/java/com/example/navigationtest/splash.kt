package com.example.navigationtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
 
        Handler().postDelayed({
            val i = Intent(this,signUp::class.java)
            startActivity(i)
            finish()
        },3000)
    }
}