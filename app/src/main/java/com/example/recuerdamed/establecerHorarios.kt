package com.example.recuerdamed

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class establecerHorarios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_establecer_horarios)

        val iniciar = findViewById<ImageButton>(R.id.btnVolver)

        val registrar = findViewById<Button>(R.id.btnGC)

        registrar.setOnClickListener {

            fnIniciar()

        }

        iniciar.setOnClickListener {

            fnIniciar()
        }
    }
    private fun fnIniciar(){
        val intent = Intent(this,verPacientes::class.java)
        startActivity(intent)
        finish()


    }
}