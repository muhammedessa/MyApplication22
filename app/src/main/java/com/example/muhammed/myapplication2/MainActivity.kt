package com.example.muhammed.myapplication2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {



    lateinit var editText : EditText
    lateinit var editText2 : EditText
    lateinit var textView : TextView
    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText  = findViewById(R.id.firstname)
        editText2  = findViewById(R.id.lastname)
         textView   = findViewById(R.id.textt)
         btn   = findViewById(R.id.button)
        btn.setOnClickListener(this)

    }



    override fun onClick(v: View?) {

var firstname = editText.text
var lastname = editText2.text

        textView.text = " $firstname $lastname "

    }


}
