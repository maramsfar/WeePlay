package com.example.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class Spot_5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spot_5)

    }
    override fun onSupportNavigateUp():Boolean {
        onBackPressed()
        return true
    }
    fun rep1(view: View){
        val inflater = layoutInflater
        val dialogLayout: View = inflater.inflate(R.layout.activity_alert5, null)
        val builder = AlertDialog.Builder(this)
        builder.setTitle("False answer")
        builder.setMessage("The correct answer is 8")
        builder.setPositiveButton("Next"){dialogInterface, which ->
            next(view)
        }
        builder.setView(dialogLayout)
        builder.show()
    }

    fun next(view: View){
        val gameActivity : Intent = Intent(this@Spot_5,Spot_6::class.java)
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
        val gameActivity : Intent = Intent ( this@Spot_5,Menu_Spot::class.java)
        startActivity(gameActivity)
    }
}
