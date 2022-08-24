package com.yjh.armytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_category2.*
import kotlinx.android.synthetic.main.activity_category2.c2start
import kotlinx.android.synthetic.main.activity_category3.*

class Category3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category3)

        var score = intent.getDoubleExtra("score",0.0)

        c3start.setOnClickListener {
            var intent = Intent(this@Category3, Question9::class.java)

            intent.putExtra("score", score)
            startActivity(intent)

        }
    }
}