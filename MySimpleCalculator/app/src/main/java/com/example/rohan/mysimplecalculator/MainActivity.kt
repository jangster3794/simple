package com.example.rohan.mysimplecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(view:View){
        val a = number1.text.toString().toFloat()
        val b = number2.text.toString().toFloat()
        val result = a+b
        resultView.text = "Result : $result"
    }
    fun divide(view:View){
        val a = number1.text.toString().toFloat()
        val b = number2.text.toString().toFloat()
        val result = a/b
        resultView.text = "Result : $result"
    }
    fun multiply(view:View){
        val a = number1.text.toString().toFloat()
        val b = number2.text.toString().toFloat()
        val result = a*b
        resultView.text = "Result : $result"

    }
    fun subtract(view:View){
        val a = number1.text.toString().toFloat()
        val b = number2.text.toString().toFloat()
        val result = a-b
        resultView.text = "Result : $result"
    }
}
