 package com.example.introduce

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

 class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val nameTextEditor = findViewById<EditText>(R.id.ev_name)
        val idTextEditor = findViewById<EditText>(R.id.ev_id)
        val pwTextEditor = findViewById<EditText>(R.id.ev_pw)

        val signUpTextView = findViewById<Button>(R.id.btn_signup)

        signUpTextView.setOnClickListener{
            if(nameTextEditor.text.isEmpty()) {
                val isEmptyName = Toast.makeText(this, "이름을 입력해주세요.", Toast.LENGTH_SHORT)
                isEmptyName.show()
            } else if(idTextEditor.text.isEmpty()) {
                val isEmptyId = Toast.makeText(this, "아이디를 입력해주세요.", Toast.LENGTH_SHORT)
                isEmptyId.show()
            } else if(pwTextEditor.text.isEmpty()) {
                val isEmptyPw = Toast.makeText(this, "비밀번호를 입력해주세요.", Toast.LENGTH_SHORT)
                isEmptyPw.show()
            } else {
                finish()
            }
        }
    }
}