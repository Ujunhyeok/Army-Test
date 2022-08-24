package com.yjh.armytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question5.*
import kotlinx.android.synthetic.main.activity_question5.Q5A1
import kotlinx.android.synthetic.main.activity_question6.*

class Question6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question6)

        var score = intent.getDoubleExtra("score",0.0)

        Q6A1.setOnClickListener {
            var intent = Intent(this@Question6, Question7::class.java)

            intent.putExtra("score", 1+score)
            startActivity(intent)
        }

        Q6A2.setOnClickListener {
            var intent = Intent(this@Question6, Question7::class.java)

            intent.putExtra("score", 3+score)
            startActivity(intent)
        }

        Q6A3.setOnClickListener {
            var intent = Intent(this@Question6, Question7::class.java)

            intent.putExtra("score", 4+score)
            startActivity(intent)
        }

        Q6A4.setOnClickListener {
            var intent = Intent(this@Question6, Question7::class.java)

            intent.putExtra("score", 2+score)
            startActivity(intent)
        }
    }
}