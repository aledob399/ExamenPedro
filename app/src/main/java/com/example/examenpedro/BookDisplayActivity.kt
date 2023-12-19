package com.example.examenpedro

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BookDisplayActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_display)
        var btn = findViewById<Button>(R.id.button)
        var datos = findViewById<TextView>(R.id.datos)
        var cadena=""

        datos.text="Titulo:${intent.getStringExtra("titulo")}," +
                "Numero de paginas:${intent.getStringExtra("numero")}," +
                "Nombre del autor:${intent.getStringExtra("nombre")}," +
                "Año de la publicacion:${intent.getStringExtra("año")}"
        datos.text=intent.getStringExtra("array")

        btn.setOnClickListener {
            var intent2 = Intent(this, MainActivity::class.java)
            cadena="${intent.getStringExtra("array")}"

            intent2.putExtra("array",cadena)
            startActivity(intent2)


        }
    }
}