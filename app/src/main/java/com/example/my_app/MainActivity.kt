package com.example.my_app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val press:Button = findViewById(R.id.button1) // save a reference to the button object in a variable
        val textResult0:TextView = findViewById(R.id.random_text)
        press.setOnClickListener {
            textResult0.text="lazy"
        val textResult1:TextView = findViewById(R.id.random_text1)
            press.setOnClickListener {
                textResult0.text = "somewhat lazy"
                val textResult2: TextView = findViewById(R.id.random_text2)
                press.setOnClickListener {
                    textResult0.text = "very lazy"
                    val textResult3: TextView = findViewById(R.id.random_text3)
                    press.setOnClickListener {
                        textResult0.text = "hardworking"
                        val textResult4: TextView = findViewById(R.id.random_text4)
                        press.setOnClickListener {
                            textResult0.text = "dedicated"




                        }

                    }

                }
            }
        }
    }
}