package com.example.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class litt_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_litt_1)
    }
    fun back(view: View){
        val gameActivity : Intent = Intent ( this@litt_1,Menu_literature::class.java)
        startActivity(gameActivity)
    }
}
