package com.primavera.arduino.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.primavera.arduino.R
import com.primavera.arduino.listener.ArduinoCommunicatorActivity
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn_go_communityActivity.setOnClickListener {
            startActivity(Intent(this@Main2Activity, ArduinoCommunicatorActivity::class.java))
        }
    }
}
