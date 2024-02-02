package com.example.toast_ujc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText( this, "Aplikasi  berjalan", Toast.LENGTH_SHORT).show()

        val tombol1 = findViewById<Button>(R.id.tombol1)
        val tombol2 = findViewById<Button>(R.id.tombol2)
        val tombol3 = findViewById<Button>(R.id.tombol3)

        tombol1.setOnClickListener {
            Toast.makeText( this, "ahmad yunus furqon",Toast.LENGTH_SHORT).show()
        }
        tombol2.setOnClickListener {
            Toast.makeText(this, "XI PPLG 2",Toast.LENGTH_SHORT).show()
        }
        tombol3.setOnClickListener {
            Toast.makeText( this,"2233276",Toast.LENGTH_SHORT).show()
        }

    }
}