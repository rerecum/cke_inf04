package com.example.cke_inf04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.confirm).setOnClickListener {
            val myString=findViewById<EditText>(R.id.mail).text
            for (i in 0..myString.length-1) {

                if (myString.substring(i,i+1) == "@"){
                    findViewById<Button>(R.id.confirm).text = "jest @"
                    break
                }
                else{

                    findViewById<Button>(R.id.confirm).text = "nie ma @"
                }
            }
            //findViewById<Button>(R.id.confirm).text=myString.substring(1,2)
        //if (R.id.mail == )
        }
    }
}