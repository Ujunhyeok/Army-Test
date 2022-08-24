package com.yjh.armytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question8.*
import kotlinx.android.synthetic.main.activity_question8.Q8A1
import kotlinx.android.synthetic.main.activity_question9.*

class Question9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question9)

        var score = intent.getDoubleExtra("score",0.0)

        Q9A1.setOnClickListener {
            var intent = Intent(this@Question9, Question10::class.java)

            intent.putExtra("score", 4+score)
            startActivity(intent)
        }

        Q9A2.setOnClickListener {
            var intent = Intent(this@Question9, Question10::class.java)

            intent.putExtra("score", 3+score)
            startActivity(intent)
        }

        Q9A3.setOnClickListener {
            var intent = Intent(this@Question9, Question10::class.java)

            intent.putExtra("score", 2+score)
            startActivity(intent)
        }

        Q9A4.setOnClickListener {
            var intent = Intent(this@Question9, Question10::class.java)

            intent.putExtra("score", 1+score)
            startActivity(intent)
        }
    }
}