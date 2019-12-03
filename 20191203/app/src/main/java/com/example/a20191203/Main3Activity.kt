package com.example.a20191203

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var str:String
        str = intent.getStringExtra("from")
        from3.setText(str)

        bt3to1.setOnClickListener {
            val sndIntent = Intent(this, Main4Activity::class.java)
            sndIntent.putExtra("from","from 3st")
            startActivity(sndIntent)
            finish()
        }

        bt3to2.setOnClickListener {
            val sndIntent = Intent(this, Main2Activity::class.java)
            sndIntent.putExtra("from","from 3st")
            startActivity(sndIntent)
            finish()
        }
    }
}
