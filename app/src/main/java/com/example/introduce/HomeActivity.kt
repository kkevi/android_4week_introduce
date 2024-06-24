package com.example.introduce

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val idTextData = intent.getStringExtra("id")
        println("id >> ${idTextData}")
        val idTextView = findViewById<TextView>(R.id.tv_id)
        idTextView.text = idTextData

        val btn = findViewById<Button>(R.id.btn_close)
        btn.setOnClickListener{
            finish() //Navigator.pop()이랑 똑같은 거
        }
    }
}