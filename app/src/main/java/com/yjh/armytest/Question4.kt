package com.yjh.armytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question4.*

class Question4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question4)

        var score = intent.getDoubleExtra("score",0.0)

        Q4A1.setOnClickListener {
            var intent = Intent(this@Question4, Question5::class.java)

            intent.putExtra("score", 2+score)
            startActivity(intent)
        }

        Q4A2.setOnClickListener {
            var intent = Intent(this@Question4, Question5::class.java)

            intent.putExtra("score", 1+score)
            startActivity(intent)
        }

        Q4A3.setOnClickListener {
            var intent = Intent(this@Question4, Question5::class.java)

            intent.putExtra("score", 4+score)
            startActivity(intent)
        }

        Q4A4.setOnClickListener {
            var intent = Intent(this@Question4, Question5::class.java)

            intent.putExtra("score", 3+score)
            startActivity(intent)
        }
    }
}