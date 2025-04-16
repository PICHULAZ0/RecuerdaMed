
package com.example.recuerdamed

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val iniciar = findViewById<Button>(R.id.btnLogin)

        val registrar = findViewById<Button>(R.id.btnRegistrar)

        registrar.setOnClickListener {

            fnRegistrar()
        }

        iniciar.setOnClickListener {

            fnIniciar()
        }
    }
    private fun fnIniciar(){
        val intent = Intent(this,cuidador::class.java)
        startActivity(intent)
        finish()


    }
    private fun fnRegistrar(){
        val intent = Intent(this,registro::class.java)
        startActivity(intent)
        finish()
    }

}