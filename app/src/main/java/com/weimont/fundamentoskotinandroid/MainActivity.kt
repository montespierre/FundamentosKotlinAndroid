package com.weimont.fundamentoskotinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

// MainActivity extiende de AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // Llamando al codigo de la funcion onCreate de la clase padre AppCompatActivity
        super.onCreate(savedInstanceState)

        // Inflar el xml = convertir el archivo de texto xml en objetos de las clases correspondientes a las vistas (button, editText) para acceder por codigo luego
        setContentView(R.layout.activity_main)

        // R aglutina a todos los recuros
        val helloText = findViewById<TextView>(R.id.hello_text)

        helloText.text = "Hello Android"


    }

}