package com.yjh.armytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question2.*
import kotlinx.android.synthetic.main.activity_question3.*

class Question3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question3)

        var score = intent.getDoubleExtra("score",0.0)

        Q3A1.setOnClickListener {
            var intent = Intent(this@Question3, Category2::class.java)

            intent.putExtra("score", 4+score)
            startActivity(intent)
        }

        Q3A2.setOnClickListener {
            var intent = Intent(this@Question3, Category2::class.java)

            intent.putExtra("score", 3+score)
            startActivity(intent)
        }

        Q3A3.setOnClickListener {
            var intent = Intent(this@Question3, Category2::class.java)

            intent.putExtra("score", 2+score)
            startActivity(intent)
        }

        Q3A4.setOnClickListener {
            var intent = Intent(this@Question3, Category2::class.java)

            intent.putExtra("score", 1+score)
            startActivity(intent)
        }
    }
}