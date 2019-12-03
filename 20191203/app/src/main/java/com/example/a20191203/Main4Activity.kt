package com.example.a20191203

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var str:String
        str = intent.getStringExtra("from")
        from1.setText(str)

        bt1to2.setOnClickListener {
            val sndIntent = Intent(this, Main2Activity::class.java)
            sndIntent.putExtra("from","from 1st")
            startActivity(sndIntent)
            finish()
        }

        bt1to3.setOnClickListener {
            val sndIntent = Intent(this, Main3Activity::class.java)
            sndIntent.putExtra("from","from 1st")
            startActivity(sndIntent)
            finish()
        }

    }
}
