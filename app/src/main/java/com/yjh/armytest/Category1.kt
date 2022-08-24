package com.yjh.armytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_category1.*

class Category1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category1)

        c1start.setOnClickListener {
            val intent = Intent(this@Category1, Question1::class.java)

            startActivity(intent)
        }
    }
}