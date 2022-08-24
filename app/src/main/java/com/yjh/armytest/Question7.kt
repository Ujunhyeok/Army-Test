package com.yjh.armytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question6.*
import kotlinx.android.synthetic.main.activity_question6.Q6A1
import kotlinx.android.synthetic.main.activity_question7.*

class Question7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question7)

        var score = intent.getDoubleExtra("score",0.0)

        Q7A1.setOnClickListener {
            var intent = Intent(this@Question7, Question8::class.java)

            intent.putExtra("score", 3+score)
            startActivity(intent)
        }

        Q7A2.setOnClickListener {
            var intent = Intent(this@Question7, Question8::class.java)

            intent.putExtra("score", 2+score)
            startActivity(intent)
        }

        Q7A3.setOnClickListener {
            var intent = Intent(this@Question7, Question8::class.java)

            intent.putExtra("score", 4+score)
            startActivity(intent)
        }

        Q7A4.setOnClickListener {
            var intent = Intent(this@Question7, Question8::class.java)

            intent.putExtra("score", 1+score)
            startActivity(intent)
        }
    }
}