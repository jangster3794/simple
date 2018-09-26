package com.example.rohan.multiapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_notes.*

class notes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)
    }
    fun home(view: View){
        val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }

    fun note1(view: View){
        val intent = Intent(applicationContext,note1::class.java)
        startActivity(intent)
    }
    fun note2(view: View){
        val intent = Intent(applicationContext,note2::class.java)
        startActivity(intent)
    }
    fun note3(view: View){
        val intent = Intent(applicationContext,note3::class.java)
        startActivity(intent)
    }
}
