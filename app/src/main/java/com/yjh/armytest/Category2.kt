package com.yjh.armytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_category2.*

class Category2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category2)

        var score = intent.getDoubleExtra("score",0.0)

        c2start.setOnClickListener {
            var intent = Intent(this@Category2, Question4::class.java)

            intent.putExtra("score", score)
            startActivity(intent)
        }
    }
}