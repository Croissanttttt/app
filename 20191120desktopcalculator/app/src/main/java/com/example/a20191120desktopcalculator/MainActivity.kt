package com.example.a20191120desktopcalculator


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ans: Int
        ans = 0
        var plus: Int
        plus = 0
        var minus: Int
        minus = 0
        var multi: Int
        multi = 0
        var div: Int
        div = 0
        var percent: Int
        percent = 0
        var num: Int
        num = 0
        bt0.setOnClickListener {
                num = num * 10 ;
                txtans.setText("$num")
            }
        bt1.setOnClickListener {
                num = num * 10 + 1;
                txtans.setText("$num")
            }
        bt2.setOnClickListener {
                num = num * 10 +2;
                txtans.setText("$num")
            }
        bt3.setOnClickListener {
                num = num * 10 + 3;
                txtans.setText("$num")
            }
        bt4.setOnClickListener {
                num = num * 10 + 4;
                txtans.setText("$num")
            }
        bt5.setOnClickListener {
                num = num * 10 + 5;
                txtans.setText("$num")
            }
        bt6.setOnClickListener {
                num = num * 10 +6;
                txtans.setText("$num")
            }
        bt7.setOnClickListener {
                num = num * 10 + 7;
                txtans.setText("$num")
            }
        bt8.setOnClickListener {
                num = num * 10 + 8;
                txtans.setText("$num")
            }
        bt9.setOnClickListener {
                num = num * 10 + 9;
                txtans.setText("$num")
            }
        btplus.setOnClickListener {
            plus = 1
            minus = 0
            multi = 0
            div = 0
            percent = 0
                ans = ans + num
                num = 0
                txtans.setText("$ans")
            }
        btminus.setOnClickListener {
            plus = 0
            minus = 1
            multi = 0
            div = 0
            percent = 0
                ans = ans - num
                num = 0
                txtans.setText("$ans")
            }
        btmulti.setOnClickListener {
            plus = 0
            minus = 0
            multi = 1
            div = 0
            percent = 0
            if (plus==0&&minus==0&&ans==0){
                ans = num
            }
            else {
                ans = ans * num
            }
            num = 0
            txtans.setText("$ans")
            }
        btdiv.setOnClickListener {
            plus = 0
            minus = 0
            multi = 0
            div = 1
            percent = 0
            if (plus==0&&minus==0&&ans==0){
                ans = num
            }
            else {
                ans = ans / num
            }
            num = 0
            txtans.setText("$ans")
            }
        btclear.setOnClickListener {
                ans = 0
                num = 0
                plus = 0
                minus = 0
                multi = 0
                div = 0
            txtans.setText(" ")
            }
        btequal.setOnClickListener {
            if (plus==1){
                ans = ans + num
                txtans.setText("$ans")
            }
            if (minus==1){
                ans = ans - num
                txtans.setText("$ans")
            }
            if (multi==1){
                ans = ans * num
                txtans.setText("$ans")
            }
            if (div==1){
                ans = ans / num
                txtans.setText("$ans")
            }
            if (percent==1){
                ans = ans % num
                txtans.setText("$ans")
            }
            num = 0
            ans = 0
        }
        btneg.setOnClickListener {
            num = num * -1
            txtans.setText("$num")
        }
        btpercent.setOnClickListener {
            plus = 0
            minus = 0
            multi = 0
            div = 0
            percent = 1
            if (plus==0&&minus==0&&ans==0){
                ans = num
            }
            else {
                ans = ans % num
            }
            num = 0
            txtans.setText("$ans")
        }
    }
}
