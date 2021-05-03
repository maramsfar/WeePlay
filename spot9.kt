package com.example.game

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Spot_9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spot_9)
    }
    override fun onSupportNavigateUp():Boolean {
        onBackPressed()
        return true
    }



    fun rep1(view: View){
        val inflater = layoutInflater
        val dialogLayout: View = inflater.inflate(R.layout.activity_alert9, null)
        val builder = AlertDialog.Builder(this)
        builder.setTitle("False answer")
        builder.setMessage("The correct answer is 7")
        builder.setPositiveButton("Next"){dialogInterface, which ->
            next(view)
        }
        builder.setView(dialogLayout)
        builder.show()
    }

    fun next(view: View){
        val gameActivity : Intent = Intent(this@Spot_9,Spot_10::class.java)
        startActivity(gameActivity)
    }

    fun rep2(view: View){

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Correct !")
        builder.setMessage("Continue to next level")
        builder.setPositiveButton("Next"){dialogInterface, which ->
            next(view)
        }
        builder.show()
    }

    fun back(view: View){
        val gameActivity : Intent = Intent ( this@Spot_9,Menu_Spot::class.java)
        startActivity(gameActivity)
    }
}
