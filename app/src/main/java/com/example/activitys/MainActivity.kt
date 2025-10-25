package com.example.activitys

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.activitys.ui.theme.ActivitysTheme

class MainActivity : ComponentActivity() {
    companion object{
        val listaAsistencias = mutableListOf<String>()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main) // llamamos al layout que hemos creado
        val txtNombre = findViewById<TextView>(R.id.txtNombre)
        val btnRegistrar = findViewById<Button>(R.id.btnIrSegunda)
        val btnVerLista = findViewById<Button>(R.id.btnLista)
btnRegistrar.setOnClickListener {
    val nombre = txtNombre.text.toString().trim()
    if (nombre.isNotEmpty()){
        listaAsistencias.add(nombre)
        Toast.makeText(this,"asistencia registrada: $nombre", Toast.LENGTH_SHORT).show()
        txtNombre.text = ""
    }else{
        Toast.makeText(this,"Por favor ingrese un nombre", Toast.LENGTH_SHORT).show()
    }
}
btnVerLista.setOnClickListener {
    val intent = Intent(this,Activity2::class.java)
    startActivity(intent)
}



    }
}