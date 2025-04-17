package com.example.recuerdamed

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class registroPacientes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registro_pacientes)
        val iniciar = findViewById<ImageButton>(R.id.btnGuardar)

        val registrar = findViewById<ImageButton>(R.id.btnVolver)





        registrar.setOnClickListener {

            fnVolver()

        }

        iniciar.setOnClickListener {

            fnIniciar()
        }
    }
    private fun fnIniciar(){
        val intent = Intent(this,pacientes::class.java)
        startActivity(intent)
        finish()


    }
    private fun fnVolver(){
        val intent = Intent(this,pacientes::class.java)
        startActivity(intent)
        finish()


    }
}