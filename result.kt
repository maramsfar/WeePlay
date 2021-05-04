package com.example.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
    }
    fun back(view: View){
        val gameActivity : Intent = Intent ( this@Result,Menu_Spot::class.java)
        startActivity(gameActivity)
    }
    fun cat(view: View){
        val gameActivity : Intent = Intent ( this@Result,Game_Type::class.java)
        startActivity(gameActivity)
    }

}
