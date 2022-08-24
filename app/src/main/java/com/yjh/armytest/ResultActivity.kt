package com.yjh.armytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var score = intent.getDoubleExtra("score",0.0)

        val resultText:String = when{
            score >= 44.0 -> "S"
            score >= 36.0 -> "A"
            score >= 29.0 -> "B"
            else -> "폐"
        }

        val resultStringTextView:TextView = findViewById(R.id.Rank)

        resultStringTextView.text = resultText

        restart.setOnClickListener {
            var intent = Intent(this@ResultActivity, MainActivity::class.java)

            startActivity(intent)
        }
    }
}