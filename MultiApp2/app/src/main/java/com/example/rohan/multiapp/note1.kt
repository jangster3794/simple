package com.example.rohan.multiapp

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_note1.*

class note1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note1)
    }

    fun home(view:View){
        val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }
    fun back(view: View){
        val intent = Intent(applicationContext,notes::class.java)
        startActivity(intent)
    }

    fun save(view: View){
        var text: String = note1Text.text.toString()
        val sharedPreferences = this.getSharedPreferences("com.example.rohan.multiapp", Context.MODE_PRIVATE)
        sharedPreferences.edit().putString("textValue",text).apply()
        val storedText = sharedPreferences.getString("textValue","Nothing was typed.")
        text = storedText
    }
}
