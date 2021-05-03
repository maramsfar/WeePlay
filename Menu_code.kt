package com.example.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Menu_Coding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu__coding)
    }
    fun  litt(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Coding,code_1::class.java)
        startActivity(gameActivity)
    }
}
