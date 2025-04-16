package com.example.recuerdamed

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class verPacientes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ver_pacientes)
        val iniciar = findViewById<Button>(R.id.btn2)

        val registrar = findViewById<Button>(R.id.btn3)

        val volver = findViewById<ImageButton>(R.id.btnVolver)

        volver.setOnClickListener {

            fnVolver()
        }


        registrar.setOnClickListener {

            fnIr()

        }

        iniciar.setOnClickListener {

            fnIniciar()
        }
    }
    private fun fnIniciar(){
        val intent = Intent(this,establecerHorarios::class.java)
        startActivity(intent)
        finish()


    }
    private fun fnIr(){
        val intent = Intent(this,verHorarios::class.java)
        startActivity(intent)
        finish()
    }

    private fun fnVolver(){
        val intent = Intent(this,pacientes::class.java)
        startActivity(intent)
        finish()
    }

}