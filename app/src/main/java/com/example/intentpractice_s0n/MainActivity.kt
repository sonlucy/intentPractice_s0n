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
//          val myIntent= Intent(출발지this, 도착액티비티::class.java)  =>     비행기 티켓 발권.(출발지.도착지 명시되어있음)
//          startActivity(myIntent)  => startActivity 함수 실행 -> 실제 비행기 탑승 (출발)
            val myIntent = Intent(this, OtherActivity::class.java)  //
            startActivity(myIntent)
        }
    }
}