package com.example.activitys

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity // Importa AppCompatActivity
import androidx.activity.ComponentActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.ListView

class Activity2 : ComponentActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)
        val listaView = findViewById<ListView>(R.id.listaView)
        val botonVolver = findViewById<Button>(R.id.btnVolver)
        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, MainActivity.listaAsistencias)
        listaView.adapter = adaptador
        botonVolver.setOnClickListener {
            finish()
        }
    }
}