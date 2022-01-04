package com.example.spacedim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked(view: View){
        //Intent pour ouvrir l'activité suivante
        val intent = Intent(this, WaitingRoom::class.java)
        //Lancement de l'intent (changement d'écran)
        startActivity(intent)
    }

}