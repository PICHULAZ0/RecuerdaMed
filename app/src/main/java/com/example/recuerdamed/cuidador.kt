package com.example.recuerdamed

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cuidador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cuidador)

        val salir = findViewById<ImageButton>(R.id.btnSalir)

        val paciente = findViewById<Button>(R.id.btnpaciente)

        paciente.setOnClickListener {

            fnHorario()
        }

        salir.setOnClickListener {

            fnIniciar()
        }
    }
    private fun fnIniciar(){


        finish()


    }

    private fun fnHorario(){

        val intent = Intent(this,pacientes::class.java)
        startActivity(intent)
        finish()
    }
}