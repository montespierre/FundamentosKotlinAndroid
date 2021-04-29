package com.weimont.fundamentoskotinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

// MainActivity extiende de AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // Llamando al codigo de la funcion onCreate de la clase padre AppCompatActivity
        super.onCreate(savedInstanceState)

        // Inflar el xml = convertir el archivo de texto xml en objetos de las clases correspondientes a las vistas (button, editText) para acceder por codigo luego
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.email)
        val sendButton = findViewById<Button>(R.id.send)

        // Cuando pulsemos la vista (boton) se lanze una accion
        sendButton.setOnClickListener {
            // Log.d("MainActivity", "Button Clicked")
            val message = email.text
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }








    }

}