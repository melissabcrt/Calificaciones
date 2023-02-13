package com.example.calificacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class aprobado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aprobado)
        var califR= intent.getStringExtra("calif")
        Log.d("Datos","Datos recibidos con exito fueron calif $califR")

        var tvAprob = findViewById<TextView>(R.id.tv_aprobado)
        tvAprob.text = "Felicidades Aprobaste la materia con $califR"
    }
}