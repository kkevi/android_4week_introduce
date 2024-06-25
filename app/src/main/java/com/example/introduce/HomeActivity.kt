package com.example.introduce

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import java.util.Random

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val idTextData = intent.getStringExtra("id")
        val idTextView = findViewById<TextView>(R.id.tv_id)
        val imageView = findViewById<ImageView>(R.id.iv_profile)

        idTextView.text = idTextData

        val images = listOf(
            R.drawable.image_profile0,
            R.drawable.image_profile1,
            R.drawable.image_profile2,
            R.drawable.image_profile3,
            R.drawable.image_profile4,
        )

        val randomNum = Random().nextInt(images.size)
        println(randomNum)

        val drawable = ResourcesCompat.getDrawable(resources, images[randomNum], null)
        imageView.setImageDrawable(drawable) // drawble 객체 자체를 가져옴

        val btn = findViewById<Button>(R.id.btn_close)
        btn.setOnClickListener{
            finish() //Navigator.pop()이랑 똑같은 거
        }
    }
}