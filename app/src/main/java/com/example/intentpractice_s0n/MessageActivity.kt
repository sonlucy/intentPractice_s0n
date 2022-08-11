package com.example.intentpractice_s0n

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_message.*

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        // 이 화면에 들어올때 첨부된 데이터를 텍스트뷰에 반영.
        val intentMessage = intent.getStringExtra("message")  //message라는 이름표 달아 보낸 문자열(String)을 변수에 저장.
//받아준 변수를 receiveMessageTxt 텍스트에 저장.
        receiveMessageTxt.text= intentMessage

    }
}