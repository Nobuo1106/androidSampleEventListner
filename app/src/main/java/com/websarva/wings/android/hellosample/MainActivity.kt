package com.websarva.wings.android.hellosample

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btClick = findViewById<Button>(R.id.btClick)
        val listener = HelloListner()
        btClick.setOnClickListener(listener)
    }

    private inner class HelloListner : View.OnClickListener {
        override  fun onClick(view: View) {
            val input = findViewById<EditText>(R.id.etName)
            val output = findViewById<TextView>(R.id.tvOutput)
            val inputstr = input.text.toString()
            output.text = inputstr + "さん、こんにちは"
        }
    }
}