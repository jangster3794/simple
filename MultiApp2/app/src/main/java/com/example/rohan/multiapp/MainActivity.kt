package com.example.rohan.multiapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculator(view: View) {
        val intent = Intent(applicationContext, calculator::class.java)
        startActivity(intent)
    }

    fun notes(view:View){
        val intent = Intent(applicationContext, notes::class.java)
        startActivity(intent)
    }
}
