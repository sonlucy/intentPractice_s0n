package com.example.intentpractice_s0n

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val REQ_FOR_NICKNAME = 1005

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editNicknameBtn.setOnClickListener {

            val myIntent = Intent(this, EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)
        }


        sendMessageBtn.setOnClickListener {

            //입력한 내용을 변수에 저장.
            val inputMessage=messageEdt.text.toString()

            //비행기 티켓 발권
            val myIntent= Intent(this, MessageActivity::class.java)

            //수화물 첨부
            myIntent.putExtra("message", inputMessage)

            //실제 출발
            startActivity(myIntent)
        }

        moveToOtherBtn.setOnClickListener {

            //다른 화면(OtherActivity)으로 이동
//          val myIntent= Intent(출발지this, 도착액티비티::class.java)  =>     비행기 티켓 발권.(출발지.도착지 명시되어있음)
//          startActivity(myIntent)  => startActivity 함수 실행 -> 실제 비행기 탑승 (출발)
            val myIntent = Intent(this, OtherActivity::class.java)  //
            startActivity(myIntent)
        }
    }
}