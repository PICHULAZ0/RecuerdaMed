package com.example.recuerdamed

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class pacientes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pacientes)
        val iniciar = findViewById<ImageButton>(R.id.ib1)

        val registrar = findViewById<ImageButton>(R.id.btnVolver)

        val paciente1 = findViewById<Button>(R.id.btn1)

        paciente1.setOnClickListener {

            fnP1()
        }

        registrar.setOnClickListener {

            fnVolver()

        }

        iniciar.setOnClickListener {

            fnIniciar()
        }
    }
    private fun fnIniciar(){
        val intent = Intent(this,registro::class.java)
        startActivity(intent)
        finish()


    }
    private fun fnVolver(){
        val intent = Intent(this,cuidador::class.java)
        startActivity(intent)
        finish()
    }
    private fun fnP1(){
        val intent = Intent(this,verPacientes::class.java)
        startActivity(intent)
        finish()

    }

}