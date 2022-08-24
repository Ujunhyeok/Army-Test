package com.yjh.armytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question5.*

class Question5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question5)

        var score = intent.getDoubleExtra("score",0.0)

        Q5A1.setOnClickListener {
            var intent = Intent(this@Question5, Question6::class.java)

            intent.putExtra("score", 3+score)
            startActivity(intent)
        }

        Q5A2.setOnClickListener {
            var intent = Intent(this@Question5, Question6::class.java)

            intent.putExtra("score", 2+score)
            startActivity(intent)
        }

        Q5A3.setOnClickListener {
            var intent = Intent(this@Question5, Question6::class.java)

            intent.putExtra("score", 1+score)
            startActivity(intent)
        }

        Q5A4.setOnClickListener {
            var intent = Intent(this@Question5, Question6::class.java)

            intent.putExtra("score", 4+score)
            startActivity(intent)
        }
    }
}