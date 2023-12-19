package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class BookDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_display)

        val atras : Button = findViewById(R.id.btTitulo)
        val titulo = intent.getStringExtra("titulo")
        val paginas = intent.getStringExtra("pagina")
        val autor = intent.getStringExtra("autor")
        val agno = intent.getStringExtra("agno")

        var libro = "Título: $titulo\nPaginas: $paginas\nAutor: $autor\nAño: $agno"

        val book: TextView = findViewById(R.id.book)

        book.setText(libro)

        atras.setOnClickListener{
            val intent = Intent(this, BookTitleActivity::class.java)

            startActivity(intent)
        }
    }
}