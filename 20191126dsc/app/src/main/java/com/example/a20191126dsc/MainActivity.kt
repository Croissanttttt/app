package com.example.a20191126dsc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var vev : Int=0
        var lin:Array<Int> = arrayOf(0,0,0)

        btreset.setOnClickListener {
            vev = 0
            lin[0]=0
            Lin1.setVisibility(View.VISIBLE)
            lin[1]=0
            Lin2.setVisibility(View.VISIBLE)
            lin[2]=0
            Lin3.setVisibility(View.VISIBLE)

            rbi.isChecked = false
            rbn.isChecked = false
            checkBox3.isChecked = false
            checkBox4.isChecked = false
            checkBox5.isChecked = false

        }

        radioGroup.setOnCheckedChangeListener{radioGroup, i ->
            when(i)
            {
                R.id.rbi ->
                {
                    vev = 1
                    if(lin[0] == 1)
                        Lin1.setVisibility(View.INVISIBLE)
                    if(lin[1] == 1)
                        Lin2.setVisibility(View.INVISIBLE)
                    if(lin[2] == 1)
                        Lin3.setVisibility(View.INVISIBLE)
                }
                R.id.rbn ->
                {
                    vev = 2
                    if(lin[0] == 1)
                        Lin1.setVisibility(View.GONE)
                    if(lin[1] == 1)
                        Lin2.setVisibility(View.GONE)
                    if(lin[2] == 1)
                        Lin3.setVisibility(View.GONE)
                }
            }
        }

        checkBox3.setOnCheckedChangeListener{compoundButton, b ->
            if(b==true){
                lin[0]=1
                when(vev) {
                    1->
                        Lin1.setVisibility(View.INVISIBLE)
                    2->
                        Lin1.setVisibility(View.GONE)
                }
            }
            else{
                lin[0]=0
                Lin1.setVisibility(View.VISIBLE)
            }
        }
        checkBox4.setOnCheckedChangeListener{compoundButton, b ->
            if(b==true){
                lin[1]=1
                when(vev) {
                    1->
                        Lin2.setVisibility(View.INVISIBLE)
                    2->
                        Lin2.setVisibility(View.GONE)
                }
            }
            else{
                lin[1]=0
                Lin2.setVisibility(View.VISIBLE)
            }
        }
        checkBox5.setOnCheckedChangeListener{compoundButton, b ->
            if(b==true){
                lin[2]=1
                when(vev) {
                    1->
                        Lin3.setVisibility(View.INVISIBLE)
                    2->
                        Lin3.setVisibility(View.GONE)
                }
            }
            else{
                lin[2]=0
                Lin3.setVisibility(View.VISIBLE)
            }
        }
    }
}
