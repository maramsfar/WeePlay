package com.example.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Menu_Math : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu__math)
    }
    fun  math1(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Math,Math__level1::class.java)
        startActivity(gameActivity)
    }
    fun  math2(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Math,Math_level2::class.java)
        startActivity(gameActivity)
    }
    fun  math3(view: View){
        val  gameActivity:Intent = Intent(this@Menu_Math,Math_level3::class.java)
        startActivity(gameActivity)
    }
    fun  math4(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Math,Math_level4::class.java)
        startActivity(gameActivity)
    }
    fun  math5(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Math,Math_level5::class.java)
        startActivity(gameActivity)
    }
    fun  math6(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Math,Math_level6::class.java)
        startActivity(gameActivity)
    }
    fun  math7(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Math,Math_level7::class.java)
        startActivity(gameActivity)
    }

    fun  math8(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Math,Math_level8::class.java)
        startActivity(gameActivity)
    }
    fun  math9(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Math,Math_level9::class.java)
        startActivity(gameActivity)
    }
    fun  math10(view: View){
        val  gameActivity: Intent = Intent(this@Menu_Math,Math_level10::class.java)
        startActivity(gameActivity)
    }
}
