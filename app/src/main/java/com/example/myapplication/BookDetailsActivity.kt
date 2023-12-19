package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class BookDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)

        val atras : Button = findViewById(R.id.btTitulo)
        val siguiente : Button = findViewById(R.id.btDisplay)
        val titulo = intent.getStringExtra("titulo")
        val paginas = intent.getStringExtra("pagina")
        val autor : TextView = findViewById(R.id.autor)
        val agno : TextView = findViewById(R.id.agno)

        atras.setOnClickListener{
            val intent = Intent(this, BookDisplayActivity::class.java)

            startActivity(intent)
        }

        siguiente.setOnClickListener{
            val intent = Intent(this, BookDisplayActivity::class.java)

            var tit = intent.putExtra("titulo",titulo)
            var pag = intent.putExtra("pagina",paginas)
            var aut = intent.putExtra("autor",autor.text.toString())
            var agn = intent.putExtra("agno",agno.text.toString())

            startActivity(intent)
        }
    }


}