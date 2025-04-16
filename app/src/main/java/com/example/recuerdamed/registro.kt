package com.example.recuerdamed

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registro)
        val iniciar = findViewById<ImageButton>(R.id.btnVolver)

        val registrar = findViewById<Button>(R.id.btnGuardar)

        registrar.setOnClickListener {

            fnIniciar()

        }

        iniciar.setOnClickListener {

            fnIniciar()
        }
    }
    private fun fnIniciar(){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()


    }
}