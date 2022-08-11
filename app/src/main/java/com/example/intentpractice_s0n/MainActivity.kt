package com.example.intentpractice_s0n

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val REQ_FOR_NICKNAME = 1005

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        다이얼(DIAL) 액션 예제
        dialBtn.setOnClickListener {

            // phoneNumEdt에 입력한 전화번호를 받아서 해당 번호에 전화연결
            val inputPhoneNum = phoneNumEdt.text.toString()

            val myUri = Uri.parse("tel:${inputPhoneNum}")  //문자열 분석

            val myIntent = Intent(Intent.ACTION_DIAL, myUri)

            startActivity(myIntent)

        }


//        CALL 액션 예제
        callBtn.setOnClickListener {

            val inputPhoneNum = phoneNumEdt.text.toString()

            val myUri = Uri.parse("tel:${inputPhoneNum}")  //문자열 분석

            val myIntent = Intent(Intent.ACTION_CALL, myUri)

            startActivity(myIntent)
        }




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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        //돌아온 이유가 닉네임을 받으러 다녀온게 맞는지?
        if (requestCode== REQ_FOR_NICKNAME){

            //추가질문: 확인(입력완료버튼)을 눌러서 돌아온게 맞는가?  (뒤로가기 버튼이 아닌)
            if (resultCode==RESULT_OK){

                //실제 첨부된 새 닉네임을 꺼내서 텍스트뷰에 반영.
                val newNickname = data?.getStringExtra("nickname")  //nickname이라는 이름표에 붙어있는거 찾아줘
                nicknameTxt.text=newNickname //새 닉네임으로 변경ㄴ
            }

        }

    }


}