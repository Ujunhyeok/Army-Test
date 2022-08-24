package com.yjh.armytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question2.*

class Question2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)

        var score = intent.getDoubleExtra("score",0.0)

        Q2A1.setOnClickListener {
            var intent = Intent(this@Question2, Question3::class.java)

            intent.putExtra("score", 4+score)
            startActivity(intent)
        }

        Q2A2.setOnClickListener {
            var intent = Intent(this@Question2, Question3::class.java)

            intent.putExtra("score", 3+score)
            startActivity(intent)
        }

        Q2A3.setOnClickListener {
            var intent = Intent(this@Question2, Question3::class.java)

            intent.putExtra("score", 2+score)
            startActivity(intent)
        }

        Q2A4.setOnClickListener {
            var intent = Intent(this@Question2, Question3::class.java)

            intent.putExtra("score", 1+score)
            startActivity(intent)
        }
    }
}