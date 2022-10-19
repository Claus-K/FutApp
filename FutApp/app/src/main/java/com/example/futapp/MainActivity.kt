package com.example.futapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewAnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.log

var teamName = ""

class MainActivity : AppCompatActivity() {
    //lateinit var brazilButton: Button

    lateinit var serviaButton: Button
    lateinit var suicaButton: Button
    lateinit var camaroesButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //brazilButton = findViewById<Button>(R.id.Brasilbutton)


//        serviaButton = findViewById<Button>(R.id.Serviabutton)
//        suicaButton = findViewById<Button>(R.id.Suicabutton)
//        camaroesButton = findViewById<Button>(R.id.Camaroesbutton)

        val flagImg1 = findViewById<View>(R.id.imageViewFlag1) as ImageView
        flagImg1.setImageResource(R.drawable.flag_of_brasil)

        val flagImg2 = findViewById<View>(R.id.imageViewFlag2) as ImageView
        flagImg2.setImageResource(R.drawable.flag_of_serbia)

        val flagImg3 = findViewById<View>(R.id.imageViewFlag3) as ImageView
        flagImg3.setImageResource(R.drawable.flag_of_switzerland_)

        val flagImg4 = findViewById<View>(R.id.imageViewFlag4) as ImageView
        flagImg4.setImageResource(R.drawable.flag_of_cameroon)


    }

    fun openTeamActivityBrazil(view: View) {
        val text = view as Button
//        val buttonText = text.text.toString()
        teamName = text.text.toString()
        val intent = Intent(this, TeamActivity::class.java)
//        intent.putExtra("teamName", buttonText)
        startActivity(intent)
    }
}



