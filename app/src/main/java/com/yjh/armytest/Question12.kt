package com.yjh.armytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question11.*
import kotlinx.android.synthetic.main.activity_question11.Q11A1
import kotlinx.android.synthetic.main.activity_question12.*

class Question12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question12)

        var score = intent.getDoubleExtra("score",0.0)

        Q12A1.setOnClickListener {
            var intent = Intent(this@Question12, ResultPre::class.java)

            intent.putExtra("score", 4+score)
            startActivity(intent)
        }

        Q12A2.setOnClickListener {
            var intent = Intent(this@Question12, ResultPre::class.java)

            intent.putExtra("score", 1+score)
            startActivity(intent)
        }

        Q12A3.setOnClickListener {
            var intent = Intent(this@Question12, ResultPre::class.java)

            intent.putExtra("score", 2+score)
            startActivity(intent)
        }

        Q12A4.setOnClickListener {
            var intent = Intent(this@Question12, ResultPre::class.java)

            intent.putExtra("score", 3+score)
            startActivity(intent)
        }
    }
}