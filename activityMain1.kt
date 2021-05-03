package com.example.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun  lancerActivity2(view: View){
        val  gameActivity: Intent = Intent(this@MainActivity,sign_in::class.java)
        startActivity(gameActivity)
    }
}
