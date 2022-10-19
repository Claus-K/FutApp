package com.example.futapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.io.File

class PlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)
        // get player
        val bundle = intent.extras
        var playerName = bundle?.getString("playerName")

       // var list = readFile(fileName = teamFileName)




    }


    fun readFile(fileName: String): List<String> = File("../../../../res/raw/${fileName}.txt").readLines()




    fun openBackTeamActivity(view: View) {
        val intent = Intent(this, TeamActivity::class.java)
        intent.putExtra("teamName", teamName)
        startActivity(intent)
    }




}