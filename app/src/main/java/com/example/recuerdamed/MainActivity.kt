
package com.example.recuerdamed

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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

        val edtemail = findViewById<EditText>(R.id.etEmail)

        val edtcontraseña = findViewById<EditText>(R.id.etPassword)

        var Ecuidador = "cuidador@test.com"
        var Ccuidador = "1234"

        var Epaciente = "paciente@test.com"
        var Cpaciente = "12345"

        registrar.setOnClickListener {

            fnRegistrar()
        }

        iniciar.setOnClickListener {

            val correo = edtemail.text.toString().trim()
            val contrasena = edtcontraseña.text.toString().trim()

            if (correo.isEmpty() || contrasena.isEmpty()) {
                Toast.makeText(this, "Debes ingresar correo y contraseña", Toast.LENGTH_SHORT).show()
            }
            if (correo==Ecuidador && contrasena==Ccuidador ) {
                fnIniciar()
            }
            if (correo==Epaciente && contrasena==Cpaciente ) {
                fnIniciar2()
            }

        }
    }
    private fun fnIniciar(){
        val intent = Intent(this,cuidador::class.java)
        startActivity(intent)
        finish()


    }
    private fun fnIniciar2(){
        val intent = Intent(this,paciente::class.java)
        startActivity(intent)
        finish()


    }
    private fun fnRegistrar(){
        val intent = Intent(this,registro::class.java)
        startActivity(intent)
        finish()
    }

}