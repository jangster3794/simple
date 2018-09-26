package com.example.rohan.kotlinintrolbta

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var age : Int?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun mySimpsons(view: View){
        val name = nameInput.text.toString()

        if (!ageInput.text.toString().equals("")){
            age  = ageInput.text.toString().toInt()
        }
        val job  = jobInput.text.toString()
        val user = simpsons(name,age,job)
        textView.text = "Name : "+user.name+" Age: "+user.age+" Job Position: "+user.job
    }
}
