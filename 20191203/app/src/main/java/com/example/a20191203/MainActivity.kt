package com.example.a20191203

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start.setOnClickListener {
            val sndIntent = Intent(this, Main4Activity::class.java)
            sndIntent.putExtra("from","from MainActivity")
            startActivity(sndIntent)
        }
    }
}
