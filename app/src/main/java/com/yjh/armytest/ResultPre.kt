package com.yjh.armytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question11.*
import kotlinx.android.synthetic.main.activity_result_pre.*

class ResultPre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_pre)

        var score = intent.getDoubleExtra("score",0.0)

        toresult.setOnClickListener {
            var intent = Intent(this@ResultPre, ResultActivity::class.java)

            intent.putExtra("score", score)
            startActivity(intent)
        }

    }
}