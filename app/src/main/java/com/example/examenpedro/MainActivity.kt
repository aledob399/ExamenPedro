package com.example.examenpedro

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.collections.ArrayList
import kotlin.collections.ArrayList as CollectionsArrayList

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private lateinit var numero:EditText
    private lateinit var titulo:EditText
    private lateinit var btn:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var al:ArrayList<String>
        var cadena=""
        numero = findViewById(R.id.numeroPaginas)
        titulo= findViewById(R.id.titulo)
        btn = findViewById(R.id.button)

        btn.setOnClickListener {
            val intent2 = Intent(this, BookDetailsActivity::class.java)
            intent2.putExtra("titulo",titulo.text)
            intent2.putExtra("numero",numero.text)
            cadena="Numero: ${titulo.text} Titulo${numero.text} ${intent.getStringExtra("array")}"
            intent2.putExtra("array",cadena)

            startActivity(intent2)


        }


    }
}




