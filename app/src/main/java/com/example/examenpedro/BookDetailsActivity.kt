package com.example.examenpedro

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ShareCompat.IntentReader

class BookDetailsActivity : AppCompatActivity() {

    private lateinit var nombre:EditText
    private lateinit var año:EditText
    private lateinit var btn:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)



         nombre = findViewById<EditText>(R.id.nombre)
         año = findViewById<EditText>(R.id.año)
         btn = findViewById<Button>(R.id.button)


        var cadena=""
        btn.setOnClickListener {

            val intent2 = Intent(this, BookDisplayActivity::class.java)
            intent2.putExtra("nombre",nombre.text)
            intent2.putExtra("año",año.text)

            cadena="Numero: ${nombre.text} Titulo${año.text} ${intent.getStringExtra("array")}"

            intent2.putExtra("titulo",intent.getStringExtra("titulo"))
            intent2.putExtra("numero",intent.getStringExtra("numero"))
            intent2.putExtra("array",intent.getStringExtra("array"))
            startActivity(intent2)

        }

    }
}