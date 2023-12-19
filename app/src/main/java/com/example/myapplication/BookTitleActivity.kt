package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BookTitleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_title)

        val detalles : Button = findViewById(R.id.btDetalles)
        val titulo : EditText = findViewById(R.id.titulo)
        val paginas : EditText = findViewById(R.id.paginas)

        detalles.setOnClickListener{
            val intent = Intent(this, BookDetailsActivity::class.java)

            var tit = intent.putExtra("titulo",titulo.text.toString())
            var pag = intent.putExtra("pagina",paginas.text.toString())

            startActivity(intent)
        }
    }



}