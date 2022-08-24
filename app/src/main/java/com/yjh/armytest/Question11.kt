package com.yjh.armytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question10.*
import kotlinx.android.synthetic.main.activity_question10.Q10A1
import kotlinx.android.synthetic.main.activity_question11.*

class Question11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question11)

        var score = intent.getDoubleExtra("score",0.0)

        Q11A1.setOnClickListener {
            var intent = Intent(this@Question11, Question12::class.java)

            intent.putExtra("score", 4+score)
            startActivity(intent)
        }

        Q11A2.setOnClickListener {
            var intent = Intent(this@Question11, Question12::class.java)

            intent.putExtra("score", 2+score)
            startActivity(intent)
        }

        Q11A3.setOnClickListener {
            var intent = Intent(this@Question11, Question12::class.java)

            intent.putExtra("score", 3+score)
            startActivity(intent)
        }

        Q11A4.setOnClickListener {
            var intent = Intent(this@Question11, Question12::class.java)

            intent.putExtra("score", 1+score)
            startActivity(intent)
        }

    }
}