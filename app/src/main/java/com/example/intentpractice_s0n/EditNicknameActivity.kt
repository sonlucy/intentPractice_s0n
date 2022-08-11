package com.example.intentpractice_s0n

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        //새 닉네임 입력후, 입력완료 (okBtn)버튼 눌리면
        okBtn.setOnClickListener {

            //입력한 새 닉네임이 뭔지 변수로 저장.
            val inputNewNickname = newNicknameEdt.text.toString()

            //입력한 닉네임을 가지고 메인화면으로 복귀.
            //입력닉네임을 담아주기 위한 용도로만 사용하는 Intent
            val resultIntent = Intent()
            resultIntent.putExtra("nickname", inputNewNickname) //inputNewNickname 값을 가지고 돌아갈게
            setResult(RESULT_OK, resultIntent)  //ok눌렀고 resultIntent 가지고돌아가
            finish() //복귀
        }


    }
}