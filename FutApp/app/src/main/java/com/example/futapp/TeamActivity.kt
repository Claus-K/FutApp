package com.example.futapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

var teamFileName = ""


class TeamActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team)
        //get team

//        val bundle = intent.extras
//        teamNameTeamA = bundle?.getString("teamName")


        // def
        var def1 = findViewById<Button>(R.id.defPlayer1)
        var def2 = findViewById<Button>(R.id.defPlayer2)
        // center
        var center1 = findViewById<Button>(R.id.centerPlayer1)
        var center2 = findViewById<Button>(R.id.centerPlayer2)
        // edger
        var edger1 = findViewById<Button>(R.id.edgerPlayer1)
        var edger2 = findViewById<Button>(R.id.edgerPlayer2)
        var edger3 = findViewById<Button>(R.id.edgerPlayer3)
        var edger4 = findViewById<Button>(R.id.edgerPlayer4)
        // middle
        var middle1 = findViewById<Button>(R.id.middlePlayer1)
        var middle2 = findViewById<Button>(R.id.middlePlayer2)
        var middle3 = findViewById<Button>(R.id.middlePlayer3)


        when (teamName) {
            "Brasil" -> {
                def1.text = "Freed"
                def2.text = "Alison"
                center1.text = "Casemiro"
                center2.text = "Thiago Silva"
                edger1.text = "Alex Telles"
                edger2.text = "Marquinhos"
                edger3.text = "Danilo"
                edger4.text = "Lucas Paquetá"
                middle1.text = "Raphinha"
                middle2.text = "Richarlison"
                middle3.text = "Neymar"
                teamFileName = "brasil"
                println("Team Brasil")
            }

            "Sérvia" -> {
                def1.text = "Rajkovic"
                def2.text = "Milenković"
                center1.text = "Veljković"
                center2.text = "Pavlović"
                edger1.text = "Živković"
                edger2.text = "Radonjić"
                edger3.text = "Lukić"
                edger4.text = "Savić"
                middle1.text = "Kostić"
                middle2.text = "Tadić"
                middle3.text = "Mitrović"
                teamFileName = "servia"
                println("Team Servia")
            }
            "Suíça" -> {
                def1.text = "Sommer"
                def2.text = "Silvan Widmer"
                center1.text = "Fabian Schär"
                center2.text = "Manuel Akanji"
                edger1.text = "Ricardo Rodriguez"
                edger2.text = "Remo Freuler"
                edger3.text = "Denis Zakaria"
                edger4.text = "Renato Steffen"
                middle1.text = "Ruben Vargas"
                middle2.text = "Xherdan Shaqiri"
                middle3.text = "Embolo"
                teamFileName = "suica"
                println("Team Suica")
            }
            "Camarões" -> {
                def1.text = "André Onana"
                def2.text = "Michael Ngadeu-Ngadjui"
                center1.text = "Ambroise Oyongo"
                center2.text = "Collins Fai"
                edger1.text = "Jean-Charles Castelletto"
                edger2.text = "Gaël Ondoua"
                edger3.text = "Karl Toko Ekambi"
                edger4.text = "Samuel Gouet"
                middle1.text = "Martin Hongla"
                middle2.text = "Léandre Tawamba"
                middle3.text = "Eric Maxim Choupo-Moting"
                teamFileName = "camaroes"
                println("Team Camaroes")
            }

        }

    }

    fun openPlayerActivity(view: View) {
        val text = view as Button
        val buttonText = text.text.toString()
        val intent = Intent(this, PlayerActivity::class.java)
        intent.putExtra("playerName", buttonText)
//        intent.putExtra("teamNameFile", team)

        startActivity(intent)
    }


}