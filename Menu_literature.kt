package com.example.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Menu_literature : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_literature)
    }
    fun  litt(view: View){
        val  gameActivity: Intent = Intent(this@Menu_literature,litt_1::class.java)
        startActivity(gameActivity)
    }
}
