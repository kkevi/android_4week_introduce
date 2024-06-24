package com.example.introduce

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val idTextEditor = findViewById<EditText>(R.id.ev_id)
        val pwTextEditor = findViewById<EditText>(R.id.ev_pw)

        val loginButton =  findViewById<Button>(R.id.btn_login)
        val signUpTextView = findViewById<TextView>(R.id.tv_signUp)

        loginButton.setOnClickListener{
            if(idTextEditor.text.isEmpty()) {
                val isEmptyId = Toast.makeText(this, "아이디를 입력해주세요.", Toast.LENGTH_SHORT)
                isEmptyId.show()
            } else if(pwTextEditor.text.isEmpty()) {
                val isEmptyPw = Toast.makeText(this, "비밀번호를 입력해주세요.", Toast.LENGTH_SHORT)
                isEmptyPw.show()
            } else {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("id", idTextEditor.text.toString())
                startActivity(intent)
            }
        }

        signUpTextView.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }

    // 암시적 인텐트
//    fun doOnBtnClick(view: View){ //여기서 view는 클릭된 버튼 객체
//        when(view.getId()){
//            R.id.btnDialActivity -> {
//                val call_intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:114"))
//                startActivity(call_intent)
//            }
//            R.id.btnMapActivity -> {
//                val map_intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.565350, 127.01445"))
//                startActivity(map_intent)
//            }
//        }
//    }
}