package com.example.courseapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val homeBTN : ImageView = findViewById(R.id.home_btn2);
        homeBTN.setOnClickListener{
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

        val listBTN : ImageView = findViewById(R.id.list_btn2);
        listBTN.setOnClickListener{
            val intent = Intent(this, viewHolderList2::class.java)
            startActivity(intent)
        }


        val userBTN : ImageView = findViewById(R.id.user_btn2);
        userBTN.setOnClickListener{
            val intent = Intent(this, UserProfile::class.java)
            startActivity(intent)
        }


    }
}