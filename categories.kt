package com.example.game

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.arrayListOf as arrayListOf1


class Game_Type : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game__type)
        Toast.makeText (applicationContext,  "Welcome let's start playing!", Toast.LENGTH_SHORT).show()
        //action bar
        val actionbar = supportActionBar
        // set actionbar title
        actionbar!!.title = "Categories"
        //setbackbutton
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp():Boolean {
        onBackPressed()
        return true
    }

    fun  math(view: View){
        val  gameActivity: Intent = Intent(this@Game_Type,Menu_Math::class.java)
        startActivity(gameActivity)
    }
    fun  literature(view: View){
        val  gameActivity: Intent = Intent(this@Game_Type,Menu_literature::class.java)
        startActivity(gameActivity)
    }
    fun  spot_the_differences(view: View){
        val  gameActivity: Intent = Intent(this@Game_Type,Menu_Spot::class.java)
        startActivity(gameActivity)
    }
    fun  Coding(view: View){
        val  gameActivity: Intent = Intent(this@Game_Type,Menu_Coding::class.java)
        startActivity(gameActivity)
    }
    ///////////////////////////////////////////////////////////////////////////
    fun withSeekBar(view:View) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Set game difficulty")
        val seekBar = SeekBar(this@Game_Type)
        val lp = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT)
        seekBar.setLayoutParams(lp)
        builder.setView(seekBar)
        builder.setPositiveButton("OK", object: DialogInterface.OnClickListener {
            override fun onClick(dialogInterface:DialogInterface, i:Int) {
                Toast.makeText(getApplicationContext(), "Difficulty is " + seekBar.getProgress(), Toast.LENGTH_SHORT).show()
            }
        })
        builder.show()

    }
    ////////////////////////////////////////////////////////////////////////////////

}
