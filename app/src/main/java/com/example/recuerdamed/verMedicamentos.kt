package com.example.recuerdamed

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class verMedicamentos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ver_medicamentos)
        val iniciar = findViewById<ImageButton>(R.id.btnVolver)



        iniciar.setOnClickListener {

            fnIniciar()
        }
    }
    private fun fnIniciar(){
        val intent = Intent(this,paciente::class.java)
        startActivity(intent)
        finish()




    }
}