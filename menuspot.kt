package com.example.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Menu_Spot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu__spot)
    }
    fun  Spot1(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Spot,Spot_1::class.java)
        startActivity(gameActivity)
    }
    fun  spot2(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Spot,Spot_2::class.java)
        startActivity(gameActivity)
    }
    fun  spot3(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Spot,spot_3::class.java)
        startActivity(gameActivity)
    }
    fun  spot4(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Spot,spot_4::class.java)
        startActivity(gameActivity)
    }
    fun  spot5(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Spot,Spot_5::class.java)
        startActivity(gameActivity)
    }
    fun  spot6(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Spot,Spot_6::class.java)
        startActivity(gameActivity)
    }
    fun  spot7(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Spot,Spot_7::class.java)
        startActivity(gameActivity)
    }

    fun  spot8(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Spot,Spot_8::class.java)
        startActivity(gameActivity)
    }
    fun  spot9(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Spot,Spot_9::class.java)
        startActivity(gameActivity)
    }
    fun  spot10(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Spot,Spot_10::class.java)
        startActivity(gameActivity)
    }
}
