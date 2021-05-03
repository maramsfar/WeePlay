package com.example.game

import android.app.ActionBar
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign_in.*

class sign_in : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        this.setupFloatingLabelError();

        //Bar d'actionn
        val actionbar = supportActionBar
        // set actionbar title
        actionbar!!.title = "Sign in with us"
        //set back  button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

    }

    fun lancerActivity2(view: View) {
        val gameActivity: Intent = Intent(this@sign_in,Game_Type::class.java)
        startActivity(gameActivity)

    }


    override fun onSupportNavigateUp():Boolean {
        onBackPressed()
        return true
    }
    fun String.isValidEmail():Boolean{
        return  Patterns.EMAIL_ADDRESS.matcher(this).matches()
    }
    fun setupFloatingLabelError() {

        ////////////USERNAME LISTENERS////////////
        id_name.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (id_name.text.isNullOrEmpty()) {
                    id_name.error = "Remplissez ce champs SVP!"
                } else if (id_name.text.toString().length < 2) {
                    id_name.error = "Username doit etre composé de 3 caracteres min "
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })
        id_email.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (!id_email.text.toString().isValidEmail()) {
                    id_email.error = "Adress Email invalide"
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })
    }





}
