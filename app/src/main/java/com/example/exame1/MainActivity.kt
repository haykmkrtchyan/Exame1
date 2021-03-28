package com.example.exame1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   val button = findViewById<Button>(R.id.button)
   val textView = findViewById<TextView>(R.id.TextView)

        button.setOnClickListener {
                       textView.text = "thanks for everything dear trainer mister Varosyan"

        }
        }
    }


class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.TextView)

        button.setOnClickListener {
            textView.text = "thanks for everything"

        }
    }
}



