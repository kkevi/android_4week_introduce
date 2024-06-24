package com.example.introduce

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val loginButton =  findViewById<Button>(R.id.btn_login)

        loginButton.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        val signUpTextView = findViewById<TextView>(R.id.tv_signUp)
        signUpTextView.setOnClickListener{
//            val edit_text = findViewById<EditText>(R.id.edit_data)
//            val textData = edit_text.text.toString()
//            val intent = Intent(this, ThirdActivity::class.java)
//            intent.putExtra("dataFromFirstActivity", textData)
//            startActivity(intent)
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