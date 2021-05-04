package com.example.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class code_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_1)
    }
    fun back(view: View){
        val gameActivity : Intent = Intent ( this@code_1,Menu_Coding::class.java)
        startActivity(gameActivity)
    }
}

