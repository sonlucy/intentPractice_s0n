package com.example.intentpractice_s0n

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToOtherBtn.setOnClickListener {

            //다른 화면(OtherActivity)으로 이동

            val myIntent = Intent(this, OtherActivity::class.java)  //
            startActivity(myIntent)
        }
    }
}