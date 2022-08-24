package com.yjh.armytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question7.*
import kotlinx.android.synthetic.main.activity_question7.Q7A1
import kotlinx.android.synthetic.main.activity_question8.*

class Question8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question8)

        var score = intent.getDoubleExtra("score",0.0)

        Q8A1.setOnClickListener {
            var intent = Intent(this@Question8, Category3::class.java)

            intent.putExtra("score", 2+score)
            startActivity(intent)
        }

        Q8A2.setOnClickListener {
            var intent = Intent(this@Question8, Category3::class.java)

            intent.putExtra("score", 3+score)
            startActivity(intent)
        }

        Q8A3.setOnClickListener {
            var intent = Intent(this@Question8, Category3::class.java)

            intent.putExtra("score", 4+score)
            startActivity(intent)
        }

        Q8A4.setOnClickListener {
            var intent = Intent(this@Question8, Category3::class.java)

            intent.putExtra("score", 1+score)
            startActivity(intent)
        }


    }
}