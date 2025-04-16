package com.example.recuerdamed

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class paciente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_paciente)
        val salir = findViewById<ImageButton>(R.id.btnSalir)

        val horario = findViewById<Button>(R.id.btnHorario)

        horario.setOnClickListener {

            fnPacientes()
        }

        salir.setOnClickListener {

            fnIniciar()
        }
    }
    private fun fnIniciar(){


        finish()


    }

    private fun fnPacientes(){

        val intent = Intent(this,pacientes::class.java)
        startActivity(intent)
        finish()
    }
}