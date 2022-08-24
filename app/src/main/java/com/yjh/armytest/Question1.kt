package com.yjh.armytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question1.*

class Question1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question1)

        Q1A1.setOnClickListener {
            var intent = Intent(this@Question1, Question2::class.java)

            intent.putExtra("score", 4.0)
            startActivity(intent)
        }

        Q1A2.setOnClickListener {
            var intent = Intent(this@Question1, Question2::class.java)

            intent.putExtra("score", 3.0)
            startActivity(intent)
        }

        Q1A3.setOnClickListener {
            var intent = Intent(this@Question1, Question2::class.java)

            intent.putExtra("score", 2.0)
            startActivity(intent)
        }

        Q1A4.setOnClickListener {
            var intent = Intent(this@Question1, Question2::class.java)

            intent.putExtra("score", 1.0)
            startActivity(intent)
        }
    }
}