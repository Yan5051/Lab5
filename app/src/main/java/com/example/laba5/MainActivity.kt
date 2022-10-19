package com.example.laba5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.VelocityTracker
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    private lateinit var PervayaBtn : Button
    private lateinit var VtorayaBtn : Button
    private lateinit var TretyaBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        PervayaBtn = findViewById(R.id.pervBtn)
        VtorayaBtn = findViewById(R.id.vtorBtn)
        TretyaBtn = findViewById(R.id.tretBtn)



        PervayaBtn.setOnClickListener {
            Toast.makeText(this, R.string.pervStr, Toast.LENGTH_SHORT).show()
        }

        var temp : Int = 0
        VtorayaBtn.setOnClickListener {
            temp++;
            if(temp == 2){
                Toast.makeText(this, R.string.vtorStr, Toast.LENGTH_SHORT).show()
                temp = 0
            }
        }

        var temps : Int = 0
        TretyaBtn.setOnClickListener {
            temps++;
            if(temps == 3){
                Toast.makeText(this, R.string.tretStr, Toast.LENGTH_SHORT).show()
                temps = 0
            }
        }
    }

}