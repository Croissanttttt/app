package com.example.a20191203

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var str:String
        str = intent.getStringExtra("from")
        from2.setText(str)

        bt2to1.setOnClickListener {
            val sndIntent = Intent(this, Main4Activity::class.java)
            sndIntent.putExtra("from","from 2st")
            startActivity(sndIntent)
            finish()
        }

        bt2to3.setOnClickListener {
            val sndIntent = Intent(this, Main3Activity::class.java)
            sndIntent.putExtra("from","from 2st")
            startActivity(sndIntent)
            finish()
        }
    }
}
